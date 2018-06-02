package statCalculator;

import java.util.Comparator;

public class TeamComparator implements Comparator<String>{

	@Override
	public int compare(String teamName1, String teamName2) {
		
		for(int i=0; i<teamName1.length() && i<teamName2.length(); i++) {
			if(teamName1.charAt(i) < teamName2.charAt(i)) {
				return -1;
			}
			if(teamName1.charAt(i) > teamName2.charAt(i)) {
				return 1;
			}
		}
		
		return 0;
	}
	
	
	
	
}
