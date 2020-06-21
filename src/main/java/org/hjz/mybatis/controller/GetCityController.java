package org.hjz.mybatis.controller;

import org.hjz.mybatis.entiry.R;
import org.hjz.mybatis.service.GetCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:HuangJieZhou
 * @Description:
 * @Date:Created in 2020/6/17 21:00
 */
@RestController
public class GetCityController {

    @Autowired
    private GetCityService getCityService;

    @GetMapping("/get/city")
    public R getCity() {

        return R.success(getCityService.getCitys());
    }
}
