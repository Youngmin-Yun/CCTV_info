package com.cctv.service;

import java.util.List;

import com.cctv.mapper.RegionCCTVMapper;
import com.cctv.vo.CctvInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionCCTVService {
    @Autowired
    RegionCCTVMapper mapper;
    public List<CctvInfoVO> selectRegionCCTVStatus(String region){
        return mapper.selectRegionCCTVStatus(region);
    }
}
