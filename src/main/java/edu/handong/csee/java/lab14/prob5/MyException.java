package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception {

	String message = null; 
	
	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
		this.message = message;
	} 
	
	public String toString() {
		return message;
	}

}
