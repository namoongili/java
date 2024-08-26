package day16.exception.사용자예외실습2;

public class MyLibMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLib b = new MyLib();
		try {
			b.isAdult(25);
		}catch(미성년자예외 e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("물건 구매를 할 수 없어요");
		}
		
		System.out.println("프로그램 정상종료");
	}

}
