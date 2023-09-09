package fourthstep;

public class For {
    public static void main(String[] args) {
//        int count =1;
//        int sum = 0;
//
//        for( int i = 0 ; i<10; i++, count++) {  //10번
//            sum += count;
//        }
//        System.out.println(sum);
        int dan = 2;
        int count = 1;

        for( dan = 2; dan <= 9; dan++) {

            for(count = 1; count <=9; count++) {

                System.out.println( dan + "X" + count + "=" + dan * count);
            }
            System.out.println();
        }
        //3의 배수만 찍히게 한다.
        int num;
        for( num = 1; num <= 100; num++) {

            if( (num % 3) != 0)
                continue;

            System.out.println(num);

        }

    }
}
