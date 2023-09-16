package seventhstep;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1","조정래");
        library[1] = new Book("태백산맥2","조정래");
        library[2] = new Book("태백산맥3","조정래");
        library[3] = new Book("태백산맥4","조정래");
        library[4] = new Book("태백산맥5","조정래");
        // 얕은 복사
        System.arraycopy(library,0,copyLibrary,0,library.length);
        //아 오브젝트의 몇번째 부터 , 이 오브젝트의 몇번째 번호를 시작으로 몇개를 복사해라.
        for (Book book: library){
            book.showBookInfo();
        }
        for (Book book: copyLibrary){
            book.showBookInfo();
        }
        library[0].setAuthor("박완서");
        library[0].setTitle("계륵");
        for (Book book: copyLibrary){
            book.showBookInfo();
        }


    }
}
