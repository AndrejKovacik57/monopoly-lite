package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Game {

   public void game(){
       GameCycle game = new GameCycle();
       TakeAction choose= new TakeAction();
       CreateCardPack createCardPack = new CreateCardPack();
       ArrayList<Player> players = new ArrayList<Player>();
       ArrayList<SpaceOnBoard> board = new ArrayList<SpaceOnBoard>();
       ArrayList<ChanceCards> cardPack = new ArrayList<ChanceCards>();
       Die die = new Die();
       CreateBoard createBoard = new CreateBoard();
       PlayersInitialization createPlayers = new PlayersInitialization();

       createCardPack.create(cardPack);
       createBoard.createMonopolyBoard(board);
       createPlayers.createP(players);
       game.gameCycle(players,choose,die,board,cardPack);





   }


}
