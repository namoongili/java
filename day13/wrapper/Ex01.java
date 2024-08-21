package day13.wrapper;

public class Ex01 {

	public static void main(String[] args) {

		// Wrapper 클래스
		// int => Integer
		// 기본자료형 => 객체자료형으로 만들어주는 클래스

		int a=3;
		
		Integer i1 = 3; 			 // auto boxing
		Integer i2 = 10;			 // 
		Integer i3 = new Integer(4); // 이렇게 쓰지마라
		
		
		
		int sum = i1.intValue() + i2.intValue(); // unboxing 값을꺼냄
		System.out.println(sum);
		
		
		int sum2 = i1 + i2; // auto unboxing
		System.out.println(sum2);
		
		Integer i4 = 1000;			// -128~127 내용에 대한 객체는 새로만드는것이 아니라 캐싱기법을 사용하므로
									// 같은 주소가 나온다 !
		Integer i5 = 1000;			//
		
		// 두 개 비교
		
		if( i4 == i5 ) {
			System.out.println("");
		}
		
		// 두 개 비교 equals 사용해야 한다
		if( i4.equals(i5)) {	// 내용비교
			System.out.println("같다");
		}
		
		Object[] arr = new Object[3];
		arr[0]="안녕";
		arr[1]=3;
		arr[2]=new Integer(5);
		
		for( Object o : arr ) {
			System.out.println( o );
		}
	}
}
