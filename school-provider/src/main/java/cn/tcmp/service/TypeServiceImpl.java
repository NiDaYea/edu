package cn.tcmp.service;

import cn.tcmp.dao.TypeMapper;
import cn.tcmp.entity.Type;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> queryStatu(String typeCode) {
        return typeMapper.queryStatu(typeCode);
    }

    @Override
    public List<Type> querytypeCar(String typeCode) {
        return typeMapper.querytypeCar(typeCode);
    }
}
