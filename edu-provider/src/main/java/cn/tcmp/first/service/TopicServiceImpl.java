package cn.tcmp.first.service;

import cn.tcmp.first.dao.TopicMapper;
import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.util.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Reference
    private TopicMapper topicMapper;

    @Override
    public PageUtil<Topic> queryAllTopic(Integer topicCode, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Topic> list = topicMapper.queryAllTopic(topicCode);
        PageInfo<Topic> pageInfo = new PageInfo<Topic>(list);
        PageUtil<Topic> pageUtil=new PageUtil<Topic>();
        pageUtil.setPageNo(pageInfo.getPageNum());
        pageUtil.setPageSize(pageInfo.getPageSize());
        pageUtil.setTotalPageCount(pageInfo.getPages());
        pageUtil.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageUtil.setList(pageInfo.getList());
        return pageUtil;
    }

    @Override
    public List<Topic> queryByYIbai(Integer topicCode) {
        return null;
    }
}
