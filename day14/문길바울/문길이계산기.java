package day14.문길바울;

public class 문길이계산기 implements 계산기{

	@Override
	public int 더하기(int su1, int su2) {
				System.out.println("문길이더한다?");
		return su1 + su2;
	}

	@Override
	public int 빼기(int su1, int su2) {
		System.out.println("문길이빼볼까?");
		return su1-su2;
	}

	@Override
	public int 곱하기(int su1, int su2) {
		System.out.println("문길이따블로");
		return (su1+su2)*2;
	}

	@Override
	public double 나누기(int su1, int su2) {
		System.out.println("문길이나눌줄모름 ㅠ그냥더할래");
		return su1+su2;
	}

	@Override
	public int 나머지(int su1, int su2) {
		System.out.println("문길이 나머지 공부");
		return su1%su2;
	}

}
