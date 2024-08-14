package day10;

public class Student2 {
	
	String name;
	int age;
	
	//값을 넣는 역할 => 생성자문법 사용하기
	//생성자문법 : 클래스이름과 동일, 반환타입을 하면 안됨
	//생성자를 만들지 않으면 기본생정자를 만들어준다
	//생성자를 한 개라도 만들면 기본생성자는 제공되지 않는다.
	
	//기본생성자, 매개변수가 없는 생성자(default constructor)
	public Student2() { // 생성자끼리는 호출이 가능, 맨 앞줄에서만 가능하다
		//name="아무개";
		//age=20;
		
		this("아무개", 20);
	}
	
	//매개변수가 있는 생성자
	public Student2(String name, int age) { //다른 생성자를 호출하는 코드
		this.name = name;
		this.age = age;
	}
	
	public Student2(String name) {
		//this.name = name;
		//this.age=10;
		this(name, 10);
	}
	


	
	
	
	/*
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
*/
}
