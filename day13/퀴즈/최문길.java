package day13.퀴즈;

public class 최문길 extends Acorn {


	String address;
	String email;
	
	public 최문길(String email, String name, String phone, String address, String id ) {
	super(id, name, phone);
	this.address = address;
	this.email = email;
	
	}
	
	@Override
	 public void prinfInfo() {
		//super.printInfo();
//		System.out.println("CMG")
//		System.out.println("최문길");
//		System.out.println("01012345678");
		
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		System.out.println(phone);

	}
}
