package pl.lukaszdusza.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class StatsService {

	/* example solution */
	
/*	private Map<Date, Integer> dataValues;
	private Map<String, ArrayList<Integer>> datavalues2;*/

	/*test stats*/
	
	private String[] dateValues = {
			"2017-01-01", "2017-01-02", "2017-01-03",
			"2017-01-04", "2017-01-05", "2017-01-06", "2017-01-07",
			"2017-01-08", "2017-01-09", "2017-01-10"};
	private int[] values = {47, 12, 65, 45, 25, 45, 21, 55, 30, 20};

	/*----------------------------------------------*/

	
	public StatsService() {
	}

	public StatsService(String[] dateValues, int[] values) {
		this.dateValues = dateValues;
		this.values = values;

	}
	public String getDateValues(int i) {
		return dateValues[i];
	}
	public void setDateValues(String[] dateValues) {
		this.dateValues = dateValues;
	}
	public int getValue(int i) {
		return values[i];
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}

}
