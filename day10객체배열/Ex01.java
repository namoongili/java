package day10객체배열;

public class Ex01 {

	public static void main(String[] args) {


		//잘못된객체배열사용
		//객체배열을 선언하면 실제객체가 생성되는것이 아니다.
		//객체의 정보를 담을 수 있는 참조형변수가 배열로 만들어지는 것이다
		
		//참조형변수란? 주소값을 저장하는 변수이다 (8byte) => 참조형변수의 크기
		//참조형변수의 초기값 null
		//null 이란? 어떤 주소도 참조하고 있지 않다는 의미의 값이다
		
		Latte[] lattes = new Latte[10];		// Latte 배열을 선언 => 참조형변수가 배열로 만들어지고 null로 초기화됨
		//lattes[0].printInfo();	객체를 생성한 적이 없으니 nullPointer Exception 발생
		
		lattes[0] = new Latte();
		lattes[1] = new Latte();
		
		lattes[0].calcTotal();
		lattes[0].printInfo();
		
		lattes[0].calcTotal();
		lattes[1].printInfo();
		
		for(int i=0; i<lattes.length; i++) {
			lattes[i].calcTotal();
			lattes[i].printInfo();
			
		}
		
		// Latte 객체 생성하기
		Latte latte = null;
		latte.printInfo();
		
		latte = new Latte();
		latte.printInfo();
		
		Latte latte2 = new Latte();
		
		Latte[] arr = new Latte[2];
		arr[0] = latte;
		arr[1] = latte2;
		
		Latte[] arr2 = new Latte[] {latte, latte2};

		Latte[] arr3 = new Latte[2];
		arr3[0] = new Latte();
		arr3[1] = new Latte();
	}

}
