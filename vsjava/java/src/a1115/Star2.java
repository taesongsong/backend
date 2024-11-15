package a1115;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j =n; j >= i; j--){
            System.out.print("*");
        }
            System.out.println(); // 별을 다섯개찍고 줄바꿈 
            // i : 1, j : 5 4 3 2 1 
            // i : 2, j : 5 4 3 2
            // i : 3, j : 5 4 3 
            // i : 4, j : 5 4 
            // i : 5, j : 5  
        }
    }
}
