package ws1.java2.entity;

public class Vehicle {
	protected String modelName;
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelName() {
		return this.modelName;
	}
	protected int maxSpeed;
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	protected int numberLimit;
	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}
	public int getNumberLimit() {
		return this.numberLimit;
	}
	protected boolean available;
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public boolean getAvailable() {
		return this.available;
	}
	public Vehicle(String modelName,
			 int maxSpeed,
			 int numberLimit,
			 int extraInfoNum,
			 boolean available) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.available = available;
	}
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도: " + getMaxSpeed() + "km/h");
		System.out.println(" 최대정원: " + getNumberLimit() + "명");
	}
}
