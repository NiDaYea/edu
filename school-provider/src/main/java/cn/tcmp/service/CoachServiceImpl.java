package cn.tcmp.service;

import cn.tcmp.dao.CoachMapper;
import cn.tcmp.entity.Coach;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
    private CoachMapper coachMapper;


    @Override
    public List<Coach> queryCoach() {
        return coachMapper.queryCoach();
    }

    @Override
    public Integer updateCoach(Integer coachId) {
        return coachMapper.updateCoach(coachId);
    }

    @Override
    public Integer updateCoach2(Integer coachId) {
        return coachMapper.updateCoach2(coachId);
    }
}
