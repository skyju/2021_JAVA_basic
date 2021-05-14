package ws1.java2.entity;

public class Car extends Vehicle {
	private int mileage;
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMileage() {
		return this.mileage;
	}
	public Car(String modelName,
			 int maxSpeed,
			 int numberLimit,
			 int mileage,
			 boolean available) {
		super(modelName, maxSpeed, numberLimit, mileage, available);
	}
	public void displayInfo() {
		if(getAvailable()==true) {
		super.displayInfo();
		System.out.println(" ��տ��� : " + getMileage() + "km/l");
		} else {
			System.out.println("���� ��� ������ ���°� �ƴմϴ�.");
		}
	}
}
