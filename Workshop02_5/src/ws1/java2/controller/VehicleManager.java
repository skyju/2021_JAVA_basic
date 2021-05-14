package ws1.java2.controller;
import ws1.java2.entity.*;

public class VehicleManager {
	Vehicle[] VehicleArr = new Vehicle[7];
	public VehicleManager() {//������
		VehicleArr[0] = new Airplane("����747",1300,300,4,true);
		VehicleArr[1] = new Airplane("F-15",1600,1,1,true);
		VehicleArr[2] = new Car("�׷���",180,5,10,true);
		VehicleArr[3] = new Car("����ũ",130,4,15,true);
		VehicleArr[4] = new Car("��Ÿ����",150,10,11,true);
		VehicleArr[5] = new Ship("ũ����2",30,400,35000,true);
		VehicleArr[6] = new Ship("��ƿ����",25,150,15000,true);
	}
	public void displayVehicles(String title) {
		System.out.println(title);
		for (int inx = 0 ; inx < VehicleArr.length ; inx++) {
			VehicleArr[inx].displayInfo();
		}
		System.out.println();
	}
}

