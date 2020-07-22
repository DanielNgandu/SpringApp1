package com.luv2code.springdemo;

public class CricketCoach  implements Coach{
	//1.define private field for dependency
	private FortuneService fortuneService;
	
	//add private fields
	private String emailAddress;
	private String team;
	
	//array
	String fortunesArray[]; 

	public void setFortunesArray(String[] fortunesArray) {
		this.fortunesArray = fortunesArray;
	}


	public String[] getFortunesArray() {
		return fortunesArray;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setemailAddress");

		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setTeam");

		this.team = team;
	}


	public CricketCoach() {
		super();
		System.out.println("CricketCoach: inside no-arg constructor");

	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket workout.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
//		return "Cricket good vibes che!";
		return "Hello =="+fortuneService.getFortune();
	}
	//Setter dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Hey!Am in CricketCoach class as hostage under setter!");
		this.fortuneService = fortuneService;
	}


}
