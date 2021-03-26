package sk.stuba.fei.uim.oop;
import java.util.Random;


public class CardBetMoney extends ChanceCards{
    public CardBetMoney() {
        setCost(3000);
        setReward(30000);
        setProbability(25);
    }

    public void useCard(Player player){
        TakeAction action = new TakeAction();
        System.out.println(player.getName()+" can bet $"+getCost()+" to win $"+getReward()+" with 25% chance of succeed.");
        if(action.takeAction("Press 1 to take a bet or press 0 to not take bet: ") && player.getMoney()>=getCost()){

            Random rand = new Random();
            if( getProbability() > rand.nextInt(100)+1){
                player.increaseMoney(getReward());
                System.out.println(player.getName()+"  won the bet and recieved $"+getReward()+".");
            }
            else{
                System.out.println(player.getName()+"  didnt win the bet.");
            }
        }
        else{
            System.out.println(player.getName()+"  didnt take a chance or didnt have money to bet.");

        }

        setUsed(true);
    }
}
