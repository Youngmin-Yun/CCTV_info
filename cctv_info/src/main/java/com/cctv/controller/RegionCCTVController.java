package com.cctv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegionCCTVController {
    @GetMapping("/region")
    public String getRegionCCTVStatus(){
        return "/cityCCTV/regionCCTV";
    }
}
