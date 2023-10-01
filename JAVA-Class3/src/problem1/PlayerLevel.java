package problem1;

public interface PlayerLevel {
    public void run();
    public void jump();
    public void turn();
    public void showLevelMessage();
    default void go(int count){
        showLevelMessage();
        run();
        for(int i = 0 ; i< count; i++){
            jump();
        }
        turn();
    }
}
