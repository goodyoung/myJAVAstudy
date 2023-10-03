package fourthstep;

import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n != -1){
            for(int count = 1; count <=9; count++) {
                System.out.println( n + "X" + count + "=" + n * count);
            }
            n = scanner.nextInt();
        }


    }
}
