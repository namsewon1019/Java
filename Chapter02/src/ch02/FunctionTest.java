package ch02;

public class FunctionTest {
	//�� ���� �Է¹޾� ���� ��� ���� ��ȯ�ϴ� �Լ�

	public static int add(int num1, int num2) {
		return (num1 + num2);
	}
	
	//�̸��� �Է¹޾� �̸�+hello�� ����ϴ� �ռ�
	
	public static void sayHello(String name) {
		System.out.println(name + "hello");
	}
	
	//1���� 100���� ���� ������� ��ȯ�ϴ� �Լ�
	
	public static int calcSum(int sum) {
		for(int i=1; i<=100; i++) {
			sum += i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		
		/*int num1 = 10;
		int num2 = 20;
		
		
		sum = add(num1, num2);
		
		sayHello("mrchoi");*/
		int sum = 0;
		
		calcSum(sum);
		
		

	}

}
