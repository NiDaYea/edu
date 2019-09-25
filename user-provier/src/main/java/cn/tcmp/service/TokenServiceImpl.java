package cn.tcmp.service;

import cn.tcmp.dto.DataDto;
import cn.tcmp.dto.TokenDto;
import cn.tcmp.entity.User;
import cn.tcmp.util.Common;
import cn.tcmp.util.RedisUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import eu.bitwalker.useragentutils.UserAgent;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class TokenServiceImpl implements TokenService {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public String createToken(String userAgent, User user) {
        StringBuilder str = new StringBuilder();
        str.append(Common.TOKEN_PREFIX);
        //判断客户端特征
        UserAgent agent = UserAgent.parseUserAgentString(userAgent);
        if (agent.getOperatingSystem().isMobileDevice()) {
            str.append(Common.MOBILE + "-");
        } else {
            str.append(Common.PC + "-");
        }
        String UserTel = user.getUserTel();
        str.append(DigestUtils.md5Hex(UserTel) + "-");
        //userId
        str.append(user.getUserId() + "-");
        //创建时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmsss");
        String date = sdf.format(new Date());
        str.append(date + "-");
        //agent MD5 截取前6位
        String agentMD5 = DigestUtils.md5Hex(userAgent);
        agentMD5 = agentMD5.substring(0, 6);
        str.append(agentMD5);
        return str.toString();
    }

    @Override
    public Integer saveToken(String token, User user) {
        //user->json
        String json=JSON.toJSONString(user);
        redisUtil.set(token,json,Common.TOKEN_TIMEOUT);
        return 1;
    }

    //token验证
    @Override
    public boolean checkToken(String token, String userAgent) {
        //1.通过入参token查询redis中是否有符合的记录
        Object userJson=redisUtil.get(token);
        if(userJson==null){
            System.out.println("未登录");
            return  false;
        }
        System.out.println("已登陆");
        //2.验证userAgent的信息是否与登陆一致
        String oldAgent=token.split("-")[4];
        String newAgent=DigestUtils.md5Hex(userAgent).substring(0,6);
        if(oldAgent.equals(newAgent)){
            return true;
        }
        return false;
    }

    @Override
    public TokenDto logout(String token, String userAgent) {

        TokenDto tokenDto=new TokenDto();
        //验证Token
        Boolean result=checkToken(token,userAgent);
        if(!result){
            tokenDto.setErrorCode(Common.CODE_03);
            return tokenDto;
        }
        redisUtil.delete(token);
        tokenDto.setErrorCode(Common.CODE_SUCCESS);
        //删除Token
        return tokenDto;
    }

    @Override
    public TokenDto reset(String token, String userAgent) {
        TokenDto tokenDto=new TokenDto();
        //验证该token是否到重置时间（>1.5小时）
        String tokenDataStr=token.split("-")[3];
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmsss");
        Date tokenDate=null;
        try {
             tokenDate =dateFormat.parse(tokenDataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //系统时间
        Long nowTime=Calendar.getInstance().getTimeInMillis();
        Long tokenCreateTime=tokenDate.getTime();
        Long passTime=nowTime-tokenCreateTime;
        if(passTime<Common.TOKEN_REDIS_TIMEOUT){
            //没有到重置时间
            tokenDto.setErrorCode(Common.CODE_04);
            return tokenDto;
        }
        //1.验证token是否有效
        Boolean result =checkToken(token, userAgent);
        if(!result){
            //token无效
            tokenDto.setErrorCode(Common.CODE_03);
            return tokenDto;
        }
        //2.生成新token
        String userJson=redisUtil.get(token)+"";
        User user=JSON.parseObject(userJson,User.class);
        String newToken=createToken(userAgent, user);
        //3.将新的token保存redis中
        Integer count=saveToken(newToken, user);
        //4.将新的token封装到tokenDto中
        DataDto dataDto=new DataDto();
        dataDto.setToken(newToken);
        dataDto.setGenTime(Calendar.getInstance().getTimeInMillis() + "");
        dataDto.setExpTime(Calendar.getInstance().getTimeInMillis() + Common.TOKEN_TIMEOUT + "");
        tokenDto.setDataDto(dataDto);
        tokenDto.setErrorCode(Common.CODE_SUCCESS);
        //5.老token延迟2分钟失效
        redisUtil.set(token,userJson,Common.TOKEN_LONG_TIME);
        return tokenDto;
    }
}
