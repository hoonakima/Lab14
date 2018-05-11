package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(System.in);
			System.out.println();
			String s = in.nextLine();
			
			Main tester = new Main();
			tester.myTest(s);
		}
		catch(MyException mae) {
			System.out.println("Inside catch block: " + mae);
		}

	}

	public static void myTest(String s) throws MyException {
		
		if(s.equalsIgnoreCase("null"))
			throw new MyException("String val is null");
		else
			System.out.println("String val is " + s);



	}

}
