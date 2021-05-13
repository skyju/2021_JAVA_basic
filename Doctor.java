package com.test.workshop3.doctor;

public class Doctor {
    
    private String name;
    private String department;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Doctor( String name, String department ) {
        this.name = name;
        this.department = department;
    }
	public Doctor() {}
    
    public void treatPatient() {
        System.out.println( "환자를 진료합니다." );
    }
    
    @Override
    public String toString() {
        return department + " : " + name + " 선생님";
    }
    
    public void displayingInfo() {
    	System.out.println(toString());
    	treatPatient();
    }
}