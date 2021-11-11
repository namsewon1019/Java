package ch02;

public class Customer {
	

	
	protected static int number = 100;
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer(String name) {
		customerName = name;
		customerGrade = "SILVER";
		customerID = number++;
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ��������" + bonusRatio*100 + "%�̰�, ���ʽ� ����Ʈ�� " + bonusPoint + "���Դϴ�.");
	}
	

}
