package com.cctv.service;

import java.util.List;

import com.cctv.mapper.MyTownCCTVMapper;
import com.cctv.vo.CctvInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyTownCCTVService {
    @Autowired
    MyTownCCTVMapper mapper;
    public List<CctvInfoVO> selectMyTown(String lat, String lng){
        return mapper.selectMyTown(lat, lng);
    }
}
