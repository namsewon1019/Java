package ch05;

public class Person {
	int renth;
	int weight;
	int gender;
	
	public Person(int renth, int weight, int gender) {
		this.renth = renth;
		this.weight = weight;
		this.gender = gender;
	}
	public void ShowPersonInfo() {
		System.out.println("Ű�� " +renth +"�̰� �����԰� " + weight + "kg�� ������ �ֽ��ϴ�. �̸��� mrchoi�̰� ���̴� " + gender + "�Դϴ�.");
	}

}
