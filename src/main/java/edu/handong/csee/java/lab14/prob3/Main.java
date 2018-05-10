package edu.handong.csee.java.lab14.prob3; //package name

import java.util.Scanner; //import Scanner class

public class Main { //Main class

	public static void main(String[] args) { //starts this program

		Powercalc my_calculator = new Powercalc(); //instantiate Powercalc
		Scanner in = new Scanner(System.in); //instantiate Scanner
		
		System.out.println(); //show a console window
		
		while(in.hasNextInt()) { //iterate this loop while "the next token in this scanner's input can be interpreted as an int value" 
		int n = in.nextInt(); //get n value
		int p = in.nextInt(); //get p value
		
		try { //try block to throw an exception when it is needed.
			System.out.println(my_calculator.power(n, p)); //print the return value of the power() method
		}
		catch(Exception e) { //catch an thrown exception
			System.out.println(e); //the parameter of println is Object. It prints out String value of the input Object.
		}
		}
	}

}
