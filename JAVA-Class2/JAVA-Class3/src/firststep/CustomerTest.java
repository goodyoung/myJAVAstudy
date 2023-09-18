package firststep;

public class CustomerTest {
    public static void main(String[] args) {
        int price = 10000;
        Customer customerlee = new Customer();
        customerlee.setCustomerName("이");
        customerlee.setCustomerId(10010);
        customerlee.bonusPoint = 1000;
        int cost = customerlee.calcPrice(price);
        System.out.println(customerlee.showCustomerInfo() + " 지불 금액은 "+ cost + " 입니다.");


        Customer customerkim = new VIPCustomer();
        customerkim.setCustomerName("김");
        customerkim.setCustomerId(10020);
        customerkim.bonusPoint = 10000;
        cost = customerkim.calcPrice(price);
        System.out.println(customerkim.showCustomerInfo()+ " 지불 금액은 "+ cost + " 입니다.");

        Customer customerPark = new VIPCustomer();
        customerPark.setCustomerName("Park");
        cost = customerPark.calcPrice(price);
        System.out.println(customerPark.showCustomerInfo()+ " 지불 금액은 "+ cost + " 입니다.");
        // 오버라이딩이 된 경우에 인스턴스(VIP)것이 불린다.
        // 참조할 수 있는건 customer 것이 참조가 되는것이지 생성되는 것이 아닌 게 아니다.
    }
}
