package statCalculator;

public class Player {
	
	private String name = "";
	private Team team; //Players team
	private int kills; //Players overall kills
	private double deaths; //Players overall deaths
	private double KDRatio; //Players overall K/D Ratio
	
	private int hpKills; //Hardpoint kills for advanced mode
	private double hpDeaths;//Hardpoint deaths for advanced mode
	private double hpKD;//Hardpoint KD for advanced mode
	private int hillTime;//Hardpoint hillTime in seconds
	private int numHardpointGames; //Total number of hardpoint games played
	
	private int sndKills;//Search and Destroy kills for advanced mode
	private double sndDeaths;//Search and Destroy deaths for advanced mode
	private double sndKD;//Search and Destroy KD for advanced mode
	private int plants;//Search and Destroy bomb plants
	private int firstBloods;//Search and Destroy first bloods;
	private int numSNDGames;//Total number of search and destroy games played
	
	private int ctfKills;//Capture the flag kills for advanced mode
	private double ctfDeaths;//Capture the flag deaths for advanced mode
	private double ctfKD;//Capture the flag KD for advanced mode
	private int captures;//Capture the flag, flag captures
	private int numCTFGames;//Total number of capture the flag games played
	
	public Player(Team team, String name) {
		this.team = team;
		this.name = name;
		
		this.hpKills = 0;
		this.hpDeaths = 0.0;
		this.hpKD = 0.0;
		this.hillTime = 0;
		this.numHardpointGames = 0;
		
		this.sndKills = 0;
		this.sndDeaths = 0.0;
		this.sndKD = 0.0;
		this.plants = 0;
		this.firstBloods = 0;
		this.numSNDGames = 0;
		
		this.ctfKills = 0;
		this.ctfDeaths = 0.0;
		this.ctfKD = 0.0;
		this.captures = 0;
		this.numCTFGames = 0;
		
		this.kills = 0;
		this.deaths = 0.0;
		this.KDRatio = 0.0;
	}

	public Team getTeam() {
		return team;
	}

	public int getKills() {
		return kills;
	}

	public double getDeaths() {
		return deaths;
	}

	public double getKDRatio() {
		return KDRatio;
	}

	public int getHpKills() {
		return hpKills;
	}

	public double getHpDeaths() {
		return hpDeaths;
	}

	public double getHpKD() {
		return hpKD;
	}

	public int getSndKills() {
		return sndKills;
	}

	public double getSndDeaths() {
		return sndDeaths;
	}

	public double getSndKD() {
		return sndKD;
	}

	public int getCtfKills() {
		return ctfKills;
	}

	public double getCtfDeaths() {
		return ctfDeaths;
	}

	public double getCtfKD() {
		return ctfKD;
	}
	
	public double calculateKD(int kills, double deaths) {
		return kills/deaths;
	}
	
	public void addKills(int kills) {
		this.kills = this.kills + kills;
	}
	
	public void addDeaths(double deaths) {
		this.deaths = this.deaths + deaths;
	}
	
	public void addHardpointKills(int kills) {
		hpKills = hpKills+kills;
	}
	
	public void addHardpointDeaths(double deaths) {
		hpDeaths = hpDeaths+deaths;
	}
	
	public void addSearchKills(int kills) {
		sndKills = sndKills + kills;
	}
	
	public void addSearchDeaths(double deaths) {
		sndDeaths = sndDeaths + deaths;
	}
	
	public void addCTFKills(int kills) {
		ctfKills = ctfKills + kills;
	}
	
	public void addCTFDeaths(double deaths) {
		ctfDeaths = ctfDeaths + deaths;
	}
	
	public String getName() {
		return name;
	}
	
	public String teamToString() {
		return team.getName();
	}
	
	public void addHpGame() {
		numHardpointGames++;
	}
	
	public void addSNDGames() {
		numSNDGames++;
	}
	
	public void addCTFGames() {
		numCTFGames++;
	}
	
	public void addPlant(int plants) {
		this.plants = this.plants + plants;
	}
	
	public void addFirstBlood(int firstBloods) {
		this.firstBloods = this.firstBloods + firstBloods;
	}
	
	public void addCapture(int captures) {
		this.captures = this.captures + captures;
	}
	
	public double calculateAvgHilltime() {
		return (double)hillTime/numHardpointGames;
	}
	
	public int calculateAvgHPKills() {
		return hpKills/numHardpointGames;
	}
	
	public int calculateAvgSNDKills() {
		return sndKills/numSNDGames;
	}
	
	public int calcuateAvgCTFKills() {
		return ctfKills/numCTFGames;
	}
}
