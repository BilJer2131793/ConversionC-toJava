public class Player {
    String name;
    Integer atk;
    Integer def;
    Integer gen;
    Integer goals;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAtk() {
        return atk;
    }
    public void setAtk(Integer atk) {
        this.atk = atk;
    }
    public Integer getDef() {
        return def;
    }
    public void setDef(Integer def) {
        this.def = def;
    }
    public Integer getGen() {
        return gen;
    }
    public void setGen(Integer gen) {
        this.gen = gen;
    }
    public Integer getGoals() {
        return goals;
    }
    public void setGoals(Integer goals) {
        this.goals = goals;
    }
    public String Goal(){
        goals++;
        return name +" from team ";
    }

    public Player(String name, Integer atk, Integer def, Integer gen) {
        this.name = name;
        this.atk = atk;
        this.def = def;
        this.gen = gen;
        this.goals = 0;
    }
    public Player(String name, Integer atk, Integer def, Integer gen, Integer goals) {
        this.name = name;
        this.atk = atk;
        this.def = def;
        this.gen = gen;
        this.goals = goals;
    }

    public boolean PlayAgainst(Player oponent){
        if (this.atk > oponent.def && oponent.atk > this.def)
            return false;
        else if (this.atk > oponent.def)
            return true;

        return false;
    }
}
