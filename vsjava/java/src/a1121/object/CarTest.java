package a1121.object;

public class CarTest {

    public static void main(String[] args) {
        Car genesis = new Car("g80", "black", 1000);

        System.out.println("모델명 : " + genesis.model);
        System.out.println("색상 : " + genesis.color);
        System.out.println("가격(단위: 만 원) : " + genesis.model;

        genesis.powerOn();
        genesis.accelerate();
        genesis.stop();

        // genesis.powerOn();
        // 생성된 객체를 사용하는 방법은 포인트 연산자'.'를 사용하여
        // 객채에 접근
    }
}
