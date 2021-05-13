package com.test.workshop3.doctor;

public class Surgeon extends Doctor {

	public Surgeon(String name) {
		super.setName(name);
		super.setDepartment("외과");
		displayingInfo();
	}
	public Surgeon() {}
    public void performSurgery() {
    	System.out.println("수술을 집도하다.\n");
    }
    public void displayingInfo() {
    	super.displayingInfo();
    	performSurgery();
    }
}