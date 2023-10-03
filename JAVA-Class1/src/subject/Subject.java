// 소프트웨어학부 * 고건영
package subject;
import java.util.Scanner;
public class Subject {
    public static void main(String[] args) {
            //2020017027 - 고건영
            Scanner scanner = new Scanner(System.in);
            System.out.printf("숫자를 입력하세요: ");
            int n = scanner.nextInt();
            while (n != -1){
                if (n == 0 ){
                    System.out.println("0단은 없습니다.");
                }else{
                    for(int count = 1; count <=9; count++) {
                        System.out.println( n + "X" + count + "=" + n * count);
                    }
                }
                System.out.printf("숫자를 입력하세요: ");
                n = scanner.nextInt();
            }
    }
}
