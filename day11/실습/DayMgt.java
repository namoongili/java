package day11.실습;

import java.util.Scanner;

public class DayMgt {

	public static void main(String[] args) {

		Day[] days = new Day[5];
		int index=0;
		
		Scanner sc = new Scanner(System.in);
		
			loop: while(true) {
				System.out.println("메뉴 1.등록, 2.조회 3.종료");
				int menu = sc.nextInt();
				
				sc.nextLine();	
				switch(menu) {
				case 1:
					System.out.println("할 일");
					String title = sc.nextLine();
					System.out.println("날짜");
					String date = sc.nextLine();
					System.out.println("세부사항");
					String desc = sc.nextLine();
					System.out.println("결과");
					String result = sc.nextLine();
					
					Day day = new Day( title, date, desc, result );
					days[index]= day;
					index++;
					
					break;
				case 2:
					System.out.println("조회");
					for(int i=0; i<index; i++) {
						System.out.println(days[i].toString());
					}
					break;
				case 3:
					System.out.println("종료");
					
					break loop;
					}
				 
			} //while
			
		}//main

}