package cn.tcmp.dao;

import cn.tcmp.entity.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> queryAll(String userName);
    //管理员登楼
    User loginUser(User user);
    //审核用户
    Integer updateUserType(Integer userId);

}
