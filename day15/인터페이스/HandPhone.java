package day15.인터페이스;

public class HandPhone {
	
	 Battery battery;
	
	void setBattery (Battery battery) {
		this.battery = battery;
	}
		
		void PowerOn() {
			battery.getEnergy();
			System.out.println("핸드폰이 켜집니다");
			
	}

}
