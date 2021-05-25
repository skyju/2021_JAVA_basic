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
		this.mileage = mileage;
	}
	public void displayInfo() {
		if(getAvailable()==true) {
		super.displayInfo();
		System.out.println(" 평균연비 :" + getMileage() + "km/l");
		} else {
			System.out.println("현재 사용가능한 상태가 아닙니다.");
		}
	}
}
