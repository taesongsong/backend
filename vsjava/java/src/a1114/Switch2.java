package a1114;

public class Switch2 {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원입니다.");
                break;
            default:
                 System.out.println("손님 입니다.");
                
        }
            
    }
}

// Switch 문은 반드시 break를 넣어서 빠져나가야 함.