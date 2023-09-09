package thirdstep;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int max;
        System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 1: ");
        int x = scanner.nextInt();
        System.out.println("입력 2: ");
        int y = scanner.nextInt();
        max = (x > y)? x: y;
        System.out.println(max);
    }


}
