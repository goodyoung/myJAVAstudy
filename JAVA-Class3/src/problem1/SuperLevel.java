package problem1;

public class SuperLevel implements PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높게 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**** 고급자 레벨입니다. ****");
    }
}
