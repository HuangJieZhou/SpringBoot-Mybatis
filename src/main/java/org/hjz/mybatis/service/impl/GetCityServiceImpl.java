package org.hjz.mybatis.service.impl;

import org.hjz.mybatis.common.dao.AreaMapper;
import org.hjz.mybatis.common.model.Area;
import org.hjz.mybatis.common.model.AreaExample;
import org.hjz.mybatis.service.GetCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:HuangJieZhou
 * @Description:
 * @Date:Created in 2020/6/17 20:56
 */
@Service
public class GetCityServiceImpl implements GetCityService {

    @Autowired
    private AreaMapper areaMapper;


    @Override
    public List<Area> getCitys() {
        List<Area> areas = areaMapper.selectByExample(new AreaExample());
        return areas;
    }
}
