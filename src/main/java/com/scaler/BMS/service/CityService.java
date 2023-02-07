package com.scaler.BMS.service;

import com.scaler.BMS.model.City;
import com.scaler.BMS.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City addCity(String name){
        City newCity = new City();
        newCity.setName(name);
        return this.cityRepository.save(newCity);
    }
}
/*
        A -> B -> C
             B -> D

       C obj, D obj
       inject them into constructor to create obj B
       inject obj B into constructor to create obj A

 */