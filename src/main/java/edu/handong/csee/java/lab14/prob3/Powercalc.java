package edu.handong.csee.java.lab14.prob3; //package name

public class Powercalc { //this class is for executing power operation

	private int n, p = 1; //private instance variables.

	public Powercalc() { //constructor

	}

	public long power (int n, int p) throws Exception{ //power() method throws Exception. It is just a heading.
		this.n = n; //set n value
		this.p = p; //set p value

		if(n == 0 && p ==0)  //when n and p is zero
			throw new Exception("n and p should not be zero."); //throw the Exception with the String message

		else if(n <0 || p < 0) //when n or p is negative
			throw new Exception("n or p should not be negative."); //throw the Exception with the String message

		return (long) Math.pow(n,p); //return the calculated value
	}
}
