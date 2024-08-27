package Tamagotchi;

public class 김솔 extends DamaPet {

    public 김솔() {
        super(100, 0, 0, 50, 0); // 각자 초기 상태값 설정
    }

    @Override
    public String 캐릭터선택() {
        return "김솔 캐릭터를 선택했습니다.";
    }

    @Override
    public String 상태창() {
        
        String 성장상태 = 성장상태(친밀도);
        String 건강상태 = 건강상태(체력, 스트레스, 포만감, 질병);

        return "김솔의 상태창\n" +
               "체력: " + 체력 + "\n" +
               "스트레스: " + 스트레스 + "\n" +
               "친밀도: " + 친밀도 + "\n" +
               "포만감: " + 포만감 + "\n" +
               "질병: " + 질병 + "\n" +
               "성장상태: " + 성장상태 + "\n" +
               "건강상태: " + 건강상태 + "\n";
    }

    public String 성장상태(int 친밀도) {
        if (친밀도 < 30) {
            return "반항기";
        } else if (친밀도 < 60) {
            return "사춘기";
        } else {
            return "프렌드기";
        }
    }

    public String 건강상태(int 체력, int 스트레스, int 포만감, int 질병) {  //각자 상태 설정
        if (체력 < 스트레스) {
            return "스트레스 상태";
        } else if (스트레스 > 80) {
            return "빈사 상태";
        } else if (포만감 < 50) {
            return "배고픔";
        } else if (질병 > 50) {
            return "질병 상태";
        } else {
            return "건강 합니다";
        }
    }

    @Override
    public String 애정도올리기() {
        System.out.println("무엇을 할까요? 1. 먹이 2. 화장실 3. 운동 4. 놀기 5. 훈육");
        int 선택 = sc.nextInt();

        String 결과;

        switch (선택) { //각자 수치 설정 및 변경
            case 1:
                포만감 += 20;
                체력 -= 10;
                결과 = "먹이를 줬습니다. 포만감이 20 증가하고 체력이 10 감소했습니다.";
                break;
            case 2:
                질병 -= 10;
                스트레스 += 5;
                결과 = "화장실을 갔습니다. 질병이 10 감소하고 스트레스가 5 증가했습니다.";
                break;
            case 3:
                체력 += 20;
                포만감 -= 10;
                결과 = "운동을 했습니다. 체력이 20 증가하고 포만감이 10 감소했습니다.";
                break;
            case 4:
                체력 += 10;
                친밀도 += 20;
                결과 = "놀아줬습니다. 체력이 10 증가하고 친밀도가 20 증가했습니다.";
                break;
            case 5:
                스트레스 += 10;
                친밀도 += 10;
                결과 = "훈육을 했습니다. 스트레스가 10 증가하고 친밀도가 10 증가했습니다.";
                break;
            default:
                결과 = "잘못된 선택입니다.";
                break;
        }

        return 결과;
    }

    @Override
    public String 통신하기() { //미완
        System.out.println("무엇을 할까요? 1. 아이템 교환 2. 아이템 구매 3. 외출 4. 쇼핑하기 5. 알바하기");
        int 선택 = sc.nextInt();
        switch (선택) {
            case 1: return "아이템을 교환했습니다.";
            case 2: return "아이템을 구매했습니다.";
            case 3: return "외출을 했습니다.";
            case 4: return "쇼핑을 했습니다.";
            case 5: return "알바를 했습니다."; 	
            default: return "잘못된 선택입니다.";
        }
    }
}