package a1114;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 7;

        String result = (number % 2 == 0) ? "짝수": "홀수";
        // 조건식 ? 조건이 참일 때 값 : 조건이 거짓일 때 값
        // 물음표(?)를 기준으로 참이면 앞에(짝수) , 거짓이면 뒤에(홀수) 로 출력됨
        System.out.println(result);
    }
}
