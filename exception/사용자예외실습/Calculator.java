package day16.exception.사용자예외실습;

public class Calculator {

	public int add( int su1, int su2) throws NegativeNumberException {	//
		
		if(su1 < 0 || su2 <0) {	//|| : ~하거나 
			
			throw new NegativeNumberException();		//이메소드는 예외처리되는 메소드이다
		}
		
		return su1 + su2;
	}
}
