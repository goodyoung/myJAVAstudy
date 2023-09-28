package fifthstep;

public interface Calc {
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1,int num2);
    int divide(int num1, int num2);
    //public abstract의 키워드가 나온다
    double PI = 3.14;
    int ERORR=9999999;
    //public static final로 처리가 된다.
}
