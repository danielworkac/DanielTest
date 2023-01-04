package com.example.demo.service;

import com.example.demo.dao.RecordRepository;
import com.example.demo.model.CountRecordModel;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    private RecordRepository recordRepository;

    public DBService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public void addRecord(CountRecordModel countRecordModel) {
        recordRepository.save(countRecordModel);

    }
}
