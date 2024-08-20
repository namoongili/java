package 다형성실습;

public class Bus extends Transportation {

    public Bus(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 버스 전용 차선에서 달립니다.");
    }
}