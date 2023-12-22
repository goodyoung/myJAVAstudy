package subject9;

public class Test {
    public static void main(String[] args) {
        int row, col;
        int count = 0;
        outerLoop:
        for (row = 0; row < 3; row++)
            for (col = 0; col < 5; col++) {
                count = count + 1;
                if (count > 3){
                    System.out.println(count);
                    break outerLoop;
                }

            }
    }
}
