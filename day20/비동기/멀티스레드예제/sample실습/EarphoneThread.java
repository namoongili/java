package day20.비동기.멀티스레드예제.sample실습;

public class EarphoneThread extends Thread{
 
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("이어폰으로 음악 듣기: "+i);
		}
	}
	
}
