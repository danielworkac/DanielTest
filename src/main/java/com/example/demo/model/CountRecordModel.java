package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "countrecord")
@Getter
@Setter
public class CountRecordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "THOUSAND")
    private Integer thousand;
    @Column(name = "FIVEHUNDRED")
    private Integer fiveHundred;
    @Column(name = "HUNDRED")
    private Integer hundred;
    @Column(name = "ACCOUNT")
    private String account;
    public CountRecordModel() {}

    public CountRecordModel(int thousand, int fiveHundred, int hundred, String account) {
        this.thousand = thousand;
        this.fiveHundred = fiveHundred;
        this.hundred = hundred;
        this.account = account;
    }

    @Override
    public String toString() {
        return "CountRecordModel{" +
                "account=" + account +
                ", thousand=" + thousand +
                ", fiveHundred=" + fiveHundred +
                ", hundred=" + hundred +
                '}';
    }
}
