import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.NumberFormat;
import javax.swing.JTextField;

/**
 * GUI called Computer Options Form using windows builder and then writing code to 
 * populate the combo boxes and calculate the price
 * @author Mary A Stewart
 *
 */

public class ComputerForm extends JFrame {

  //Variables that may be used at any time in the program
 
	private JPanel contentPane;
	private JComboBox processorComBox;
	private JComboBox memoryComBox;
	private JComboBox diskComBox;
	private JRadioButton win7ProRadBtn;
	private JRadioButton win7UltRadBtn;
	private JCheckBox officePkgChkBox;
	private JCheckBox acctPkgChkBox;
	private JCheckBox graphicsPkgChkBox;
	private JLabel priceLbl;
	private JTextField priceTFld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComputerForm frame = new ComputerForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComputerForm() {
		setTitle(" Computer Options Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JPanel harewarePnl = new JPanel();
		harewarePnl.setBorder(new TitledBorder(null, "Hardware", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel softwarePnl = new JPanel();
		softwarePnl.setBorder(new TitledBorder(null, "Software", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		priceLbl = new JLabel("Price:");
		
		// Action Listener and Action Event for the JButton "Calculate"
		 
		JButton calculateBtn = new JButton("Calculate");
		calculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculatePrice();
			}
		});
		
		//  Action Listener and Action Event for the JButton "Exit"
		 
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		priceTFld = new JTextField();
		priceTFld.setEditable(false);
		priceTFld.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING,
						gl_panel.createSequentialGroup().addGap(19)
								.addComponent(harewarePnl, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
								.addGap(26)
								.addComponent(softwarePnl, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup().addGap(103).addComponent(priceLbl)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(priceTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 154, Short.MAX_VALUE).addComponent(calculateBtn)
						.addGap(18).addComponent(exitBtn).addGap(95)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(20)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(harewarePnl, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(softwarePnl, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(priceLbl).addComponent(
								priceTFld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(43))
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(calculateBtn)
										.addComponent(exitBtn))
								.addGap(20)))));

		win7ProRadBtn = new JRadioButton("Windows 7 Professional");

		win7UltRadBtn = new JRadioButton("Windows 7 Ultimate");

		officePkgChkBox = new JCheckBox("Office Package");

		acctPkgChkBox = new JCheckBox("Accounting Package");

		graphicsPkgChkBox = new JCheckBox("Graphics Package");
		GroupLayout gl_softwarePnl = new GroupLayout(softwarePnl);
		gl_softwarePnl.setHorizontalGroup(gl_softwarePnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_softwarePnl.createSequentialGroup().addContainerGap()
						.addGroup(gl_softwarePnl.createParallelGroup(Alignment.LEADING).addComponent(win7ProRadBtn)
								.addComponent(win7UltRadBtn).addComponent(officePkgChkBox).addComponent(acctPkgChkBox)
								.addComponent(graphicsPkgChkBox))
						.addContainerGap(181, Short.MAX_VALUE)));
		gl_softwarePnl.setVerticalGroup(gl_softwarePnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_softwarePnl.createSequentialGroup().addContainerGap().addComponent(win7ProRadBtn)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(win7UltRadBtn)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(officePkgChkBox)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(acctPkgChkBox)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(graphicsPkgChkBox)
						.addContainerGap(13, Short.MAX_VALUE)));
		softwarePnl.setLayout(gl_softwarePnl);

		JLabel memoryLbl = new JLabel("Memory");

		JLabel processorLbl = new JLabel("Processor");

		JLabel diskLbl = new JLabel("Disk");

		
		 //  populate Processor combo box
		processorComBox = new JComboBox<String> ();
		processorComBox.addItem("Quad Core 3.40 GHz");
		processorComBox.addItem("Quad Core 3.50 GHz");
		processorComBox.addItem("Quad Core 3.60 GHz");
		
		 // populate Memory combo box
		memoryComBox = new JComboBox<String> ();
		memoryComBox.addItem("4GB");
		memoryComBox.addItem("8GB");
		memoryComBox.addItem("16GB");
		memoryComBox.addItem("32GB");
		//populate Disk combo box 
		diskComBox = new JComboBox<String> ();
		diskComBox.addItem("500GB");
		diskComBox.addItem("1TB");
		diskComBox.addItem("2TB");

		GroupLayout gl_harewarePnl = new GroupLayout(harewarePnl);
		gl_harewarePnl.setHorizontalGroup(gl_harewarePnl.createParallelGroup(Alignment.LEADING).addGroup(gl_harewarePnl
				.createSequentialGroup()
				.addGroup(gl_harewarePnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_harewarePnl.createSequentialGroup().addGap(11).addComponent(processorLbl))
						.addGroup(gl_harewarePnl.createSequentialGroup().addContainerGap().addComponent(diskLbl))
						.addGroup(gl_harewarePnl.createSequentialGroup().addContainerGap().addComponent(memoryLbl)))
				.addGap(18)
				.addGroup(gl_harewarePnl.createParallelGroup(Alignment.LEADING)
						.addComponent(diskComBox, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addComponent(memoryComBox, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addComponent(processorComBox, 0, 144, Short.MAX_VALUE))
				.addContainerGap()));
		gl_harewarePnl.setVerticalGroup(gl_harewarePnl.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_harewarePnl.createSequentialGroup().addContainerGap()
						.addGroup(gl_harewarePnl.createParallelGroup(Alignment.BASELINE)
								.addComponent(processorLbl).addComponent(processorComBox, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_harewarePnl.createParallelGroup(Alignment.BASELINE).addComponent(memoryLbl)
								.addComponent(memoryComBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_harewarePnl.createParallelGroup(Alignment.BASELINE).addComponent(diskLbl)
								.addComponent(diskComBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(35, Short.MAX_VALUE)));
		harewarePnl.setLayout(gl_harewarePnl);
		panel.setLayout(gl_panel);

	}
	
	private void calculatePrice() {
		double price = 500;
		if (win7ProRadBtn.isSelected())
			price += 0;
		else if (win7UltRadBtn.isSelected())
			price += 100;
		if (officePkgChkBox.isSelected())
			price += 400;
		if (acctPkgChkBox.isSelected())
			price += 200;
		if (graphicsPkgChkBox.isSelected())
			price += 600;		
		if (processorComBox.getSelectedIndex()==0)			
		    price += 0;
		if (processorComBox.getSelectedIndex()==1)			
		    price += 50;
		if (processorComBox.getSelectedIndex()==2)			
		    price += 150;
		if (memoryComBox.getSelectedIndex()==0)			
		    price += 0;
		if (memoryComBox.getSelectedIndex()==1)			
		    price += 50;
		if (memoryComBox.getSelectedIndex()==2)			
		    price += 100;
		if (memoryComBox.getSelectedIndex()==3)			
		    price += 150;
		if (diskComBox.getSelectedIndex()==0)			
		    price += 0;
		if (diskComBox.getSelectedIndex()==1)			
		    price += 50;
		if (diskComBox.getSelectedIndex()==2)			
		    price += 150;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String priceStr = nf.format(price);
		priceTFld.setText(priceStr);

	}
}
