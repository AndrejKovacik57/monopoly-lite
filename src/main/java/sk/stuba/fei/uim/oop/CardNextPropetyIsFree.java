package sk.stuba.fei.uim.oop;

public class CardNextPropetyIsFree extends ChanceCards{
    public void useCard(Player player){
        System.out.println("Next time "+player.getName()+" wants to buy property its for free.");
        player.setFreePropertyTicket(true);
        setUsed(true);
    }
}
