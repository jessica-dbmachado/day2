package com.simplelearn.com;

/**
 * @author J_Machado
 *
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		Car honda = new Car ();
		honda.addGallons(2);
		System.out.println(honda.getAmtGasoline());
		//just a comment
		
		//array
		String[] testarray= {"1st elemnt", "2nd element","3rd element","4th element","5th element"};
		for (int i = 0; i <= 2; i++) {
			  System.out.println("i= " + i + " Array content: "+testarray[i]+ "\n");
			  //test123
			}
	}

}
