package cn.tcmp.first.controller;

import cn.tcmp.first.service.FeesService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeesController {

    @Reference
    private FeesService feesService;

    //去班型及价格的总页面
    @RequestMapping("toSummary")
    public String toSummary() {
        return "summary";
    }

    //去价格介绍的页面
    @RequestMapping("toFees")
    public String toFees(Model model) {
        model.addAttribute("Fees",feesService.queryAll());
        return "fees";
    }
}
