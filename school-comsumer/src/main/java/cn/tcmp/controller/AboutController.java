package cn.tcmp.controller;

import cn.tcmp.service.AboutService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {

    @Reference
    private AboutService aboutService;


    @RequestMapping("queryAbout")
    public String queryAbout(Integer pageNo, Integer pageSize,Model model) {
        if (pageNo == null) {
            pageNo=1;
        }
        if (pageSize == null) {
            pageSize=5;
        }
        model.addAttribute("pageUtil",aboutService.queryAll(pageNo,pageSize));
        System.err.println(aboutService.queryAll(pageNo,pageSize).getList());
        return "about_list";
    }

    @ResponseBody
    @RequestMapping(value = "queryAboutTwo",method = RequestMethod.POST,produces = {"application/json;charset=UTf-8"})
    public String queryAboutTwo(Integer pageNo, Integer pageSize) {
        if (pageNo == null) {
            pageNo=1;
        }
        if (pageSize == null) {
            pageSize=5;
        }
        return JSON.toJSONString(aboutService.queryAll(pageNo,pageSize));
    }
}
