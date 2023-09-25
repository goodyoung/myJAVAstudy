package thirdstep;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer com = new Computer();
        Computer deskTop = new DeskTop();
        deskTop.display();;
        deskTop.turnOff();

        NoteBook myNoteBook = new MyNoteBook();
        myNoteBook.typing();
    }
}
