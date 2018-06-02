package statCalculator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FileFormatter {
	
	private static final String[] TAB = {"   "};
	private static final String[] GENERALHEADING = {"Team    Player    Kills    Deaths    K/D Ratio"};
	private static final String[] HARDPOINTHEADING = {"Team	Player	Kills	Deaths	HillTime	K/D Ratio	AVG HillTime	AVG Kills"};
	
	Division division;
	TeamComparator comp = new TeamComparator();
	quickSortTeams sorter = new quickSortTeams();
	
	
	public FileFormatter(Division division) {
		this.division = division;
	}
	
	public void generateGeneral(OutputStream output) {
		PrintStream ps = new PrintStream(output);
		sorter.sort(division, comp);
		overallStats(ps);
		generalHeading(ps);
		generalOutput(division, ps);
		
	}
	
	private void overallStats(PrintStream ps) {
		ps.println("" + "," + "" + "," + "Overall stats for " + division.getName());
	}
	
	private void generalHeading(PrintStream ps) {
		ps.println("Team,Player,Kills,Deaths,K/D Ratio");
	}
	private void hardPointHeading(PrintStream ps) {
		ps.println(HARDPOINTHEADING);
	}
	public String sndHeading() {
		return "Team	Player	Kills	Deaths	Plants	First Bloods	K/D Ratio	AVG Kills";
	}
	public String ctfHeading() {
		return "Team	Player	Kills	Deaths	Captures	K/D Ratio	AVG Kills";
	}
	
	private void generalOutput(Division division,PrintStream ps) {
		for(int i=0; i<division.size(); i++) {
			for(int j=0; j<division.get(i).size(); j++) {
				Team team = division.get(i);
				Player player = team.get(j);
				double killDeath = player.calculateKD(player.getKills(), player.getDeaths());
				DecimalFormat df = new DecimalFormat(".####");
				df.format(killDeath);
				ps.println(team.getName() + "," + player.getName() + "," + player.getKills() + "," + player.getDeaths() + "," + killDeath);
			}
		}
	}
	
	public String generateHardpointOutput(Team team, Player player) {
		return team.getName() + player;
	}
}
