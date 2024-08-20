package day12.상속_inheritance.동물_다형성;

public class Cat extends Animal {

	public void 쥐를잡다() {
		System.out.println("쥐를 잡는다");
	}
	
	@Override 	  // 오버라이드 : 상속관계에서만 발생, 상속관계에서 부모의 매서드를 재정의 하는것을말함
	public void 짖다() {
		System.out.println("야옹");
		
		//super.짖다(); // this:내꺼 , super:부모꺼
	}
}
