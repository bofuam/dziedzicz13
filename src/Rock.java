/**
 * Created by JK on 2016-04-25.
 */
public class Rock extends Move {
    @Override
    public boolean beats(Move move) {
        if(move instanceof Paper){
            return false;
        }else if(move instanceof Scissors){
            return true;
        }else if(move instanceof Lizard){
            return true;
        }else if(move instanceof Spock){
            return true;
        }else return false;
    }
}
