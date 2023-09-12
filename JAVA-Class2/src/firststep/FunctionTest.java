package firststep;

public class FunctionTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1,n2);
        sayhello("Hello");
        System.out.println(total);
    }
    public static int addNum(int num1, int num2){
        return num1 + num2;
    }
    public static void sayhello(String str){
        System.out.println(str);
    }
}
