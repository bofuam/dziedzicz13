import java.util.Random;

public abstract class Move {
    public abstract boolean beats(Move move);

    public static Move getRandom(){
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        if (randomNumber==0){
            return new Paper();
        }else if(randomNumber==1){
            return new Rock();
        }else if(randomNumber == 2){
            return new Scissors();
        }else if(randomNumber == 3){
            return new Lizard();
        }else return new Spock();
    }
}