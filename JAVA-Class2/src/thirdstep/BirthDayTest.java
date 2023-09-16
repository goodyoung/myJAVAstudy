package thirdstep;

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        BirthDay day2 = new BirthDay();
        day.setYear(2023);
        day.setMonth(15);
        day.setDay(30);
        System.out.println(day.isValid());
        System.out.println(day);
        System.out.println(day2);
        day.printThis();
        day2.printThis();
    }
}
