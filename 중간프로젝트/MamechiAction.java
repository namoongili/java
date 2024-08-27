package 중간프로젝트;

import java.util.Scanner;

public class MamechiAction {

    Scanner scanner = new Scanner(System.in);

    public void run() {

        Mamechi mamechi = new Mamechi("마메치", 0, 0, 0, 0, 1); //스트레스, 애정도, 포만감, 청결도, 레벨

        while (true) {
            System.out.println("1. 간식주기  2. 씻기기  3. 배변  4. 놀아주기  5. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 엔터 처리

            switch (menu) {
                case 1:
                    // 간식주기
                    giveSnack(mamechi, 10, 5);
                    break;

                case 2:
                    // 씻기기
                    giveShower(mamechi, 10, 5);
                    break;

                case 3:
                    // 배ㅐ변
                    letpoop(mamechi, 10, 5);
                    break;

                case 4:
                    // 놀아주기
                    playwith(mamechi, 10, 5);
                    break;

                case 5:
                    // 종료
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

            }
            // 현재 상태 출력
            System.out.println(mamechi);
        }
    }

    public static void main(String[] args) {
        MamechiAction action = new MamechiAction();
        action.run();
    }

    public void giveSnack(Mamechi mamechi, int fullnessIncrease, int affectionIncrease) {
    	
    	int value =   	mamechi.getCharacterFullness();    	
    	value= 	value +fullnessIncrease;
    	mamechi.setCharacterFullness(  value);    //포만감 증가
    	
    	int affectionValue = mamechi.getCharacterAffection();   
    	affectionValue = affectionValue + affectionIncrease;
    	mamechi.setCharacterAffection(affectionValue);    // 애정도 증가
    	
        System.out.println(mamechi.getCharacterName() + "에게 간식을 주어 포만감과 애정도가 증가했습니다.");
    }
    
    
   
    
    public void giveShower(Mamechi mamechi, int cleanlinessIncrease, int affectionIncrease) {
    	
    	int value1 = 	mamechi.getCharacterCleanliness();
    	value1 = value1 + cleanlinessIncrease;
    	mamechi.setCharacterCleanliness(  value1);    // 청결도 증가

    	int affectionValue = mamechi.getCharacterAffection();
    	affectionValue = affectionValue + affectionIncrease;
    	mamechi.setCharacterAffection(affectionValue);    // 애정도 증가
    
    	System.out.println(mamechi.getCharacterName() + "를 샤워시켜 청결도와 애정도가 증가했습니다.");
}
    
    public void letpoop(Mamechi mamechi, int stressDecrease, int affectionIncrease) {
    	
		int stressValue = mamechi.getCharacterStress();
		stressValue = stressValue - stressDecrease;
		mamechi.setCharacterStress(stressValue);    // 스트레스 감소

		int affectionValue = mamechi.getCharacterAffection();
		affectionValue = affectionValue + affectionIncrease;
		mamechi.setCharacterAffection(affectionValue);    // 애정도 증가
		
		System.out.println(mamechi.getCharacterName() + "를 배변시켜 스트레스가 감소하고 애정도가 증가했습니다.");
 }
 
 
 
    public void playwith(Mamechi mamechi, int stressDecrease, int affectionIncrease) {
 		int stressValue = mamechi.getCharacterStress();
 		stressValue = stressValue - stressDecrease;
 		mamechi.setCharacterStress(stressValue);    // 스트레스 감소

 		int affectionValue = mamechi.getCharacterAffection();
 		affectionValue = affectionValue + affectionIncrease;
 		mamechi.setCharacterAffection(affectionValue);    // 애정도 증가.
 
 		System.out.println(mamechi.getCharacterName() + "와 놀아줘서 스트레스가 감소하고 애정도가 증가했습니다.");
 	 }
 	 
 	 }