import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Team {
    Random rand = new Random();
    private List<Player> players;
    private Integer score;
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public Team(Integer teamSize){
        players = new ArrayList<>();
        score = 0;
        GenerateTeam(teamSize);
    }
    public void Goal(int playerNum, String name){
        score++;
        System.out.println(players.get(playerNum).Goal() + " from team " + name + "has scored");
    }
    private void GenerateTeam(Integer teamSize){
        for (int i = 0; i != teamSize; i++){
            String name = String.format("Player %d",i);
            int atk = rand.nextInt(1,8);
            int def = rand.nextInt(1,8);
            int gen = atk + def;
            players.add(new Player(name, atk, def, gen));
        }
    }
}
