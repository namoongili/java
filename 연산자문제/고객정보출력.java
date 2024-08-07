package day05;

import java.util.Scanner;

public class 고객정보출력 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 고객 정보 입력 받기
        System.out.print("아이디를 입력하세요: ");
        String id = scanner.nextLine();

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.print("키를 입력하세요(cm): ");
        double height = scanner.nextDouble();

        // 입력받은 정보 출력하기
        System.out.println("\n[고객 정보]");
        System.out.println("아이디: " + id);
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height + " cm");

    }
}