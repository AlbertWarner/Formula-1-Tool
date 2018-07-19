package pformulaoneassignment1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;

/**
 * @author Albert Warner
 * 
 * <ul>
 * <li>Date: 29/05/2017 </li>
 * <li>The Formula One gui class creates the gui and use the methods from reader class</li>
 * </ul>
 *
 */
public class FormulaOneGui extends JFrame {

	private ArrayList<FormulaOne>formulaOne;
	private JPanel contentPane;
	private final JLabel lbl = new JLabel("");
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel pnlMSearch = new JPanel();
	private final JPanel pnlSorting = new JPanel();
	private final JPanel pnlSearch = new JPanel();
	private final JLabel lbl_28 = new JLabel("Sorting Of Formula One Information");
	private final JButton btnSort = new JButton("Press to Sort");
	private final JComboBox cmbSorting = new JComboBox();
	private final JLabel lbl_29 = new JLabel("Sorting By:");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable table = new JTable();
	private DefaultTableModel tm;
	private DefaultTableModel tm1;
	private DefaultTableModel tm2;
	private DefaultTableModel tm3;
	private final JLabel lbl_0 = new JLabel("Select a Driver:");
	private final JComboBox cmbSelectName = new JComboBox();
	private final JLabel lbl_1 = new JLabel("Select a Year:");
	private final JComboBox cmbDate = new JComboBox();
	private final JLabel lbl_30 = new JLabel("Search Information on Formula One Winners");
	private final JLabel lbl_2 = new JLabel("");
	private final JScrollPane scrollPane_1 = new JScrollPane();
	private final JTable table_1 = new JTable();
	private final JButton btnSearch_1 = new JButton("Search");
	private final JLabel lbl_31 = new JLabel("Total Number of Grand Prix won:");
	private  final JTextField txf = new JTextField();
	private final JLabel lbl_32 = new JLabel("Select a Manufacture :");
	private final JComboBox cmbSelectManu = new JComboBox();
	private final JScrollPane scrollPane_2 = new JScrollPane();
	private final JTable table_2 = new JTable();
	private final JLabel lbl_33 = new JLabel("Search Information on Manufactures that Won");
	private final JComboBox cmbDate1 = new JComboBox();
	private final JLabel lbl_34 = new JLabel("");
	private final JLabel lbl_35 = new JLabel("Select a Date:");
	private final JButton btnSearch = new JButton("Search");
	private final JLabel lbl_36 = new JLabel("Total Number of Grand Prix Won:");
	private final JTextField txf_1 = new JTextField();
	private final JPanel pnlBrowser = new JPanel();
	private final JPanel pnlView = new JPanel();
	private final JPanel pnlCalculation = new JPanel();
	private final JLabel lbl_37 = new JLabel("Browse Through Formula One's Individual Data");
	private final JTextField txf_2 = new JTextField();
	private final JButton btnPrevious = new JButton("Previous");
	private final JButton btnNext = new JButton("Next");
	private final JLabel lbl_38 = new JLabel("Scroll Though Each individual Data ");
	int count = 0;
	private final JLabel lbl_39 = new JLabel("Grand Prix :");
	private final JLabel lbl_40 = new JLabel("Winner :");
	private final JLabel lbl_41 = new JLabel("Manufacture :");
	private final JLabel lbl_42 = new JLabel("Lap Time :");
	private final JLabel lbl_43 = new JLabel("Date Of Race :");
	private final JLabel lbl_44 = new JLabel("Number of Laps:");
	private final JTextField txf_3 = new JTextField();
	private final JTextField txf_4 = new JTextField();
	private final JTextField txf_5 = new JTextField();
	private final JTextField txf_6 = new JTextField();
	private final JTextField txf_7 = new JTextField();
	private final JScrollPane scrollPane_3 = new JScrollPane();
	private final JTable table_3 = new JTable();
	private final JLabel lbl_24 = new JLabel("View All the Data At Once", SwingConstants.CENTER);
	private final JButton btnViewStart_6 = new JButton("Start");
	private final JLabel lbl_25 = new JLabel("Click here to Start:");
	private final JLabel lbl_23 = new JLabel("Some Different Calculations on the Formula One Data");
	private final JPanel pnlBarGraph = new JPanel();
	private final JPanel pnlCalculation1 = new JPanel();
	private final JButton btnCalculation_1 = new JButton("Press to Calculate");
	private final JTextField txf_8 = new JTextField();
	private final JLabel lbl_3 = new JLabel("Total amount of Laps:");
	private final JLabel lbl_4 = new JLabel("Select a year :");
	private final JComboBox cmbDate2 = new JComboBox();
	private final JLabel lbl_5 = new JLabel("Amount Laps in a Season");
	private final JPanel pnlCalculation2 = new JPanel();
	private final JLabel lbl_6 = new JLabel("Amount of Race's in a Season");
	private final JLabel lbl_7 = new JLabel("Select A Year :");
	private final JComboBox cmbDate4 = new JComboBox();
	private final JLabel lbl_8 = new JLabel("Total amount of Races:");
	private final JTextField txf_9 = new JTextField();
	private final JButton btnCalculation_2 = new JButton("Press to Calculate");
	private final JPanel pnlCalculation3 = new JPanel();
	private final JLabel lbl_9 = new JLabel("Average Driver Wins per Season");
	private final JLabel lbl_10 = new JLabel("Select A Year:");
	private final JComboBox cmbDate5 = new JComboBox();
	private final JLabel lbl_11 = new JLabel("Select A Driver:");
	private final JComboBox cmbDriverName = new JComboBox();
	private final JLabel lbl_12 = new JLabel("Average Win Rate % :");
	private final JTextField txf_10 = new JTextField();
	private final JButton btnCalculation_6 = new JButton("Press to Calculate");
	private final JPanel pnlCalculation4 = new JPanel();
	private final JLabel lbl_13 = new JLabel("Average Manufacture Wins per Season");
	private final JLabel lbl_14 = new JLabel("Select a year:");
	private final JComboBox cmbDate6 = new JComboBox();
	private final JComboBox cmbManufacture = new JComboBox();
	private final JLabel lbl_15 = new JLabel("Manufacture :");
	private final JLabel lbl_16 = new JLabel(" Win Rate % :");
	private final JTextField texf_11 = new JTextField();
	private final JButton btnCalculation_3 = new JButton("Press To Calculate");
	private final JPanel pnlCalculation5 = new JPanel();
	private final JLabel lbl_17 = new JLabel("Find the Maximum Laps in a Season");
	private final JLabel lbl_18 = new JLabel("Select a Year:");
	private final JComboBox cmbDate7 = new JComboBox();
	private final JTextField txf_12 = new JTextField();
	private final JLabel lbl_19 = new JLabel("Maximum amount of Laps :");
	private final JButton btnCalculation_4 = new JButton("Press To Find");
	private final JPanel pnlCalculation6 = new JPanel();
	private final JLabel lbl_20 = new JLabel("Find the Minimum Laps in a Season");
	private final JLabel lbl_21 = new JLabel("Select a Year :");
	private final JComboBox cmbDate8 = new JComboBox();
	private final JTextField txf_13 = new JTextField();
	private final JLabel lbl_22 = new JLabel("Minimum amount of Laps");
	private final JButton btnCalculation_5 = new JButton("Press to Find");
	private final JLabel lbl_27 = new JLabel("Bar Graph of Driver's Total Wins");

