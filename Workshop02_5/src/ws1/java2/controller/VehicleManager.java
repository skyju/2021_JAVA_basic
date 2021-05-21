package ws1.java2.controller;
import java.util.*;
import ws1.java2.entity.*;

public class VehicleManager {
		ArrayList vehicles = new ArrayList();
		
	public VehicleManager() {//생성자
		vehicles.add(new Airplane("보잉747",1300,300,4,true));
		vehicles.add(new Airplane("F-15",1600,1,1,true));
		vehicles.add(new Car("그랜저",180,5,10,true));
		vehicles.add(new Car("스파크",130,4,15,true));
		vehicles.add(new Car("스타렉스",150,10,11,true));
		vehicles.add(new Ship("크루즈2",30,400,35000,true));
		vehicles.add(new Ship("노틸러스",25,150,15000,true));
	}
	public void sortByName() {
		Collections.sort(vehicles, new Comparator<Vehicle>() {
		@Override
			public int compare(Vehicle o1, Vehicle o2) {
				return o1.getModelName().compareTo(o2.getModelName());
			}
		});
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

