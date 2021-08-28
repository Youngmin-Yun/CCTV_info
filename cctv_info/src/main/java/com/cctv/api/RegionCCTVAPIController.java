package com.cctv.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.cctv.service.RegionCCTVService;
import com.cctv.vo.CctvInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionCCTVAPIController {
    @Autowired
    RegionCCTVService service;
    @GetMapping("/api/region")
    public Map<String, Object> getRegionCCTVStatus(@RequestParam String region){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        region = region+"%";
        List<CctvInfoVO> list = service.selectRegionCCTVStatus(region);
        resultMap.put("status", true);
        resultMap.put("list", list);
        return resultMap;
    }
}
