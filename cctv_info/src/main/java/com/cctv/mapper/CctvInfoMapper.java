package com.cctv.mapper;

import java.util.List;

import com.cctv.vo.CctvInfoVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CctvInfoMapper {
    public void insertCctvInfo(CctvInfoVO vo);
    public Integer selectAllCctvCnt();
    public List<CctvInfoVO>selectCateByPorpose();
}
