package statCalculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Team {
	
	private String teamName = "";
	public ArrayList<Player> playerList = new ArrayList<>();
	
	public Team(String teamName){
		this.teamName = teamName;
		this.playerList = playerList;
	}
	
	public void addPlayer(Player player) {
		playerList.add(player);
	}
	
	public String getName() {
		return teamName;
	}
	
	public int size() {
		return playerList.size();
	}
	
	public Player get(int index) {
		return playerList.get(index);
	}
	
	public boolean containsPlayer(String playerName) {
		for(int i=0; i<playerList.size(); i++) {
			if(playerList.get(i).getName().equals(playerName)) {
				return true;
			}
		}
		return false;
	}
	
	public Player findPlayer(String player) {
		for(int i=0; i<playerList.size(); i++) {
			if(playerList.get(i).getName().equals(player)) {
				return playerList.get(i);
			}
		}
		return null;
	}
}
