package ws1.java2.controller;
import java.util.*;
import ws1.java2.entity.*;

public class VehicleManager {
		ArrayList vehicles = new ArrayList();
		
	public VehicleManager() {//������
		vehicles.add(new Airplane("����747",1300,300,4,true));
		vehicles.add(new Airplane("F-15",1600,1,1,true));
		vehicles.add(new Car("�׷���",180,5,10,true));
		vehicles.add(new Car("����ũ",130,4,15,true));
		vehicles.add(new Car("��Ÿ����",150,10,11,true));
		vehicles.add(new Ship("ũ����2",30,400,35000,true));
		vehicles.add(new Ship("��ƿ����",25,150,15000,true));
	}
	
	public void displayVehicles1(String title) {
		System.out.println(title);
		for (int inx = 0 ; inx < vehicles.size() ; inx++) {
			Vehicle v = (Vehicle)vehicles.get(inx);
			v.displayInfo();
		}
		System.out.println();
	}
	
	public void displayVehicles2(String title) {
		System.out.println(title);
		Iterator itr = vehicles.iterator();
		while(itr.hasNext()) {
			Vehicle v = (Vehicle)itr.next();
			v.displayInfo();
		}
	}
}

