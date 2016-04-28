public class Game {


//zad01 tak mozna
    public static void main(String[] args) {
        class Player {
            private String name;
            private int points;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            public void addPoints() {
                this.points = points + 1;
            }
        }
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName("pla1");
        player2.setName("pla2");
        player1.setPoints(0);
        player2.setPoints(0);
       // int points1 = 0, points2 = 0;
        
        for (int i = 1; i <= 10; ++i) {

            Move move1 = Move.getRandom(), move2 = Move.getRandom();
      
            System.out.println("Round " + i);
            System.out.println("Player 1: " + move1);
            System.out.println("Player 2: " + move2);



            // zadanie 05
            if (move1.beats(move2)) {
                System.out.println("Player 1 wins!");
                player1.addPoints();

            }
            else if (move2.beats(move1)) {
                System.out.println("Player 2 wins!");
                player2.addPoints();
            }
            else {
                System.out.println("Draw!");
            }

            System.out.println("Result: " + player1.getPoints() + "-" + player2.getPoints() + "\n");

        }
    }
}
