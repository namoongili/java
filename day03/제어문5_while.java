package day03;

public class 제어문5_while {

	public static void main(String[] args) {

		int i = 1;
		int sum=0;
		
		while(true) {
			
			sum = sum+1;
			i++;
			
			//탈출조건
			if(i>10) break; // 자신의 속한 반복문 빠져나옴
			
	}
		System.out.println(sum);
		
	} // main
	
} // class