package problem2;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 가장 높은 call을 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 숙련도가 가장 높은 상담원을 가지고 옵니다.");
    }
}
