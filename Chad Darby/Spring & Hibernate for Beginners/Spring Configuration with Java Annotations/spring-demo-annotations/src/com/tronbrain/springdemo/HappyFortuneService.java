package com.tronbrain.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(">>> 123");
	}

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
