package com.autowiring;

public class Heart {
	
	
	private String name;
	private int number_of_hearts;
	public void pump(){
		
		
		System.out.println("Heart Pumping ");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber_of_hearts() {
		return number_of_hearts;
	}
	public void setNumber_of_hearts(int number_of_hearts) {
		this.number_of_hearts = number_of_hearts;
	}
}
