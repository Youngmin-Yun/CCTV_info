package com.cctv.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.cctv.service.MyTownCCTVService;
import com.cctv.vo.CctvInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTownCCTVAPIController {
    @Autowired
    MyTownCCTVService service;
    @GetMapping("/api/mytown")
    public Map<String, Object> selectMyTownCCTV(@RequestParam String lat, @RequestParam String lng){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<CctvInfoVO> list = service.selectMyTown(lat, lng);
        resultMap.put("list", list);
        return resultMap;
    }
}
