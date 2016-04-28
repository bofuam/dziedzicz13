/**
 * Created by s416094 on 2016-04-25.
 */
public class Spock extends Move {
    @Override
    public boolean beats(Move move) {
        if(move instanceof Rock){
            return true;
        }else if(move instanceof Scissors){
            return true;
        }else if(move instanceof Lizard){
            return false;
        }else if(move instanceof Paper){
            return false;
        }else return false;
    }
}
