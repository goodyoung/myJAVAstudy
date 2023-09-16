package fourthstep;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    public void takeSubway(Subway sub){
        sub.take(1000);
        this.money -= 1200;
    }
    public void showStudentInfo(){
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
