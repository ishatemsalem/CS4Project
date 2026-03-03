package game.engine.monsters;

public class Dasher {
    private int momentumTurns;
    public Dasher(String name, String description, Role role, int energy) {
         super(name, description, role, energy);
         this.momentumTurns = 0;
    }
    public int getMomentumTurns() {
        return momentumTurns;
    }
    public void setMomentumTurns(int momentumTurns) {
        this.momentumTurns = momentumTurns;
    }
}
