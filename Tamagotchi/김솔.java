package Tamagotchi;

import java.util.Random;
import java.util.Scanner;

public class 김솔 extends TamaPet {
    private Random random;
    private Scanner sc;

    public 김솔() {
        super(50, 30, 0, 50, 30);  
        this.random = new Random();
        this.sc = new Scanner(System.in); 
    }

    @Override
    public String 캐릭터선택() {
        return "김솔 캐릭터를 선택했습니다.";
    }

    @Override
    public String 상태창() {
        String 성장상태 = 성장상태(친밀도);
        String 건강상태 = 건강상태(체력, 스트레스, 포만감, 질병);

        return "------------------------------------------------------------ \n"+
        		"김솔 의 상태창\n" +
        		"\n"+
               "체력: " + 체력 + "\n" +
               "스트레스: " + 스트레스 + "\n" +
               "친밀도: " + 친밀도 + "\n" +
               "포만감: " + 포만감 + "\n" +
               "질병: " + 질병 + "\n" +
               "\n"+
               "성장상태: " + 성장상태 + "\n" +
               "건강상태: " + 건강상태 + "\n"+
               "------------------------------------------------------------ \n";
    }

    private String 성장상태(int 친밀도) {
        if (친밀도 < 30) return "비행 상태";
        else if (친밀도 < 50) return "반항 상태";
        else if (친밀도 < 70) return "음침 상태";
        else if (친밀도 < 90) return "보통 상태";
        else return "말괄량이 상태";
    }

    private String 건강상태(int 체력, int 스트레스, int 포만감, int 질병) {
        if (체력 < 스트레스) return "스트레스 상태";
        else if (체력 < 포만감) return "비만 상태";
        else if (체력 < 질병) return "질병 상태";
        else if (스트레스 < 포만감) return "폭식증 상태";
        else if (스트레스 < 질병) return "빈사 상태";
        else if (포만감 < 질병) return "거식증 상태";
        else return "건강 합니다";
    }

    @Override
    public String 애정도올리기() {
        System.out.println("------------------------------------------------------------\n"
        		+ "무엇을 할까요? \n"
        		+ "1. 밥주기 \n"
        		+ "2. 화장실가기 \n"
        		+ "3. 휴식하기 \n"
        		+ "4. 놀아주기 \n"
        		+ "5. 훈육하기 \n"
        		+ "------------------------------------------------------------ \n");
        int aChoice = sc.nextInt();

        switch (aChoice) {
        	case 1:
        		return 밥주기();
        	case 2: 
        		return 화장실가기();
        	case 3: 
        		return 휴식하기();
        	case 4: 
        		return 놀아주기();
        	case 5: 
        		return 훈육하기();
        	default: return "잘못된 선택입니다.";
        } 
    }
        
        private String 밥주기() {
        	if(포만감<80) {
        		adjust포만감(20);
                adjust친밀도(10);
                return "마침 배가 고팠습니다.\n > 포만감이 20 증가하고 친밀도가 10 증가했습니다. <";
        	} else {
        		adjust포만감(20);
                adjust스트레스(20);
                adjust질병(20);
                
                checkStress();
                checkHealth();
                return "배가 불러 밥을 먹기 싫어 합니다.\n > 포만감이 20 증가하고 스트레스와 질병이 20 증가했습니다. <";
        	}
        }
        
        private String 화장실가기() {
        	if(질병<80) {
        		adjust질병(-20);
                adjust스트레스(20);
                
                checkStress();
        		return "화장실을 가기 싫어 합니다.\n > 질병이 20 감소하고 스트레스가 20 증가했습니다. <";
        	} else {
        		adjust질병(-20);
                adjust친밀도(10);
        		return "마침 화장실이 가고 싶었습니다.\n > 질병이 20 감소하고 친밀도가 10 증가했습니다. <";
        	}
        }
        
        private String 휴식하기() {
        	if(체력<스트레스) {
        		adjust스트레스(-20);
        		adjust체력(10);
        		adjust친밀도(10);
        		return "적절한 휴식을 취했습니다.\n > 스트레스가 20 감소하고 체력과 친밀도가 10 증가했습니다. <";
        	} else {
        		adjust스트레스(-20);
        		adjust체력(-10);
        		return "휴식이 과해 늘어집니다. \n > 스트레스가 20 감소하고 체력이 10 감소했습니다. <";
        	}
        }
        
