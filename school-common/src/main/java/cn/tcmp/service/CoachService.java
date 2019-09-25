package cn.tcmp.service;

import cn.tcmp.entity.Coach;

import java.util.List;

public interface CoachService {
    //查询所有教练
    List<Coach> queryCoach();
    //辞退教练
    Integer updateCoach(Integer coachId);
    //入职教练
    Integer updateCoach2(Integer coachId);


}
