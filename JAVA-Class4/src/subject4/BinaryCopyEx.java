package subject4;

import java.io.*;

public class BinaryCopyEx {
    public static void main(String[] args) {
        File src = new File("/Users/goodyoung/Desktop/GIt/myJAVAstudy/JAVA-Class4/src/subject4/image/img1.png");
        File dest = new File("/Users/goodyoung/Desktop/GIt/myJAVAstudy/JAVA-Class4/src/subject4/dest_image/copy_img.png");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte [] buf = new byte [1024*10]; // 10KB 버퍼
            while(true) {
                int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 실제 읽은 바이트
                fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기
                if(n <buf.length)
                    break;
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath()+ "를 " +
                    dest.getPath()+ "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}