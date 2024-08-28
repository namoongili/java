package Tamagotchi;

import java.util.ArrayList;
import java.util.Scanner;

public class 최문길 extends TamaPet {
    private Scanner sc;
    private ArrayList<String> 랜덤메시지리스트 = new ArrayList<>(); // '애정도 올리기'의 랜덤 메시지 저장
    
    public 최문길() {
        super(100, 0, 0, 0, 0);
        this.sc = new Scanner(System.in); // Scanner 초기화
    }

    @Override
    public String 캐릭터선택() {
        return "최문길 캐릭터를 선택했습니다.";
    }

    @Override
    public String 상태창() {
        String 성장상태 = 성장상태(친밀도);
        String 정신상태 = 정신상태(체력, 스트레스, 포만감, 질병);

        StringBuilder result = new StringBuilder();
        for (String str : 랜덤메시지리스트) {
            result.append(str);
        }

        return "최문길의 상태창\n" +
               "체력: " + 체력 + "\n" +
               "스트레스: " + 스트레스 + "\n" +
               "친밀도: " + 친밀도 + "\n" +
               "포만감: " + 포만감 + "\n" +
               "질병: " + 질병 + "\n" +
               "성장상태: " + 성장상태 + "\n" + 
               "메시지: " + result.toString() + "\n" + 
               "정신상태: " + 정신상태 + "\n";
    }

    public String 성장상태(int 친밀도) {
        if (친밀도 < 20) {
            return "낯가림 단계";
        } else if (친밀도 < 50) {
            return "호기심 단계";
        } else if (친밀도 < 80) {
            return "친밀 단계";
        } else {
            return "신뢰 단계";
        }
    }

    public String 정신상태(int 체력, int 스트레스, int 포만감, int 질병) {
        if (체력 < 40 && 스트레스 > 70) {
            return "방전 상태";
        } else if (포만감 < 30 || 질병 > 60) {
            return "위험 상태";
        } else if (스트레스 > 50) {
            return "피로 상태";
        } else {
            return "안정적 상태";
        }
    }

    @Override
    public String 애정도올리기() {
        int 랜덤 = (int) (Math.random() * 4); // 랜덤으로 선택
        String 랜덤메시지 = null;

        switch (랜덤) {
            case 0:
                adjust스트레스(-10);
                adjust친밀도(5);
                랜덤메시지 = "당신은 최문길과 함께 영화를 봤습니다.\n";	// \n : 개행문자 줄바꿈
                랜덤메시지 += "최문길의 스트레스가 10 감소하고, 당신과의 친밀도가 5 증가했습니다. \n"; // += : 메시지 미출력 방지
                랜덤메시지 += "최문길은 편안한 상황 속에서 즐거움을 느꼈습니다. \n";
                break;

            case 1:
                adjust체력(10);
                adjust친밀도(5);
                랜덤메시지 = "당신은 최문길과 함께 운동을 했습니다.\n";
                랜덤메시지 += "최문길의 체력이 10 증가하고, 당신과의 친밀도가 5 증가했습니다.\n";
                랜덤메시지 += "최문길은 운동을 통해 새로운 에너지를 얻었습니다. \n";
                break;

            case 2:
                adjust포만감(10);
                adjust친밀도(5);
                랜덤메시지 = "당신은 최문길과 함께 요리를 했습니다.\n";
                랜덤메시지 += "최문길의 포만감이 10 증가하고, 당신과의 친밀도가 5 증가했습니다.\n";
                랜덤메시지 += "최문길은 함께 만든 음식을 맛있게 먹으며 즐거워했습니다.\n";
                break;

            case 3:
                adjust스트레스(10);
                adjust친밀도(-5);
                랜덤메시지 = "당신은 최문길의 옆에서 소리를 질렀습니다.\n";
            	랜덤메시지 += "최문길의 스트레스가 10 증가하고, 당신과의 친밀도가 5 감소했습니다.\n";
            	랜덤메시지 += "최문길은 깜짝 놀라 당황한 표정을 지었습니다.  \n";
                break;
        }

        랜덤메시지리스트.add(랜덤메시지); // 랜덤 메시지를 리스트에 추가

        return 랜덤메시지;
    }

    @Override
    public String 통신하기() {
        System.out.println("무엇을 할까요? 1. 놀기  2. 아이템 교환  3. 운동  4. 음악  5. 영화");
        int 선택 = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 비우기

        String 통신;

        switch (선택) {
            case 1:
            	통신 = "당신은 최문길과 함께 집에서 여러 가지 재미있는 놀이를 즐겼습니다.";
    	        통신 = "최문길은 기분이 좋아졌고, 스트레스가 줄어들었습니다.";
    	        통신 = "최문길은 새로운 장난감을 발견하고 즐거움을 느꼈습니다.";
                break;

            case 2:
            	 통신 = "당신은 최문길과 아이템을 교환했습니다.";
     	        통신 = "최문길은 당신이 준 새로운 아이템에 만족해했습니다.";
     	        통신 = "교환한 아이템 덕분에 최문길의 모험심이 커졌습니다.";
                break;

            case 3:
            	통신 = "당신은 최문길과 함께 운동을 했습니다.";
    	        통신 = "간단한 운동을 통해 최문길은 체력을 기르고 스트레스를 해소했습니다.";
    	        통신 = "운동이 끝난 후, 최문길은 상쾌한 기분을 느꼈습니다.";
                break;

            case 4:
            	통신 = "당신과 최문길은 함께 음악을 들었습니다.";
    	        통신 = "최문길은 마음이 편안해졌고, 리듬에 맞춰 춤을 추었습니다.";
    	        통신 = "음악을 들으며 최문길의 창의력이 자극되었습니다.";
                break;

            case 5:
            	통신 = "당신은 최문길과 함께 영화를 보았습니다.";
    	        통신 = "영화를 보며 최문길은 여러 가지 감정을 느끼고, 새로운 통찰을 얻었습니다.";
    	        통신 = "영화를 보고 최문길은 충만한 감정을 느꼈습니다.";
                break;

            default:
                통신 = "잘못된 선택입니다. 최문길은 혼란스러워 합니다.";
                break;
        }

        return 통신;
    }
}