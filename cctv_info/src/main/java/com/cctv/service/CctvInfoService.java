package com.cctv.service;

import java.util.List;

import com.cctv.mapper.CctvInfoMapper;
import com.cctv.vo.CctvInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CctvInfoService {
    @Autowired
    CctvInfoMapper mapper;
    public void insertCctvInfo(CctvInfoVO vo){
        mapper.insertCctvInfo(vo);
    }
    public Integer selectAllCctvCnt(){
        return mapper.selectAllCctvCnt();
    }
    public List<CctvInfoVO>selectCateByPorpose(){
        return mapper.selectCateByPorpose();
    }

}
