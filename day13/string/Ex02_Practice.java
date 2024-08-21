package day13.string;

public class Ex02_Practice {

	public static void main(String[] args) {

		//String은 문자열을 처리위한 자바클래스
		
		//방법1
		String hi1 = "hello";
		String hi2 = "hello";
		
		//문자열기능
		char result = hi1.charAt(0);	//  배열의0번째 -> 첫번째
		System.out.println(result);
		
		String result2 = hi1.toUpperCase();	   //  대문자로작성
		System.out.println(result2);
		
		
		
		
		
		//방법2
		String hi3 = new String("hello");
		String hi4 = new String("hello");
		
		//문자열기능
		char result3 = hi3.charAt(1);
		System.out.println(result3);
		
		String result4 = hi3.toUpperCase();
		System.out.println(result4);
	}

}
