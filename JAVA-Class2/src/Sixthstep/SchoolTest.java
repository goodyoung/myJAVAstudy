package Sixthstep;

import java.util.Calendar;

public class SchoolTest {
    public static void main(String[] args) {
        School school1 = School.getInstatnce();
        School school2 = School.getInstatnce();
        System.out.println(school1 == school2);
        //하나만 존재하는 것을 확인할 수 있다.
        Calendar calendar = Calendar.getInstance();
        //이 객체가 가지는 인스턴스 값이 여러개 일 경우 문제가 될 때.
        // 시간이라는 것은 하나 뿐이 없다.
        // 인스턴스 값이 여러개가 아니다.
    }
}
