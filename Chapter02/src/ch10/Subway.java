package ch10;

public class Subway {
	
	int number;
	int money;
	int passengerCount;
	
	public Subway(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(number + "�� ����ö�� �°���" + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�");
	}
	
	

}
