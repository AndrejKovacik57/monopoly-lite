package sk.stuba.fei.uim.oop;

public class CardMoneyReward extends ChanceCards{

   public CardMoneyReward(){
        setReward(5000);
    }

    public void useCard(Player player){
        System.out.println(player.getName()+"  have won $"+getReward()+"!");
        player.increaseMoney(getReward());
        setUsed(true);


    }
}
