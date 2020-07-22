package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public BeanScopeDemoApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopes-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		
		
		boolean result = (theCoach == theCoach1);

		//call methods on bean
		
		System.out.println(result);
		
		
		//close context
		context.close();


	}

}
