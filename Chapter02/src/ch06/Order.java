package ch06;

public class Order {
	String jebsu;
	String phonenum;
	String juso;
	String day;
	String time;
	String gageak;
	String name;
	String num;
	
	public Order(String jebsu, String phonenum, String juso, String day, String time, String gageak, String name, String num  ) {
		this.jebsu = jebsu;
		this.phonenum = phonenum;
		this.juso = juso;
		this.day = day;
		this.time = time;
		this.gageak = gageak;
		this.name = name;
		this.num = num;
	}
	public void showOrderinfo() {
		System.out.println("�ֹ� ���� ��ȣ: " + jebsu + "\n" +
							"�ֹ� �ڵ��� ��ȣ: " + phonenum + "\n" +
							"�ֹ� �� �ּ�: " + juso + "\n" +
							"�ֹ� ��¥: "+ day + "\n" +
							"�ֹ� �ð�: " + time + "\n" +
							"�ֹ� ����: " + gageak + "\n" +
							"�޴� �̸�: " + name + "\n" +
							"�޴� ��ȣ: " + num);
	}

}


