package sk.stuba.fei.uim.oop;

public class CardYouPayFine extends ChanceCards{
    public CardYouPayFine() {
        setCost(5000);
    }

    public void useCard(Player player){
        System.out.println("Sad news, "+player.getName()+" must pay fine of $"+getCost()+".");
        if(player.getMoney()<getCost()){
            System.out.println(player.getName()+" doesnt have enough money to pay fine.\n "+player.getName()+" loses the game.");
            player.setLost(true);
            setUsed(true);
        }
        else {
            player.decreaseMoney(getCost());
            setUsed(true);
            System.out.println(player.getName()+" payed the fine.");
        }

    }
}
