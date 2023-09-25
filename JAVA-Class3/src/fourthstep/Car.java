package fourthstep;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    final public void run(){
        //재정의 하면 안된다.
        //구현되거나 구현되지 않거나 상관없다
        //하위 클래스들이 상속을 받아서 구현할 것이기 때문에
        //템플릿 메서드 안에는 추상 메서드와 구체적인 메서드 모두 사용 가능하다.
        startCar();
        drive();
        stop();
        turnOff();
    }

}
