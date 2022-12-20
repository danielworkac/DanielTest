package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class doCount {
    @RequestMapping({"/doCount"})
    public String doCount(@RequestBody JSONObject obj){
        int intThousand, intFiveHundred, intHundred;
        intThousand = intFiveHundred = intHundred = 0;

        for(int i = 0; i < obj.size(); i++) {
            String [] strRedEnvelope = obj.getString(Integer.toString(i)).split("/");
            int intMoney = Integer.parseInt(strRedEnvelope[0]);
            int person = Integer.parseInt(strRedEnvelope[1]);
            int thousand = intMoney / 1000;
            intThousand += thousand * person;
            intMoney %= 1000;
            int fiveHundred = intMoney / 500;
            intFiveHundred += fiveHundred * person;
            intMoney %= 500;
            int hundred = intMoney / 100;
            intHundred += hundred * person;
        }

        return ("一千元 : " + intThousand + "張，五百元 : " + intFiveHundred + "張，一百元 : " + intHundred + "張").toString();

    }
}
