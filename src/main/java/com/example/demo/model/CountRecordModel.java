package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CountRecord")
@Getter
@Setter
public class CountRecordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "thousand")
    private Integer thousand;
    @Column(name = "fiveHundred")
    private Integer fiveHundred;
    @Column(name = "hundred")
    private Integer hundred;

    public CountRecordModel() {

    }

    public CountRecordModel(int thousand, int fiveHundred, int hundred) {
        this.thousand = thousand;
        this.fiveHundred = fiveHundred;
        this.hundred = hundred;
    }

    @Override
    public String toString() {
        return "CountRecordModel{" +
                "id=" + id +
                "thousand=" + thousand +
                ", fiveHundred=" + fiveHundred +
                ", Hundred=" + hundred +
                '}';
    }
}
