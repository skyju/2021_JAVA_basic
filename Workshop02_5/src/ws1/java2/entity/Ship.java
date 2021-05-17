package ws1.java2.entity;

public class Ship extends Vehicle {
	private int replacement;
	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}
	public int getReplacement() {
		return this.replacement;
	}
	public Ship(String modelName,
			 int maxSpeed,
			 int numberLimit,
			 int replacement,
			 boolean available) {
		super(modelName, maxSpeed, numberLimit, replacement,available);
	}
	public void displayInfo() {
		if(getAvailable()==true) {
		super.displayInfo();
		System.out.println(" �� �� �� : " + getReplacement() + "��");
		} else {
			System.out.println("���� ��� ������ ���°� �ƴմϴ�.");
		}
	}
}
