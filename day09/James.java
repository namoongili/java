package day09;

public class James {


	private int age;
	private String name;
	private boolean isMarried;
	private int children;
	
	public void input(int age, String name, boolean isMarried, int children ) {
		this.name = name;
		this.age = age;
		this.isMarried = true;
		this.children = children;
	}
	
	//
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(isMarried);
		System.out.println(children);
	}

	
}
