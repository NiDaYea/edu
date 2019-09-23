package cn.tcmp.service;

import cn.tcmp.dao.UserMapper;
import cn.tcmp.entity.Coach;
import cn.tcmp.entity.User;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public PageUtil<User> queryAll(String userName, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<User>list=userMapper.queryAll(userName);
        PageInfo<User> pageInfo=new PageInfo<>(list);
        PageUtil<User>pageUtil=new PageUtil<>();
        pageUtil.setPageNo(pageInfo.getPageNum());
        pageUtil.setPageSize(pageInfo.getPageSize());
        pageUtil.setTotalPageCount(pageInfo.getPages());
        pageUtil.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageUtil.setList(pageInfo.getList());
        return pageUtil;
    }
}
