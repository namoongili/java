package day13.string;

public class Ex01_Practice {

	public static void main(String[] args) {


		// 문자열 : 문자 여러개
		// 문자 : 한 개
		
		char c = 'a';
		
		
		char[] whutup = new char[5];
		whutup[0] = 'h';
		whutup[1] = 'e';
		whutup[2] = 'l';
		whutup[3] = 'l';
		whutup[4] = 'o';
		
		for(int i=0; i<whutup.length; i++) {
			System.out.print(whutup[i]);
		}
	}

}
