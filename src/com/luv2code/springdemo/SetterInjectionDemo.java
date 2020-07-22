package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {

	public SetterInjectionDemo() {
		// TODO Auto-generated constructor stub
		super();

	}

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get beans
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);


		//read from beans
		System.out.println(cricketCoach.getDailyFortune());
		
		//get literal values
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());

		
       //close context
		context.close();
	}

}
