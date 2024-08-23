package day15.인터페이스;

public class SMBattery implements Battery{
	public SMBattery() {
		System.out.println("삼성 배터리입니다.");
	}
	
	public static void main(String[] args) {
	}
	
	public void getEnergy() {
		System.out.println("전원 켜짐");
	}

}
