package finalstep_problems1;

public class BeanCoffee {
    int money;
    public String buying(int money){
        this.money += money;
        if (money == Menu.BEANAMERICANO){
            return "빈 다방 아메리카노를 구입했습니다.";
        }
        else if (money == Menu.BEANLATTE){
            return "빈 다방 라떼를 구입했습니다.";
        }
        else{
            return null;
        }
    }
}
