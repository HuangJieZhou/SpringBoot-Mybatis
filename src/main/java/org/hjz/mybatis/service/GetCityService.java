package org.hjz.mybatis.service;

import org.hjz.mybatis.common.model.Area;

import java.util.List;

/**
 * @Author:HuangJieZhou
 * @Description:
 * @Date:Created in 2020/6/17 20:56
 */
public interface GetCityService {

    /**
     * 获取城市
     *
     * @return
     */
    List<Area> getCitys();
}
