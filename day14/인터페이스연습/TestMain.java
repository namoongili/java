package day14.인터페이스연습;

public class TestMain {

	public static void main(String[] args) {
		
		HandPhone cellphone = new HandPhone();
		
		//LgBattery lg = new LgBattery();
		SMBattery sm = new SMBattery();
		
		cellphone.setBattery(sm);
		cellphone.PowerOn();
	}

}
