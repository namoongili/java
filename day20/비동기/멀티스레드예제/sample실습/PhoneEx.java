package day20.비동기.멀티스레드예제.sample실습;

import day20.비동기.멀티스레드예제.sample.CameraThread;
import day20.비동기.멀티스레드예제.sample.MusicThread;
import day20.비동기.멀티스레드예제.sample.YoutubeThread;

public class PhoneEx {

	public static void main(String[] args) {

		MusicThread mt = new MusicThread();
//		YoutubeThread yt = new YoutubeThread();
//		CameraThread ct = new CameraThread();
		
		mt.start();
//		ct.start();
//		yt.start();

	}

}
