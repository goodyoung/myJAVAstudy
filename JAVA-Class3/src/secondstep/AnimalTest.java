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
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }

}
class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
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

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }
    public static void animalMove(Animal ani){
        ani.move();
    }
    public static void testDownCasting(ArrayList<Animal> animalList){
        for(int i = 0 ; i< animalList.size(); i++){
            Animal animal = animalList.get(i);
            if( animal instanceof Human){
                Human humans = (Human) animal;
                humans.readBooks();
            }else if (animal instanceof Tiger){
                Tiger tigers = (Tiger) animal;
                tigers.hunting();
            }
        }
    }
}
