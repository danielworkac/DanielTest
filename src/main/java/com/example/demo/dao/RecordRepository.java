package com.example.demo.dao;

import com.example.demo.model.CountRecordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<CountRecordModel, Integer> {

}
