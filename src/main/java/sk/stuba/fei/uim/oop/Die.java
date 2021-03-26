package sk.stuba.fei.uim.oop;
import java.util.Random;

public class Die {

    private final int sides = 6;

    public void throwDie(Player player) {
        int outcome;
        Random gen = new Random();
        outcome = gen.nextInt(sides) + 1;
        player.movePlayer(outcome);
        System.out.println(player.getName()+" threw: "+outcome+".");

    }
}
