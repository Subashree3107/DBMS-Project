package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;

public class hike extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String String = null;
	private JPanel contentPane;
	private JTextField txtexp;
	private JTextField txtsal;
	private JTextField txtper;
	private JTextField txtnew;
	private JTextField txtfn;
	private JTextField txtln;
	private JTextField txtemp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hike frame = new hike();
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
	public hike() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SALARY APPRAISAL");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(543, 42, 476, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ANNUAL SALARY");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(161, 323, 186, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("YEARS OF EXPERIENCE");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(161, 391, 261, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SKILL LEVEL");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(161, 454, 163, 42);
		contentPane.add(lblNewLabel_3);
		
		txtexp = new JTextField();
		txtexp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtexp.setBounds(453, 402, 268, 29);
		contentPane.add(txtexp);
		txtexp.setColumns(10);
		
		txtsal = new JTextField();
		txtsal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtsal.setBounds(453, 334, 268, 29);
		contentPane.add(txtsal);
		txtsal.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BEGINNER (1-3 years)", "INTERMEDIATE (4-7 years)", "ADVANCED (Above 7 years)"}));
		comboBox.setBounds(453, 465, 268, 29);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("HIKE PERCENTAGE");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(161, 575, 281, 42);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("NEW ANNUAL SALARY");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(527, 575, 281, 42);
		contentPane.add(lblNewLabel_3_2);
		
		txtper = new JTextField();
		txtper.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtper.setColumns(10);
		txtper.setBounds(129, 625, 268, 39);
		contentPane.add(txtper);
		
		txtnew = new JTextField();
		txtnew.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtnew.setColumns(10);
		txtnew.setBounds(480, 627, 339, 36);
		contentPane.add(txtnew);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			
		
		    public void actionPerformed(ActionEvent e) {
		        try {
		            double annualSal = Double.parseDouble(txtsal.getText());
		            String skill = (String) comboBox.getSelectedItem();
		            float exp = Float.parseFloat(txtexp.getText());
		            float newSal = 0;
		            double hike = 0;

		            // Calculate the hike based on skill level and experience
		            if (skill.equals("BEGINNER (1-3 years)")) {
		                hike = 5 + exp * 0.5; 
		            } else if (skill.equals("INTERMEDIATE (4-7 years)")) {
		                hike = 10 + exp * 1.0; 
		            } else if (skill.equals("ADVANCED (Above 7 years)")) {
		                hike = 15 + exp * 1.5; 
		            }

		            // Calculate the new annual salary based on the hike percentage
		            newSal = (float) (annualSal + (annualSal * hike / 100));

		            // Set the calculated hike percentage and new salary to the respective text fields
		            txtper.setText(String.valueOf(hike)+"%");
		            txtnew.setText(String.valueOf(newSal));
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Please enter valid numbers for salary and experience.");
		        }
		    }
		});

		btnNewButton.setBounds(394, 522, 158, 43);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(886, 107, 548, 547);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("ADD RECORDS");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\n\n"+
						"\twww.infinity.com\n"+
						"\tEmail:infinity_beyond_limit@gmail.com\n\n\n"+
						"\t\t                 INFINITY\n\n"+
						"\t\t      SALARY APPRAISAL SLIP\n\n"+
						
						"=============================================================================================================================================================\n\n"+
						"\tEMPLOYEE ID:\t\t\t"+txtemp.getText()+"\n"+
						"---------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tFIRST NAME:\t\t\t"+txtfn.getText()+"\n"+
						"---------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tLAST NAME:\t\t\t"+txtln.getText()+"\n"+
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tANNUAL SALARY:\t\t  "+txtsal.getText()+"\n"+
						"-------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tYEARS OF EXPERIENCE:\t\t "+txtexp.getText()+"\n"+
						"---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tSKILL LEVEL:\t\t\t"+(String)comboBox.getSelectedItem()+"\n"+
						"---------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tHIKE PERCENTAGE:\t\t"+txtper.getText()+"\n"+
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\tNEW ANNUAL SALARY:\t\t"+txtnew.getText()+"\n"+
						"-------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n"+
						
						"========================================================================================================================================================================\n"+
						"\tCONGRATULATIONS YOUR SALARY HAS BEEN INCREMENTED!!\n"
						
						
						
						
						);
			}
			
		});
		btnNewButton_1.setBounds(886, 679, 200, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PRINT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.print();
				}
				catch(PrinterException e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton_2.setBounds(1107, 679, 106, 43);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtsal.setText(null);
				txtexp.setText(null);
				txtper.setText(null);
				txtnew.setText(null);
				txtemp.setText(null);
				txtfn.setText(null);
				txtln.setText(null);
				
			}
		});
		btnNewButton_3.setBounds(1223, 679, 117, 43);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
				frame=new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "confirm want to exit","Print System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnNewButton_4.setBounds(1356, 681, 85, 39);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("EMPLOYEE ID");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(184, 141, 194, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("FIRST NAME");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(168, 210, 158, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(146, 210, 45, 0);
		contentPane.add(lblNewLabel_6);
		
		txtfn = new JTextField();
		txtfn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtfn.setBounds(453, 220, 268, 29);
		contentPane.add(txtfn);
		txtfn.setColumns(10);
		
		txtln = new JTextField();
		txtln.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtln.setBounds(453, 279, 268, 29);
		contentPane.add(txtln);
		txtln.setColumns(10);
		
		txtemp = new JTextField();
		txtemp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtemp.setBounds(394, 143, 194, 29);
		contentPane.add(txtemp);
		txtemp.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-search (1).gif"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Suba@3107");
					
				   Statement st=con.createStatement();
					String sql="select salaray,First_name,Last_name from employee where emp_id=?";
					
					PreparedStatement pts=con.prepareStatement(sql);
					pts.setString(1,txtemp.getText());
					ResultSet rs= pts.executeQuery();
					while(rs.next()) {
						String kt=rs.getString("Salaray");
						//String pvr=rs.getString("firstname");
						
						txtsal.setText(kt);
						String vv=rs.getString("First_name");
						String kv=rs.getString("Last_name");
						txtfn.setText(vv);
						txtln.setText(kv);
					}
				}
				catch(Exception ec) {
					JOptionPane.showMessageDialog(null,"it has not been registered");
					ec.printStackTrace();
				}

			}
		});
		btnNewButton_5.setBounds(620, 143, 33, 29);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_7 = new JLabel("LAST NAME");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(167, 279, 143, 21);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_6 = new JButton("BACK");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				userpage frame = new userpage();
				frame.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(161, 69, 85, 29);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp20.jpg"));
		lblNewLabel_8.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_8);
	}
}
