package com.springboot.admin.service;

import com.springboot.admin.bean.City;
import com.springboot.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;
    public City getById(Long id){
        return cityMapper.getById(id);
    }
}
