package com.test.workshop3.doctor;

public class Surgeon extends Doctor {

	public Surgeon(String name) {
		super.setName(name);
		super.setDepartment("�ܰ�");
		displayingInfo();
	}
	public Surgeon() {}
    public void performSurgery() {
    	System.out.println("������ �����ϴ�.\n");
    }
    public void displayingInfo() {
    	super.displayingInfo();
    	performSurgery();
    }
}