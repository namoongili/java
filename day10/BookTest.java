package day10;

public class BookTest {

	public static void main(String[] args) {

		
		//변수
		Book b1 = new Book();
		
		//값 저장
		b1.title = "당신이 누군가를 죽였다";
		b1.author = "히가시노 게이고";
		b1.price = 20000;
		
		//값 이용
		printBook(b1);

		
	}
		
	public static void printBook(Book b1) {
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
	}
	

}



