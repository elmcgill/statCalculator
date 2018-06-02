package statCalculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StatReader {
	
	private boolean isAdvanced = false;
	private Player modify;
	
	public StatReader() {
		
	}
	
	public StatReader(String input, Division division) throws FileNotFoundException {
		
		FileReader reader = new FileReader(input);
		Scanner scan = new Scanner(reader);
		
		if(isAdvanced == false) {
			while(scan.hasNextLine()) {
				String team = scan.next();
				String player = scan.next();
				Team cur = new Team(team);
				if(division.containsTeam(team) == false) {
					Team toAdd = new Team(team);
					division.addTeam(toAdd);
					cur = division.findTeam(team);
				}
				else {
					cur = division.findTeam(team);
				}
				if(cur.containsPlayer(player) == false) {
					Player pToAdd = new Player(cur,player);
					cur.addPlayer(pToAdd);
					modify = cur.findPlayer(player);
					int kills = scan.nextInt();
					double deaths = scan.nextDouble();
					modify.addKills(kills);
					modify.addDeaths(deaths);
				}
				else {
					modify = cur.findPlayer(player);
					int kills = scan.nextInt();
					double deaths = scan.nextDouble();
					modify.addKills(kills);
					modify.addDeaths(deaths);
				}
			}
			scan.close();
		}
		if(isAdvanced == true) {
			while(scan.hasNextLine()) {
				String team = scan.next();
				String player = scan.next();
				String gameMode = scan.next();
				Team cur = new Team(team);
				if(division.containsTeam(team) == false) {
					Team toAdd = new Team(team);
					division.addTeam(toAdd);
					cur = division.findTeam(team);
				}
				else {
					cur = division.findTeam(team);
				}
				if(cur.containsPlayer(player) == false) {
					Player pToAdd = new Player(cur,player);
					cur.addPlayer(pToAdd);
					modify = cur.findPlayer(player);
					if(gameMode.equals("HP")) {
						int kills = scan.nextInt();
						double deaths = scan.nextDouble();
						int hpTime = scan.nextInt();
						modify.addHpGame();
						modify.addHardpointKills(kills);
						modify.addHardpointDeaths(deaths);
					}
					if(gameMode.equals("SND")) {
						int kills = scan.nextInt();
						double deaths = scan.nextDouble();
						int plants = scan.nextInt();
						int firstBloods = scan.nextInt();
						modify.addSearchKills(kills);
						modify.addSearchDeaths(deaths);
						modify.addPlant(plants);
						modify.addFirstBlood(firstBloods);
						modify.addSNDGames();
					}
					if(gameMode.equals("CTF")) {
						int kills = scan.nextInt();
						double deaths = scan.nextDouble();
						int captures = scan.nextInt();
						modify.addCTFKills(kills);
						modify.addCTFDeaths(deaths);
						modify.addCapture(captures);
						modify.addCTFGames();
					}
				}
				else {
					modify = cur.findPlayer(player);
					if(gameMode.equals("HP")) {
						int kills = scan.nextInt();
						double deaths = scan.nextDouble();
						int hpTime = scan.nextInt();
						modify.addHpGame();
						modify.addHardpointKills(kills);
						modify.addHardpointDeaths(deaths);
					}
					if(gameMode.equals("SND")) {
						int kills = scan.nextInt();
						double deaths = scan.nextDouble();
						int plants = scan.nextInt();
						int firstBloods = scan.nextInt();
						modify.addSearchKills(kills);
						modify.addSearchDeaths(deaths);
						modify.addPlant(plants);
						modify.addFirstBlood(firstBloods);
						modify.addSNDGames();
					}
					if(gameMode.equals("CTF")) {
						int kills = scan.nextInt();
						double deaths = scan.nextDouble();
						int captures = scan.nextInt();
						modify.addCTFKills(kills);
						modify.addCTFDeaths(deaths);
						modify.addCapture(captures);
						modify.addCTFGames();
					}
				}
			}
			scan.close();
		}
	}
	
	public void setAdvancedTrue() {
		isAdvanced = true;
	}
	
	public void setAdvancedFalse() {
		isAdvanced = false;
	}

}
