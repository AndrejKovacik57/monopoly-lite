package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class CreateBoard {
    public void createMonopolyBoard(ArrayList<SpaceOnBoard> board){

        board.add(new Start("Start",0));
        board.add(new Property("Dogs shelter",false,200,100,1));
        board.add(new Property("Tree house",false,400,200,2));
        board.add(new Property("Old small house",false,700,300,3));
        board.add(new CardPackSpace("Pack of chance cards",4));
        board.add(new Property("Cottage",false,900,400,5));
        board.add(new Prison("Prison",6));
        board.add(new Property("Flat house",false,1500,800,7));
        board.add(new Property("Bungalow",false,1800,1000,8));
        board.add(new Property("Apartment",false,2000,1200,9));
        board.add(new CardPackSpace("Pack of chance cards",10));
        board.add(new Property("Two story house",false,2500,1600,11));
        board.add(new ParkingLot("Parking",12));
        board.add(new Property("Restaurant",false,3100,2000,13));
        board.add(new Property("Tattoo shop",false,3500,2300,14));
        board.add(new Property("Electronics store",false,3900,2600,15));
        board.add(new CardPackSpace("Pack of chance cards",4));
        board.add(new Property("Supermarket",false,4300,3000,17));
        board.add(new Police("Police",18));
        board.add(new Property("Gas station",false,5000,3500,19));
        board.add(new Property("Hotel 4 stars",false,5700,4000,20));
        board.add(new Property("Circus",false,6100,4500,21));
        board.add(new CardPackSpace("Pack of chance cards",22));
        board.add(new Property("Airport",false,7000,5000,23));

    }
}
