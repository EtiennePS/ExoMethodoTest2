package com.ynov.methotest2.exo4;

public class Exo4 {

	private IExo4Logic logic;
	
	public Exo4(IExo4Logic logic) {
		this.logic = logic;
	}
	
	/**
	 * déclencher le chauffage si toutes les conditions sont réunies :
	 *	i.  La température moyenne des 7 dernier jour est supérieur à 20°
	 *	ii. La température actuelle est supérieur à 25°
	 */
	public void manageHeater() {
		float average = get7DaysAverageTemp();
		float currentTemp = logic.getActualTemp();
		
		logic.setHeater(average > 20 && currentTemp > 25);
	}
	
	private float get7DaysAverageTemp() {
		float sum = 0;
		
	    for (float value : logic.getLastDaysTemps()) {
	        sum += value;
	    }
	    
	    return sum / 7;
	}
	
}
