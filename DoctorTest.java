package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("ȫ�浿"));
        dent.add(new Dentist("����ġ"));
        surg.add(new Surgeon("�Ӳ���"));
        surg.add(new Surgeon("ȫ���"));
        surg.add(new Surgeon("������"));
        
    }
}