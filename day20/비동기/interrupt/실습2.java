package day20.비동기.interrupt;

public class 실습2 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		/*
		//별도의 흐름으로 만들기
		for(int i=10; i>0; i--) {
			System.out.println(i);
			// 시간지연을 위한 반복문
			for(long x=1; x<=2200000000L; x++);{
				
			}
			*/
		
		
		//스레드 생성및 실행
		CounterA a = new CounterA();
		a.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		a.interrupt();  	//a 스레드에게 신호주기
		System.out.println("프로그램 종료");
	}

}

class CounterA extends Thread{
									// isInterrupted() 메서드가 제공됨 (기본값 : false 제공, 외부에서 interrupt() 호출되면 true 반환 받음)
	@Override
	public void run() {

		/*
		//별도의 흐름으로 만들기
		for(int i=10; i>0; i--) {
			System.out.println(i);
			// 시간지연을 위한 반복문
			for(long x=1; x<=2200000000L; x++);{
				
			}
			*/
		
		/*
			int i=10;
			while(i!=0 && !isInterrupted() ) { 	// 인터럽트가 발생되기전까지 반복해 !false (true)
			System.out.println(i);
			i--;
			// 시간지연을 위한 반복문
			for(long x=1; x<=2200000000L; x++);
				
			}
			*/
		
		int i=10;
		while(true) {
				
			if(i==0 && isInterrupted() == true ) {
				break;
			}
			System.out.println(i);
			i--;
			for(long x=1; x<=2200000000L; x++);
		}
	}
	
}
