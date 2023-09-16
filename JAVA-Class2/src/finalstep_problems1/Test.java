package finalstep_problems1;

public class Test {
    public static void main(String[] args) {
        Person Kim = new Person("Kim",10000);
        Person Lee = new Person("Lee",20000);
        StarCoffee str = new StarCoffee();
        BeanCoffee bee = new BeanCoffee();

        Kim.buyStarCoffee(str, Menu.STARAMERICANO);
        Lee.buyStarCoffee(str, Menu.BEANLATTE);

    }
}
