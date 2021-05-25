package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("홍길동"));
        dent.add(new Dentist("전우치"));
        
        surg.add(new Surgeon("임꺽정"));
        surg.add(new Surgeon("홍길순"));
        surg.add(new Surgeon("광개토"));
        
    }
}