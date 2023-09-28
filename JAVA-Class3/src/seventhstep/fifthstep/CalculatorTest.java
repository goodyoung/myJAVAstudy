package seventhstep.fifthstep;

public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        int num1 = 10;
        int num2 = 2;
        System.out.println(calc.divide(num1, num2));
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description();
        int [] arr = {1,2,3,4,5};
        Calc.total(arr);
    }
}
