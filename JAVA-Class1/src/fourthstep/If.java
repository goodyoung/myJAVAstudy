package fourthstep;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
//        int age = 7;

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if( age >= 8)
            System.out.println("학교에 다닙니다");
        else if (age ==4)
            System.out.println("4살 입니다.");
        else
            System.out.println("학교에 다니지 않습니다.");
    }
}
