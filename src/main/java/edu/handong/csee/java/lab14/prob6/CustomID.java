package edu.handong.csee.java.lab14.prob6;

public class CustomID {

	private String name = null;
	private int age = 1;
	private String race;
	static private String[] validRaces = new String[] {"Vulcans", "Romulan", "Klingons"};
	static private int state = 0;

	public CustomID() {

	}

	public void receiveName(String name) throws Exception{

		if(name.length() < 5) {
			throw new Exception("Your name is short! Try again!");

		}

		else{
			System.out.println("Name is valid");
			this.name = name;
			System.out.println("Name: " + this.name);
			state++;
		}

	}
	public void receiveAge(int age) throws Exception{
		if(age < 18) {
			throw new Exception("You are too young! Try again!");
		}
		else {
			System.out.println("Age is valid");
			this.age = age;
			System.out.println("Age: " + this.age);
			state++;

		}
	}
	public void receiveRace(String race) throws Exception{

		int raceDetector = 0;

		for(String r: validRaces) {
			if(r.equalsIgnoreCase(race))
				raceDetector++;
		}
		if(raceDetector == 1) {
			System.out.println("Race is valid");
			this.race = race;
			System.out.println("Race: " + this.race);
			state = 0;
		}
		else{
			throw new Exception("Human! Try again.");
		}


	}
	public int getState() {
		return state;
	}
}
