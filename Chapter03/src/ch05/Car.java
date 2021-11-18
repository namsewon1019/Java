package ch05;

public abstract class Car {
	
	public void startCar() {
		System.out.println("�ڵ����� �õ��� �̴ϴ�");
	}
	public void turnOff() {
		System.out.println("�ڵ����� �õ��� ���ϴ�");
	}
	
	public abstract void drive();
	public abstract void stop();
	
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
