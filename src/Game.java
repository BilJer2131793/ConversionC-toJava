import java.util.Random;
import java.util.List;
public class Game {
    Random rand = new Random();
    Team Loafers;
    Team Tomato;
    public void Run() {
        Loafers = new Team(12);
        Tomato = new Team(13);

        for (int i=0; i != 10 ; i++){
            Turn();
        }
        EndGame();
    }
    public void Turn(){
        int player1 = rand.nextInt(Loafers.getPlayers().size());
        int player2 = rand.nextInt(Tomato.getPlayers().size());

        if (Loafers.getPlayers().get(player1).PlayAgainst(Tomato.getPlayers().get(player2))){
            Loafers.Goal(player1, "Loafers");
        }
        else if (Tomato.getPlayers().get(player2).PlayAgainst(Loafers.getPlayers().get(player1))){
            Tomato.Goal(player2, "Tomato");
        }

    }
    public void EndGame(){
        if (Loafers.getScore() == Tomato.getScore())
            System.out.println("Egaliter");
        else if (Loafers.getScore() > Tomato.getScore()) {
            System.out.println("The Loafers have won");
        }
        else {
            System.out.println("The Tomato has won");
        }
    }

}
