package problems;

public class Computer_1 {
    String myComputer;
    int myMemory;
    public static final String[] osType = {"윈도7","애플 OS X","안드로이드"};
    public Computer_1(int idx,int myMemory){
        myComputer = osType[idx];
        this.myMemory = myMemory;
    }
    public void print(){
        System.out.println("운영체제: " + myComputer +  ", 메인메모리: "+ myMemory);
    }
}
