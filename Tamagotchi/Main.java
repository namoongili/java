package Tamagotchi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DamaPet pet = null;

        System.out.println(" 캐릭터를 선택하세요:  1. 김솔  2. 하예진  3. 김채운  4. 최문길 ");
        int 선택 = sc.nextInt();

        switch (선택) {

            case 1:
                pet = new 김솔();
                break;
                
//            case 2:
//                pet = new 하예진();
//                break;
//                
//            case 3:
//                pet = new 김채운();
//                break;
                
            case 4:
                pet = new 최문길();
                break;
                

            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        if (pet != null) {
            pet.showMenu();
        }
    }
}