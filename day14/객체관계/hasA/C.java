package day14.객체관계.hasA;

public class C {
	
	D d;	// 현재 d = null, c 가 d를 가질거
	


	public void setD(D d) {
		this.d = d;
	}



	public void C매서드() {
		System.out.println("C매서드");
		d.D매서드();
	}
}
