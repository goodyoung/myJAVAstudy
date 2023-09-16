package sixthstep;

public class School {
    private  static School instance = new School();

    private School(){}
    public static School getInstatnce(){
        if (instance == null){
            instance = new School();
        }
        return instance;
    }
    public void createCar(){

    }
}
