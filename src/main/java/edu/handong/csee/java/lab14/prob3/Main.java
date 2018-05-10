package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Powercalc my_calculator = new Powercalc();
		Scanner in =new Scanner(System.in);
		
		System.out.println();
		
		while(in.hasNextInt()) {
		int n = in.nextInt();
		int p = in.nextInt();
		
		try {
			System.out.println(my_calculator.power(n, p));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}

}
