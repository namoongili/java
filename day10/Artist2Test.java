package day10;

import day09.Artist2;

public class Artist2Test {

	public static void main(String[] args) {

		// 클래스이름은 패키지정보를 포함한다.
		// 다른 패키지 (폴더)에 있는 클래스를 사용할 때는 패키지를 명시해야 한다.
		// 패키지이름을 명시하는 대신 import 문을 사용할 수 있다.
		// day09.Artist2 a = new day09.Artist2();
		Artist2 a = new Artist2();
		a.input("아이유");
		a.printArtist();
		

	}

}
