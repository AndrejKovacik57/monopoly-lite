package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class CreateBoard {
    public void createMonopolyBoard(ArrayList<SpaceOnBoard> board){

        board.add(new Start("Start"));
        board.add(new Property("Dogs shelter",false,200,100));
        board.add(new Property("Tree house",false,400,200));
        board.add(new Property("Old small house",false,700,300));
        board.add(new CardPackSpace("Pack of chance cards"));
        board.add(new Property("Cottage",false,900,400));
        board.add(new Prison("Prison"));
        board.add(new Property("Flat house",false,1500,800));
        board.add(new Property("Bungalow",false,1800,1000));
        board.add(new Property("Apartment",false,2000,1200));
        board.add(new CardPackSpace("Pack of chance cards"));
        board.add(new Property("Two story house",false,2500,1600));
        board.add(new ParkingLot("Parking"));
        board.add(new Property("Restaurant",false,3100,2000));
        board.add(new Property("Tattoo shop",false,3500,2300));
        board.add(new Property("Electronics store",false,3900,2600));
        board.add(new CardPackSpace("Pack of chance cards"));
        board.add(new Property("Supermarket",false,4300,3000));
        board.add(new Police("Police"));
        board.add(new Property("Gas station",false,5000,3500));
        board.add(new Property("Hotel 4 stars",false,5700,4000));
        board.add(new Property("Circus",false,6100,4500));
        board.add(new CardPackSpace("Pack of chance cards"));
        board.add(new Property("Airport",false,7000,5000));

    }
}
