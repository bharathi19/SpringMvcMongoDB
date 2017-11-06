package com.cts.controller;


import com.cts.model.City;
import com.cts.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MyController {

    @Autowired
    DistanceService service;

    @Autowired
    MongoTemplate mongoTemplate;

    @RequestMapping(value = "/getTotalDistance" ,method = RequestMethod.GET)
      public ModelAndView getOutput(HttpServletRequest request, HttpServletResponse response ){

       /* City city1 = new City("Pune", 0);
        City city2 = new City("Mumbai", 200);
        City city3 = new City("Bangalore", 1000);
        City city4 = new City("Delhi", 2050);
        City city5 = new City("Chennai", 1234.5);


        // save
        mongoTemplate.save(city1);
        mongoTemplate.save(city2);
        mongoTemplate.save(city3);
        mongoTemplate.save(city4);
        mongoTemplate.save(city5);*/

        String formCity=request.getParameter("t1");
        String toCity=request.getParameter("t2");
        double k=service.getJourneyDistance(formCity,toCity);

        ModelAndView mv=new ModelAndView();
        mv.setViewName("distance");
        mv.addObject("result",k);
        return mv;
    }
}


