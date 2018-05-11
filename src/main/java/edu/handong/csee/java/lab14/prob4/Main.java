package edu.handong.csee.java.lab14.prob4; //package name

import java.util.Scanner; //import Scanner class

public class Main { //Main class

	public static void main(String[] args) { //starts this program

		boolean repeat = true; //it makes to start the while loop

		try { //try block to throw exceptions
			Scanner in = new Scanner(System.in); //instantiate

			while(repeat){ //iterates the loop while repeat is true

				System.out.print("Enter an integer: "); //print the line
				int a =in.nextInt(); //get input value
				Boundary.receiveInput(a); //call the method to send an input value

			}
		}
		catch(ArrayIndexOutOfBoundsException e) {  //catch a created exception 
			System.out.println("Invalid array index access!"); //print the error message
			repeat = false; //stop the while loop
		}
	}

}
