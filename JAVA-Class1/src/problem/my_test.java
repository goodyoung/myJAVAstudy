package problem;


import java.util.Arrays;
import java.util.Scanner;

public class my_test {
    public static void main(String[] args) {
        //case 1
//        grade = (sore >= 90) ? 'A' : 'B';
//        char grade;
//        Scanner scanner = new Scanner(System.in);
//        int score = scanner.nextInt();
//        if (score >= 90){
//            System.out.println("A");
//        }else{
//            System.out.println("B");
//        }
        //case 2
//        int sum;
//        int row;
//        for(int i = 1 ; i <= 9; i ++){
////            if (i % 2 != 0)
////                continue;
//            for ( int j = 1 ;j <=i; j++){
//                System.out.printf("%d X %d = %d\n",i,j,i*j);
//            }
//        }
        //case 3
        int tot = 7;
        int cnt = tot/2 + 1;
        int star = 1;
        System.out.println("hi");

        for(int i = 0; i < 7; i++){
            for(int k = 0; k<cnt;k++){
                System.out.print(" ");
            }
            for(int k = 0; k<star;k++) {
                System.out.print("*");
            }
            for(int k = 0; k<cnt;k++){
                System.out.print(" ");
            }
            if (i<(tot/2)){
                star +=2;
                cnt--;
            }else{
                star -=2;
                cnt ++;
            }
            System.out.println();
        }
    }
}
