package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping({"/doCount"})
	@ResponseBody
	public String doCount(@RequestBody JSONObject obj, HttpServletRequest request){
		int intThousand, intFiveHundred, intHundred;
		intThousand = intFiveHundred = intHundred = 0;

		for(int i = 0; i < obj.size(); i++) {
			String [] strRedEnvelope = obj.getString(Integer.toString(i)).split("/");
			int intMoney = Integer.parseInt(strRedEnvelope[0]);
			int intPerson = Integer.parseInt(strRedEnvelope[1]);
			int Thousand = intMoney / 1000;
			intThousand += Thousand * intPerson;
			intMoney %= 1000;
			int FiveHundred = intMoney / 500;
			intFiveHundred += FiveHundred * intPerson;
			intMoney %= 500;
			int Hundred = intMoney / 100;
			intHundred += Hundred * intPerson;
		}

		return ("一千元 : " + intThousand + "張，五百元 : " + intFiveHundred + "張，一百元 : " + intHundred + "張").toString();

	}


}



