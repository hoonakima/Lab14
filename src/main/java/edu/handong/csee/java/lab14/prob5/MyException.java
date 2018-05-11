package edu.handong.csee.java.lab14.prob5; //package name

public class MyException extends Exception { //customized exception class that inherits Exception class

	String message = null;  //message data
	
	public MyException() { //default constructor
		super(); //call super constructor
	}
	
	public MyException(String message) { //constructor
		super(message); //call super constructor
		this.message = message; //set message data as input parameter
	} 
	
	public String toString() { //overrides toString() method
		return message; //return message data
	}

}
