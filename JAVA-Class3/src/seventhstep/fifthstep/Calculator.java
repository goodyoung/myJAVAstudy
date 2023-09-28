package seventhstep.fifthstep;

public abstract class Calculator implements Calc {
    //인터페이스는 여러개가 가능하다.
    //인터페이스는 구현이기 때문에 implements이다.
    @Override
    public int add(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 + num2;
    }

//    @Override
//    public void description() {
//        System.out.println("사칙연산을 수행하는 연산기 입니다.");
//    }
}
