package cn.tcmp.first.service;

import cn.tcmp.first.entity.User;

public interface UserService {

    //在线报名
    Integer saveUser(User user);

    //修改用户密码
    Integer updatePassword(User user);
}
