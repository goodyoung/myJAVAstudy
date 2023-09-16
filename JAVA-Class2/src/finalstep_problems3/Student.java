package finalstep_problems3;

import java.util.ArrayList;

public class Student {
    private static int studentSerialNum= 1000;
    int studentId;
    String studentName;
    ArrayList<Subject> subjectList = new ArrayList<Subject>();

    public Student(String studentName){
        this.studentId = ++studentSerialNum;
        this.studentName = studentName;
    }
    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }
    public void showStudentInfo(){
        int total = 0;
        for (Subject s: subjectList){
            total += s.getScore();
            System.out.println(studentName + "학생의 " + s.getSubjectName()+ "과목의 성적은 "+ s.getScore()+ "입니다. ");
        }
        System.out.println(studentName + "학생의 총점은 "+ total + "입니다.");
    }
}
