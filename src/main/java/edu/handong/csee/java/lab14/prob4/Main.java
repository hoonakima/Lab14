package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean repeat = true;

		try {
			Scanner in = new Scanner(System.in);

			while(repeat){

				System.out.print("Enter an integer: ");
				int a =in.nextInt();
				Boundary.receiveInput(a);	

			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index access!");
			repeat = false;
		}
	}

}
