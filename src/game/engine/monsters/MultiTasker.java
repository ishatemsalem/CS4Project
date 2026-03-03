package game.engine.monsters;

public class MultiTasker {
     int normalSpeedTurns;
        public MultiTasker(String name, String description, Role role, int energy) {
            super(name, description, role, energy);
            this.normalSpeedTurns = 0;
        }
}
