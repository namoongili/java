package day12.상속_inheritance.음료마시기;

public class Main {

	public static void main(String[] args) {


		AcornStudent[] list = new AcornStudent[24];
		

		list[0] = new 이상민();
		list[1] = new 최문길();
		
		
		for(int i=0; i<list.length; i++) {
			list[i].음료마시기();
			
			if(list[i] instanceof 이상민) {
				// 다운캐스팅
				((이상민)list[i]).단축키();
			
			}
			
		
			}
		}

	}


