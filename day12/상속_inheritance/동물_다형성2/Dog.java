package day12.상속_inheritance.동물_다형성2;

public class Dog extends Animal{
	
	public void 집을지킨다() {
		System.out.println("집을 지킨다");
	}
	@Override
	public void 싸운다() {
		// TODO Auto-generated method stub
		System.out.println("이빨을 드러내면서 으르렁거린다");
	}
}
