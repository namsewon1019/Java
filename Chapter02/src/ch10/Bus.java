package ch10;

public class Bus {
	String number;
	int passengerCount;
	int money;
	
	public Bus(String number) {
		this.number = number;
		
	}
	
	public void take(int money) {
		this.money = money;
		this.passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(number + "�� ������ �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}

}
