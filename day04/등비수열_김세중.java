package day04;

public class 등비수열_김세중 {

	public static void main(String[] args) {

		//변수선언
		int commonRatio=3;
		int firstTerm=2;
		int currentTerm = firstTerm;
		int sum=0;
		
		// 2 6 18 54 162 486 1458
		for(int i=1; i<=7; i++) {
			sum += currentTerm;
			currentTerm = currentTerm * commonRatio;
			System.out.println(currentTerm);
		}
		System.out.println(sum);
	}

}
