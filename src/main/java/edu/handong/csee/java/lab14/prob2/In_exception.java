package edu.handong.csee.java.lab14.prob2; //package name

import java.util.InputMismatchException; //import InputMismatchException class
import java.util.Scanner; //import Scanner class

public class In_exception{ //define In_exception class

	private int x, y = 0; //private instance variable
	
	public In_exception() { //constructor
		
	}

	public void error() { //error() method detects an input error
		try{ //try block to detect exceptions
			Scanner keyboard = new Scanner(System.in); //instantiate

			System.out.print("x: "); //print the line
			x = keyboard.nextInt(); //get the value
			System.out.print("y: "); //print the line
			y = keyboard.nextInt(); //get the value
			
			System.out.println(x/y); //print the value

		}
		catch(InputMismatchException e) { //when Input is not integer, the predefined exception is thrown, and this catch block catches it.
			e = new InputMismatchException("java.util.InputMismatchException"); //create new e instance with the String parameter
			System.out.println(e.getMessage()); //print the String returned by getMessage()
			
			//other way
			//System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException e) { //catch block for thrown ArithmeticException instance
			e = new ArithmeticException("java.lang.ArithmeticException: / by zero"); //create new e instance with the paramter
			System.out.println(e.getMessage()); //print the String which is the constructor parameter
			
			//other way
			//System.out.print("java.lang.ArithmeticException: "); //print the line
			//System.out.println(e.getMessage()); //print "/ by zero " which is a default message value
		}
		
		
		
	}
}
