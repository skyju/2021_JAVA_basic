package ws1.java2.entity;

public class Airplane extends Vehicle {
	private int numOfEngine;
	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}
	public int getNumOfEngine() {
		return this.numOfEngine;
	}
	public Airplane(String modelName,
			 int maxSpeed,
			 int numberLimit,
			 int numOfEngine,
			 boolean available) {
		super(modelName, maxSpeed, numberLimit, numOfEngine, available);
	}
	public void displayInfo() {
		if(getAvailable()==true) {
		super.displayInfo();
		System.out.println(" 엔진개수 :" + getNumOfEngine() + "개");
		} else {
			System.out.println("현재 사용가능한 상태가 아닙니다.");
		}
	}
}
