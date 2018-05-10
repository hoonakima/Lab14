package edu.handong.csee.java.lab14.prob1; //package name

import java.util.Random; //import Random class
import java.util.Scanner; //import Scanner class

public class Main { //In Main class, get limit and speed value.

	
	public static void main(String[] args) { //starts this program

		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		
		System.out.println("Set the speed limit, officer: "); // print the line
		int speedLimit = keyboard.nextInt(); //get the value 
		
		Random n = new Random(); //create a Random instance n
		int speed = n.nextInt(100); //get random number between 0 to 100.
		
		SpeedLimiter mySpeedLimiter = new SpeedLimiter(speed ,speedLimit); //instantiate SpeedLimiter class
		mySpeedLimiter.warnSpeedLimit(); //call the method
		

	}

}
