package cn.tcmp.service;

import cn.tcmp.dao.TopicMapper;
import cn.tcmp.entity.Topic;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TopicServiceImpl  implements TopicService{
    @Autowired
    private TopicMapper topicMapper;

    @Override
    public PageUtil<Topic> queryAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Topic> list=topicMapper.queryAll();
        PageInfo<Topic> pageInfo=new PageInfo<>(list);
        PageUtil<Topic> pageUtil=new PageUtil<>();
        pageUtil.setPageNo(pageInfo.getPageNum());
        pageUtil.setPageSize(pageInfo.getPageSize());
        pageUtil.setTotalPageCount(pageInfo.getPages());
        pageUtil.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageUtil.setList(pageInfo.getList());
        return pageUtil;
    }
}
