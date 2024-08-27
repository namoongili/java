package Tamagotchi;

public class 최문길 extends DamaPet{

	public 최문길() {
		super(100, 0, 0, 0, 0);	
	}
	
	@Override
	public String 캐릭터선택() {
		return "최문길 캐릭터를 선택했습니다.";
}
	
	@Override
	public String 상태창() {
	
		String 성장상태 = 성장상태(친밀도);
		String 정신상태 = 정신상태(체력, 스트레스, 포만감, 질병, 창의력);
		
		   return "최문길의 상태창\n" +
           "체력: " + 체력 + "\n" +
           "스트레스: " + 스트레스 + "\n" +
           "친밀도: " + 친밀도 + "\n" +
           "포만감: " + 포만감 + "\n" +
           "창의력: " + 창의력 + "\n" +
           "질병: " + 질병 + "\n" +
           "성장상태: " + 성장상태 + "\n" +
           "정신상태: " + 정신상태 + "\n";
}
	

	public String 성장상태(int 친밀도) {
		if ( 친밀도 < 20) {
			return "낯가림 단계";
		} else if (친밀도 < 50) {
			return "호기심 단계";
		} else if (친밀도 < 80) {
			return "친밀 단계";
		} else {
	        return "신뢰 단계";
	    
		}
	}
	
	    public String 정신상태(int 체력, int 스트레스, int 포만감, int 질병, int 창의력) {  
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
	    	StringBuilder 결과 = new StringBuilder();

	     
	        결과.append("최문길 :\n");


	        int 랜덤행동 = (int) (Math.random() * 4);
	        switch (랜덤행동) {
	            case 0:
	                
	                스트레스 -= 10;
	                친밀도 += 5;
	                결과.append("당신은 최문길과 함께 영화를 봤습니다. ")
	                     .append("최문길의 스트레스가 10 감소하고, 당신과의 친밀도가 5 증가했습니다.\n")
	                     .append("최문길은 편안한 상황 속에서 즐거움을 느꼈습니다.");
	                break;

	            case 1:
	               
	                체력 += 10;
	                친밀도 += 5;
	                결과.append("당신은 최문길과 함께 운동을 했습니다 . ")
	                     .append("최문길의 체력이 10 증가하고, 당신과의 친밀도가 5 증가했습니다.\n")
	                     .append("최문길은 운동을 통해 새로운 에너지를 얻었습니다.");
	                break;

	            case 2:
	               
	                포만감 += 10;
	                친밀도 += 5;
	                결과.append("당신은 최문길과 함께 요리를 했습니다. ")
	                     .append("최문길의 포만감이 10 증가하고, 당신과의 친밀도가 5 증가했습니다.\n")
	                     .append("최문길은 함께 만든 음식을 맛있게 먹으며 즐거워했습니다.");
	                break;
	                
	            case 3:
	                
	                창의력 += 10;
	                친밀도 += 5;
	                결과.append("당신은 최문길과 함께 예술 활동을 했습니다. ")
	                     .append("최문길의 창의력이 10 증가하고, 당신과의 친밀도가 5 증가했습니다.\n")
	                     .append("최문길은 새로운 예술 작품을 만드는 즐거움을 경험했습니다.");
	                break;
	              
	            case 4:
	            	
	            	스트레스 += 10;
	            	친밀도 -= 5;
	            	결과.append("당신은 최문길의 옆에서 소리를 질렀습니다.")
	            		.append("최문길의 스트레스가 10 증가하고, 당신과의 친밀도가 5 감소했습니다.\n")
	            		.append("최문길은 깜짝 놀라 당황한 표정을 지었습니다.");

	        }

	        //  캐릭터의 반응
	        결과.append("최문길은 당신과의 시간을 더욱 소중히 여기고 있습니다.\n");


	        return 결과.toString();
	    }
	    
	    
	    
	    @Override
	    public String 통신하기() {
	        StringBuilder 결과 = new StringBuilder();

	        System.out.println("무엇을 할까요? 1. 놀기  2. 아이템 교환  3. 운동  4. 음악  5. 영화");
	        int 선택 = sc.nextInt();

	        결과.append("최문길과 함께 한 시간 : ");

	        switch (선택) {
	            case 1:
	                결과.append("당신은 최문길과 함께 집에서 여러 가지 재미있는 놀이를 즐겼습니다.\n")
	                     .append("최문길은 기분이 좋아졌고, 스트레스가 줄어들었습니다.\n")
	                     .append("최문길은 새로운 장난감을 발견하고, 그것으로 즐거움을 느꼈습니다.");
	                break;
	                
	            case 2:
	                결과.append("당신은 최문길과 아이템을 교환했습니다.\n")
	                     .append("최문길은 당신이 준 새로운 아이템에 만족해하며 즐거워했습니다.\n")
	                     .append("교환한 아이템 덕분에 최문길의 모험심이 커졌습니다.");
	                break;
	                
	            case 3:
	                결과.append("당신은 최문길과 함께 활기차게 운동을 했습니다.\n")
	                     .append("간단한 운동을 통해 최문길은 체력을 기르고 스트레스를 해소했습니다.\n")
	                     .append("운동이 끝난 후, 최문길은 상쾌한 기분을 느꼈습니다.");
	                break;
	                
	            case 4:
	                결과.append("당신과 최문길은 함께 음악을 들었습니다.\n")
	                     .append("최문길은 마음이 편안해졌고, 리듬에 맞춰 춤을 추었습니다.\n")
	                     .append("음악을 들으며 최문길의 창의력이 자극되었습니다.");
	                break;
	                
	            case 5:
	                결과.append("당신은 최문길과 함께 영화를 보았습니다.\n")
	                     .append("영화를 보며 최문길은 여러 가지 감정을 느끼고, 새로운 통찰을 얻었습니다.\n")
	                     .append("영화를 보고 최문길은 더욱 성장한 느낌을 받았습니다.");
	                break;
	                
	            default:
	                결과.append("잘못된 선택입니다. 최문길은 혼란스러워 합니다.");

	                break;
	        }


	        
//	             결과.append("최문길의 현재 상태에 따라 다른 반응을 보일 수 있습니다.");

	        return 결과.toString();
	    }
}