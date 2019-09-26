package cn.tcmp.service;

import cn.tcmp.dao.AboutMapper;
import cn.tcmp.entity.About;
import cn.tcmp.entity.Car;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AbooutServiceImpl implements AboutService{

    @Autowired
    private AboutMapper aboutMapper;


    @Override
    public PageUtil<About> queryAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<About> list=aboutMapper.queryAll();
        PageInfo<About> pageInfo=new PageInfo<>(list);
        PageUtil<About> pageUtil=new PageUtil<>();
        pageUtil.setPageNo(pageInfo.getPageNum());
        pageUtil.setPageSize(pageInfo.getPageSize());
        pageUtil.setTotalPageCount(pageInfo.getPages());
        pageUtil.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageUtil.setList(pageInfo.getList());
        return pageUtil;
    }
}
