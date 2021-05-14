package com.test.workshop3.doctor;

public class Surgeon extends Doctor {

	public Surgeon(String name) {
		super.setName(name);
		super.setDepartment("외과");
		displayingInfo();
	}
	public Surgeon() {}
    public void performSurgery() {
    	System.out.println("수슬을 집도하다.");
    }
    public void displayingInfo() {
    	super.displayingInfo();
    	performSurgery();
    	System.out.println();
    }
}