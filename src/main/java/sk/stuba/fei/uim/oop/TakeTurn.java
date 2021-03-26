package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class TakeTurn {
    private int findOwnerOfProperty(Property property, ArrayList<Player> players){
        int i=0;
        while (property.getOwnerId()!=players.get(i).getPlayerId()){
            i++;
        }
        return i;
    }
    private void playerReturnProperties(Player player, ArrayList<SpaceOnBoard> board){
        System.out.println(player.getName()+" returns back all his properties.");
        for(SpaceOnBoard b : board){
            if(b instanceof Property) {
                if(player.getPlayerId()==((Property)b).getOwnerId()){
                    ((Property)b).setOwnerId(0);
                    ((Property)b).setOwned(false);
                }
            }
        }
    }

    public void takeCardFromPack (Player player, ArrayList<ChanceCards>chanceCardsPack,CardPackSpace cardPackSpace){
        System.out.println(player.getName()+" is standing on "+cardPackSpace.getName()+".");
        int i=0;
        while(chanceCardsPack.get(i).getUsed()) {
            i++;
        }
        if(chanceCardsPack.get(i) instanceof CardYouPayFine ) {
            ((CardYouPayFine)(chanceCardsPack.get(i))).useCard(player);
        }

        else if(chanceCardsPack.get(i) instanceof CardBetMoney ) {
            ((CardBetMoney)(chanceCardsPack.get(i))).useCard(player);
        }

        else if(chanceCardsPack.get(i) instanceof CardPrisonImmunity ) {
            ((CardPrisonImmunity)(chanceCardsPack.get(i))).useCard(player);
        }

        else if(chanceCardsPack.get(i) instanceof CardMoneyReward ) {
            ((CardMoneyReward)(chanceCardsPack.get(i))).useCard(player);
        }
        else {
            ((CardNextPropetyIsFree)(chanceCardsPack.get(i))).useCard(player);
        }
        if(i==4){
            for(ChanceCards card: chanceCardsPack){
                card.setUsed(false);
            }
        }
    }
    public void turn(int round,TakeAction choose, Player player, Die die,ArrayList<Player> players,ArrayList<SpaceOnBoard>  board,ArrayList<ChanceCards> cardPack)
    {
        System.out.println("\n-----------------------------------------------");
        System.out.println("                 ROUND "+round);
        System.out.println(player.toString());
        if(player.getInPrison()){
            ((Prison)board.get(player.getSpace())).spaceMethod(player);
        }
        else{
            //hod kockou, player ziska poziciu
            die.throwDie(player);
            //ak hrac presiel startom
            if(player.getMovedTroughStart()){
                ((Start)board.get(0)).spaceMethod(player);
            }
            //zistim ci policko na ktore player skocil je property
            if(board.get(player.getSpace()) instanceof Property){

                System.out.println(player.getName()+" is standing on property "+((Property)board.get(player.getSpace())).getName()+".");
                //propertz nema majtela
                if(!((Property)board.get(player.getSpace())).isOwned()){
                    System.out.println(((Property)board.get(player.getSpace())).getName()+" doesnt have owner!"+" Its price is $"+((Property)board.get(player.getSpace())).getCost()+".");

                    //rozhodnem sa ci ho chcem kupit
                    if(choose.takeAction("Press 1 to buy property or press 0 to not(IF YOU HAVE PROPERTY TICKET IT WILL BE CONSUMED): ")){
                        //ak mam freepropertyticket tak kupim property zadarmo
                        if(player.getFreePropertyTicket()){
                            ((Property)board.get(player.getSpace())).buyProperty(player);
                        }
                        //kupujem za peniaze
                        else if(player.getMoney()>=((Property)board.get(player.getSpace())).getCost()){
                            ((Property)board.get(player.getSpace())).buyProperty(player);
                        }
                        //nemam peniaze na kupu
                        else{
                            System.out.println(player.getName()+" doesnt have enough money to buy property!");
                        }
                    }
                }
                //ma majtela
                else  {

                    int ownerOfPropertyId= findOwnerOfProperty(((Property)board.get(player.getSpace())),players);
                    //majtel je protihrac
                    if(((Property)board.get(player.getSpace())).getOwnerId()==players.get(ownerOfPropertyId).getPlayerId() && player.getPlayerId()!=((Property)board.get(player.getSpace())).getOwnerId()){
                        //ak mam peniaze platim ak nemam peniaze vypadavam
                        ((Property)board.get(player.getSpace())).payRent(player,players.get(ownerOfPropertyId));
                    }
                    //stojim na vlastnom property
                    else{
                        System.out.println(player.getName()+" is standing on his own property "+((Property)board.get(player.getSpace())).getName()+".");
                    }


                }
            }
            //taham kartu
            else if (board.get(player.getSpace()) instanceof CardPackSpace){
                takeCardFromPack(player,cardPack,((CardPackSpace)board.get(player.getSpace())));
            }
            //idem do vazania
            else if (board.get(player.getSpace()) instanceof Police){
                ((Police)board.get(player.getSpace())).spaceMethod(player);

            }
            //nic sa nedeje
            else if (board.get(player.getSpace()) instanceof Prison){
                ((Prison)board.get(player.getSpace())).spaceMethod(player);

            }
            //platim pokutu
            else if (board.get(player.getSpace()) instanceof ParkingLot){
                ((ParkingLot)board.get(player.getSpace())).spaceMethod(player);

            }
            //hrac vypadol
            if(player.getLost()){

                player.playerRemoval(player,players);
                playerReturnProperties(player,board);
            }

        }


    }
}
