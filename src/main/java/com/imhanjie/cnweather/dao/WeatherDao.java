package com.imhanjie.cnweather.dao;

import com.imhanjie.cnweather.entity.Weather;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 *
 * @author hanjie
 */

@Repository
public class WeatherDao {

    private static final String COLLECTION_WEATHER = "real_time";

    @Resource
    private MongoTemplate template;

    public List<Weather> findById(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        return template.findAll(Weather.class, COLLECTION_WEATHER);
    }

}
