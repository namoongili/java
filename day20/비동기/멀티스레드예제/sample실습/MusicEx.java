package day20.비동기.멀티스레드예제.sample실습;

public class MusicEx {

	public static void main(String[] args) {

		EarphoneThread et = new EarphoneThread();
		SpeakerThread st = new SpeakerThread();
		TurntableThread tt = new TurntableThread();
		
		et.start();
		st.start();
		tt.start();

	}

}
