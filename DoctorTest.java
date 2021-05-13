package com.test.workshop3.doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorTest {
    
    public static void main( String[] args ) {
        
        List<Dentist> dent = new ArrayList<Dentist>();
        List<Surgeon> surg = new ArrayList<Surgeon>();
        
        dent.add(new Dentist("È«±æµ¿"));
        dent.add(new Dentist("Àü¿ìÄ¡"));
        surg.add(new Surgeon("ÀÓ²©Á¤"));
        surg.add(new Surgeon("È«±æ¼ø"));
        surg.add(new Surgeon("±¤°³Åä"));
        
    }
}