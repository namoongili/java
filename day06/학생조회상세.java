package day06;

import java.util.Scanner;

public class 학생조회상세 {

	public static void main(String[] args) {
		String[] arr = new String[] { "김솔", "주형준", "김채운", "", "" };
		int index=3;
		
		Scanner sc = new Scanner( System.in);
		System.out.println( "조회할 학생번호" );
		int select = sc.nextInt()-1;	//1 -> 0	//2 -> 1
		
		System.out.println("<<학생정보>>");
		System.out.println(arr[select]);
		
	}

}
