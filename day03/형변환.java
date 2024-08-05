package day03;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형변환, type, 자료형 
		// 자동형변환(묵시적, 암묵적)
		// 강제형변환(명시적)
		
		byte b = 127;
		int result ;
		
		result = b; // int   <=   byte  byte형으로 int형 형변환이 이루어짐
		
		// 강제형변환
		float f = 35.4f; //
		double d = 35.4;
		
		float result2;
		result2 = (float) d;  // 강제형변환 (작은타입변수)변수 , => 일시적이다
		
		// 형 변환
		
		// 큰변수 = 작은변수 (큰변수형으로 자동형변환 됨)
		// 작은변수 = (작은변수type) 큰변수 (일시적으로 형을 변환하여 사용 : 강제형변환, 명시적형변환) 소수컵 = 맥주컵 
	}

}