	/**
	 * Create the frame.
	 */
	/**
	 * @param formulaOne - Loads the data from the array list - data comes from FormulaOneReader
	 */
	public FormulaOneGui(ArrayList<FormulaOne>formulaOne) {
		super("FormulaOne");
		txf_7.setBounds(488, 373, 198, 30);
		txf_7.setColumns(10);
		txf_6.setBounds(488, 332, 198, 30);
		txf_6.setColumns(10);
		txf_5.setBounds(488, 291, 198, 30);
		txf_5.setColumns(10);
		txf_4.setBounds(488, 248, 198, 30);
		txf_4.setColumns(10);
		txf_3.setBounds(488, 207, 198, 30);
		txf_3.setColumns(10);
		txf_1.setBounds(770, 379, 86, 20);
		txf_1.setColumns(10);
		this.formulaOne = formulaOne;	
		setTitle("Formula One Racing ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 895);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lbl.setIcon(new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/formula-1-logo.jpg")));
		lbl.setBounds(10, 11, 1059, 220);
		
		contentPane.add(lbl);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabbedPane.setBounds(20, 242, 1049, 592);
		
		contentPane.add(tabbedPane);
		tm = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Grand Prix", "Winner", "Manufacture", "Lap Time", "Date of Race", "Amount of Laps"
			}
		);
		tm1 = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Winner", "Manufacture", "Grand Prix", "Race Date"
			}
		);
		txf.setBounds(479, 511, 95, 31);
		txf.setColumns(10);
		tabbedPane.addTab("Search", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlSearch, null);
		pnlSearch.setLayout(null);
		lbl_0.setBounds(10, 104, 74, 21);
		
		pnlSearch.add(lbl_0);
		cmbSelectName.setModel(new DefaultComboBoxModel(new String[] {" ","Sebastian\u00A0Vettel", "Nico\u00A0Rosberg", "Max\u00A0Verstappen", "Lewis\u00A0Hamilton", "Daniel\u00A0Ricciardo", "Kimi\u00A0R\u00E4ikk\u00F6nen", "Fernando\u00A0Alonso", "Jenson\u00A0Button", "Pastor\u00A0Maldonado", "Mark\u00A0Webber"}));
		cmbSelectName.setBounds(10, 135, 161, 26);
		
		pnlSearch.add(cmbSelectName);
		lbl_1.setBounds(10, 172, 90, 14);
		
		pnlSearch.add(lbl_1);
		cmbDate.setModel(new DefaultComboBoxModel(new String[] {"All","2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate.setBounds(10, 208, 74, 31);
		
		pnlSearch.add(cmbDate);
		lbl_30.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_30.setBounds(247, 25, 727, 45);
		
		pnlSearch.add(lbl_30);
		lbl_2.setBounds(10, 301, 235, 241);
		
		pnlSearch.add(lbl_2);
		scrollPane_1.setBounds(267, 104, 733, 396);
		
		pnlSearch.add(scrollPane_1);
		table_1.setModel(tm1);
		scrollPane_1.setViewportView(table_1);
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = (String) cmbSelectName.getSelectedItem();
				String yearCount = (String) cmbDate.getSelectedItem();
						if(cmbSelectName.getSelectedIndex()!=0&&cmbDate.getSelectedIndex()!=0)
						{
							int year = Integer.parseInt(yearCount);	
							ArrayList<FormulaOne> answers=(FormulaOneReader.driverWinCount(name, year, formulaOne));
							drawTable4(answers);
							txf.setText(""+answers.size());
						}
						else if(cmbDate.getSelectedIndex()==0)
						{
							ArrayList<FormulaOne> answers=(FormulaOneReader.allWins(name, formulaOne));
							drawTable4(answers);
							txf.setText(""+answers.size());
						}
						else
						{
							JOptionPane.showMessageDialog(null, "No Driver Selected ");
						}
						
						switch(cmbSelectName.getSelectedIndex())
						{
						case 1:
							lbl_2.setIcon(new ImageIcon("vettel.png"));
							break;
						case 2: 
							lbl_2.setIcon(new ImageIcon("nico.png"));
							break;
						case 3: 
							lbl_2.setIcon(new ImageIcon("max.png"));
							break;
						case 4: 
							lbl_2.setIcon(new ImageIcon("lewis.png"));
							break;
						case 5: 
							lbl_2.setIcon(new ImageIcon("daniel.png"));
							break;
						case 6: 
							lbl_2.setIcon(new ImageIcon("Kimi.png"));
							break;
						case 7: 
							lbl_2.setIcon(new ImageIcon("fornando.png"));
							break;
						case 8: 
							lbl_2.setIcon(new ImageIcon("jenson.png"));
							break;
						case 9: 
							lbl_2.setIcon(new ImageIcon("Pastor.png"));
							break;
						case 10: 
							lbl_2.setIcon(new ImageIcon("mark.png"));
							break;
						
						}
						
					}		
		});
		btnSearch_1.setBounds(11, 267, 89, 23);
		pnlSearch.add(btnSearch_1);
		lbl_31.setBounds(267, 516, 226, 26);
		
		pnlSearch.add(lbl_31);
		
		pnlSearch.add(txf);
		
		tabbedPane.addTab("Manufacture Search", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlMSearch, null);
		pnlMSearch.setLayout(null);
		lbl_32.setBounds(28, 120, 132, 21);
		
		pnlMSearch.add(lbl_32);
		cmbSelectManu.setModel(new DefaultComboBoxModel(new String[] {"", "RED BULL RACING TAG HEUER", "MERCEDES", "FERRARI", "RED BULL RACING RENAULT", "LOTUS RENAULT", "MCLAREN MERCEDES", "WILLIAMS RENAULT"}));
		cmbSelectManu.setBounds(28, 152, 161, 33);
		
		pnlMSearch.add(cmbSelectManu);
		scrollPane_2.setBounds(277, 120, 727, 238);
		
		pnlMSearch.add(scrollPane_2);
		tm2 = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Manufacture", "Winner", "Grand Prix", "Date Of Race"
			}
		);
		
		scrollPane_2.setViewportView(table_2);
		table_2.setModel(tm2);
		lbl_33.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_33.setBounds(277, 28, 727, 58);
		
		pnlMSearch.add(lbl_33);
		cmbDate1.setModel(new DefaultComboBoxModel(new String[] {"All","2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate1.setBounds(32, 246, 92, 33);
		
		pnlMSearch.add(cmbDate1);
		lbl_34.setBounds(38, 369, 419, 173);
		
		pnlMSearch.add(lbl_34);
		lbl_35.setBounds(35, 207, 89, 14);
		
		pnlMSearch.add(lbl_35);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String car = (String) cmbSelectManu.getSelectedItem();
				String yearCount = (String) cmbDate1.getSelectedItem();
				if(cmbSelectManu.getSelectedIndex()!=0&&cmbDate1.getSelectedIndex()!=0)
				{
							int year = Integer.parseInt(yearCount);	
							ArrayList<FormulaOne> answers=(FormulaOneReader.vehicleWins(car, year, formulaOne));
									drawTable5(answers);
									txf_1.setText(""+answers.size());
						
				}else if(cmbDate1.getSelectedIndex()==0)
				{
					ArrayList<FormulaOne> answers=(FormulaOneReader.allManuWins(car, formulaOne));
					drawTable5(answers);
					txf_1.setText(""+answers.size());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No Manufacture Selected ");
				}
						
						switch(cmbSelectManu.getSelectedIndex())
						{
						case 1:
							lbl_34.setIcon(new ImageIcon("redtag.jpg"));
							break;
						case 2: 
							lbl_34.setIcon(new ImageIcon("merc.png"));
							break;
						case 3: 
							lbl_34.setIcon(new ImageIcon("ferrari.png"));
							break;
						case 4: 
							lbl_34.setIcon(new ImageIcon("redR.png"));
							break;
						case 5: 
							lbl_34.setIcon(new ImageIcon("lotus.png"));
							break;
						case 6: 
							lbl_34.setIcon(new ImageIcon("mercma.jpg"));
							break;
						case 7: 
							lbl_34.setIcon(new ImageIcon("williams.png"));
							break;
						}
				
			}

		});
		btnSearch.setBounds(28, 310, 89, 23);
		
		pnlMSearch.add(btnSearch);
		lbl_36.setBounds(517, 382, 207, 14);
		
		pnlMSearch.add(lbl_36);
		
		pnlMSearch.add(txf_1);
		
		tm3=(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Grand Prix", "Date Of Race", "Winner", "Manufacture", "Laps", "Lap Time"
			}
		));
		txf_2.setBounds(488, 166, 198, 30);
		txf_2.setColumns(10);
		
		tabbedPane.addTab("Browser", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlBrowser, null);
		pnlBrowser.setLayout(null);
		lbl_37.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_37.setBounds(233, 58, 731, 44);
		
		pnlBrowser.add(lbl_37);
		
		pnlBrowser.add(txf_2);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			// This method goes through the data and displays each one 	
				if (count ==0) {
					count = formulaOne.size() - 1;
                } else {
                    count--;
                }
                drawTable2();
			
			}
		});
		btnPrevious.setBounds(245, 455, 89, 23);
		
		pnlBrowser.add(btnPrevious);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (count == formulaOne.size() - 1) {
                    count = 0;
                } else {
                    count++;
                }
                drawTable2();
			}
		});
		btnNext.setBounds(652, 455, 89, 23);
		
		pnlBrowser.add(btnNext);
		lbl_38.setBounds(400, 459, 198, 14);
		
		pnlBrowser.add(lbl_38);
		lbl_39.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_39.setBounds(349, 176, 103, 23);
		
		pnlBrowser.add(lbl_39);
		lbl_40.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_40.setBounds(349, 217, 83, 14);
		
		pnlBrowser.add(lbl_40);
		lbl_41.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_41.setBounds(349, 262, 103, 14);
		
		pnlBrowser.add(lbl_41);
		lbl_42.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_42.setBounds(349, 298, 83, 23);
		
		pnlBrowser.add(lbl_42);
		lbl_43.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_43.setBounds(349, 343, 116, 14);
		
		pnlBrowser.add(lbl_43);
		lbl_44.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_44.setBounds(349, 384, 153, 14);
		
		pnlBrowser.add(lbl_44);
		
		pnlBrowser.add(txf_3);
		
		pnlBrowser.add(txf_4);
		
		pnlBrowser.add(txf_5);
		
		pnlBrowser.add(txf_6);
		
		pnlBrowser.add(txf_7);
		pnlCalculation.setBackground(new Color(255, 255, 255));
		
		tabbedPane.addTab("Calculations", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlCalculation, null);
		pnlCalculation.setLayout(null);
		lbl_23.setFont(new Font("Dialog", Font.BOLD, 30));
		lbl_23.setBounds(159, 24, 803, 53);
		
		pnlCalculation.add(lbl_23);
		pnlCalculation1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		pnlCalculation1.setBounds(10, 88, 317, 211);
		
		pnlCalculation.add(pnlCalculation1);
		pnlCalculation1.setLayout(null);
		btnCalculation_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String yearCount = (String) cmbDate2.getSelectedItem();
				int year = Integer.parseInt(yearCount);	
				txf_8.setText(FormulaOneReader.lapCount(year, formulaOne));
			}
		});
		btnCalculation_1.setBounds(67, 161, 151, 23);
		
		pnlCalculation1.add(btnCalculation_1);
		txf_8.setBounds(195, 103, 86, 20);
		txf_8.setColumns(10);
		
		pnlCalculation1.add(txf_8);
		lbl_3.setBounds(10, 106, 125, 14);
		
		pnlCalculation1.add(lbl_3);
		lbl_4.setBounds(10, 61, 90, 14);
		
		pnlCalculation1.add(lbl_4);
		cmbDate2.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate2.setBounds(195, 58, 86, 20);
		
		pnlCalculation1.add(cmbDate2);
		lbl_5.setBounds(67, 9, 141, 14);
		lbl_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		pnlCalculation1.add(lbl_5);
		pnlCalculation2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		pnlCalculation2.setBounds(367, 88, 317, 211);
		
		pnlCalculation.add(pnlCalculation2);
		pnlCalculation2.setLayout(null);
		lbl_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_6.setBounds(54, 11, 199, 20);
		
		pnlCalculation2.add(lbl_6);
		lbl_7.setBounds(31, 54, 86, 14);
		
		pnlCalculation2.add(lbl_7);
		cmbDate4.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate4.setBounds(198, 51, 86, 20);
		
		pnlCalculation2.add(cmbDate4);
		lbl_8.setBounds(31, 100, 157, 14);
		
		pnlCalculation2.add(lbl_8);
		txf_9.setColumns(10);
		txf_9.setBounds(198, 97, 86, 20);
		
		pnlCalculation2.add(txf_9);
		btnCalculation_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String yearCount = (String) cmbDate4.getSelectedItem();
				int year = Integer.parseInt(yearCount);	
				txf_9.setText(FormulaOneReader.amountTracks(year, formulaOne));
			}
		});
		btnCalculation_2.setBounds(114, 150, 139, 23);
		
		pnlCalculation2.add(btnCalculation_2);
		pnlCalculation3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		pnlCalculation3.setBounds(717, 88, 317, 211);
		
		pnlCalculation.add(pnlCalculation3);
		pnlCalculation3.setLayout(null);
		lbl_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_9.setBounds(87, 11, 182, 14);
		
		pnlCalculation3.add(lbl_9);
		lbl_10.setBounds(32, 54, 98, 14);
		
		pnlCalculation3.add(lbl_10);
		cmbDate5.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate5.setBounds(206, 51, 72, 20);
		
		pnlCalculation3.add(cmbDate5);
		lbl_11.setBounds(32, 100, 98, 14);
		
		pnlCalculation3.add(lbl_11);
		cmbDriverName.setModel(new DefaultComboBoxModel(new String[] {"Sebastian\u00A0Vettel", "Nico\u00A0Rosberg", "Max\u00A0Verstappen", "Lewis\u00A0Hamilton", "Daniel\u00A0Ricciardo", "Kimi\u00A0R\u00E4ikk\u00F6nen", "Fernando\u00A0Alonso", "Jenson\u00A0Button", "Pastor\u00A0Maldonado", "Mark\u00A0Webber"}));
		cmbDriverName.setBounds(148, 97, 130, 20);
		
		pnlCalculation3.add(cmbDriverName);
		lbl_12.setBounds(32, 138, 130, 14);
		
		pnlCalculation3.add(lbl_12);
		txf_10.setColumns(10);
		txf_10.setBounds(191, 135, 86, 20);
		
		pnlCalculation3.add(txf_10);
		btnCalculation_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = (String) cmbDriverName.getSelectedItem();
				String yearCount = (String) cmbDate5.getSelectedItem();
				int year = Integer.parseInt(yearCount);	
				txf_10.setText(FormulaOneReader.AverageWin(name, year, formulaOne));
				
			}
		});
		btnCalculation_6.setBounds(99, 176, 147, 23);
		
		pnlCalculation3.add(btnCalculation_6);
		pnlCalculation4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		pnlCalculation4.setBounds(10, 331, 317, 211);
		
		pnlCalculation.add(pnlCalculation4);
		pnlCalculation4.setLayout(null);
		lbl_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_13.setBounds(38, 14, 246, 14);
		
		pnlCalculation4.add(lbl_13);
		lbl_14.setBounds(10, 42, 86, 14);
		
		pnlCalculation4.add(lbl_14);
		cmbDate6.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate6.setBounds(133, 39, 83, 20);
		
		pnlCalculation4.add(cmbDate6);
		cmbManufacture.setModel(new DefaultComboBoxModel(new String[] {"RED BULL RACING TAG HEUER", "MERCEDES", "FERRARI", "RED BULL RACING RENAULT", "LOTUS RENAULT", "MCLAREN MERCEDES", "WILLIAMS RENAULT"}));
		cmbManufacture.setBounds(133, 78, 176, 20);
		
		pnlCalculation4.add(cmbManufacture);
		lbl_15.setBounds(10, 81, 120, 14);
		
		pnlCalculation4.add(lbl_15);
		lbl_16.setBounds(10, 131, 86, 14);
		
		pnlCalculation4.add(lbl_16);
		texf_11.setColumns(10);
		texf_11.setBounds(133, 128, 86, 20);
		
		pnlCalculation4.add(texf_11);
		btnCalculation_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String car = (String) cmbManufacture.getSelectedItem();
				String yearCount = (String) cmbDate6.getSelectedItem();
				int year = Integer.parseInt(yearCount);	
				texf_11.setText(FormulaOneReader.AverageWinManufacture(car, year, formulaOne));
			}
		});
		btnCalculation_3.setBounds(36, 175, 153, 23);
		
		pnlCalculation4.add(btnCalculation_3);
		pnlCalculation5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		pnlCalculation5.setBounds(367, 331, 317, 211);
		
		pnlCalculation.add(pnlCalculation5);
		pnlCalculation5.setLayout(null);
		lbl_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_17.setBounds(60, 11, 212, 14);
		
		pnlCalculation5.add(lbl_17);
		lbl_18.setBounds(25, 53, 86, 14);
		
		pnlCalculation5.add(lbl_18);
		cmbDate7.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate7.setBounds(221, 50, 86, 20);
		
		pnlCalculation5.add(cmbDate7);
		txf_12.setColumns(10);
		txf_12.setBounds(221, 89, 86, 20);
		
		pnlCalculation5.add(txf_12);
		lbl_19.setBounds(25, 92, 168, 14);
		
		pnlCalculation5.add(lbl_19);
		btnCalculation_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String yearCount = (String) cmbDate7.getSelectedItem();
				int year = Integer.parseInt(yearCount);	
				txf_12.setText(FormulaOneReader.findMaxLaps(year, formulaOne));
			}
		});
		btnCalculation_4.setBounds(112, 142, 132, 23);
		
		pnlCalculation5.add(btnCalculation_4);
		pnlCalculation6.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		pnlCalculation6.setBounds(717, 331, 317, 211);
		
		pnlCalculation.add(pnlCalculation6);
		pnlCalculation6.setLayout(null);
		lbl_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_20.setBounds(79, 22, 206, 14);
		
		pnlCalculation6.add(lbl_20);
		lbl_21.setBounds(44, 64, 86, 14);
		
		pnlCalculation6.add(lbl_21);
		cmbDate8.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011"}));
		cmbDate8.setBounds(198, 61, 87, 20);
		
		pnlCalculation6.add(cmbDate8);
		txf_13.setColumns(10);
		txf_13.setBounds(199, 100, 86, 20);
		
		pnlCalculation6.add(txf_13);
		lbl_22.setBounds(44, 103, 144, 14);
		
		pnlCalculation6.add(lbl_22);
		btnCalculation_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String yearCount = (String) cmbDate8.getSelectedItem();
				int year = Integer.parseInt(yearCount);	
				txf_13.setText(FormulaOneReader.findMinLaps(year, formulaOne));
			}
		});
		btnCalculation_5.setBounds(114, 153, 125, 23);
		
		pnlCalculation6.add(btnCalculation_5);
		
		tabbedPane.addTab("View", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlView, null);
		pnlView.setLayout(null);
		scrollPane_3.setBounds(39, 142, 953, 362);
		
		pnlView.add(scrollPane_3);
		
		scrollPane_3.setViewportView(table_3);
		table_3.setModel(tm3);
		lbl_24.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_24.setBounds(10, 22, 1024, 51);
		
		pnlView.add(lbl_24);
		btnViewStart_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				drawTable3();
			}
		});
		btnViewStart_6.setBounds(413, 96, 89, 23);
		
		pnlView.add(btnViewStart_6);
		lbl_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_25.setBounds(245, 94, 107, 26);
		
		pnlView.add(lbl_25);
		pnlSorting.setBackground(new Color(255, 255, 255));
		
		tabbedPane.addTab("Sorting", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlSorting, null);
		tabbedPane.setBackgroundAt(5, Color.WHITE);
		pnlSorting.setLayout(null);
		lbl_28.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_28.setBounds(167, 25, 626, 74);
		
		pnlSorting.add(lbl_28);
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cmbSorting.getSelectedIndex()==0)
				{
					FormulaOneReader.Sorting2(formulaOne);
					drawTable();
				}
				if(cmbSorting.getSelectedIndex()==1)
				{
					FormulaOneReader.Sorting3(formulaOne);
					drawTable();
				}
				if(cmbSorting.getSelectedIndex()==2)
				{
					FormulaOneReader.Sorting(formulaOne);
					drawTable();
				}
				
			}
		});
		btnSort.setBounds(20, 256, 121, 35);
		
		pnlSorting.add(btnSort);
		cmbSorting.setModel(new DefaultComboBoxModel(new String[] {"Fastest Time", "Driver Name", "Grand Prix"}));
		cmbSorting.setBounds(20, 193, 121, 35);
		
		pnlSorting.add(cmbSorting);
		lbl_29.setBounds(34, 147, 107, 35);
		
		pnlSorting.add(lbl_29);
		scrollPane.setBounds(167, 110, 848, 406);
		
		pnlSorting.add(scrollPane);
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(tm);
		scrollPane.setViewportView(table);
		
		tabbedPane.addTab("Bar Graph", new ImageIcon(FormulaOneGui.class.getResource("/pformulaoneassignment1/hqdefault1.jpg")), pnlBarGraph, null);
		pnlBarGraph.setLayout(null);
		
		lbl_27.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl_27.setBounds(251, 11, 502, 45);
		
		pnlBarGraph.add(lbl_27);
		barGraph();
	}
	/**
	 * <ul>
	 * <li>Draws the table with different fields</li>
	 * <li>Data populated from ArrayList and neatly put into the fields </li>
	 * </ul>
	 */
	public void drawTable()
	{
		
		tm.setRowCount(0);
		for(int i = 0; i < formulaOne.size();i++)
		{
			Object[] object = new Object[6];
			object[0] = formulaOne.get(i).getRace();
			object[1] = formulaOne.get(i).getWinner();
			object[2] = formulaOne.get(i).getRaceCar();
			object[3] = formulaOne.get(i).getTime();
			object[4] = formulaOne.get(i).getRaceDate();
			object[5]= formulaOne.get(i).getLaps();
			tm.addRow(object);
		}
	}
	/**
	 * <ul>
	 * <li>Creates the string array </li>
	 * <li>stores the data from the Array List in the string array /data is converted if not a string </li>
	 * <li>Data is displayed in the text fields </li>
	 * </ul>
	 */
	public void drawTable2()
	{
		
		String [] array = new String[6];
		array[0] = formulaOne.get(count).getRace();
		array[1] = formulaOne.get(count).getWinner();
		array[2] = formulaOne.get(count).getRaceCar();
		array[3] = formulaOne.get(count).getTime();
		array[4] = formulaOne.get(count).getDateOfRace();
		array[5] = Integer.toString(formulaOne.get(count).getLaps());
		
		txf_2.setText(array[0]);
		txf_3.setText(array[1]);
		txf_4.setText(array[2]);
		txf_5.setText(array[3]);
		txf_6.setText(array[4]);
		txf_7.setText(array[5]);
		
	}
	/**
	 * <ul>
	 * <li>Draws the table - Table has a different layout compared to table 1</li>
	 * <li>Data populated from ArrayList --All data from file is displayed in this table </li>
	 * </ul>
	 */
	public void drawTable3()
	{
		
		tm3.setRowCount(0);
		for(int i = 0; i < formulaOne.size();i++)
		{
			Object[] object = new Object[6];
			object[0] = formulaOne.get(i).getRace();
			object[1] = formulaOne.get(i).getRaceDate();
			object[2] = formulaOne.get(i).getWinner();
			object[3] = formulaOne.get(i).getRaceCar();
			object[4]= formulaOne.get(i).getLaps();
			object[5] = formulaOne.get(i).getTime();
			tm3.addRow(object);
		}
	}
	/**
	 * <ul>
	 * <li>Draws a bar graph on a panel  </li>
	 * <li>Drivers names are manually entered into string array</li>
	 * <li>Loop around the array finding the names and added them into a sub Array List </li>
	 * <li>Sub Array list size is equal to the drivers amount of wins</li>
	 * <li>Wins are Plotted on Bar Graph </li>
	 * </ul>
	 */
	public void barGraph()
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		int count = 0;
		String[]array  = new String[10];
		array[0] = "Sebastian\u00A0Vettel";
		array[1] = "Nico\u00A0Rosberg";
		array[2] = "Max\u00A0Verstappen";
		array[3] = "Lewis\u00A0Hamilton";
		array[4] = "Daniel\u00A0Ricciardo";
		array[5] = "Kimi\u00A0R\u00E4ikk\u00F6nen";
		array[6] ="Fernando\u00A0Alonso";
		array[7] ="Jenson\u00A0Button"; 
		array[8] ="Pastor\u00A0Maldonado"; 
		array[9] ="Mark\u00A0Webber";
		
		for(int i = 0; i<array.length;i++)
		{
			ArrayList<FormulaOne> wins = FormulaOneReader.allWins(array[i], formulaOne);
			dataset.addValue(wins.size(), "Number of Wins", array[i]);
		}
		JFreeChart chart1 = ChartFactory.createBarChart("Formula One Drivers wins", "Drivers", "Number of Wins", dataset, PlotOrientation.VERTICAL,true,true,false);
		CategoryPlot plot = (CategoryPlot) chart1.getPlot();
		org.jfree.chart.axis.CategoryAxis categoryaxis = plot.getDomainAxis();
		categoryaxis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(1.0d));
		ChartPanel panel_13 = new ChartPanel(chart1);
		panel_13.setBounds(128, 84, 781, 413);
		pnlBarGraph.add(panel_13);
		panel_13.setVisible(true);
		
	}
	/**
	 * <ul>
	 * <li>Draws the table which has a sub array list called answers pass through</li>
	 * <li>The sub array list is printed to the table </li>
	 * </ul>
	 */
	public void drawTable4(ArrayList<FormulaOne>answers)
	{
		tm1.setRowCount(0);
		for(int i = 0; i < answers.size();i++)
		{
			
			Object[] object = new Object[4];
			object[0] = answers.get(i).getWinner();
			object[1] = answers.get(i).getRaceCar();
			object[2] = answers.get(i).getRace();
			object[3] = answers.get(i).getRaceDate();
			tm1.addRow(object);
		}
		
	}
	/**
	 * <ul>
	 * <li>Same at table 4 but the table has a different layout</li> 
	 * <li>Draws the table which has a sub array list called answers pass through</li>
	 * <li>The sub array list is printed to the table </li>
	 * </ul>
	 */
	public void drawTable5(ArrayList<FormulaOne>answers)
	{
		tm2.setRowCount(0);
		for(int i = 0; i < answers.size();i++)
		{
			
			Object[] object = new Object[4];
			object[0] = answers.get(i).getRaceCar();
			object[1] = answers.get(i).getWinner();
			object[2] = answers.get(i).getRace();
			object[3] = answers.get(i).getRaceDate();
			tm2.addRow(object);
		}
	}
}
