package com.cts.dao;

;
import com.cts.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class DistanceDao implements DaoMethods{


    @Autowired
    MongoTemplate template;

    public double getDistanceByCityName(String city){
        Query searchByCityName=new Query(Criteria.where("cityName").is(city));
        City cityDistances =template.findOne(searchByCityName,City.class);
        double distance= cityDistances.getCityDistance();
        return distance;


    }
}
