package statCalculator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class quickSortTeams extends Sorter{	
	
	
	@Override
	public void sort(Division divisionToSort, Comparator<String> comp) {
		quickSortRec(divisionToSort,comp,0,divisionToSort.size()-1);
	}
	
	private void quickSortRec(Division divisionToSort, Comparator<String> comp, int start, int end) {
		if(start>=end) {
			return;
		}
		int part = partition(divisionToSort,comp,start,end);
		quickSortRec(divisionToSort,comp,start,part-1);
		quickSortRec(divisionToSort,comp,part+1,end);
	}
	
	private int partition(Division divisionToSort, Comparator<String> comp, int start, int end) {
		int i = start;
		for(int j = start; j<end; j++) {
			if(comp.compare(divisionToSort.get(j).getName(), divisionToSort.get(end).getName())<0) {
				i++;
				Team temp = divisionToSort.get(i);
				Collections.swap(divisionToSort.teamList, i, j);
			}
		}
		Collections.swap(divisionToSort.teamList, i+1, end);
		return i+1;
	}

}

