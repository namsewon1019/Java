package ch10;

public class GasStation {
	String adders;
	int gasAccount;
	int money;
	
	public GasStation(String adders) {
		this.adders = adders;
		this.gasAccount = 10;
	}
	
	public int oiling(int liter) {
		this.gasAccount -= liter;
		this.money += 6000*liter;
		return 6000*liter;
	}
	
	public void showInfo() {
		System.out.println(adders + "�������� �����⸧�� " + gasAccount + "�̰�, ������" + money + "�� �Դϴ�");
	}

}
