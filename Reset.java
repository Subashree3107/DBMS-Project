package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Reset extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField pass1;
	private JTextField user1;
    private JTextField user2;
    private JPasswordField pass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reset frame = new Reset();
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
	public Reset() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-email.gif"));
		lblNewLabel_5.setBounds(451, 156, 60, 44);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Update Password");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(608, 52, 437, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email ID");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(574, 167, 115, 21);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Recovery ID");
		lblNewLabel_2.setBounds(574, 239, 180, 32);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New Password");
		lblNewLabel_3.setBounds(572, 327, 193, 32);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBounds(755, 500, 115, 44);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{try {
				String us1 = user1.getText();
				//@SuppressWarnings("deprecation")
				String us2 = user2.getText();
				String ps1 = pass1.getText();
				String ps2 = pass2.getText();
				System.out.println(us1);
				System.out.println(us2);
				System.out.println(ps1);
				System.out.println(ps2);
				 if (!ps1.equals(ps2)) {
			            JOptionPane.showMessageDialog(null, "Passwords do not match", "Invalid Password", JOptionPane.ERROR_MESSAGE);
			            return; // Stop further execution
			        }
				  if (us1.isEmpty() || us2.isEmpty() || ps1.isEmpty() || ps2.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
			            return; // Stop further execution
			        }
				
				//System.out.println(us);
				
				//System.out.println(ps);
				/*Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
				Statement st = con.createStatement();
				
				String sql2 = "select * from signup where email_id=? and recover_id=?";
				
				
				
				    ResultSet rs = st.executeQuery(sql2);*/
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");

				    String sql2 = "SELECT * FROM signup WHERE email_id=? AND recover_id=?";
		            PreparedStatement pstmtSelect = con.prepareStatement(sql2);
		            pstmtSelect.setString(1, us1);
		            pstmtSelect.setString(2, us2);

		            ResultSet rs = pstmtSelect.executeQuery();
		            if (rs.next()) {
		                String sql1 = "UPDATE signup SET password1=? WHERE email_id=? AND recover_id=?";
		                PreparedStatement pstmtUpdate = con.prepareStatement(sql1);
		                pstmtUpdate.setString(1, ps1);
		                pstmtUpdate.setString(2, us1);
		                pstmtUpdate.setString(3, us2);

		                pstmtUpdate.executeUpdate();
		                JOptionPane.showMessageDialog(null, "Successful");
		                setVisible(false);
		                login frame = new login();
		                frame.setVisible(true);
		                pstmtUpdate.close();
		            } else {
		                JOptionPane.showMessageDialog(null, "No matching records found", "Error", JOptionPane.ERROR_MESSAGE);
		            }
			    /*if(rowsInserted>0)
			    {
			    	JOptionPane.showMessageDialog(null,"successfull");
			    }*/
			    
			}
			catch(Exception o) {
				JOptionPane.showMessageDialog(null,o);
			}
				
				/*try {
					String us = user.getText();
					String ps = pass.getText();
					System.out.println(us);
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println(ps);
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					System.out.println("1");
					Statement st = con.createStatement();
					System.out.println("1");
					String sql = "Select * from access";
					System.out.println("1");
					ResultSet rs = st.executeQuery(sql);
					System.out.println("1");
					while(rs.next()){
					String username = rs.getString("username");
					System.out.println("1-");
					String password = rs.getString("password");
					System.out.println("1-");

					if(us.equals(username) && ps.equals(password)){
					new login().setVisible(true);
					System.out.println("true");
					SwingUtilities.windowForComponent(btnNewButton).dispose();
					}
					else{
					user.setText("");
					pass.setText("");
					System.out.println("false");
					continue;
					}

					login frame = new login();
					frame.setVisible(true);
				}*/
				
			}
		});
		contentPane.add(btnNewButton);
		
		pass1 = new JPasswordField();
		pass1.setBounds(823, 327, 210, 31);
		pass1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(pass1);
		
		user1 = new JTextField();
		user1.setBounds(823, 166, 200, 31);
		user1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(user1);
		user1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		lblNewLabel_4.setBounds(572, 410, 241, 32);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_4);
		
		
		
		user2 = new JTextField();
		user2.setBounds(823, 239, 200, 31);
		user2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(user2);
		user2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.setBounds(1076, 330, 169, 31);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					pass1.setEchoChar((char)0);
				}
				else {
					pass1.setEchoChar('*');
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Show Password");
		rdbtnNewRadioButton_1.setBounds(1072, 412, 173, 33);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					 pass2.setEchoChar((char)0);
				}
				else {
					pass2.setEchoChar('*');
				}
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(rdbtnNewRadioButton_1);
		
		pass2 = new JPasswordField();
		pass2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass2.setBounds(823, 412, 200, 30);
		contentPane.add(pass2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-email.gif"));
		lblNewLabel_6.setBounds(451, 231, 60, 44);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\pass.png"));
		lblNewLabel_6_1.setBounds(451, 405, 60, 54);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("");
		lblNewLabel_16_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-password.gif"));
		lblNewLabel_16_1.setBounds(451, 310, 60, 68);
		contentPane.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp23.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_7);
	}
}
