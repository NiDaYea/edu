package cn.tcmp.controller;

import cn.tcmp.dto.DataDto;
import cn.tcmp.dto.TokenDto;
import cn.tcmp.entity.User;
import cn.tcmp.service.TokenService;
import cn.tcmp.service.UserService;
import cn.tcmp.util.Common;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    private UserService userService;
    @Reference
    private TokenService tokenService;
    //退出
    @RequestMapping(value = "logout",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public String logout(HttpServletRequest request){
        String agent=request.getHeader("User-Agent");
        String token=request.getHeader("token");
        TokenDto tokenDto=tokenService.logout(token,agent);
        return JSON.toJSONString(tokenDto);
    }
    //登陆方法
    @RequestMapping(value = "login",method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    public String login(HttpServletRequest request, User user){
        TokenDto tokenDto=new TokenDto();
        DataDto dataDto=null;
        //1.用户名密码验证
        User loginUser=userService.login(user);
        if(loginUser==null){
            tokenDto.setErrorCode(Common.CODE_02);
            return JSON.toJSONString(tokenDto);
        }
        //2.生成token
        String agent = request.getHeader("User-Agent");
        String token = tokenService.createToken(agent, loginUser);

        //3.保存token
        tokenService.saveToken(token, loginUser);
        //4.将token信息返回给用户
        dataDto=new DataDto();
        dataDto.setToken(token);
        //token生成时间
        dataDto.setGenTime(Calendar.getInstance().getTimeInMillis()+"");
        //token过期时间
        dataDto.setExpTime(Calendar.getInstance().getTimeInMillis()+Common.TOKEN_TIMEOUT+"");
        tokenDto.setDataDto(dataDto);
        tokenDto.setErrorCode(Common.CODE_SUCCESS);
        return JSON.toJSONString(tokenDto);
    }
}
