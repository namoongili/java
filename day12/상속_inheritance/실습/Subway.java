package 다형성실습;

public class Subway extends Transportation {

    public Subway(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 지하철 선로를 따라 달립니다.");
    }
}