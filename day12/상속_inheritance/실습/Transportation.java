package 다형성실습;

public abstract class Transportation {
    protected String name;

    public Transportation(String name) {
        this.name = name;
    }

    // 교통수단의 이동 방식을 정의하는 추상 메서드
    public abstract void move();
}