package com.test.workshop3.doctor;

public class Dentist extends Doctor {
	
	public Dentist(String name) {
		super.setName(name);
		super.setDepartment("ġ��");
		displayingInfo();
	}
	public Dentist() {}
	public void pullOutTooth() {
		System.out.println("�̸� �̽��ϴ�.\n");
	}
	public void displayingInfo() {
    	super.displayingInfo();
    	pullOutTooth();
    }

}