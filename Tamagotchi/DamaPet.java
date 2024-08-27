package Tamagotchi;

import java.util.Scanner;


public abstract class DamaPet {
    protected int 체력;
    protected int 스트레스;
    protected int 친밀도;
    protected int 포만감;
    protected int 질병;
    protected int 창의력;
    
    protected Scanner sc = new Scanner(System.in);

    public DamaPet(int 체력, int 스트레스, int 친밀도, int 포만감, int 질병) {
        this.체력 = 체력;
        this.스트레스 = 스트레스;
        this.친밀도 = 친밀도;
        this.포만감 = 포만감;
        this.질병 = 질병;
        this.창의력 = 0;
    }

    public abstract String 캐릭터선택();

    public abstract String 상태창();

    public abstract String 애정도올리기();

    public abstract String 통신하기();

    public void showMenu() {
        while (true) {
            System.out.println("다마고치 키우기:");
            System.out.println("1. 상태창");
            System.out.println("2. 애정도 올리기");
            System.out.println("3. 통신하기");
            System.out.println("4. 종료");
            System.out.println();

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(상태창());
                    break;
                case 2:
                    System.out.println(애정도올리기());
                    break;
                case 3:
                    System.out.println(통신하기());
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return; 
                default:
                    System.out.println("다시 선택해주세요.");
            }
        }
    }
}