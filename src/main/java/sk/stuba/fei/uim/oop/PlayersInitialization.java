package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class PlayersInitialization extends KeyboardInput{

    public void createP(ArrayList<Player> players){
        int playerNumber;

        playerNumber = readInt("Enter number of players: ");

        for (int i =1;i<= playerNumber;i++)
        {
            Player player = new Player(readString("Enter name for player"+(i)+": "), i);
            players.add(player);
        }
    }
}
