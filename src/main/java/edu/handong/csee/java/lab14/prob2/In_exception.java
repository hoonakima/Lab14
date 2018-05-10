package edu.handong.csee.java.lab14.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception{

	private int x, y = 0;
	
	public In_exception() {
		
	}

	public void error() {
		try{
			Scanner keyboard = new Scanner(System.in);

			System.out.print("x: ");
			x = keyboard.nextInt();
			System.out.print("y: ");
			y = keyboard.nextInt();
			
			System.out.println(x/y);

		}
		catch(InputMismatchException e) {
			e = new InputMismatchException("java.util.InputMismatchException");
			System.out.println(e.getMessage());
			
//			System.out.println("java.util.InputMismatchException");
		}
		catch(ArithmeticException e) {
			e = new ArithmeticException("java.lang.ArithmeticException: / by zero");
			System.out.println(e.getMessage());
			
//			System.out.print("java.lang.ArithmeticException: ");
//			System.out.println(e.getMessage());
		}
		
		
	}
}
