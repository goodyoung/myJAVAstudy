package problems;

public class Salary {
    int salary;
    public Salary(){
        this.salary = 1000000;
    }
    public Salary(int salary){
        this.salary = salary;
    }
    public int getAnnualGross(){
        return (this.salary*12) + (this.salary*5);
    }

}
