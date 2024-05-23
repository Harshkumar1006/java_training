package com.sample;
 
class Cardetails {
	private String name;
	private String model;
	private String year;
	private String color;
	private String  date_of_purchase;
	
	public Cardetails(String name, String model,String year,String color,String date_of_purchas){
		this.name = name;
		this.model= model;
		this.year = year;
		this.color = color;	
		
		
	}
	public void show() {
		System.out.println("Name : "+name);
		System.out.println("Model : "+model);
		System.out.println("Year : "+year);
		System.out.println("Color : "+color);
		System.out.println("date of purchase :"+2000);
	}
}
 
public class Car {

	public static void main(String[] args) {
		Cardetails cardetails =new Cardetails("Mustang","gt","1969","black" , "2000");
		cardetails.show();
	}

}
 
 