package firststep;

public class VIPCustomer extends Customer{
    private int agentId;
    double salesRatio;
    public VIPCustomer(){
//        super(); -> default-Constructor
        //하위 클래스가 생성이 될 때 상위 클래스의 constructor가 생성이 된다.
        // 상위 클래스가 먼저 생성이 되어서 인스턴스 변수들의 메모리 값이 형성이 되어서 print가 찍히는 것이다.
        System.out.println(bonusRatio);
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
        System.out.println("VIP Customer ho");
    }
    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price* salesRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는 " + agentId;
    }

    public int getAgentId(){
        return agentId;
    }
}
