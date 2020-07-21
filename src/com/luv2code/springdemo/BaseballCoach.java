package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//constructor injection
	
	//1.define private field for dependency
	private FortuneService fortuneService;
	//2. build class constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
		
	}
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Baseball coach!!";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
