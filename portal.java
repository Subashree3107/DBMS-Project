package Employee;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class portal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField pass1;
	private JPasswordField pass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					portal frame = new portal();
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
	public portal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_16_1 = new JLabel("New label");
		lblNewLabel_16_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-password.gif"));
		lblNewLabel_16_1.setBounds(354, 521, 48, 68);
		contentPane.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-password.gif"));
		lblNewLabel_16.setBounds(354, 452, 48, 68);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-email (1).gif"));
		lblNewLabel_15.setBounds(354, 404, 48, 43);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-email (1).gif"));
		lblNewLabel_14.setBounds(354, 348, 48, 43);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\name.gif"));
		lblNewLabel_11.setBounds(354, 223, 48, 43);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-phone-number.gif"));
		lblNewLabel_13.setBounds(354, 291, 48, 43);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\name.gif"));
		lblNewLabel_10.setBounds(354, 156, 51, 50);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\name.gif"));
		lblNewLabel_9.setBounds(354, 91, 48, 63);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(656, 29, 200, 50);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBackground(SystemColor.text);
		lblNewLabel_1.setBounds(430, 107, 230, 30);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setBounds(430, 171, 230, 30);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("User Name");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setBounds(430, 236, 230, 30);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email ID");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setBounds(430, 350, 230, 30);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Confirm Password");
		lblNewLabel_5.setBounds(430, 538, 230, 30);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setForeground(SystemColor.text);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone Number");
		lblNewLabel_6.setForeground(SystemColor.text);
		lblNewLabel_6.setBounds(430, 291, 230, 30);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_6);
		
		JLabel pass = new JLabel("Password");
		pass.setForeground(SystemColor.text);
		pass.setBounds(430, 465, 230, 30);
		pass.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(pass);
		
		JLabel lblNewLabel_8 = new JLabel("Recovery ID");
		lblNewLabel_8.setForeground(SystemColor.text);
		lblNewLabel_8.setBounds(430, 404, 230, 30);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(708, 109, 485, 30);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(708, 170, 485, 36);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(708, 235, 485, 36);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(708, 290, 485, 36);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(708, 349, 485, 36);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(708, 403, 485, 36);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		pass1 = new JPasswordField();
		pass1.setBounds(708, 465, 332, 30);
		pass1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(pass1);
	

		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBounds(700, 619, 137, 36);
		btnNewButton.addActionListener(new ActionListener() {
			/*public void actionPerformed(ActionEvent e) {
				
				try {
				    String fn = textField.getText();
				    String ln = textField_1.getText();
				    String us = textField_2.getText();
				    String pn = textField_3.getText();
				    String ei = textField_4.getText();
				    String ri = textField_5.getText();
				    String ps = new String(pass1.getPassword());
				    String ps1 = new String(pass2.getPassword());
				     
				    if(ps!=ps1) {
				    	JOptionPane.showMessageDialog(null, "Password does not match ", "Invalid invalid password", JOptionPane.ERROR_MESSAGE);
				        return; // Stop further execution
				    }
				    if(pn.matches(ps1))
				    	JOptionPane.showMessageDialog(null,"submitted sucessfully");
			            new access().setVisible(true);
				    	
				    
				    
				    if (pn.length() > 10) {
				        JOptionPane.showMessageDialog(null, "Phone number should not exceed 10 digits", "Invalid Phone Number", JOptionPane.ERROR_MESSAGE);
				        return; // Stop further execution
				    }
				  
				    
				    
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");

				    String sql = "INSERT INTO signup (first_name, last_name, user_name, phone_no, email_id, recover_id, password1) VALUES (?, ?, ?, ?, ?, ?, ?)";
				    PreparedStatement pstmt = con.prepareStatement(sql);
				    pstmt.setString(1, fn);
				    pstmt.setString(2, ln);
				    pstmt.setString(3, us);
				    pstmt.setString(4, pn);
				    pstmt.setString(5, ei);
				    pstmt.setString(6, ri);
				    pstmt.setString(7, ps);
				    
				    
				    int rowsInserted = pstmt.executeUpdate();
				    if (rowsInserted > 0) {
				        System.out.println("A new user was inserted successfully!");
				        JOptionPane.showMessageDialog(null,"submitted sucessfully");
				        new access().setVisible(true);
				    }
				    con.close();
				} catch (Exception e1) {
				    e1.printStackTrace();
				    JOptionPane.showMessageDialog(btnNewButton, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}*/
			public void actionPerformed(ActionEvent e) {
			    try {
			        String fn = textField.getText();
			        String ln = textField_1.getText();
			        String us = textField_2.getText();
			        String pn = textField_3.getText();
			        String ei = textField_4.getText();
			        String ri = textField_5.getText();
			        String ps = new String(pass1.getPassword());
			        String ps1 = new String(pass2.getPassword());
			        
			        if (fn.isEmpty() || ln.isEmpty() || us.isEmpty() || pn.isEmpty() || ei.isEmpty() || ri.isEmpty() || ps.isEmpty() || ps1.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
			            return; // Stop further execution
			        }

			        
			        if ((!ps.equals(ps1) || !isValidPassword(ps)) || (pn.length() != 10 || !pn.matches("\\d+"))) {
			            String errorMessage = "";
			            if (!ps.equals(ps1)) {
			                errorMessage += "Invalid Password. Password does not match.\n";
			            }

			            

			            if (!isValidPassword(ps)) {
			                errorMessage += "Invalid Password. Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character.\n";
			            }

			            if (pn.length() != 10 || !pn.matches("\\d+")) {
			                errorMessage += "Invalid Phone Number. Phone number must be exactly 10 digits and contain only numbers";
			            }

			            JOptionPane.showMessageDialog(null, errorMessage, "Invalid Input", JOptionPane.ERROR_MESSAGE);
			            return; // Stop further execution
			        }


			        // Proceed with database insertion if all validations pass
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");

			        String sql = "INSERT INTO signup (first_name, last_name, user_name, phone_no, email_id, recover_id, password1) VALUES (?, ?, ?, ?, ?, ?, ?)";
			        PreparedStatement pstmt = con.prepareStatement(sql);
			        pstmt.setString(1, fn);
			        pstmt.setString(2, ln);
			        pstmt.setString(3, us);
			        pstmt.setString(4, pn);
			        pstmt.setString(5, ei);
			        pstmt.setString(6, ri);
			        pstmt.setString(7, ps);

			        int rowsInserted = pstmt.executeUpdate();
			        if (rowsInserted > 0) {
			            System.out.println("A new user was inserted successfully!");
			            JOptionPane.showMessageDialog(null, "Submitted successfully");
			            setVisible(false);
			            new access().setVisible(true);
			        }
			        con.close();
			    } catch (Exception e1) {
			        e1.printStackTrace();
			        JOptionPane.showMessageDialog(btnNewButton, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
			    }
			}

			// Method to check password validity
			public boolean isValidPassword(String password) {
			    // Password must be at least 8 characters long
			    if (password.length() < 8) return false;

			    // Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character
			    boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
			    for (char c : password.toCharArray()) {
			        if (Character.isUpperCase(c)) hasUpper = true;
			        if (Character.isLowerCase(c)) hasLower = true;
			        if (Character.isDigit(c)) hasDigit = true;
			        if (!Character.isLetterOrDigit(c)) hasSpecial = true;
			    }
			    return hasUpper && hasLower && hasDigit && hasSpecial;
			}


			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.setBounds(1091, 471, 153, 23);
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
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Show Password");
		rdbtnNewRadioButton_1.setBounds(1091, 547, 153, 21);
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
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(rdbtnNewRadioButton_1);
		
		pass2 = new JPasswordField();
		pass2.setBounds(708, 538, 325, 30);
		pass2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(pass2);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-phone-number.gif"));
		lblNewLabel_12.setBounds(354, 287, 48, 43);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp8.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_7);
		
	}
}
