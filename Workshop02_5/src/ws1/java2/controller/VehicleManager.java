package ws1.java2.controller;
import ws1.java2.entity.*;

public class VehicleManager {
	Vehicle[] VehicleArr = new Vehicle[7];
	public VehicleManager() {//생성자
		VehicleArr[0] = new Airplane("보잉747",1300,300,4,true);
		VehicleArr[1] = new Airplane("F-15",1600,1,1,true);
		VehicleArr[2] = new Car("그랜저",180,5,10,true);
		VehicleArr[3] = new Car("스파크",130,4,15,true);
		VehicleArr[4] = new Car("스타렉스",150,10,11,true);
		VehicleArr[5] = new Ship("크루즈2",30,400,35000,true);
		VehicleArr[6] = new Ship("노틸러스",25,150,15000,true);
	}
	public void displayVehicles(String title) {
		System.out.println(title);
		for (int inx = 0 ; inx < VehicleArr.length ; inx++) {
			VehicleArr[inx].displayInfo();
		}
		System.out.println();
	}
}

