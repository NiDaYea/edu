package cn.tcmp.first.service;

import cn.tcmp.first.dto.TokenDto;
import cn.tcmp.first.entity.User;

public interface TokenService {

    //生成
    String creatrToken(String userAgent, User user);

    //保存
    Integer save(String token, User user);

    //验证token
    Boolean checkToken(String token, String userAgent);

    //退出方法
    TokenDto loginOut(String token, String userAgent);

    //重置Token
    TokenDto reset(String token, String userAgent);

}
