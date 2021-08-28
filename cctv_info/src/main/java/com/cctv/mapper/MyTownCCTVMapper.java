package com.cctv.mapper;

import java.util.List;

import com.cctv.vo.CctvInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyTownCCTVMapper {
    public List<CctvInfoVO> selectMyTown(String lat, String lng);
}
