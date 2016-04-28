public class Paper extends Move {
    @Override
    public boolean beats(Move move) {
        if(move instanceof Rock){
            return true;
        }else if(move instanceof Scissors){
            return false;
        }else if(move instanceof Lizard){
            return false;
        }else if(move instanceof Spock){
            return true;
        }else return false;
    }
}