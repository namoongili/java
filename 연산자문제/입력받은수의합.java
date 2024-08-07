package day05;

import java.util.Scanner;

public class 입력받은수의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수를 입력하세요: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("1부터 " + number + "까지의 합: " + sum);
    }
}
