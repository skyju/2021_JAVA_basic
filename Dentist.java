package com.test.workshop3.doctor;

public class Dentist extends Doctor {
	
	public Dentist(String name) {
		super.setName(name);
		super.setDepartment("치과");
		displayingInfo();
	}
	public Dentist() {}
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.\n");
	}
	public void displayingInfo() {
    	super.displayingInfo();
    	pullOutTooth();
    }

}