package subject;

import java.util.Scanner;

public class TotalTest {
    public static void main(String[] args) {
        // 고건영 소프트웨어학부 2020017027
        Scanner scanner = new Scanner(System.in);
        System.out.printf("학생 수를 입력해주세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Total[] t;
        t = new Total[n];


        for (int i = 0 ; i < n ; i++){

            System.out.printf("이름 국어, 수학, 영어 순으로 (홍길동 100 100 100)과 같이 입력하시오:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            int a = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]);
            int c = Integer.parseInt(parts[3]);
            System.out.println("- 성 적 표 -");
            System.out.println("===============================\n" +
                    "이름   국어   수학  영어 총점  평균\n" +
                    "===============================");
            for (int i = 0 ; i < n ; i++){
                System.out.printf("%s %d  %d  %d  %d  %d\n",t[i].studentName,t[i].mathScore,t[i].koreanScore,t[i].englishScore,t[i].totalSum(),t[i].mean());
            }
            System.out.printf("===============================");
            t[i] = new Total(name,a,b,c);
        }

    }
}
