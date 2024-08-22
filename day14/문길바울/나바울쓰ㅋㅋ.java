package day14.문길바울;

	
	public class 나바울쓰ㅋㅋ implements 계산기{
		
		@Override
		public int 더하기(int su1, int su2) {
			System.out.println("더해볼까?ㅋㅋ");
			return su1 + su2;
		}
		
		
		@Override
		public int 빼기(int su1, int su2) {
			System.out.println("아니 빼볼라고 ㅋ");
			return su1 - su2;
		}
		
		
		@Override
		public int 곱하기(int su1, int su2) {
			System.out.println("바울이는 곱해볼래요,,,");
			return su1 * su2;
		}
		
		
		@Override
		public double 나누기(int su1, int su2) {
			System.out.println("아니 나눌건데 ㅋㅋㅋㅋㅋㅋㅋㅋ");
			return su1 / su2;
		}
		
		
		@Override
		public int 나머지(int su1, int su2) {
			System.out.println("나누고 남은 나머지.");
			return su1 % su2;
			
		}
	}


