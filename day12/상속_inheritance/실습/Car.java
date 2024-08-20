package 다형성실습;

public class Car extends Transportation {

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 도로에서 달립니다.");
    }
}