package day20.비동기.데몬;

public class 실습 {

	public static void main(String[] args) {
 
		System.out.println("main 시작");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Thread t = new Thread( new Runnable() {
			
			@Override
			public void run() {
			
			
			for(int i=1; i<1000; i++) {
				System.out.println("^___^");
			}
		}});
		
		
		t.setDaemon(true);   //데몬스레드는 메인스레드가 끝나면 자동으로 종료되는 스레드
		t.start();
		

		System.out.println("프록르램 종료");
	}

}
