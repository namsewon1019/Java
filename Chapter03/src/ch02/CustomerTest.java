package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer choi = new Customer("choi");
		System.out.println("1000��¥�� ��ǰ ���� : " + choi.calcPrice(1000)+"�� ����");
		choi.showCustomerInfo();
		
		VIPCustomer kim = new VIPCustomer("kim");
		System.out.println("1000��¥�� ��ǰ ���� :" + kim.calcPrice(1000)+"�� ����");
		kim.showCustomerInfo();

	}

}
