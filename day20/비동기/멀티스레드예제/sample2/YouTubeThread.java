package day20.비동기.멀티스레드예제.sample2;

public class YouTubeThread  extends  Thread{
		@Override
		public void run() {
			 
			while( !isInterrupted()) {
				
				System.out.println("유튜브 보기");
				for( int i=1;  i< 2100000000; i++);
				
			}
			 
		}
}
