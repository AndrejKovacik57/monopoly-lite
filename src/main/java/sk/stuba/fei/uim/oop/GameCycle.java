package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class GameCycle {

    public void gameCycle(ArrayList<Player> players, TakeAction choose, Die die, ArrayList<SpaceOnBoard>  board,ArrayList<ChanceCards> cardPack){
        TakeTurn takeTurn = new TakeTurn();
        int counter=0;
        int round=1;
        while(players.size() != 1)
        {
            takeTurn.turn(round,choose,players.get(counter),die,players,board,cardPack);

            counter++;
            if(counter > players.size() - 1)
                counter = 0;
            round++;
        }
        System.out.println("Winner is "+players.get(0).getName());
    }
}
