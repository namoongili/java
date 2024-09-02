package day20.비동기.멀티스레드예제.sample실습;

public class TurntableThread extends Thread {
 	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("턴테이블로 음악 듣기: " + i);
		}
	}
}
