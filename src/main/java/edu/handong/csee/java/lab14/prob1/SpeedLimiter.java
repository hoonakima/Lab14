package edu.handong.csee.java.lab14.prob1; //package name

import java.util.Random; // import Random class
import java.util.Scanner; // import Scanner class

public class SpeedLimiter { //define a SpeedLimiter class
	
	Random n = new Random(); //create a Random instance n
	int speed = n.nextInt(100); //instance variable which is random number between 0 to 100.
	private int speedLimit; //private instance variable
	
	public static void main(String[] args) { //starts this program
		
		SpeedLimiter mySpeedLimiter = new SpeedLimiter(); //instantiate SpeedLimiter class
		mySpeedLimiter.warnSpeedLimit(); //call the method

	}
	
	public void warnSpeedLimit() { //define warnSpeedLimit method
		try { //try block to handle exceptions
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		
		System.out.println("Set the speed limit, officer: "); // print the line
		speedLimit = keyboard.nextInt(); //get the value 
	
		
		if(speed > speedLimit) //when someone's speed exceeds speedLimit
			throw new ViolateSpeedLimitException(); //throw the exception, which means create the exception instance. 
		 
		 	
		}catch(ViolateSpeedLimitException e) { 	//catch block. The parameter is thrown Exception instance.
	
			System.out.println("Speed Limit " + speedLimit + "km exceeded!"); //print the line when exceed the limit
			System.out.println("You are being fined."); //print the line
			System.out.println("Your current speed: " +speed + "km"); //print the line
			System.exit(0); //exit this method
		}
		
		System.out.println("You are a law abiding citizen!"); //print the line when do not exceed the limit
		System.out.println("Your current speed: " + speed + "km"); //print the line
		
	}

}
