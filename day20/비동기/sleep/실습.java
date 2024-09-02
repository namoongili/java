package day20.비동기.sleep;

public class 실습 {

	public static void main(String[] args) {

		System.out.println("3초 후 공개됩니다.");
		
		//현재 실행되는 스레드를 정지할 수 있다.(thread sleep) 스레드 재우기
		
		try {
			Thread.sleep(3000);	//1000 => 1초 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//1000 => 1초
		
		System.out.println("여러분 놀라셨죠...? 준비 하셔야돼요,,,,");

	}

}
