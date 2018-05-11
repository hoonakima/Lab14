package edu.handong.csee.java.lab14.prob5; //package name

import java.util.Scanner; //import Scanner class

public class Main { //Main class

	public static void main(String[] args) { //starts this program

		try { //try block that throws exceptions
			Scanner in = new Scanner(System.in); //instantiation
			System.out.println(); //shows console window
			String s = in.nextLine(); //get String value
			
			Main tester = new Main(); //instantiation 
			tester.myTest(s); //call myTest method
		}
		catch(MyException mae) { //catch a created MyException 
			System.out.println("Inside catch block: " + mae); //print the line and print return value of toString method which is in MyException class
		}

	}

	public static void myTest(String s) throws MyException { //static method which throws MyException
		
		if(s.equalsIgnoreCase("null")) //when an input String class parameter is same as "null"
			throw new MyException("String val is null"); //creates MyException instance with the error message
		else 						   //other cases
			System.out.println("String val is " + s); // print the input String parameter



	}

}
