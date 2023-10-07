package secondstep;

public class Plastic extends Material{
    public String toString(){
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic의 재료를 사용합니다.");
    }
}
