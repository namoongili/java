package Tamagotchi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TamaPet pet = null;

        while (pet == null) {
            try {
                System.out.println("캐릭터를 선택하세요: 1. 최문길 2. 하예진 3. 김솔");
                int petChoice = sc.nextInt();

                switch (petChoice) {
                  	case 1:
                        pet = new 최문길();
                        break;
                    case 2:
                        pet = new 하예진();
                        break;
                    case 3:
                        pet = new 김솔();
                        break;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.next();
            }
        }

        while (true) {
            try {
                System.out.println("\n메뉴를 선택하세요: 1. 상태창 보기 2. 애정도 올리기 3. 통신하기 4. 종료");
                int menuChoice = sc.nextInt();

                switch (menuChoice) {
                    case 1:
                        System.out.println(pet.상태창());
                        break;
                    case 2:
                        System.out.println(pet.애정도올리기());
                        break;
                    case 3:
                        System.out.println(pet.통신하기());
                        break;
                    case 4:
                        System.out.println("게임을 종료합니다.");
                        sc.close();
                        return;
                    default:
                        System.out.println("잘못된 선택입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.next();  
            }
        }
    }
}