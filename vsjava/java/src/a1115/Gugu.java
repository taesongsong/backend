package a1115;

import java.util.Scanner; // alt + shift + 5

public class Gugu {
    public static void main(String[] args) {
        // 구구단 (1~9단)
        // 원하는 단은 입력받아 아래와 같이 구구단 수식을 출력

        Scanner sc = new Scanner(System.in); // (System.in) : 키보드로 입력받아 넣겠다
        System.out.print("입력 : ");
        int input = sc.nextInt(); // 숫자 정수는 Int 로 받는다.

        for(int i = 1; i <= 9; i++){
            // System.out.println(input + " * " + i + " = "+ input * i);
            int result = input * i;
            System.out.println(input + " * " + i + " = " + result);
        }
        sc.close(); // 현재는 안써도 괜찮은데 나중에 많아지면 에러뜨는거 방지.
        
    }
}
