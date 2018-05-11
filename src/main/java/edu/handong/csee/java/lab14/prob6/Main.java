package edu.handong.csee.java.lab14.prob6; //package name

import java.util.Scanner; //import Scanner class

public class Main { //Main class

	public static void main(String[] args) { //starts this program

		boolean repeat = true;  //indicates whether repeat or not
		
		while(repeat) { //iterates the loop until repeat is true 
			try { //try block 
				Scanner in = new Scanner(System.in); //instantiation
				CustomID myCustomID = new CustomID(); //instantiation
				int state = myCustomID.getState(); //set state value by getting the value from CustomID class

				if(state == 0) { //when state is zero, which means it covers name data
					System.out.print("Enter your name: "); //print the line
					String name = in.nextLine(); //get name data
					myCustomID.receiveName(name); //call receiveName method
				}
				else if(state == 1) { //when state is one, which means it covers age data

					System.out.print("Enter your age: "); //print the line 
					int age = in.nextInt(); //get age data
					myCustomID.receiveAge(age); //call receiveAge method
				}
				else if(state == 2){ //when state is two, which means it covers race data
					System.out.print("Enter your race: "); //print the line
					String race = in.nextLine(); //get race data
					myCustomID.receiveRace(race); //call receiveRace method
				}
			}
			catch(Exception e) { //catch a created Exception
				System.out.println(e.getMessage()); //print the message
				repeat = true; //repeat the loop
			}
		}
	}

}
