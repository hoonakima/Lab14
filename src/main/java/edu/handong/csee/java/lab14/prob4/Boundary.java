package edu.handong.csee.java.lab14.prob4;

public class Boundary {

	private static int[] arr = new int[5];
	private static int i =0;

	public Boundary() {

	}

	static public void receiveInput(int a) {

		arr[i] = a;

		System.out.println("arr["+ i + "]<- " + arr[i]);

		i++;

	}

}
