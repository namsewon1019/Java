package ch10;

public class IfElseifElseTest {

	public static void main(String[] args) {
		
		int age = 17;
		int charage;
		
		if(age<8) {
			System.out.println("�� ���� �Ƶ��Դϴ�.");
			charage = 200;
		}
		else if(age<14) {
			System.out.println("�ʵ��л��Դϴ�.");
			charage = 400;
		}
		else if(age<20) {
			System.out.println("�� ����Դϴ�.");
			charage = 800;
		}
		else {
			System.out.println("�����Դϴ�.");
			charage = 1200;
		}
		System.out.println("����� " + charage + "�� �Դϴ�.");

	}

}
