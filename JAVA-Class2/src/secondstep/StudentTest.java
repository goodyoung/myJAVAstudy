package secondstep;

public class StudentTest {
    public static void main(String[] args) {
        Student Lee = new Student(1,"Lee");
        Student Kim = new Student(1,"Kim");
        Lee.setKoreanSubject("Korean",100);
        Lee.setMathSubject("Math",95);
        Kim.setKoreanSubject("Korean",80);
        Kim.setMathSubject("Math",99);

        Lee.showStudentScore();
        Kim.showStudentScore();
        System.out.println(Lee.getStudentId());
        Kim.setStudentName("james");
        Kim.showStudentScore();
    }
}
