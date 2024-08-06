package day04;

public class 반복문_건너뛰기 {

	public static void main(String[] args) {

		// continue : 반복문 건너뛰기
		
		// 홀수의합 1~10의 합		
		// 1 2 3 4 5 6 7 8 9 10
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			
			if(i %2 ==0){
				continue;
			}
			sum=sum+1; 	// => 짝수일때는 코드가 수행되지않도록 건너뛰기
		}

	}

}
