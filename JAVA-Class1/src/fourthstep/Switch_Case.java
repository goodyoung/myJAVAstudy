package fourthstep;

public class Switch_Case {
    public static void main(String[] args) {
        int month = 10;
//        int day;

//        switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
//            case 4, 6, 9, 11 -> day = 30;
//            case 2 -> day = 28;
//            default -> {
//                day = 0;
//                System.out.println("존재하지 않는 달 입니다.");
//            }
//        }
        int day = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일 입니다.");
                //day = 31 안 쓰고 day에 할당된다.
                yield 31;
            }
            case 4,6,9,11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 ->{
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default->{
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        };

        System.out.println(month + "월은 " + day + "일입니다.");


    }
}
