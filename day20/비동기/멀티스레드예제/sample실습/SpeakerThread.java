package day20.비동기.멀티스레드예제.sample실습;

public class SpeakerThread extends Thread {
 
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("스피커로 음악 듣기");
		}
	}
}
