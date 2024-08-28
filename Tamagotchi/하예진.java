package Tamagotchi;

import java.util.Random;
import java.util.Scanner;

public class 하예진 extends TamaPet {
    private Random random;
    private Scanner sc;

    public 하예진() {
        super(100, 40, 55, 20, 70);
        this.random = new Random();
        this.sc = new Scanner(System.in);
    }

    @Override
    public String 캐릭터선택() {
        return "하예진 캐릭터를 선택했습니다.";
    }
	@Override
	public String 상태창() {
		String 성장상태 = 성장상태(친밀도);
		String 애정상태 = 애정상태(친밀도);
		String 건강상태 = 건강상태(체력, 스트레스, 포만감, 질병);

		return "상태창\n" + "체력: " + 체력 + "\n" + "스트레스: " + 스트레스 + "\n" + "친밀도: " + 친밀도 + "\n" + "포만감: " + 포만감 + "\n"
				+ "질병: " + 질병 + "\n" + "성장상태: " + 성장상태 + "\n" + "건강상태: " + 건강상태 + "\n";
	}

	public String 성장상태(int 친밀도) {
		if (친밀도 < 1) {
			return "알";
		} else if (친밀도 < 25) {
			return "유아기";
		} else if (친밀도 < 50) {
			return "반항기";
		} else if (친밀도 < 75) {
			return "사춘기";
		} else {
			return "프렌드기";
		}
	}

	public String 애정상태(int 친밀도) {
		if (친밀도 < 30) {
			return "애정결핍 상태";
		} else if (친밀도 <= 50) {
			return "펑범함";
		} else if (친밀도 <= 70) {
			return "행복함";
		} else {
			return "최고의 상태";
		}
	}

	public String 건강상태(int 체력, int 스트레스, int 포만감, int 질병) {
		if (체력 < 50) {
			return "지친 상태";
		} else if (스트레스 > 70) {
			return "스트레스 상태";
		} else if (포만감 < 50) {
			return "배고픔";
		} else if (질병 < 50) {
			return "더러움 상태";
		} else {
			return "건강한 상태";
		}
	}

	@Override
	public String 애정도올리기() {
		System.out.println("무엇을 할까요? 1. 간식 먹이기 2. 샤워하기 3. 화장실 가기 4. 놀아주기");
		int 선택 = sc.nextInt();
		sc.nextLine();

		String 결과;

		switch (선택) {
		case 1:
			adjust포만감(20);
			adjust질병(-5);
			결과 = "간식을 줬습니다. (포만감 +20)(질병 -5)";
			break;
		case 2:
			adjust친밀도(10);
			adjust질병(30);
			결과 = "샤워를 합니다. (친밀도 +10)(질병 +30)";
			break;
		case 3:
			adjust스트레스(-10);
			adjust질병(10);
			결과 = "화장실을 갔습니다. (스트레스 -10)(질병 +10)";
			break;
		case 4:
			adjust체력(-10);
			adjust친밀도(20);
			adjust질병(-20);
			결과 = "놀아줬습니다. (체력 -10)(친밀도 +20)(질병 -20)";
			break;
		default:
			결과 = "잘못된 선택입니다.";
			break;
		}

		return 결과;
	}

	@Override
	public String 통신하기() {
		System.out.println("무엇을 할까요? 1. 아이템 교환 2. 외출  3. 놀기");
		int 선택 = sc.nextInt();
		sc.nextLine();

		switch (선택) {
		case 1:
			return 아이템교환();
		case 2:
			return 외출();
		case 3:
			return 놀기();
		default:
			return "잘못된 선택입니다.";
		}
	}

	public String 아이템교환() {
		System.out.println("어떤 친구를 만날까요? 1. 다마고치1 2. 다마고치2 3. 다마고치3");
		int 선택 = sc.nextInt();
		sc.nextLine();

		String 친구이름 = "";
		String 결과 = "";

		switch (선택) {
		case 1:
			친구이름 = "다마고치1";
			break;
		case 2:
			친구이름 = "다마고치2";
			break;
		case 3:
			친구이름 = "다마고치3";
			break;
		default:
			return "잘못된 선택입니다.";
		}

		int 결과번호 = random.nextInt(3);

		switch (결과번호) {
		case 0:
			adjust친밀도(30);
			결과 = 친구이름 + "(이)가 마음에 들어합니다.\n" + "(친밀도 +30)";
			break;
		case 1:
			adjust친밀도(10);
			결과 = 친구이름 + "(이)가 평범하게 반응합니다.\n" + "(친밀도 +10)";
			break;
		case 2:
			adjust친밀도(-10);
			결과 = 친구이름 + "(이)가 별로 마음에 들어하지 않습니다.\n" + "(친밀도 -10)";
			break;
		}

		return 결과;
	}

	public String 외출() {
		System.out.println("어디로 외출할까요? 1. 거리 2. 산 3. 놀이공원 4. 상점가 5. 집");
		int 선택 = sc.nextInt();
		sc.nextLine();

		String 결과 = "";

		switch (선택) {
		case 1:
			adjust스트레스(20);
			adjust질병(-10);
			adjust친밀도(10);
			결과 = "거리를 다녀옵니다.\n" + "(스트레스 +20)(질병 -10)(친밀도 +10)";
			break;
		case 2:
			adjust스트레스(20);
			adjust체력(-20);
			adjust친밀도(15);
			결과 = "산을 다녀옵니다.\n" + "(스트레스 +20)(체력 -20)(친밀도 +15)";
			break;
		case 3:
			adjust스트레스(-30);
			adjust친밀도(20);
			결과 = "놀이공원을 다녀옵니다.\n" + "(스트레스 -30)(친밀도 +20)";
			break;
		case 4:
			adjust스트레스(-20);
			adjust친밀도(20);
			결과 = "상점가를 다녀옵니다.\n" + "(스트레스 -20)(친밀도 +20)";
			break;
		case 5:
			결과 = "집으로 돌아왔습니다.\n" + "(수치 변환 없음)";
			break;
		default:
			결과 = "잘못된 선택입니다.";
			break;
		}

		return 결과;
	}

	public String 놀기() {
		System.out.println("자유시간을 보냅니다.");
//		int 선택 = sc.nextInt();
		sc.nextLine();

		String 결과 = "";

		int 결과번호 = random.nextInt(4); // 0, 1, 2, 3 중 랜덤으로 선택

		switch (결과번호) {
		case 0:
			adjust스트레스(-20);
			adjust친밀도(10);
			결과 = "책을 읽었습니다.\n" + "(스트레스 -20)(친밀도 +10)";
			break;
		case 1:
			adjust스트레스(-20);
			adjust친밀도(10);
			결과 = "게임을 합니다.\n" + "(스트레스 -20)(친밀도 +10)";
			break;
		case 2:
			adjust스트레스(-20);
			adjust친밀도(10);
			결과 = "음악을 듣습니다.\n" + "(스트레스 -20)(친밀도 +10)";
			break;
		case 3:
			adjust스트레스(-20);
			adjust친밀도(10);
			결과 = "그림을 그립니다.\n" + "(스트레스 -20)(친밀도 +10)";
			break;
		}

		return 결과;
	}
}