package day06;

import java.util.Scanner;

public class 학생등록 {

	public static void main(String[] args) {
		 
		String[] arr = new String[5];
		int index=0;   		
		
		Scanner sc = new Scanner( System.in);
		
		
		String tmpName  = sc.nextLine();
		arr[index]= tmpName;		
		index++;
		
		 

		tmpName  = sc.nextLine();
		arr[index]= tmpName;		
		index++;
		
		

		 tmpName  = sc.nextLine();
		 arr[index]= tmpName;		
		 index++;
		
		
		
		//출력
		
		for( int i=0 ; i<index; i++) {
			System.out.println( arr[i]);
		}

	}

}
