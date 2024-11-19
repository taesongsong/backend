package a1118;

public class Sprit1 {
    public static void main(String[] args) {
        String board = "1,자비학습,참조타입 String을 학습합니다.,홍길동";
        // 믄자열을 배열로 분리
        String[] tokens = board.split(",");
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("저자: " + tokens[3]);
        System.out.println();

        // for문을 이용한 읽기
        for(int i = 0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
