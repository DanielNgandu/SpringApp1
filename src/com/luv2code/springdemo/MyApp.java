package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
     //create the object 
	 Coach baseball = new BaseballCoach();
	 Coach track = new TrackCoach();

		
	//use the object	
	 System.out.println(baseball.getDailyWorkout());
	 System.out.println(track.getDailyWorkout());

//	 baseballCoach.getDailyWorkout();
	}

}
