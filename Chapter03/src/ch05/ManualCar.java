package ch05;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("������ P->D");
		System.out.println("������ ��´�");
		System.out.println("�ڵ��� �����Ѵ�");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ��´�");
		System.out.println("������ D->P");
	}
	

}
