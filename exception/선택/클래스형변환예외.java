package day16.exception.선택;

public class 클래스형변환예외 {

	public static void main(String[] args) {
		
		
		 
		 Object  o = new A();  // 상속관계에서  upcasting 
		                       // 부모형으로 사용 축소 
		 						// Object 부모라서 A나 B로 가는게 오류는아님
		 
		 
		 ((A)o).놀기();  
		 
		 
		 ((B)o).공부하기();    // 잘못된 다운캐스팅 
		                    
		 

		 
		 System.out.println(" 프로그램 정상 종료");
	}

}
