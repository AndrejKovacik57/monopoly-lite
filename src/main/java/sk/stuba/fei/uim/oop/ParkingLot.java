package sk.stuba.fei.uim.oop;

public class ParkingLot extends SpaceOnBoard{
    private final int fine = 2000;

    public ParkingLot(String name){
        setName(name);
    }
    public void spaceMethod(Player player){
        System.out.println(player.getName()+" stepped on parking lot, he must pay fine of $"+fine);
        if(player.getMoney()<fine){
            System.out.println(player.getName()+" doesnt have enough money to pay fine,"+player.getName()+" is out of the game");
            player.setLost(true);
        }
        else{
            System.out.println(player.getName()+" payed fine ");
            player.decreaseMoney(fine);
        }

    }


}
