package finalstep_problems3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
//        Student lee = new Student("Lee");
//        Student kim = new Student("Kim");
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("Lee"));
//        list.add(new Student("Kim"));
//        list.get(0).setKoreanSubject("Korean",100);
//        list.get(0).setMathSubject("Math",50);
//        list.get(1).setEnglishSubject("English",0);
//
//        list.get(1).setKoreanSubject("Korean",70);
//        list.get(1).setMathSubject("Math",85);
//        list.get(1).setEnglishSubject("English",100);
//        int total =0;
//        for(int i = 0 ; i < list.size(); i++){
//            list.get(i).showStudentScore();
//        }
//////////////////////////////////////////////////////
        Student lee = new Student("Lee");
        lee.addSubject("국어",100);
        lee.addSubject("수학",50);
        Student kim = new Student("Kim");
        kim.addSubject("국어",70);
        kim.addSubject("수학",85);
        kim.addSubject("영어",100);
        lee.showStudentInfo();
        kim.showStudentInfo();

    }
}
