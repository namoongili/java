package day14.객체관계.isA;

public class Main {

	public static void main(String[] args) {

		B b = new B();
		
		A a = null;	//a 참조형변수 ( 참조형변수의 기본값은 null )
		
		a = b;	//a 에 b 넣기 : 업캐스팅, 부모만큼만 해석된다.
		
		Object o = b;	// 업캐스팅
		
		
		// 한줄로표현
		((B)o).B매서드();
		
		// 두줄로표현
		/*
		B tmp ;
		tmp = (B) o;
		tmp.B매서드();
		*/
		
		

	}

}
