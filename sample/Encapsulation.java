package com.sample;

public class Encapsulation {
	//private data members
		private String account_holder;
		private int CVV;
		private double balance;
		private int OTP;
		
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getOTP() {
		return OTP;
	}
	public void setOTP(int oTP) {
		OTP = oTP;
	}
	public static void main(String[] args ) {
		Encapsulation encap=new Encapsulation();
		encap.setAccount_holder("Harsh");
		encap.setBalance(1000000.000);
		encap.setCVV(386);
		encap.setOTP(123);
		System.out.println(encap.getAccount_holder()+"\n"+encap.getBalance()+"\n"+encap.getOTP()+"\n"+encap.getOTP()
		);
	}
	
	

}
