package com.cctv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTownCCTVController {
    @GetMapping("/mytown")
    public String getMyTownCCTVStatus(){
        return "/cityCCTV/myTownCCTV";
    }
}
