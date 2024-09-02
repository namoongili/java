package day20.비동기.실습;

public class Ex05 {

	public static void main(String[] args) {

		
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0 ; i < 1000; i++) {
					for(int j = 1 ; j<=9; j++) {
						System.out.println(2*j);
					}
				}
				
			}
			
		});
		th1.start();
		
		Thread th2 = new Thread (new Runnable() {

			@Override
			public void run() {
				for(int i = 0 ; i <1000; i++) {
					System.out.println("흐름이 다른 스레드 ~~");
				}
				
			}
			
		});
		th2.start();
	}

}
