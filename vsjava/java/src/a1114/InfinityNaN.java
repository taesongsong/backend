public class InfinityNaN {
    public static void main(String[] args) {
        int x =5;
        double y = 0.0;
        double z = x / y ;
        // double z = x % y;
        // System.out.println(z+2);
        // 위의 경우 잘못된 코드이다.

        // 알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z+2);
        }




    }
}
