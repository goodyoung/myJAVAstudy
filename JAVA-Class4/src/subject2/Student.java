package subject2;

class Student { // 학생을 표현하는 클래스
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id; this.tel = tel;
    }
    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }
}