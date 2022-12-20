package com.example.demo.service;

import com.example.demo.model.ServiceModel;
import com.example.demo.model.ServiceReturnModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CountServiceTest {

    @Autowired
    CountService countService;

    @Test
    void test_case_1() {
        ServiceModel serviceModel = new ServiceModel(1000, 1);
        ServiceReturnModel returnModel = countService.doCount(serviceModel);
        expected(returnModel, 0, 0, 1);
    }

    @Test
    void test_case_2() {
        ServiceModel serviceModel = new ServiceModel(1000, 2);
        ServiceReturnModel returnModel = countService.doCount(serviceModel);
        expected(returnModel, 0, 0, 2);
    }

    @Test
    void test_case_3() {
        ServiceModel serviceModel = new ServiceModel(1700, 1);
        ServiceReturnModel returnModel = countService.doCount(serviceModel);
        expected(returnModel, 2, 1, 1);
    }

    @Test
    void test_add() {
        ServiceModel serviceModel1 = new ServiceModel(1700, 1);
        ServiceModel serviceModel2 = new ServiceModel(1000, 1);
        ServiceReturnModel result = countService.doCount(serviceModel1);
        ServiceReturnModel returnModel2 = countService.doCount(serviceModel2);
        result.add(returnModel2);
        expected(result, 2, 1, 2);
    }

    private static void expected(ServiceReturnModel returnModel, int expectedOneHundred, int expectedFiveHundred, int expectedThousand) {
        Assertions.assertEquals(expectedOneHundred, returnModel.getOneHundred());
        Assertions.assertEquals(expectedFiveHundred, returnModel.getFiveHundred());
        Assertions.assertEquals(expectedThousand, returnModel.getOneThousand());
    }
}