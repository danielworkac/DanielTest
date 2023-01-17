package com.example.demo.service;

import com.example.demo.dao.RecordRepository;
import com.example.demo.model.CountRecordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {
    private RecordRepository recordRepository;

    @Autowired
    public DBService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public void addRecord(CountRecordModel countRecordModel) {
        recordRepository.save(countRecordModel);
    }

    public List<CountRecordModel> findData(String account) {
        List<CountRecordModel> model = recordRepository.findByAccount(account);

        return model;
    }
}
