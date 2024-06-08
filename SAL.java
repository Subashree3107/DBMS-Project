package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class SAL extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtemp;
	private JTextField txttax;
	private JTextField txtbas;
	private JTextField txthra;
	private JTextField txtlta;
	private JTextField txtmed;
	private JTextField txtcon;
	private JTextField txtsp;
	private JTextField txtnet;
	private JTextField txtsal;
	private JTextField txtfn;
	private JTextField txtln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SAL frame = new SAL();
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
	public SAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SALARY SLIP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(609, 32, 332, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(88, 109, 194, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TAX");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(236, 343, 162, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BASIC SALARY");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(236, 392, 162, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("HRA");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(236, 431, 240, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("LTA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(236, 485, 240, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("MEDICAL ALLOWANCE");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(236, 543, 228, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CONVEYANCE");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(236, 593, 167, 21);
		contentPane.add(lblNewLabel_7);
		
		JLabel txtspl = new JLabel("SPECIAL ALLOWANCE");
		txtspl.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtspl.setBounds(236, 643, 219, 29);
		contentPane.add(txtspl);
		
		txtemp = new JTextField();
		txtemp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtemp.setBounds(292, 114, 209, 29);
		contentPane.add(txtemp);
		txtemp.setColumns(10);
		
		txttax = new JTextField();
		txttax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txttax.setBounds(464, 350, 194, 27);
		contentPane.add(txttax);
		txttax.setColumns(10);
		
		txtbas = new JTextField();
		txtbas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtbas.setBounds(464, 396, 194, 27);
		contentPane.add(txtbas);
		txtbas.setColumns(10);
		
		txthra = new JTextField();
		txthra.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txthra.setBounds(464, 440, 194, 27);
		contentPane.add(txthra);
		txthra.setColumns(10);
		
		txtlta = new JTextField();
		txtlta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtlta.setBounds(464, 489, 194, 27);
		contentPane.add(txtlta);
		txtlta.setColumns(10);
		
		txtmed = new JTextField();
		txtmed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtmed.setBounds(464, 547, 194, 27);
		contentPane.add(txtmed);
		txtmed.setColumns(10);
		
		txtcon = new JTextField();
		txtcon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtcon.setBounds(464, 593, 194, 27);
		contentPane.add(txtcon);
		txtcon.setColumns(10);
		
		txtsp = new JTextField();
		txtsp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtsp.setBounds(465, 647, 194, 27);
		contentPane.add(txtsp);
		txtsp.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("NET MONTHLY SALARY");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(236, 697, 228, 29);
		contentPane.add(lblNewLabel_9);
		
		txtnet = new JTextField();
		txtnet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtnet.setBounds(464, 701, 194, 27);
		contentPane.add(txtnet);
		txtnet.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-search (1).gif"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
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
					
				
			      double annual_sal=Double.parseDouble(txtsal.getText());
			      float tax = 0 ;
			      float basic = 0 ;
			      float hra = 0 ;
			      float lta = 0 ;
			      float med = 0 ;
			      float conv = 0 ;
			      float spl = 0 ;
			      float month = 0 ;
			      float total_sal;
			      float tax1 = 0;
			      if(annual_sal>0 && annual_sal<=250000) {
			    	  tax1=0;
			    	  month=(float) (annual_sal/12);
			    	  basic=(float) (month*0.50);
			    	  hra=(float) (basic*0.40);
			    	  lta=(float) (basic*0.15);
			    	  med=1500;
			    	  conv=(float) (basic*0.20);
			    	  spl=(float) (basic*0.01);
			    	  
			    	  
			      }
			      else if(annual_sal>250000 && annual_sal<=1000000) {
			    	  tax1=8;
			    	  tax=(float) ((float)annual_sal* 0.08);
			    	  total_sal=(float) (annual_sal-tax);
			    	  month=(float) (total_sal/12);
			    	  basic=(float) (month*0.50);
			    	  hra=(float) (basic*0.40);
			    	  lta=(float) (basic*0.15);
			    	  med=1500;
			    	  conv=(float) (basic*0.20);
			    	  spl=(float) (basic*0.01);
			    	  
			    	  
			      }
			      else if(annual_sal>1000000 && annual_sal<=1700000) {
			    	  tax1=14;
			    	  tax=(float) ((float)annual_sal* 0.14);
			    	  total_sal=(float) (annual_sal-tax);
			    	  month=(float) (total_sal/12);
			    	  basic=(float) (month*0.50);
			    	  hra=(float) (basic*0.40);
			    	  lta=(float) (basic*0.15);
			    	  med=1500;
			    	  conv=(float) (basic*0.20);
			    	  spl=(float) (basic*0.01);
			    	  
			    	  
			      }
			      else if(annual_sal>1700000 && annual_sal<=2500000) {
			    	  tax1=20;
			    	  tax=(float) ((float)annual_sal* 0.20);
			    	  total_sal=(float) (annual_sal-tax);
			    	  month=(float) (total_sal/12);
			    	  basic=(float) (month*0.50);
			    	  hra=(float) (basic*0.40);
			    	  lta=(float) (basic*0.15);
			    	  med=1500;
			    	  conv=(float) (basic*0.20);
			    	  spl=(float) (basic*0.01);
			    	  
			    	  
			      }
			      else if(annual_sal>2500000) {
			    	  tax1=26;
			    	  tax=(float) ((float)annual_sal* 0.26);
			    	  total_sal=(float) (annual_sal-tax);
			    	  month=(float) (total_sal/12);
			    	  basic=(float) (month*0.50);
			    	  hra=(float) (basic*0.40);
			    	  lta=(float) (basic*0.15);
			    	  med=1500;
			    	  conv=(float) (basic*0.20);
			    	  spl=(float) (basic*0.01);
			    	  
			    	  
			      }



			      
			      txttax.setText(String.valueOf(tax1)+"%");
			      txtbas.setText(String.valueOf(basic));
			      txthra.setText(String.valueOf(hra));
			      txtlta.setText(String.valueOf(lta));
			      txtmed.setText(String.valueOf(med));
			      txtcon.setText(String.valueOf(conv));
			      txtsp.setText(String.valueOf(spl));
			      txtnet.setText(String.valueOf(month));
			      
				} 
				}
				catch(Exception ec) {
					JOptionPane.showMessageDialog(null,"it has not been registered");
					ec.printStackTrace();
				}

			      
			      
			      
			      
			      
			      
			      
			}
		});
		btnNewButton.setBounds(530, 115, 34, 29);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(755, 143, 644, 562);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("ADD RECORDS");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\n\n"+
						"\ttwww.infinity.com\n"+
						"\temail:infinity_beyond_limit@gmail.com\n\n"+
						"\t\t\t              INFINITY\n\n"+
						"\t\t\t     SALARY APPRAISAL SLIP\n"+
						"===============================================================================================================================================================================================\n"+
						"\t\tEMPLOYEE ID:\t\t\t"+txtemp.getText()+"\n"+
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tFIRST NAME:\t\t\t"+txtfn.getText()+"\n"+
						"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tLAST NAME:\t\t\t"+txtln.getText()+"\n"+
						"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tANNUAL SALARY:\t\t"+txtsal.getText()+"\n"+
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tTAX:\t\t\t"+txttax.getText()+"\n"+
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tBASIC SALARY:\t\t"+txtbas.getText()+"\n"+
						"-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tHRA:\t\t\t"+txthra.getText()+"\n"+
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
                         "\t\tLTA:\t\t\t"+txtlta.getText()+"\n"+
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tMEDICAL ALLOWANCE:\t\t"+txtmed.getText()+"\n"+
						"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tCONVEYANCE:\t\t"+txtcon.getText()+"\n"+
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tSPECIAL ALLOWANCE:\t\t"+txtsp.getText()+"\n"+
						"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"+
						"\t\tNET SALARY:\t\t\t"+txtnet.getText()+"\n"+
						"========================================================================================================================================================================================================\n"+
						"\t\tTHE ABOVE MENTIONED ARE YOUR SALARY ALLOWANCES!!\n"
						
						
						
						
						);

			}
		});
		btnNewButton_1.setBounds(757, 745, 150, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("PRINT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
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
		btnNewButton_2.setBounds(936, 745, 110, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txttax.setText(null);
				txtbas.setText(null);
				txthra.setText(null);
				txtlta.setText(null);
				txtmed.setText(null);
				txtcon.setText(null);
				txtsp.setText(null);
				txtnet.setText(null);
				txtemp.setText(null);
				txtfn.setText(null);
				txtln.setText(null);
				txtsal.setText(null);
			}
		});
		btnNewButton_3.setBounds(1084, 745, 85, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
				frame=new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "confirm want to exit","Print System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnNewButton_4.setBounds(1212, 745, 85, 40);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_8 = new JLabel("ANNUAL SALARY");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(236, 303, 160, 20);
		contentPane.add(lblNewLabel_8);
		
		txtsal = new JTextField();
		txtsal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtsal.setBounds(464, 303, 194, 27);
		contentPane.add(txtsal);
		txtsal.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("FIRST NAME");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setBounds(234, 184, 167, 29);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("LAST NAME");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11.setBounds(235, 246, 143, 21);
		contentPane.add(lblNewLabel_11);
		
		txtfn = new JTextField();
		txtfn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtfn.setBounds(464, 188, 194, 27);
		contentPane.add(txtfn);
		txtfn.setColumns(10);
		
		txtln = new JTextField();
		txtln.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtln.setBounds(464, 246, 194, 27);
		contentPane.add(txtln);
		txtln.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("BACK");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				userpage frame = new userpage();
				frame.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(88, 41, 85, 29);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp10.jpg"));
		lblNewLabel_12.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_12);
	}
}
