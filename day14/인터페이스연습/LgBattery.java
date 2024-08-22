package day14.인터페이스연습;

public class LgBattery implements Battery{
	public LgBattery() {
		System.out.println("LG 배터리입니다");
	}
	
	public static void main(String[] args) {

	}
	
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
	}

}
