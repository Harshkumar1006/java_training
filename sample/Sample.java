package com.sample;

public class Sample {
	int a=100;
	static String org= "Accenture";
	void set(int x) {
		System.out.println(x);
	}
	static {
		System.out.println(org);
	}
	{
		a=500;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Sample sample=new Sample();
		System.out.println(sample);
		sample.set(300);
		System.out.println(org);
		System.out.println(sample.a);
		int a=3;
		int b=3;
//		System.out.println(a==b);
//		System.out.println(a!=b);
//		System.out.println(a<b);
//		System.out.println(a<=b);
		System.out.println(a>=b);
//		
		System.out.println(true^true);
		System.out.println(false^true);

//      and&
	
		System.out.println(true&false);
		System.out.println(true&true);
		System.out.println(false&true);
		System.out.println(false&false);
		
//      and and &&
		System.out.println(true&&false);
		System.out.println(true&&true);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
//     0r(|)
		System.out.println(true | false);
		System.out.println(true|true);
		System.out.println(false|true);
		System.out.println(false|false);
		
//      or(||)
		System.out.println(true||false);
		System.out.println(true||true);
		System.out.println(false||true);
		System.out.println(false||false);
		
		
		
	}
}
