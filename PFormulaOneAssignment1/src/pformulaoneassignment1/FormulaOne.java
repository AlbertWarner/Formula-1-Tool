package pformulaoneassignment1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * @author warnaa1
 * 
 * <ul>
 * <li>Date: 29/05/2017 </li>
 * <li>The Formula One Base class create the instance of object called Formula One and creates the gets and sets </li>
 * </ul>
 *
 */
public class FormulaOne implements Comparable<FormulaOne> {
	
	private String race;
	private LocalDate raceDate;
	private String winner;
	private String raceCar;
	private int laps;
	private LocalTime lapTime;
	ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
	
	/**
	 * <ul>
	 * <li>When the data is read from the file it converted into these variable</li>
	 * <li>The constructor creates instance of the class of formula one</li>
	 * </ul>
	 * @param race - set the string of Grand prix
	 * @param raceDate - set the string from file and convert to a LocalDate
	 * @param winner - set the string of winner 
	 * @param raceCar - set the string of Race car
	 * @param laps - set the string from file and convert to a integer
	 * @param lapTime - set the string from file and convert to a LocalTime
	 */
	public FormulaOne(String race, LocalDate raceDate, String winner, String raceCar, int laps, LocalTime lapTime)
	{
		setRace(race);
		setRaceDate(raceDate);
		setWinner(winner);
		setRaceCar(raceCar);
		setLaps(laps);
		setLapTime(lapTime);
	}

	/**
	 * @return - get the Grand prix name from file
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race -- set the Grand prix name  
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return get the LocalDate Race Date from file
	 */
	public LocalDate getRaceDate() {
		return raceDate;
	}

	/**
	 * @param raceDate -- set the LocalDate Race Date
	 */
	public void setRaceDate(LocalDate raceDate) {
		this.raceDate = raceDate;
	}

	/**
	 * @return  get the Winner name from file
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * @param winner -- set the Winner name
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}

	/**
	 * @return get the Manufacture from file
	 */
	public String getRaceCar() {
		return raceCar;
	}

	/**
	 * @param raceCar -- set the Manufacture 
	 */
	public void setRaceCar(String raceCar) {
		this.raceCar = raceCar;
	}

	/**
	 * @return get the amount of laps from file
	 */
	public int getLaps() {
		return laps;
	}

	/**
	 * @param laps -- set the amount of laps 
	 */
	public void setLaps(int laps) {
		this.laps = laps;
	}

	/**
	 * @return get the Lap time from file
	 */
	public LocalTime getLapTime() {
		return lapTime;
	}

	/**
	 * @param lapTime -- set the lap time
	 */
	public void setLapTime(LocalTime lapTime) {
		this.lapTime = lapTime;
	}
	/**
	 * <ul>
	 * <li>Most of calculations methods use only the date,</li>
	 * <li>This method grabs the date and returns it as a integer</li>
	 * </ul>
	 * @return gets year from Race Date and return and integer of year
	 */
	public int getYear()
	{
		int years = raceDate.getYear();
		return years;
	}
	/**
	 * <ul>
	 * <li>The data that came from the file for lap time was dirty,</li>
	 * <li>This method cleans the data and returns it as a string</li>
	 * </ul>
	 * @return get LocalTime of lap time and returns a string of clean data
	 */
	public String getTime()
	{
		int min = lapTime.getMinute();
		int nano = lapTime.getNano();
		int second = lapTime.getSecond();
		String lap = min+" : "+second+" : "+nano;
		return lap;
	}
	/**
	 * <ul>
	 * <li>Some methods required a string instead of localDate, </li>
	 * <li>read in the data from race date into integers and the converts to strings</li>
	 * </ul>
	 * @return reads in localDate into integers and converts to string
	 */
	public String getDateOfRace()
	{
		int year = raceDate.getYear();
		int day = raceDate.getDayOfMonth();
		int month = raceDate.getMonthValue();
		String year1 = Integer.toString(year);
		String day1 = Integer.toString(day);
		String month1 = Integer.toString(month);
		String date = year1+"/"+ month1+ "/"+ day1;
		return date;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 * <ul>
	 * <li>Creates the to String method that returns a String to the console </li>
	 * </ul>
	 */
	public String toString()
	{
		String message = "Racing at "+ getRace() + " on the "+ getDateOfRace()+ " won by " +getWinner()+ " driving "+ getRaceCar() + " amount of laps " +getLaps()+ " fastest time of driver"+ getTime(); 
		return message;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * <ul>
	 * <li>Comparison, this method compare the names of Grand prix and sort's them alphabetical  </li>
	 * </ul>
	 */
	@Override
	public int compareTo(FormulaOne f1) {
		
		
		return this.race.compareTo(f1.getRace());
	}
	

}
