package com.sample;

public class Overloading {
	public String details(String sim1) {
		return "Name :Harsh kumar \n Role: Ase\n contact number:7004012674";	
	}
	public String details(String sim1 ,String sim2) {
		return "Name :Harsh kumar\n Role: Ase\n contact number: 7004012674";
	}
	public static void main (String[] args) {
		Overloading overloading = new Overloading();
		System.out.println(overloading.details("sim1"));
		System.out.println(overloading.details("sim1","sim2"));
		
	}

}
