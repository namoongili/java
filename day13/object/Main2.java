package day13.object;

public class Main2 {

	public static void main(String[] args) {

		Score s = new Score("이효진", 100, 100);
		Score s2 = new Score("이효진", 100, 100);

		//객체비교
		//Object equals는 객체의 주소를 가지고 비교한다	
		//객체를 비교하러면 재정의 해서 사용해야 한다
		
		boolean result = s.equals(s2);
		
		System.out.println(result);
	}

}