package game.engine;

import java.util.ArrayList;
import game.engine.monsters.Monster;
import game.engine.Role;
import game.engine.dataloader.DataLoader;
import game.engine.cards.Card;
import java.io.IOException;
import game.engine.Board;

import java.util.Random;

public class Game {

	private Board board;
    private ArrayList<Monster>allMonsters;
    private Monster player;
    private Monster opponent;
    private Monster current;

	public Board getBoard() {
	    return board;
	}
	public ArrayList<Monster> getAllMonsters() {
	    return allMonsters;
	}
	public Monster getPlayer() {
	    return player;
	}
	public Monster getOpponent() {
	    return opponent;
	}
	public Monster getCurrent() {
	    return current;
	}
	public void setCurrent(Monster m) {
	    current=m;
	}
	public Game(Role playerRole) throws IOException {
		ArrayList<Card>c =DataLoader.readCards();
        board=new Board(c);
        allMonsters=DataLoader.readMonsters();
        player=pickRandomMonster(playerRole);
        Role opp;
        if (playerRole==Role.SCARER) {
            opp=Role.LAUGHER;
        } else {
            opp=Role.SCARER;
        }
        opponent=pickRandomMonster(opp);
        current=player;
	
	}
	private Monster pickRandomMonster(Role role) {
        
        ArrayList<Monster> list=new ArrayList<>();
        for (int i=0; i<allMonsters.size(); i++) {
            Monster m=allMonsters.get(i);
            if (m.getRole()==role) {
                list.add(m);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        Random r=new Random();
        int j=r.nextInt(list.size());
        return list.get(j);
    }
}