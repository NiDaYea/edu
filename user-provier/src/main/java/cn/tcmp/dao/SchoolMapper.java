package cn.tcmp.dao;

import cn.tcmp.entity.About;
import cn.tcmp.entity.Coach;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {
    //查询所有教练
    List<Coach> queryAll(@Param("coathName") String coathName, @Param("carTypevalueId") Integer carTypevalueId);
    Integer addCoach(Coach coach);

    //根据主键查询教练
    Coach queryById(Integer coachId);

    //约车详情
    List<About> queryAllAbout(@Param("coachId") Integer coachId,@Param("aboutDate") String aboutDate);

    //约车
    Integer addAbout(About about);

    //约车
    Integer updateAbout(@Param("aboutId") Integer aboutId,@Param("str") String str);

    //查询about表主键最大的一列
    About queryTop1();

    //查询某个用户所预约的数量
    Integer queryCountAbout(Integer userId);
}
