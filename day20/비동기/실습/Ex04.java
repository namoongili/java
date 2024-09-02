package day20.비동기.실습;

//2번째 방법(Runnable 인터페이스를 구현하는 방법)
public class Ex04 {

	public static void main(String[] args) {
/*
		for(int i=1; i<1000; i++) {
			
			//2단 출력
			for(int j=1; j<=9; j++) {
				System.out.println(2*j);
			}
		}
*/
		/*
		for(int i=1; i<1000; i++) {
			System.out.println("hello java 멀티스레드 !!");
		}
		*/
		
		//스레드 생성 및 실행
		//Thread(Runnable r);
		Thread th1 = new Thread(new RunnableImp());
		th1.start();
		
//		Thread th2 = new Thread(new RunnableImp2());
//		th2.start();
	}

}

class RunnableImp implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=1; i<1000; i++) {
			
			//2단 출력
			for(int j=1; j<=9; j++) {
				System.out.println(2*j);
			}
		}
		
	}
}

//class RunnableImp2 implements Runnable{
//	
//}