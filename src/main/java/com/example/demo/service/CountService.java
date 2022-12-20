package com.example.demo.service;

import com.example.demo.model.ServiceModel;
import com.example.demo.model.ServiceReturnModel;
import org.springframework.stereotype.Service;

@Service
public class CountService {
    public ServiceReturnModel doCount(ServiceModel serviceModel) {
        int intMoney = serviceModel.money();
        int intPerson = serviceModel.person();
        int intThousand = 0;
        int intFiveHundred = 0;
        int intHundred = 0;

        int thousand = intMoney / 1000;
        intThousand += thousand * intPerson;
        intMoney %= 1000;
        int fiveHundred = intMoney / 500;
        intFiveHundred += fiveHundred * intPerson;
        intMoney %= 500;
        int hundred = intMoney / 100;
        intHundred += hundred * intPerson;
        return new ServiceReturnModel(intHundred, intFiveHundred, intThousand);
    }
}
