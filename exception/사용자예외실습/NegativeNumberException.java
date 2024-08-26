package day16.exception.사용자예외실습;

//필수예외가 되는법 : Exception 상속

public class NegativeNumberException extends Exception{

	public NegativeNumberException() {
		
		super("음수안돼 !!");
	}
}
