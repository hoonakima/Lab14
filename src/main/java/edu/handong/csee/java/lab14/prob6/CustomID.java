package edu.handong.csee.java.lab14.prob6; //package name	

public class CustomID { //Customizing ID information class

	private String name = null; //name data
	private int age = 1; //age data
	private String race; //race data
	static private String[] validRaces = new String[] {"Vulcans", "Romulan", "Klingons"}; //valid race data
	private int state = 0; //state data for distinguishing each data

	public CustomID() { //constructor

	}

	public void receiveName(String name) throws Exception{ //receiveName method that throws Exception

		if(name.length() < 5) { //when the length of name is shorter than 5
			state = 0; //indicates this state covers name data
			throw new Exception("Your name is short! Try again!"); //create Exception with the String message

		}

		else{  //when the length of name is same or longer than 5
			System.out.println("Name is valid"); //print the line
			this.name = name; //set name data
			System.out.println("Name: " + this.name); //print name data
			state++; //increase state number to cover other data
		}

	}
	public void receiveAge(int age) throws Exception{ //receives age data 
		if(age < 18) { //when younger than 18
			state = 1; // indicates this state covers age data
			throw new Exception("You are too young! Try again!"); //create Exception with the String message
		}
		else { //when same with or older than 18
			System.out.println("Age is valid"); //print the line
			this.age = age; //set age data
			System.out.println("Age: " + this.age); //print age data
			state++; //increase state number to cover other data

		}
	}
	public void receiveRace(String race) throws Exception{ //receives race data

		int raceDetector = 0; //it shows whether race is valid or not
		state = 2; //indicates this state covers race data

		for(String r: validRaces) { //for all elements of valid race array
			if(r.equalsIgnoreCase(race)) //when input parameter is same with one elements of validRace
				raceDetector++; //increase the value
		}
		if(raceDetector == 1) { //it indicates input race data is valid
			System.out.println("Race is valid"); //print the line
			this.race = race; //set race data
			System.out.println("Race: " + this.race); //print race data
			state = 0; //restart getting ID info for others
		}
		else{ //it indicates input race is not valid one
			throw new Exception("Human! Try again."); //create the Exception with the String message
		}


	}
	public int getState() { //getter for state value
		return state; //returns state value
	}
}
