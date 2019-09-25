package cn.tcmp.first.service;

import cn.tcmp.first.dao.FeesMapper;
import cn.tcmp.first.entity.Fees;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class FeesServiceImpl implements FeesService {

    @Autowired
    private FeesMapper feesMapper;

    //查询所有班型及价格
    @Override
    public List<Fees> queryAll() {
        return feesMapper.queryAll();
    }

    //二级联动查看班型(报名用)
    @Override
    public List<Fees> queryClass(String license) {
        return feesMapper.queryClass(license);
    }
}
