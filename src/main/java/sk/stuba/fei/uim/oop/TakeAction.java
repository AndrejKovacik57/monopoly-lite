package sk.stuba.fei.uim.oop;

public class TakeAction extends KeyboardInput{

    public static boolean takeAction(String text){
        int num;
        boolean answer;
        while(true){
            num = readInt(text);
            if(num==0){
                answer = false;
                break;
            }
            else if(num==1){
                answer = true;
                break;
            }
            else {
                System.out.println("You entered wrong input try again!");
            }
        }

        return answer;
    }
}