        private String 놀아주기() {
        	if(체력>포만감) {
        		adjust체력(20);
        		adjust친밀도(10);
        		return "놀아줬습니다. 즐거워합니다. \n > 체력이 20 증가하고 친밀도가 10 증가했습니다. <";
        	} else {
        		adjust체력(20);
        		adjust스트레스(20);
        		
        		checkStress();
        		return "놀고 싶지 않아합니다.\n > 체력이 20 증가하고 스트레스가 20 증가했습니다. <";
        	}
        }
        
        private String 훈육하기() {
        	if(친밀도>=80) {
        		adjust친밀도(10);
        		adjust스트레스(-20);
        		return "훈육이 성공적 입니다. \n > 친밀도가 10 증가하고 스트레스가 20 감소했습니다. <";
        	} else {
        		adjust친밀도(-10);
        		adjust스트레스(20);
        		
        		checkStress();
        		return "훈육이 과해 효과가 없습니다. \n > 친밀도가 10 감소하고 스트레스가 20 증가했습니다. <";
        	}
        }
        
    @Override
    public String 통신하기() {
        System.out.println("------------------------------------------------------------\n"
        		+ "무엇을 할까요? \n"
        		+ "1. 교류 \n"
        		+ "2. 외출 \n"
        		+ "3. PVP \n"
        		+ "------------------------------------------------------------ \n");
        int cChoice = sc.nextInt();

        switch (cChoice) {
            case 1:
                return 교류();
            case 2:
                return 외출();
            case 3:
                return PvP();
            default:
                return "잘못된 선택입니다.";
        }
    }

    private String 교류() {
        System.out.println("------------------------------------------------------------\n"
        		+ "어떤 친구를 만날까요? \n"
        		+ "1. 김채운 \n"
        		+ "2. 최문길 \n"
        		+ "3. 하예진 \n"
        		+ "------------------------------------------------------------ \n");
        int eChoice = sc.nextInt();

        String friend;
        switch (eChoice) {
            case 1:
                friend = "김채운";
                break;
            case 2:
                friend = "최문길";
                break;
            case 3:
                friend = "하예진";
                break;
            default:
                return "잘못된 선택입니다.";
        }

        int eResult = random.nextInt(3);
        switch (eResult) {
            case 0:
                adjust스트레스(-20);
                adjust친밀도(20);
                return friend + " 와(과) 재밌게 놀았습니다.\n" +
                       " > 스트레스가 20 감소하고 친밀도가 20 증가했습니다. <";
            case 1:
                adjust스트레스(20);
                adjust친밀도(-20);
                
                checkStress();
                return friend + " 와(과) 싸웠습니다.\n" +
                       " > 스트레스가 20 증가하고 친밀도가 20 감소했습니다. <";
            case 2:
                adjust스트레스(-10);
                adjust친밀도(10);
                return friend + " 와(과) 편안하게 시간을 보냈습니다.\n" +
                       " > 스트레스가 10 감소하고 친밀도가 10 증가했습니다. <";
            default:
                return "잘못된 선택입니다.";
        }
    }

    private String 외출() {
        System.out.println("------------------------------------------------------------ \n"
        		+ "어디로 외출할까요? \n"
        		+ "1. 번화가 \n"
        		+ "2. 공원 \n"
        		+ "3. 놀이터 \n"
        		+ "4. 학원 앞 \n"
        		+ "5. 홍대 \n"
        		+ "------------------------------------------------------------ \n");
        
        int oChoice = sc.nextInt();
        String outing;

        switch (oChoice) {
            case 1:
                outing="번화가";
                break;
            case 2:
            	outing="공원";
                break;
            case 3:
            	outing="놀이터";
                break;
            case 4:
            	outing="학원 앞";
                break;
            case 5:
            	outing="홍대";
                break;
            default:
                return "잘못된 선택입니다.";
        }
        
        int oResult=random.nextInt(5);
        switch(oResult) {
        	case 0:
        		adjust체력(-10);
        		adjust스트레스(20);
        		adjust질병(20);
        		
        		checkStress();
        		checkHealth();
        		return outing+" 에서 불량학생 들과 마주쳤습니다. 삥을 뜯겼습니다. \n > 체력이 10 감소하고 스트레스와 질병이 20 증가했습니다. <";
        		
        	case 1:
        		adjust스트레스(30);
        		adjust체력(-10);
        		
        		checkStress();
        		return outing+" 에서 \'도를 믿습니다\'에 붙잡혔습니다. \n > 스트레스가 30 증가하고 체력이 10 감소했습니다. < ";
        	
        	case 2:
        		adjust스트레스(-10);
        		adjust포만감(10);
        		return outing+" 에서 만원을 주웠습니다. 간식을 사먹었습니다. \n > 스트레스가 10 감소하고 포만감이 10 증가했습니다. <";
        		
        	case 3:
        		adjust스트레스(20);
        		adjust친밀도(10);
        		
        		checkStress();
        		return outing+" 에서 길을 묻는 외국인을 만났습니다. \n > 스트레스가 20 증가하고 친밀도가 10 증가했습니다. <";
        		
        	case 4:
        		adjust스트레스(-20);
        		adjust친밀도(20);
        		return outing+" 에서 우연히 친구를 만났습니다. \n > 스트레스가 20 감소하고 친밀도가 20 증가했습니다. <";
        		
        	default:
        		return "잘못된 선택입니다.";

        } 
    }

