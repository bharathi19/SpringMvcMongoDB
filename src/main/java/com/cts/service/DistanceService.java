package com.cts.service;

import com.cts.dao.DistanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {


    @Autowired
    DistanceDao distanceDao;


    public double getJourneyDistance(String fromCity, String toCity) {
        return distanceDao.getDistanceByCityName(fromCity) + distanceDao.getDistanceByCityName(toCity);
    }

}