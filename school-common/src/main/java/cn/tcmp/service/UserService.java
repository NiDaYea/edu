package cn.tcmp.service;

import cn.tcmp.entity.User;
import cn.tcmp.util.pageutil.PageUtil;

public interface UserService {
    //查询所有报名学员
    PageUtil<User>queryAll(String userName,Integer pageNo,Integer pageSize);
    //管理员登楼
    User loginUser(User user);
    //审核用户
    Integer updateUserType(Integer userId);



}
