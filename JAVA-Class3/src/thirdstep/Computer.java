package thirdstep;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    //위에는 어떻게 정의할 지 모른다.
    //하위 클래스에 위임한다.
    //반드시 구현을 해야한다.
    //밑에는 공유를 할 것
    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
