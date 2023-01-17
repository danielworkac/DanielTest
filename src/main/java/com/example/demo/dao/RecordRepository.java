package com.example.demo.dao;

import com.example.demo.model.CountRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<CountRecordModel, Integer> {
    List<CountRecordModel> findByAccount(String account);
}
