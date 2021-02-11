package com.simplelearn.com;

public class Car {
	
	private String type = "jesk";
	private int amtGasoline =26;
	private String color="";
	
	
	public int getAmtGasoline() {
		return amtGasoline;
	}
	public void setAmtGasoline(int amtGasoline) {
		this.amtGasoline = amtGasoline;
	}

	public int addGallons (int gallons)
	{
		amtGasoline +=gallons;
		
		return amtGasoline;
	}

}
