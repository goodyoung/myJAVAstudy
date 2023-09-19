package secondstep;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");
    }
}
class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal tiger = new Tiger();
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(human);
        animalList.add(tiger);
        for(Animal ani: animalList){
            ani.move();
            //다형
            //move라는 똑같은 메서드를 호출했지만
            //각 인스턴스에 해당되는 move메서드가 호출이 되었다.
        }

        animalMove(human); // upcasting
        animalMove(tiger);
    }
    public static void animalMove(Animal ani){
        ani.move();
    }
}
