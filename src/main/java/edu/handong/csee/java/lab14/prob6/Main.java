package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;

public class Main {

	static boolean repeat = true;

	public static void main(String[] args) {

		Main tester = new Main();
		while(repeat) {
			try {
				Scanner in = new Scanner(System.in);
				CustomID myCustomID = new CustomID();
				int state = myCustomID.getState();

				if(state == 0) {
					System.out.print("Enter your name: ");
					String name = in.nextLine();
					myCustomID.receiveName(name);
				}
				else if(state == 1) {

					System.out.print("Enter your age: ");
					int age = in.nextInt();
					myCustomID.receiveAge(age);
				}
				else if(state == 2){
					System.out.print("Enter your race: ");
					String race = in.nextLine();
					myCustomID.receiveRace(race);
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				repeat = true;
			}
		}
	}

}
