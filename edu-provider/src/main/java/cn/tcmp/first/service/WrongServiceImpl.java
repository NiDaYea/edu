package cn.tcmp.first.service;

import cn.tcmp.first.dao.WrongMapper;
import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.entity.Wrong;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class WrongServiceImpl implements WrongService {

    @Autowired
    private WrongMapper wrongMapper;

    @Override
    public Integer saveWrong(Wrong wrong) {
        return wrongMapper.saveWrong(wrong);
    }

    @Override
    public Integer delWrong(Wrong wrong) {
        return wrongMapper.delWrong(wrong);
    }

    @Override
    public List<Topic> queryAll(Integer userId,Integer topicCode) {
        return wrongMapper.queryAll(userId,topicCode);
    }
}
