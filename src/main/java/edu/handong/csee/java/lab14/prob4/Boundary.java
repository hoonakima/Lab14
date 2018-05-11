package edu.handong.csee.java.lab14.prob4; //package name

public class Boundary { //Boundary class

	private static int[] arr = new int[5]; //array with size 5
	private static int i =0; //static variable

	public Boundary() { //constructor

	}

	static public void receiveInput(int a) { //this static method receives inputs by a parameter

		arr[i] = a; //set array element value by input

		System.out.println("arr["+ i + "]<- " + arr[i]); //print array element value

		i++; //increase one for a next array element

	}

}
