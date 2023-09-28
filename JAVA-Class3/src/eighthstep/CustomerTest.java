package eighthstep;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.sayHello();
        Buy buyer = customer;
        buyer.buy();
    }

}
