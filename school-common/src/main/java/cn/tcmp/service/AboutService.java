package cn.tcmp.service;

import cn.tcmp.entity.About;
import cn.tcmp.util.pageutil.PageUtil;

import java.util.List;

public interface AboutService {

    //后台约车管理
    PageUtil<About> queryAll(Integer pageNo,Integer pageSize);
}
