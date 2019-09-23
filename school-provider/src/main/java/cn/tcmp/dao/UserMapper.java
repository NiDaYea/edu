package cn.tcmp.dao;

import cn.tcmp.entity.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> queryAll(String userName);

}
