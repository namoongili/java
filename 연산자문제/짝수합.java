package day05;

	import java.util.Scanner;

	public class 짝수합 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;

	        System.out.println("10개의 수를 입력하세요:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print((i + 1) + "번째 수: ");
	            int number = scanner.nextInt();

	            if (number % 2 == 0) {
	                sum += number;
	            }
	        }

	        System.out.println("입력한 수 중 짝수의 합: " + sum);
	    }
	}