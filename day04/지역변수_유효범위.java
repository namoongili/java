package day04;

public class 지역변수_유효범위 {

	public static void main(String[] args) {


		//지역변수 : local variable
		//블럭 : ({ } 중괄호 블럭) 안에서 만들어지는 변수
		//해당지역에서만 변수의 접근이 유효한다. 블럭을 벗어나면 변수가 해제됨, 없어진다!)
		
		int a; // main 영역안에서 생존 가능
		
		for(int i=1; i<=3; i++) { 	//i변수는  for 블럭 안에서 사용가능
			System.out.println(i + "안녕");
			
		//	System.out.println(i); 불가능
			
			int money = 90;
			
			if( money>= 10 ) {
				//계산식 구하고 결과를 출력해야된다
				int result;	//if 블럭에서만 사용 가능하다
				result = money * 2;
				System.out.println();
			}
		//	System.out.println(result);
			
			
		}

	}

}
