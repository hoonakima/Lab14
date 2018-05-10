package edu.handong.csee.java.lab14.prob3;

public class Powercalc {

	private int n, p = 1;
	
	public Powercalc() {
		
	}
	
	public long power (int n, int p) throws Exception{
		this.n = n;
		this.p = p;
		
		if(n == 0 && p ==0) 
			throw new Exception("n and p should not be zero.");
			
		else if(n <0 || p < 0) 
			throw new Exception("n or p should not be negative.");
			
		return (long) java.lang.Math.pow(n,p);
	}
}
