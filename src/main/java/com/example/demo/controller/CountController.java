package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.ServiceModel;
import com.example.demo.model.ServiceReturnModel;
import com.example.demo.service.CountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CountController {

    final CountService countService;

    @Autowired
    public CountController(CountService countService) {
        this.countService = countService;
    }

    @RequestMapping({"/doCount"})
    public String doCount(@RequestBody JSONObject obj) {
        ServiceReturnModel result = new ServiceReturnModel();

        for (int i = 0; i < obj.size(); i++) {
            String[] strRedEnvelope = obj.getString(Integer.toString(i)).split("/");
            ServiceModel serviceModel = new ServiceModel(Integer.parseInt(strRedEnvelope[0]), Integer.parseInt(strRedEnvelope[1]));
            result.add(countService.doCount(serviceModel));
        }

        return result.toString();

    }
}
