package day15.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 정렬하기_라이브러리사용2 {

	public static void main(String[] args) {
		
		Book2[] books = new Book2[3];
		
		books[0] = new Book2("이것은 자바다", 25000);
		books[1] = new Book2("자바의 정석", 35000);
		books[2] = new Book2("재미있는 자바", 15000);
		
		Arrays.sort(books);
		
		for(Book2 b:books) {
			System.out.println(b);
		}
		
		//지역내부클래스
		//매서드 안에서 클래스를 만들수있다
		
		class A implements Comparator<Book2>{

			@Override
			public int compare(Book2 o1, Book2 o2) {

				
				return o1.name.compareTo(o2.name);	// 기준이크면 양수, 작으면 음수
			}
			
		}
		
		
		Arrays.sort(books, new A());
		
		System.out.println("책이름 정렬");
		for( Book2 b : books) {
			System.out.println(b);
		}
		
		Arrays.sort(books, new Comparator<Book2>() {

			@Override
			public int compare(Book2 o1, Book2 o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		Arrays.sort(books, new Comparator<Book2>() { //(정렬시키고싶은거, 안넣으면 자동으로 오름차순 Comparator<객체>
				public int compare(Book2 o1, Book2 o2) {

					return o2.price - o1.price; // 2번째째 

				}
		});
		
		System.out.println("책가격이높은순정렬");
		for(Book2 b:books) {
			System.out.println(b);
		}
	}

}
