package cn.tcmp.service;

import cn.tcmp.dto.TokenDto;
import cn.tcmp.entity.User;

public interface TokenService {

    //生成Token
    String createToken(String userAgent, User user);
    //保存Token
    Integer saveToken(String token, User user);

    //验证Token
    boolean checkToken(String token, String userAgent);

    //退出
    TokenDto logout(String token, String userAgent);

    //重置Token
    TokenDto reset(String token, String userAgent);


}
