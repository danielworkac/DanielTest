package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.CountRecordModel;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    final DBService dbService;

    @Autowired
    public DBController(DBService dbService) {
        this.dbService = dbService;
    }

    @RequestMapping({"/doQuery"})
    public String doQuery(@RequestBody JSONObject obj) {
        String account = obj.getString("account");
        return dbService.findData(account).toString();
    }

    public void doInsert(CountRecordModel countRecordModel) {
        dbService.addRecord(countRecordModel);
    }
}
