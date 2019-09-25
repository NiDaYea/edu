package cn.tcmp.service;

import cn.tcmp.dao.SchoolMapper;
import cn.tcmp.entity.About;
import cn.tcmp.entity.Coach;
import cn.tcmp.util.PageUtil;
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
    public PageUtil<Coach> queryAll(String coathName,Integer carTypevalueId,Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Coach> list=schoolMapper.queryAll(coathName,carTypevalueId);
        PageInfo<Coach> pageInfo=new PageInfo<>(list);
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

    @Override
    public Coach queryById(Integer coachId) {
        return schoolMapper.queryById(coachId);
    }

    @Override
    public List<About> queryAllAbout(Integer coachId, String aboutDate) {
        return schoolMapper.queryAllAbout(coachId,aboutDate);
    }

    @Override
    public Integer addAbout(About about) {
        return schoolMapper.addAbout(about);
    }

    @Override
    public Integer updateAbout(Integer aboutId, String str) {
        return schoolMapper.updateAbout(aboutId,str);
    }

    @Override
    public About queryTop1() {
        return schoolMapper.queryTop1();
    }

    @Override
    public Integer queryCountAbout(Integer userId) {
        return schoolMapper.queryCountAbout(userId);
    }


}
