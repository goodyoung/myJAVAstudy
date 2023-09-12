package firststep;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"Lee");
//        studentLee.studentName = "Lee";
        studentLee.studentAddress = "Seoul";

        Student studentKim = new Student(101,"Kim");
//        studentKim.studentName = "Kim";
        studentKim.studentAddress = "Seoul";
        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