    private String PvP() {
    	System.out.println("컴퓨터USER 와(과) 대결합니다.");
        System.out.println("------------------------------------------------------------");

        int 상대체력 = 50 + random.nextInt(51); 

        while (true) {
            
            if (체력 > 상대체력) {
            	System.out.println("ROUND 1");
            	System.out.println("\n상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
                System.out.println("1연승 하였습니다.");
                System.out.println("------------------------------------------------------------");

                상대체력 = 100 + random.nextInt(51); 
                if (체력 > 상대체력) {
                	System.out.println("ROUND 2");
                	System.out.println("\n상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
                	System.out.println("2연승 하였습니다.");
                    System.out.println("------------------------------------------------------------ ");

                    상대체력 = 150 + random.nextInt(51); 
                    if (체력 > 상대체력) {
                    	System.out.println("LAST ROUND");
                    	System.out.println("\n상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
                    	System.out.println("3연승 하였습니다.");
                        System.out.println("------------------------------------------------------------ ");

                        adjust체력(50);
                        adjust스트레스(-50);
                        return "토너먼트에서 최종 우승하였습니다. \n" +
                               " > 체력이 50 증가하고 스트레스가 50 감소했습니다. <";
                    } else {
                    	System.out.println("LAST ROUND");
                    	System.out.println("\n상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
                    	
                        adjust체력(20);
                        adjust질병(20);
                        
                        checkHealth();
                        return "패배 하였습니다. 2연승에서 마무리되었습니다. \n" +
                               " > 체력이 20 증가하고 질병이 20 증가했습니다. < \n"+
                               "------------------------------------------------------------ ";
                    }
                } else {
                	System.out.println("ROUND 2");
                	System.out.println("상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
                	
                    adjust체력(10);
                    adjust질병(10);
                    
                    checkHealth();
                    return "패배 하였습니다. 1연승에서 마무리되었습니다.\n" +
                           " > 체력이 10 증가하고 질병이 10 증가했습니다. < \n"+
                           "------------------------------------------------------------ ";
                }
            } else if (체력 < 상대체력) {
            	System.out.println("ROUND 1");
            	System.out.println("\n상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
            	
                adjust스트레스(30);
                adjust질병(30);
                
                checkStress(); 
                checkHealth();
                return "패배 하였습니다. \n" +
                       " > 스트레스가 30 증가하고 질병이 30 증가했습니다. < \n"+
                       "------------------------------------------------------------ ";
            } else {
            	System.out.println("ROUND 1");
            	System.out.println("\n상대방 체력: " + 상대체력 + " vs 내 체력: " + 체력+"\n");
            	
                System.out.println("재대결 하시겠습니까?\n "
                		+ "1. 네\n"
                		+ "2. 아니오");
                int 선택 = sc.nextInt();
                if (선택 == 1) {
                    System.out.println("재대결을 시작합니다.");
                    상대체력 = 50 + random.nextInt(51); 
                } else {
                	adjust스트레스(10);
                	
                	checkStress(); 
                    return "재대결을 포기하였습니다.\n"+
                    		" > 스트레스가 10 증가했습니다. < \n"
                    		+ "------------------------------------------------------------ ";
                }
            }
        }
    }

    private void checkStress() {
        if (스트레스 >= 100) {
            System.out.println("\n------------------------------------------------------------ \n"
            		+ "Game Over\n스트레스가 100 이상이 되어 캐릭터 사망 \n"
            		+ "------------------------------------------------------------ \n");
            System.exit(0);
        }
    }

    private void checkHealth() {
        if (질병 >= 100) {
            System.out.println("\n------------------------------------------------------------ \n"
            		+ "Game Over\n질병이 100 이상이 되어 캐릭터 사망 \n"
            		+ "------------------------------------------------------------ \n");
            System.exit(0);
        }
    }
}