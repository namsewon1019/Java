package ch13;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[3];
		
		library[0] = new Book("�ﱹ��1", "ħ����");
		library[1] = new Book("�ﱹ��2", "ħ����");
		library[2] = new Book("�ﱹ��3", "ħ����");
		library[3] = new Book("�ﱹ��4", "ħ����");
		library[4] = new Book("�ﱹ��5", "ħ����");
		
		copylibrary[0] = new Book();
		copylibrary[1] = new Book();
		copylibrary[2] = new Book();
		
		System.arraycopy(library, 0, copylibrary, 0, 3);
		
		copylibrary[0].setTitle("�����");
		copylibrary[0].setAuthor("�������丮");
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}

	}

}
