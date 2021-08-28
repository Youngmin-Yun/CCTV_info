package com.cctv.vo;

import lombok.Data;

@Data
public class CctvInfoVO {
    private Integer seq;
    private String institutionNm;
    private String lnmadr;
    private String installationPurpsType;
    private String potogrfInfo;
    private String installationYymm;
    private String phoneNumber;
    private String latitude;
    private String longitude;
    private String cstdyDay;

    private String purpos;
    private Integer cnt;

    private String distance;
}
