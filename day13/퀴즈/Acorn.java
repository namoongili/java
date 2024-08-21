package day13.퀴즈;

public class Acorn {

	String id;
	String name;
	String phone;
	
	public Acorn( String id, String name, String phone ) {
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

