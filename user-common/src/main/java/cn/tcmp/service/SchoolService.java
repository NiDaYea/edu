package cn.tcmp.service;

import cn.tcmp.entity.About;
import cn.tcmp.entity.Coach;
import cn.tcmp.util.PageUtil;

import java.util.List;

public interface SchoolService {
    //查询所有教练信息
    PageUtil<Coach> queryAll(String coathName,Integer carTypevalueId,Integer pageNo, Integer pageSize);
    Integer addCoach(Coach coach);

    //根据主键查询教练
    Coach queryById(Integer coachId);

    //约车详情
    List<About> queryAllAbout(Integer coachId, String aboutDate);

    //约车
    Integer addAbout(About about);

    //约车
    Integer updateAbout(Integer aboutId,String str);

    //查询about表主键最大的一列
    About queryTop1();

    //查询某个用户所预约的数量
    Integer queryCountAbout(Integer userId);
}
