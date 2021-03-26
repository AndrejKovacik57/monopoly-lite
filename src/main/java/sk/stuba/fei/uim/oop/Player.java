package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Player {
    private String name;
    private int playerId;
    private int space;
    private int money;
    private boolean inPrison;
    private int timeInPrison;
    private boolean prisonImmunity;
    private boolean freePropertyTicket;
    private boolean movedTroughStart;
    private boolean lost;
    public Player(String name, int playerId){
        this.name           = name;
        this.playerId       = playerId;
        space               = 0;
        money               = 8000;
        timeInPrison        = 0;
        inPrison            = false;
        prisonImmunity      = false;
        freePropertyTicket  = false;
        movedTroughStart    = false;
        lost                = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getSpace() {
        return space;
    }

    public int getMoney() {
        return money;
    }

    public boolean getInPrison() {
        return inPrison;
    }

    public void setInPrison(boolean inPrison) {
        this.inPrison = inPrison;
    }

    public boolean getPrisonImmunity() {
        return prisonImmunity;
    }

    public void setPrisonImmunity(boolean prisonImmunity) {
        this.prisonImmunity = prisonImmunity;
    }

    public boolean getFreePropertyTicket() {
        return freePropertyTicket;
    }

    public void setFreePropertyTicket(boolean freePropertyTicket) {
        this.freePropertyTicket = freePropertyTicket;
    }

    public void setTimeInPrison(int timeInPrison) {
        this.timeInPrison = timeInPrison;
    }

    public int getTimeInPrison() {
        return timeInPrison;
    }

    public boolean getMovedTroughStart() {
        return movedTroughStart;
    }

    public void setMovedTroughStart(boolean movedTroughStart) {
        this.movedTroughStart = movedTroughStart;
    }

    public boolean getLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public void movePlayer(int numberOfSpaces){
        space+=numberOfSpaces;
        if(space>=24){
            space%=24;
            movedTroughStart = true;
        }

    }

    public void playerRemoval(Player player, ArrayList<Player> players){
        System.out.println(player.getName()+" lost, he is removed from the game!");
        players.remove(player);
    }

    public void increaseMoney(int money){
        this.money += money;
    }

    public void decreaseMoney(int money){
        this.money -= money;
    }

    @Override
    public String toString() {
        return  "               Player information"             + '\n' +
                "Player name            :" + name               + '\n' +
                "Space                  :" + space              + '\n' +
                "Money                  :" + money              + '\n' +
                "Property ticket        :" + freePropertyTicket + '\n' +
                "Jail immunity          :" + prisonImmunity     + '\n' +
                "Is in prison           :" + inPrison           + '\n' +
                "Time left in prison    :" + timeInPrison       + '\n' +
                "Player lost            :" + lost               + '\n' ;
    }

}

