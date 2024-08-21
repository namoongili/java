package day13.퀴즈;

public class Acorn1 {

	String id;
	String name;
	String phone;
	
	public Acorn1( String id, String name, String phone ) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	
	//오버라이드할 매서드
	public void prinfInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
	}
}

// id, 이름, 전화번호
// 주소, 이메일