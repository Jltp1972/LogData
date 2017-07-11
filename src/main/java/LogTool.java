import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;


public class LogTool {

	private JFrame frame;
	private JPanel mainPanel;
	public static ArrayList<logLocation> LocationList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		newList();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogTool window = new LogTool();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogTool() {
		initialize();
	}
	
	public static void newList() {

		
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 200, 550, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		JLabel header = new JLabel("<html><b COLOR=BLUE>Add New Location</b>");
		JLabel address = new JLabel("Address :");
		JLabel city = new JLabel("City :");
		JLabel name = new JLabel("Name :");
		JLabel phone = new JLabel("Phone :");
		JLabel date = new JLabel("Date :");
		JLabel status = new JLabel("Status (found, bid, cut):");
		JLabel numberTrees = new JLabel("Number of Trees :");
		JLabel notes = new JLabel("Notes :");
		JLabel email = new JLabel("Email :");
		final JTextField addressfld = new JTextField(60);
		final JTextField cityfld = new JTextField(25);
		final JTextField namefld = new JTextField(30);
		final JTextField phonefld = new JTextField(13);
		final JTextField datefld = new JTextField(20);
		final JTextField statusfld = new JTextField(15);
		final JTextField numberTreesfld = new JTextField(3);
		final JTextField notesfld = new JTextField(120);
		final JTextField emailfld = new JTextField(36);

		
		
		
		Border border = mainPanel.getBorder();
		Border margin = new EmptyBorder(10, 10, 10, 10);
		mainPanel.setBorder(new CompoundBorder(border, margin));
			
		mainPanel.setLayout(null);

		
		header.setBounds(185,05,232,45);
		header.setFont(new Font("Tahoma", Font.BOLD, 15));
		mainPanel.add(header);		
		address.setBounds(35,51,232,45);
		address.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(address);	
		city.setBounds(35,81,232,45);
		city.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(city);
		name.setBounds(35,111,232,45);
		name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(name);	
		phone.setBounds(35,141,232,45);
		phone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(phone);
		date.setBounds(35,170,232,45);
		date.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(date);
		status.setBounds(35,210,150,45);
		status.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(status);
		numberTrees.setBounds(35,250,232,45);
		numberTrees.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(numberTrees);
		notes.setBounds(35,300,232,45);
		notes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(notes);
		email.setBounds(35,360,232,45);
		email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mainPanel.add(email);
		
		addressfld.setBounds(100,60,360,25);
		mainPanel.add(addressfld);	
		cityfld.setBounds(100,90,232,25);
		mainPanel.add(cityfld);
		namefld.setBounds(100,120,232,25);
		mainPanel.add(namefld);	
		phonefld.setBounds(100,150,232,25);
		mainPanel.add(phonefld);
		datefld.setBounds(100,180,232,25);
		mainPanel.add(datefld);
		statusfld.setBounds(185,220,150,25);
		mainPanel.add(statusfld);
		numberTreesfld.setBounds(150,260,80,25);
		mainPanel.add(numberTreesfld);
		notesfld.setBounds(100,300,232,55);
		mainPanel.add(notesfld);
		emailfld.setBounds(100,370,232,25);
		mainPanel.add(emailfld);
		

		
		JButton saveDataButton = new JButton("Save Data");
		saveDataButton.setBounds(195, 410, 140, 25);
		saveDataButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		saveDataButton.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent ae) {
		String ste = "IA";
		String addr = addressfld.getText();
		String cty = cityfld.getText();
		String nme = namefld.getText();
		String phn = phonefld.getText();
		String dte = datefld.getText();
		String sts = statusfld.getText();
		String nbr = numberTreesfld.getText();
		String nte = notesfld.getText();
		String eml = emailfld.getText();
		
//		long key = locator.getkey(addr, cty, ste);
		LocationTree.addNewLoc(addr, cty, ste, nme, phn, dte, sts, nbr, nte, eml);
		
		
	}
	});
	
	mainPanel.add(saveDataButton);
	
	frame.add(mainPanel);
}

}
