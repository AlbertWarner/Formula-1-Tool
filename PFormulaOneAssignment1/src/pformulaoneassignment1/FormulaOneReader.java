package pformulaoneassignment1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author warnaa1
 * 
 * <ul>
 * <li>Date: 29/05/2017 </li>
 * <li>The Formula One Reader class gets the data from file and methods that work in gui class </li>
 * </ul>
 *
 */
public class FormulaOneReader {
	
	/**
	 * Creates a new instance of FormulaOne
	 */
	public FormulaOneReader()
	{
		
	}
	/**
	 * @param formulaOne - loads the data from the file
	 * 
	 * <ul>
	 * <li>The loader gets the data from file and converts them to strings or to local date or integers </li>
	 * <li>Data is read into array which then stores them into a ArrayList</li>
	 * </ul>
	 */
	public static void load(ArrayList<FormulaOne>formulaOne)
	{
		String race;
		LocalDate date;
		String driverName;
		String raceCar;
		int laps =0;
		LocalTime lapTime;
		String line;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
		BufferedReader in;

		try	{
			in = new BufferedReader(new FileReader("In610 JAVA Assignment1.csv"));
			while ((line = in.readLine())!= null){
				
				String [] fields = line.split(","); // split the line on "," 
				race = fields[0]; //store the string into variables 
				date = LocalDate.parse(fields[1],formatter);
				driverName = fields[2];
				raceCar = fields[3];
				laps = Integer.parseInt(fields[4]);
				String [] fields2 = fields[5].split(":");
				lapTime = LocalTime.of(0,Integer.parseInt(fields2[0]),Integer.parseInt(fields2[1]),(int)Double.parseDouble(fields2[2]));
				
				formulaOne.add(new FormulaOne(race,date,driverName,raceCar,laps,lapTime));
			}
				
		}	
		catch (IOException e){
			System.out.println("There was a problem with the file");
			e.printStackTrace();
		}catch (NumberFormatException ne) {
			System.out.println("Not a number");
			ne.printStackTrace();
		}
	}
	
		/**
		 * @param year -- This method requires a date(Integer) to be inserted to function
		 * @param formulaOne -- Use the formulOne ArrayList
		 * @return A sub Array List called answer
		 * <ul>
		 * <li> This method loops around the original array list and stores the data of year into sub array list </li>
		 * <li> Returns the answers of the sub array list</li>
		 * </ul>
		 */
		public static String lapCount(int year,ArrayList<FormulaOne> formulaOne)
		{
		
			int total = 0;
			
				for(FormulaOne item1: formulaOne)
				{
					if(item1.getYear() == year)
					{
						total = total + item1.getLaps(); 
					}
				}
				String answer = Integer.toString(total);
				return answer;
		}
		/**
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return A sub Array List called answer
		 * <ul>
		 * <li> This method loops around the original array list and stores the data of year into sub array list </li>
		 * <li> Returns the answers of the sub array list</li>
		 * </ul>
		 */
		public static String amountTracks(int year,ArrayList<FormulaOne> formulaOne)
		{
		
			int count =0;
			
				for(FormulaOne item1: formulaOne)
				{
					if(item1.getYear() == year)
					{ 
						count++;
					}
				}	
				String answer = Integer.toString(count);
				return answer;
		}
		
		/**
		 * @param name -- This method requires a name(String) to be inserted to function
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return A sub Array List called answer
		 * <ul>
		 * <li> This method loops around the original array list and stores the data of winner and the year into sub array list </li>
		 * <li> Returns the answers of the sub array list</li>
		 * </ul>
		 */
		public static ArrayList<FormulaOne> driverWinCount(String name, int year,ArrayList<FormulaOne> formulaOne)
		{
			ArrayList<FormulaOne> answers = new ArrayList<FormulaOne>();
			for (FormulaOne item:formulaOne)
			{				
				if(item.getWinner().contains(name)&&item.getYear()==year)
				{
					answers.add(item);
				}
			}
			 return answers;
			
		}
		/**
		 * @param name -- This method requires a name(String) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return A sub Array List called answer
		 * <ul>
		 * <li> This method loops around the original array list and stores the data of winner into sub array list </li>
		 * <li> Returns the answers of the sub array list</li>
		 * </ul>
		 */
		public static ArrayList<FormulaOne> allWins(String name,ArrayList<FormulaOne> formulaOne)
		{
			ArrayList<FormulaOne> answers = new ArrayList<FormulaOne>();	
			for (FormulaOne item:formulaOne)
			{
				
				if(item.getWinner().contains(name))
				{
					answers.add(item);
				}
			}
			return answers;
		}	
		/**
		 * @param car -- This method requires a car(String) to be inserted to function
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return A sub Array List called answer
		 * <ul>
		 * <li> This method loops around the original array list and stores the data of race car & the year into sub array list </li>
		 * <li> Returns the answers of the sub array list</li>
		 * </ul>
		 */
		public static ArrayList<FormulaOne> vehicleWins(String car, int year,ArrayList<FormulaOne> formulaOne)
		{	
			ArrayList<FormulaOne> answers = new ArrayList<FormulaOne>();
			for (FormulaOne item:formulaOne)
			{
				
				if(item.getRaceCar().equals(car)&&item.getYear()==year)
				{
					answers.add(item);
				}
			}
				return answers;
		}
		/**
		 * @param car -- This method requires a car(String) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return A sub Array List called answer
		 * <ul>
		 * <li> This method loops around the original array list and stores the data of race cars into sub array list </li>
		 * <li> Returns the answers of the sub array list</li>
		 * </ul>
		 */
		public static ArrayList<FormulaOne> allManuWins(String car,ArrayList<FormulaOne> formulaOne)
		{
			ArrayList<FormulaOne> answers = new ArrayList<FormulaOne>();	
			for (FormulaOne item:formulaOne)
			{
				
				if(item.getRaceCar().equals(car))
				{
					answers.add(item);
				}
			}
			return answers;
		}
		
