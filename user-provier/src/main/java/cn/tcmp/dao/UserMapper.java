package cn.tcmp.dao;

import cn.tcmp.entity.User;

public interface UserMapper {
    User login(User user);
    //点击约车，查询进度
    User queryUserJD(Integer userId);
}
