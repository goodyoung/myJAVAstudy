package problems;

public class Circle_2 {
    public double radius;

    public static double PI = 3.141592;


//생성자 구현

    public Circle_2(double radius) {
        this.radius = radius;
    }

//현재 반지름을 사용하여 원의 면적을 구하는 메소드

    public double getArea() {
        return radius * radius * PI;
    }
}
