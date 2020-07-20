package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
	     //load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		//call methods on bean
		System.out.println(thecoach.getDailyWorkout());
		//close context
		context.close();
	
		}
}
