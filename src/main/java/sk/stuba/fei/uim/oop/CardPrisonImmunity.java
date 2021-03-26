package sk.stuba.fei.uim.oop;

public class CardPrisonImmunity extends ChanceCards{
    public void useCard(Player player){
        System.out.println(player.getName()+"  has got prison imunity!\nNext time "+player.getName()+" steps on police he wont got to jail. ");
        player.setPrisonImmunity(true);
        setUsed(true);
    }
}
