package cn.tcmp.first.service;

import cn.tcmp.first.dao.TypeMapper;
import cn.tcmp.first.entity.Type;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    //驾照类型
    @Override
    public List<Type> queryDriving() {
        return typeMapper.queryDriving();
    }

    //报名类型
    @Override
    public List<Type> queryEnroll() {
        return typeMapper.queryEnroll();
    }
}
