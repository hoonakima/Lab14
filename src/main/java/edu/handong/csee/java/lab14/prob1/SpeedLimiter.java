package edu.handong.csee.java.lab14.prob1; //package name


public class SpeedLimiter { //define a SpeedLimiter class

	private int speed; //instance variable
	private int speedLimit; //instance variable


	public SpeedLimiter(int speed,int speedLimit) { //constructor
		this.speed = speed; //set speed 
		this.speedLimit = speedLimit; //set speedLimit
	}


	public void warnSpeedLimit() { //it detects whether speed exceeds the limit or not.
		try { //try block to handle an exception

			if(speed > speedLimit) //when someone's speed exceeds the limit
				throw new Exception("Speed Limit " + speedLimit + "km exceeded!"); //throw the exception with String value, which means create the Exception instance. 

			System.out.println("You are a law abiding citizen!"); //print the line when someone's speed does not exceed the limit
		}catch(Exception e) {//catch block. The parameter is the thrown Exception instance.

			System.out.println(e.getMessage()); //print the String returned by getMessage method
			System.out.println("You are being fined."); //print the line
		}

		System.out.println("Your current speed: " + speed + "km"); //print the line

	}

}
