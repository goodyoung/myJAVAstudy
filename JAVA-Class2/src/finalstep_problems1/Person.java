package finalstep_problems1;

public class Person {

    String name;
    int money;

    Person(String name, int money){
        this.name = name;
        this.money = money;
    }
    public void buyStarCoffee(StarCoffee sco, int money){
        String message = sco.buying(money);
        if(message != null){
            this.money -= money;
            System.out.println(name + "님이" + money + "으로" + message);
        }
    }
    public void buyBeanCoffee(BeanCoffee bco, int money){
        String message = bco.buying(money);
        if(message != null){
            this.money -= money;
            System.out.println(name + "님이" + money + "으로" + message);
        }
    }
}
