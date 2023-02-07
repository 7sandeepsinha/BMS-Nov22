package com.scaler.BMS.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    //@Column(name = "identity_column")
    private Long id;

    //add timeStamps -> automated
    //CREATED_AT
    //UPDATED_AT
}
