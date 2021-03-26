package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class CreateCardPack {
    public void create(ArrayList<ChanceCards> chanceCardsPack){
        chanceCardsPack.add(new CardBetMoney());
        chanceCardsPack.add(new CardMoneyReward());
        chanceCardsPack.add(new CardNextPropetyIsFree());
        chanceCardsPack.add(new CardPrisonImmunity());
        chanceCardsPack.add(new CardYouPayFine());
    }
}
