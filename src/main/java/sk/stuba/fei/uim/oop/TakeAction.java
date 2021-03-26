package sk.stuba.fei.uim.oop;

public class TakeAction {

    public boolean takeAction(String text){
            KeyboardInput input = new KeyboardInput();
        int num;
        boolean answer;
        while(true){
            num = input.readInt(text);
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
