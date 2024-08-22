package day14.인터페이스연습;

public class HandPhone {
	
	private Battery battery;
	
	void setBattery (Battery battery) {
		this.battery = battery;
	}
		
		void PowerOn() {
			battery.getEnergy();
			System.out.println("핸드폰이 켜집니다");
			
	}

}
