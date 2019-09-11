package cn.tcmp.first.dao;

import cn.tcmp.first.entity.User;

public interface UserMapper {

    //在线报名
    Integer saveUser(User user);
}
