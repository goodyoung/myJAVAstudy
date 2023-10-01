package problem1;

public class Player {
    private PlayerLevel level;

    public PlayerLevel getLevel() {
        return level;
    }
    public Player(){
        level = new BeginnerLevel();
    }
    public void upgradeLevel(){
//        this.level = pl;
        if (getLevel() instanceof BeginnerLevel){
            level = new AdvancedLevel();
        }else{
            level = new SuperLevel();
        }
    }
    final public void play(int count){
        level.go(count);
    }

}
