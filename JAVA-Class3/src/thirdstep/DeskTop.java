package thirdstep;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop Typing");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Test2");
    }
}
