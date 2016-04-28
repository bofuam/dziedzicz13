/**
 * Created by JK on 2016-04-25.
 */
public class Scissors extends Move {
    @Override
    public boolean beats(Move move) {
        if(move instanceof Rock){
            return false;
        }else if(move instanceof Paper){
            return true;
        }else if(move instanceof Lizard){
            return true;
        }else if(move instanceof Spock){
            return false;
        }else return false;
    }
}
