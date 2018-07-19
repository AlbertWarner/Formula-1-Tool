package pformulaoneassignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class FormulaOneReaderTest {
	
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testAllWins()
	{
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		ArrayList<FormulaOne> wins =FormulaOneReader.allWins("Sebastian\u00A0Vettel", formulaOne);
		ArrayList<FormulaOne> wins1 =FormulaOneReader.allWins("Lewis\u00A0Hamilton", formulaOne);
		ArrayList<FormulaOne> wins2 =FormulaOneReader.allWins("Nico\u00A0Rosberg", formulaOne);
		assertEquals(32,wins.size());
		assertEquals(39,wins1.size());
		assertEquals(23,wins2.size());
	}
	
	@Test
	public void testAmountTracks() {
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		assertEquals("21",FormulaOneReader.amountTracks(2016, formulaOne));
		assertEquals("19",FormulaOneReader.amountTracks(2011, formulaOne));
		assertEquals("19",FormulaOneReader.amountTracks(2013, formulaOne));
	}

	@Test
	public void testLapCount() {
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		assertEquals("1268",FormulaOneReader.lapCount(2016, formulaOne));
		assertEquals("1133",FormulaOneReader.lapCount(2011, formulaOne));
		assertEquals("1131",FormulaOneReader.lapCount(2013, formulaOne));
	}

	@Test
	public void testFindMaxLaps() {
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		assertEquals("78",FormulaOneReader.findMaxLaps(2016, formulaOne));
		assertEquals("78",FormulaOneReader.findMaxLaps(2011, formulaOne));
		assertEquals("78",FormulaOneReader.findMaxLaps(2013, formulaOne));
	}

	@Test
	public void testFindMinLaps() {
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		assertEquals("44",FormulaOneReader.findMinLaps(2016, formulaOne));
		assertEquals("44",FormulaOneReader.findMinLaps(2011, formulaOne));
		assertEquals("44",FormulaOneReader.findMinLaps(2013, formulaOne));
	}

	@Test
	public void testAverageWin() {
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		assertEquals("0.43",FormulaOneReader.AverageWin("Nico\u00A0Rosberg", 2016, formulaOne));
		assertEquals("0.48",FormulaOneReader.AverageWin("Lewis\u00A0Hamilton", 2016, formulaOne));
		assertEquals("0.0",FormulaOneReader.AverageWin("Sebastian\u00A0Vettel", 2016, formulaOne));
	}

	@Test
	public void testAverageWinManufacture() {
		ArrayList<FormulaOne> formulaOne = new ArrayList<FormulaOne>();
		FormulaOneReader.load(formulaOne);
		assertEquals("0.1",FormulaOneReader.AverageWinManufacture("RED BULL RACING TAG HEUER", 2016, formulaOne));
		assertEquals("0.9",FormulaOneReader.AverageWinManufacture("MERCEDES", 2016, formulaOne));
		assertEquals("0.0",FormulaOneReader.AverageWinManufacture("FERRARI", 2016, formulaOne));
	}

}
