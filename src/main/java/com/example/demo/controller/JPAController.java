package com.example.demo.controller;

import com.example.demo.dao.RecordRepository;
import com.example.demo.model.CountRecordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "CountRecordModel")
public class JPAController {

    private RecordRepository recordRepository;

    @Autowired
    public JPAController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @PostMapping(path = "addRecord")
    public void addRecord(CountRecordModel countRecordModel) {
        recordRepository.save(countRecordModel);

    }

}
