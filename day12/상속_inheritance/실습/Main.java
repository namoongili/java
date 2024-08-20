package 다형성실습;

public class Main {
    public static void main(String[] args) {
        // 다양한 교통수단 객체 생성
        Transportation car = new Car("자동차");
        Transportation bus = new Bus("버스");
        Transportation subway = new Subway("지하철");

        // 교통수단 배열에 저장
        Transportation[] transportations = {car, bus, subway};

        // 다형성을 이용하여 각 교통수단의 이동 방식 호출
        for (Transportation t : transportations) {
            t.move();
        }
    }
}