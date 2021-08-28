package com.cctv.controller;

import java.text.DecimalFormat;

import com.cctv.service.CctvInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CctvInfoController {
    @Autowired
    CctvInfoService service;
    @GetMapping("/")
    public String getCctvInfo(Model model){
        Integer cnt = service.selectAllCctvCnt();
        DecimalFormat format = new DecimalFormat("###,###");
        String cctv_cnt = format.format(cnt);
        model.addAttribute("cnt", cctv_cnt);
        return "/index";
    }
}
