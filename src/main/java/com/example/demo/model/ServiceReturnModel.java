package com.example.demo.model;

public class ServiceReturnModel {
    private Integer oneHundred = 0;
    private Integer fiveHundred = 0;

    private Integer oneThousand = 0;


    public ServiceReturnModel() {
    }

    public ServiceReturnModel(Integer oneHundred, Integer fiveHundred, Integer oneThousand) {
        this.oneHundred = oneHundred;
        this.fiveHundred = fiveHundred;
        this.oneThousand = oneThousand;
    }

    public Integer getOneHundred() {
        return oneHundred;
    }


    public Integer getFiveHundred() {
        return fiveHundred;
    }

    public Integer getOneThousand() {
        return oneThousand;
    }


    public ServiceReturnModel add(ServiceReturnModel model) {
        this.oneHundred += model.oneHundred;
        this.fiveHundred += model.fiveHundred;
        this.oneThousand += model.oneThousand;
        return this;
    }

    @Override
    public String toString() {
        return "ServiceReturnModel{" +
                "oneHundred=" + oneHundred +
                ", fiveHundred=" + fiveHundred +
                ", oneThousand=" + oneThousand +
                '}';
    }
}
