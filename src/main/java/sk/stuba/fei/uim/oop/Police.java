package sk.stuba.fei.uim.oop;

public class Police extends SpaceOnBoard{
    private final boolean prison = true;
    private final int goToPrisonSpace = 6;
    private final int numberOfRoundInPrison = 3;

    public Police(String name,int space){
        setName(name);
        setSpace(space);

    }
    public void spaceMethod(Player player){
        if(!player.getPrisonImmunity()){
            System.out.println(player.getName()+" will be sent to jail for 3 rounds!");
            player.setSpace(goToPrisonSpace);
            player.setInPrison(prison);
            player.setTimeInPrison(numberOfRoundInPrison);
            System.out.println(player.getName()+" is in prison! \n"+player.getName()+" didnt get money for passing start!");
        }
        else{
            System.out.println(player.getName()+" has jail immunity, "+player.getName()+" wont be sent to jail and your immunity has been used!");
            player.setPrisonImmunity(false);
        }
    }


    public boolean getPrison() {
        return prison;
    }

    public int getNumberOfRoundInPrison() {
        return numberOfRoundInPrison;
    }

    public int getGoToPrisonSpace() {
        return goToPrisonSpace;
    }


}
