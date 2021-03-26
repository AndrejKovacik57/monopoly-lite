package sk.stuba.fei.uim.oop;


public class Property extends SpaceOnBoard{
    private boolean owned;
    private int ownerId;
    private final int cost;
    private final int rent;


    public Property(String name, boolean owned, int cost, int rent){
        setName(name);
        this.owned  = owned;
        ownerId     = 0;
        this.cost   = cost;
        this.rent   = rent;

    }


    public void buyProperty(Player player){
        if(player.getFreePropertyTicket()){
            ownerId=player.getPlayerId();
            player.setFreePropertyTicket(false);
            owned=true;
            System.out.println(player.getName()+" bought "+getName()+" for free property ticket/");
        }
        else{
            ownerId=player.getPlayerId();
            player.decreaseMoney(cost);
            owned=true;
            System.out.println(player.getName()+" bought "+getName()+" for $"+cost+".");
        }


    }
    public void payRent(Player player,Player owner){
        if(player.getMoney()>=rent){
            player.decreaseMoney(rent);
            owner.increaseMoney(rent);
            System.out.println(player.getName()+" payed rent of $"+rent+" to "+owner.getName()+".");
        }
        else{
            System.out.println(player.getName()+" didnt have money to pay rent and he loses!");
            player.setLost(true);
        }

    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCost() {
        return cost;
    }


}
