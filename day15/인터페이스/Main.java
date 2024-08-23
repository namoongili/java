package day15.인터페이스;

public class Main {

	public static void main(String[] args) {
		
		HandPhone phone = new HandPhone();
		
		//phone.setBattery( new LGBattery());
		//phone.setBattery( new SMBattery()); 
		phone.setBattery( new Battery() {	// 객체생성
			
			@Override
			public void getEnergy() {
				System.out.println("에이콘바테리 에너지를 얻어온다");   // 익명클래스 작성
																// :상속받으면서 클래스를 만들때
			}});

		
	
		
		
		
		
		
		
		
		
		phone.PowerOn();
		
		//인터페이스를 구현하는방법
		//1.이름있는클래스를만들기
		//2.익명클래스만들기
		//3.람다식으로만들기
	}

}
