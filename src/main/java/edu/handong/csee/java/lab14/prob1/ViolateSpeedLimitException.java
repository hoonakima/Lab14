package edu.handong.csee.java.lab14.prob1; //package name

public class ViolateSpeedLimitException extends Exception { //define my own exception. It should be a derived class of Exception class.

	public ViolateSpeedLimitException() { //default constructor
		super(); //call base class constructor
	}
	
	public ViolateSpeedLimitException(String message) { //constructor which parameter is String
	
		super(message); // The message parameter will be used in getMessage() method.
	}
}
