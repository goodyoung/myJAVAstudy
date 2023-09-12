package firststep;

public class Student {
    int studentId;
    String studentName;
    String studentAddress;
    public Student(int id, String Name){
        studentId = id;
        //this.studentId = studentId;
        studentName = Name;
    }
    public void showStudentInfo(){
        System.out.println(studentId+","+studentName + "," + studentAddress);
    }
    public String getStudentName() { //이름 생성시 가져다가 쓰는 쪽의 입장에서 만들어야 한다.
        return studentName;
    }
}
