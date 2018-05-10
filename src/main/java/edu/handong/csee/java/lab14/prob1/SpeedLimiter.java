package edu.handong.csee.java.lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class SpeedLimiter {
	
	static Random n = new Random();
	static int speed = n.nextInt(100);
	private int speedLimit;
	
	public static void main(String[] args) {
		
		SpeedLimiter mySpeedLimiter = new SpeedLimiter();
		mySpeedLimiter.warnSpeedLimit();

	}
	
	public void warnSpeedLimit() {
		try {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Set the speed limit, officer: ");
		speedLimit = keyboard.nextInt();
	
		
		if(speed > speedLimit)
			throw new ViolateSpeedLimitException(); 
		 
		 	
		}catch(ViolateSpeedLimitException e) {
	
			System.out.println("Speed Limit " + speedLimit + "km exceeded!");
			System.out.println("You are being fined.");
			System.out.println("Your current speed: " +speed + "km");
			System.exit(0);
		}
		
		System.out.println("You are a law abiding citizen!");
		System.out.println("Your current speed: " + speed + "km");
		
	}

}
