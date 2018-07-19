package pformulaoneassignment1;

import java.util.Comparator;

/**
 * @author warnaa1
 *
 *<ul>
 * <li>Date: 29/05/2017 </li>
 * <li>The comparator class that compares time</li>
 * </ul>
 */
public class TimeCompare implements Comparator<FormulaOne>  {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(FormulaOne f1, FormulaOne f2) {
		
		return f1.getLapTime().compareTo(f2.getLapTime());
	}
	
}
