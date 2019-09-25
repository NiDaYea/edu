package cn.tcmp.service;

import cn.tcmp.entity.Coach;
import cn.tcmp.util.pageutil.PageUtil;


import java.util.List;

public interface SchoolService {
    //查询所有教练信息
    PageUtil<Coach> queryAll(Integer pageNo, Integer pageSize);
    //添加教练
    Integer addCoach(Coach coach);
}
