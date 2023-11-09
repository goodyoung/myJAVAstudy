package subject2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
        HashMap<String, Student> map = new HashMap<String, Student>();

        System.out.print("입력할 학생 수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 3 명의 학생 저장
        for(int i = 0; i < num; i++){
            System.out.print("학생 이름과 id, 전화번호를 입력하세요: ");
            String sentence = scanner.nextLine();
            String[] parts = sentence.split(" ");

            String name = parts[0];
            int id = Integer.parseInt(parts[1]);
            String phoneNumber = parts[2];

            if (parts.length == 3) {
                map.put(name, new Student(id, phoneNumber));
            } else {
                System.out.println("올바른 형식의 입력이 아닙니다.");
            }

        }


        while(true) {
            System.out.print("검색할 이름?");
            String name = scanner.nextLine(); // 사용자로부터 이름 입력
            if(name.equals("exit"))
                break; // while 문을 벗어나 프로그램 종료
            Student student = map.get(name); // 이름에 해당하는 Student 객체 검색
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
        }
        scanner.close();
    }


}
