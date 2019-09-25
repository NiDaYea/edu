package cn.tcmp.service;

import cn.tcmp.entity.User;

public interface UserService {

    User login(User user);
    //点击约车，查询进度
    User queryUserJD(Integer userId);
}
