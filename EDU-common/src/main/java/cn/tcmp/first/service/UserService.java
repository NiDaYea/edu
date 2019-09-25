package cn.tcmp.first.service;

import cn.tcmp.first.entity.Type;
import cn.tcmp.first.entity.User;

import java.util.List;

public interface UserService {

    //在线报名
    Integer saveUser(User user);

    //修改用户密码
    Integer updatePassword(User user);

    //查询当前用户信息
    User detailUser(Integer userId);


}
