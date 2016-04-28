/**
 * Created by s416094 on 2016-04-25.
 */
public class Lizard extends Move {
    @Override
    public boolean beats(Move move) {
        if(move instanceof Rock){
            return false;
        }else if(move instanceof Scissors){
            return false;
        }else if(move instanceof Paper){
            return true;
        }else if(move instanceof Spock){
            return true;
        }else return false;
    }
}
