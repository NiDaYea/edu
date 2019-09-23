package cn.tcmp.service;

import cn.tcmp.dao.SchoolMapper;
import cn.tcmp.entity.Coach;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;


    @Override
    public PageUtil<Coach> queryAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Coach> list=schoolMapper.queryAll();
        PageInfo<Coach>pageInfo=new PageInfo<>(list);
        PageUtil<Coach>pageUtil=new PageUtil<>();
        pageUtil.setPageNo(pageInfo.getPageNum());
        pageUtil.setPageSize(pageInfo.getPageSize());
        pageUtil.setTotalPageCount(pageInfo.getPages());
        pageUtil.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageUtil.setList(pageInfo.getList());
        return pageUtil;
    }

    @Override
    public Integer addCoach(Coach coach) {
        return schoolMapper.addCoach(coach);
    }


}
