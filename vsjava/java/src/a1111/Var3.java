package a1111;

public class Var3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;        
        System.out.println("x:" + x + ", y:" + y);
        int temp = x; 
        x = y;   // x의 값이 무시되고 y값인 5가 대입
        y = temp; // y에 temp에 있던 3이 대입
        System.out.println("x:" + x + ", y: " + y);
    }
}
