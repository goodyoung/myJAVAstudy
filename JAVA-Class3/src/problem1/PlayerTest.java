package problem1;

public class PlayerTest {
    public static void main(String[] args) {
        Player player_one = new Player();
        player_one.play(1);
        player_one.upgradeLevel();
        player_one.play(2);
        player_one.upgradeLevel();
        player_one.play(3);
    }
}