		/**
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * <ul>
		 * <li> Sorting of the array list data by Grand prix name  </li>
		 * </ul>
		 */
		public static void Sorting(ArrayList<FormulaOne> formulaOne)
		{
			Collections.sort(formulaOne);
		}
		/**
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * <ul>
		 * <li> Sorting of the array list data by time  </li>
		 * </ul>
		 */
		public static void Sorting2(ArrayList<FormulaOne> formulaOne)
		{

			Collections.sort(formulaOne,new TimeCompare());
			
		}
		/**
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * <ul>
		 * <li> Sorting of the array list data by the Winner  </li>
		 * </ul>
		 */
		public static void Sorting3(ArrayList<FormulaOne> formulaOne)
		{

			Collections.sort(formulaOne,new WinnerCompare());
			
		}
		/**
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return String answer, which is max converted from integer to a string
		 * <ul>
		 * <li> loops through the array list data and finds the maximum amount of laps  </li>
		 * </ul>
		 */
		public static String findMaxLaps(int year,ArrayList<FormulaOne> formulaOne)
		{
			int max = 0;  
			for(FormulaOne item: formulaOne) 
				{
				if(item.getYear() == year)
				{
					if (item.getLaps() > max)
					{
						max = item.getLaps();
					}
				}
				}
			String answer = Integer.toString(max);
			return answer;
			  }
			  
		/**
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return String answer, which is mix converted from integer to a string
		 * <ul>
		 * <li> loops through the array list data and finds the minimum amount of laps  </li>
		 * </ul>
		 */
		public static String findMinLaps(int year,ArrayList<FormulaOne> formulaOne)
		{
			int min = formulaOne.get(0).getLaps();
			for(FormulaOne item: formulaOne) // use foreach rather than for
			{
			if(item.getYear() == year)
			{
				if (item.getLaps() < min)
				{
					min = item.getLaps();
				}
			}
			}
			String answer = Integer.toString(min);
			return answer;
		  }
				
		/**
		 * @param name -- This method requires a name(String) to be inserted to function
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return String answer, which is a double roundoff converted to string 
		 * <ul>
		 * <li> loops through the array list data of winners and the year, count each field</li>
		 * <li> loops through the array list data of the year, count each field</li>
		 * <li> calculates the average</li> 		 
		 * </ul>
		 */
		public static String AverageWin(String name,int year,ArrayList<FormulaOne> formulaOne)
		{
			int count =0;
			int count1 =0;
			double wins = 0;
			double tracks = 0;
			
			for (FormulaOne item:formulaOne)
			{
				
				if(item.getWinner().contains(name)&&item.getYear()==year)
				{
					
					count++;
					
				}
				if(item.getYear() == year)
				{
					 
					count1++;
				}
				
			}
			wins = (double)count;
			tracks = (double)count1;
			double average = wins/tracks;
			double roundOff = (double)Math.round(average*100)/100;
			String answer = Double.toString(roundOff);
			return answer;
		}
		
		/**
		 * @param car -- This method requires a car(String) to be inserted to function
		 * @param year -- This method requires a date(integer) to be inserted to function
		 * @param formulaOne -- Uses the formulOne ArrayList
		 * @return String answer, which is a double roundoff converted to string 
		 * <ul>
		 * <li> loops through the array list data of manufactures and the year, count each field</li>
		 * <li> loops through the array list data of the year, count each field</li>
		 * <li> calculates the average</li> 		 
		 * </ul>
		 */
		public static String AverageWinManufacture(String car,int year,ArrayList<FormulaOne> formulaOne)
		{
			int count =0;
			int count1 =0;
			double wins = 0;
			double tracks = 0;
			
			for (FormulaOne item:formulaOne)
			{
				
				if(item.getRaceCar().equals(car)&&item.getYear()==year)
				{
					
					count++;
					
				}
				if(item.getYear() == year)
				{
					 
					count1++;
				}
				
			}
			wins = (double)count;
			tracks = (double)count1;
			double average = wins/tracks;
			double roundOff = (double)Math.round(average*100)/100;
			String answer = Double.toString(roundOff);
			return answer;
			
		}
		
		}
		
		
		
		
		

