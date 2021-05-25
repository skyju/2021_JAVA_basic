package ws1.java2.driver;

import ws1.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.sortByName();
		vm.displayVehicles2(">>재고목록<<");
	}
}
