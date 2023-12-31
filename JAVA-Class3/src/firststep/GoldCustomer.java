package firststep;

public class GoldCustomer extends Customer{
    double salesRatio;
    public GoldCustomer(int customerId, String customerName){
        super(customerId,customerName);
        customerGrade ="GOLD";
        salesRatio = 0.1;
        bonusRatio = 0.05;
    }
    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price* salesRatio);
    }
}
