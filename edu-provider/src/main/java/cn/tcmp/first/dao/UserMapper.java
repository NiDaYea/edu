package cn.tcmp.first.dao;

import cn.tcmp.first.entity.Type;
import cn.tcmp.first.entity.User;

import java.util.List;

public interface UserMapper {

    //在线报名
    Integer saveUser(User user);

    //修改用户密码
    Integer updatePassword(User user);


}
