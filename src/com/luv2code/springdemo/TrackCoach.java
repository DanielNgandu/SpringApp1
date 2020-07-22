package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	//constructor injection
	
	//1.define private field for dependency
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Track Coach here!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Good job fellas- Track";
	}
	
	//add startup method
	public void doMyStartupStuff() {
		System.out.println("I am in doMyStartupStuff init method. ");

		
	}
	
	//add destroy method
public void doMyCleanupStuffYoYo() {
	System.out.println("I am in doMyCleanupStuffYoYo destroy method. ");
		
	}

}
