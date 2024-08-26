package day16.exception.선택;

public class 실습_예외4 {

	public static void main(String[] args) {
		
		// Object 상속 (강제되어있음)
		
		// Object가 부모(super), A가 (자식)sub
		
		try {
		
		A a = new A();
		
		Object o = a;	// 업캐스팅, 부모형만큼만 해석되어짐, 놀기() 메서드 사용 불가
		
		// o가 참조하는 객체의 놀기 매서드를 실행하는 방법
		// 다운캐스팅 해야함
	
		((A)o).놀기();
		
		
		//잘못된 다운캐스팅
		//runtime exception 발생
		
		((B)o).공부하기();
		

	}catch ( ClassCastException e ) {
		System.out.println(e.toString());
		//
		//예외되던지!
		
		throw e;	// 다시 예외 일으키기
	}
		
		System.out.println("프로그램 정상종료");

}
}
