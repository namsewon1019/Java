package ch07;

public class ShortestJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ª�� �������� �����մϴ�.");
	}

}
