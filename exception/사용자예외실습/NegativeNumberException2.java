package day16.exception.사용자예외실습;

public class NegativeNumberException2 extends RuntimeException{
	public NegativeNumberException2() {
		super("음수안돼 선택");
	}

}
