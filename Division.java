package statCalculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Division {
	
	ArrayList<Team> teamList = new ArrayList<>();
	private String divisionName = "";
	
	public Division(String name) {
		this.teamList = teamList;
		this.divisionName = name;
	}
	
	public int size() {
		return teamList.size();
	}
	
	public Team get(int index) {
		return teamList.get(index);
	}
	
	public boolean containsTeam(String teamName) {
		for(int i=0; i<teamList.size(); i++) {
			if(teamList.get(i).getName().equals(teamName)) {
				return true;
			}
		}
		return false;
	}
	
	public Team findTeam(String name) {
		for(int i=0; i<teamList.size(); i++) {
			if(teamList.get(i).getName().equals(name)) {
				return teamList.get(i);
			}
		}
		return null;
	}
	
	public void addTeam(Team team) {
		teamList.add(team);
	}
	
	public String getName() {
		return divisionName;
	}
}
