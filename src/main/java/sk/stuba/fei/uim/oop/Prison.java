package sk.stuba.fei.uim.oop;

public class Prison extends SpaceOnBoard{

    public Prison(String name){
        setName(name);
    }


    public void spaceMethod(Player player){
        if(player.getInPrison()){
            player.setTimeInPrison(player.getTimeInPrison()-1);
            System.out.println(player.getName()+" time in jail has been reduced by one");
            if(player.getTimeInPrison()==0){
                player.setInPrison(false);
                System.out.println(player.getName()+" finished his time in jail, "+player.getName()+" is free to go in next round!");
            }
        }
        else {
            System.out.println(player.getName()+" is visiting prison.");
        }
    }
}
