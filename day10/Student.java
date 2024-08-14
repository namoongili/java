package day10;

public class Student {
	
	String name;
	int age;
	
	//값을 넣는 역할 => 생성자문법 사용하기
	//생성자문법 : 클래스이름과 동일, 반환타입을 하면 안됨
	
	//기본생성자, 매개변수가 없는 생성자(default constructor)
	public Student() {
		
	}
	
	//매개변수가 있는 생성자
	public Student(String name, int age) {
		
	}
	
	public Student(String name) {
		this.name = name;
		this.age = age;
	}
	

	
	
	
	/*
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
*/
}
