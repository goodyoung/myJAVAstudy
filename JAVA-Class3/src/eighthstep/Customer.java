package eighthstep;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
