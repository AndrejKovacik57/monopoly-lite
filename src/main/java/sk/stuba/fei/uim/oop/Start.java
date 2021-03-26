package sk.stuba.fei.uim.oop;

public class Start extends SpaceOnBoard{
    private final int startReward = 2500;

    public Start(String name){
        setName(name);
    }

    public void spaceMethod(Player player) {
        System.out.println(player.getName()+" moved trough start and gets $" + startReward + "." );
        player.increaseMoney(startReward);
        player.setMovedTroughStart(false);
    }
}

