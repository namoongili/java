package 배열기본문제;

public class 기본배열_이번주날씨 {

	public static void main(String[] args) {

		String[] temperature = {"30", "34", "34", "33", "32"};
		
		System.out.println("이번주 날씨입니다");
		 
		// for 루프를 사용하여 배열반복
		
		for(int i = 0; i < temperature.length; i++) {
			System.out.println(temperature[i]);
		}

	}

}
