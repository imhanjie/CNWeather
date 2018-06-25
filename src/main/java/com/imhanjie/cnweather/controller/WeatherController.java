package com.imhanjie.cnweather.controller;

import com.imhanjie.cnweather.dao.WeatherDao;
import com.imhanjie.cnweather.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description
 *
 * @author hanjie
 */
@RestController
public class WeatherController {

    @Resource
    private WeatherDao dao;

    @GetMapping(value = "/weather")
    public Result test(@RequestParam String cityId) {
        return Result.getSuccess(dao.findById(cityId));
    }

}