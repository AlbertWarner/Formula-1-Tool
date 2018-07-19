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
 * <ul>
 * <li>Date: 29/05/2017 </li>
 * <li>The Formula One app class loads the gui and gets the data from the Reader class</li>
 * </ul>
 */
public class FormulaOneApp {

	/**
	 * @param args - Main static method of the app class 
	 * <ul>
	 * <li>The Arraylist of object formulaOne is created in the app class  </li>
	 * <li>The Reader class read the data from the file and loads it into the ArrayList </li>
	 * <li>The gui class is also called from the app class and has the formulaOne object loaded into the gui</li>
	 * </ul>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		FormulaOneGui gui = new FormulaOneGui(formulaOne);
		gui.setVisible(true);
	}

}
