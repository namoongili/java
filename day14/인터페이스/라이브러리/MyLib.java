package day14.인터페이스.라이브러리;

public class MyLib {

	
	//	매개변수에 interface 
	public void yourProgramRun( MyRunnable r ) {	//당신의 코드
	
		
		//2번 반복할거야
		for(int i=1; i<=3; i++) {
			r.run();
		}
	}
	}
