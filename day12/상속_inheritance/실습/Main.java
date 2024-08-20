package day12.상속_inheritance.실습;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat();
	
		Dog dog = new Dog();

		
		Animal animal1 = null;
		animal1 = cat;
		
		Animal animal2 = null;
		animal2 = dog;
		
		Animal[] animals = new Animal[2];
		animals[0] = cat;
		animals[1] = dog;
		
		
		( ( Cat )animal1 ).기지개를켠다();
		// 다운캐스팅
		
		for( int i=0; i<animals.length; i++) {
			animals[i].걷는다();
			animals[i].먹는다();
		
		
		
		if(animals[i] instanceof Cat) {
			Cat tmp = (Cat) animals[i];
			tmp.기지개를켠다();
		}
	}
	}
}
