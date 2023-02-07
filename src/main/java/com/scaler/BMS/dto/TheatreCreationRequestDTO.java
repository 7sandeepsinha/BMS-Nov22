package com.scaler.BMS.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreCreationRequestDTO {
    private Long cityId;
    private String theatreName;
    private String theatreAddress;
}
