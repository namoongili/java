package 배열응용문제;

public class 짝수만담기 {

	public static void main(String[] args) {

		// 임의의 배열 생성
		int[] arr = { 33 ,35,32 ,35  ,36 ,35 ,34  };
		
		// 전체 배열 검사하고 짝수만출력
		System.out.println("배열에서 짝수는");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				System.out.println(arr[i] );
		}
		System.out.println("입니다.");

	}

}
