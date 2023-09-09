package secondstep;

public class JAVATYPE {
    public static void main(String[] args) {
        int num = 10;
        int bnum = 0B1010;
        int onum = 012;
        int xnum = 0XA;
        System.out.println(num);
        System.out.println(bnum);
        System.out.println(onum);
        System.out.println(xnum);

        int cnum = 0B01000001;
        System.out.println((char)cnum);
        // 숫자 자료형
        long iVal = 12312412451L;
        float iFloat = 123.124f;
        double hell = 12312.213; //
        System.out.println(iVal);
        System.out.println(iFloat);
        System.out.println(hell);
        double mynum = 1;
        for(int i = 0 ; i < 10000000; i++){
            mynum += 1;
        }
        System.out.println(mynum);
        // 문자
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); // 캐스팅 (자료형 변환)
        boolean isMarried = true;
        System.out.println(isMarried);
        //자료형 없이 변수 사용하기
        var str = "hello";

        System.out.println(str);

        str = "test";
        //str = 3;
        // 상수 정의
        final int MAX_NUM = 100;
        final int MIN_NUM;
        // 형 변환
        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum); // 더 큰 자료형으로 계산된다.

        System.out.println(iNum1);
        System.out.println(iNum2);

    }
}
