package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		
		System.out.println("�Է� ���� �� �� �� ū ���� ����Ұ���");
		int max;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է��ϼ��� : ");
		int x = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int y = scanner.nextInt();
		
		max = (x>y) ? x : y;
		System.out.println(max);
		
	}

}
