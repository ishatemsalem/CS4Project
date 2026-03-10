package game.engine.cells;
import game.engine.Role;
import game.engine.interfaces.CanisterModifier;

public class DoorCell extends Cell implements CanisterModifier{
	private Role role;
	private int energy;
	private boolean activated;
	
	public DoorCell(String name, Role role, int energy) {
		super(name);
		this.role=role;
		this.energy=energy;
		this.activated=false;
	}
	public Role getRole() {
		return this.role;
	}
	public int getEnergy() {
		return this.energy;
	}
	public void setActivated(boolean x) {
		this.activated=x;
	}
	public boolean isActivated() {
		return this.activated;
	}
}
