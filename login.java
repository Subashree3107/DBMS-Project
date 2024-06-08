package Employee;

import java.awt.EventQueue;
import java.sql.*;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JLabel error;
	private JTextField textField;
	JLabel cap;
	String captcha ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
	public static String create() {
        Random rand = new Random();
        int length = 7 + (Math.abs(rand.nextInt()) % 3); // Fixed typo random -> rand, added closing parenthesis for Math.abs
        StringBuffer captcha = new StringBuffer(); // Fixed typo capt -> captcha
        for (int i = 0; i < length; i++) {
            int base = Math.abs(rand.nextInt()) % 62; // Fixed typo random -> rand
            int charNumber = 0; // Fixed typo charn -> charNumber
            char charN; // Added missing variable declaration char charN
            if (base < 26) {
                charN = (char) (65 + base); // Fixed typo char -> charN
            } else if (base < 52) {
                charN = (char) (97 + (base - 26)); // Fixed typo char -> charN, added missing parenthesis
            } else {
                charN = (char) (48 + (base - 52)); // Fixed typo char -> charN, changed -- to -
            }
            captcha.append(charN); // Fixed typo capatacha -> captcha, char -> charN
        }
        return captcha.toString(); // Fixed typo capatacha -> captcha
    }

	/**  
	 *    
	 * Create the frame.
	 */
	public login() {
	     cap= new JLabel(); // Initialize l0 before setting its text
		
	    captcha = create();
	    cap.setText(captcha);
		//String captcha = create();
		
		//l0.setText(captcha);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		 
		 JButton btnNewButton_2 = new JButton("");
		 btnNewButton_2.setBounds(1106, 416, 37, 32);
		 btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\cap2.gif"));
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		captcha = create();
		 	    cap.setText(captcha);
		 	}
		 });
		 contentPane.setLayout(null);
		 contentPane.add(btnNewButton_2);
		
		 cap = new JLabel("");
		 cap.setBounds(1153, 423, 117, 25);
		contentPane.add(cap);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(835, 416, 237, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CAPTCHA");
		lblNewLabel_4.setBounds(612, 423, 126, 25);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setBounds(724, 121, 315, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(601, 235, 190, 39);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(601, 321, 137, 34);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		user = new JTextField();
		user.setBounds(835, 242, 237, 25);
		user.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pass.setBounds(835, 332, 237, 25);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(854, 486, 102, 38);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				    int er=0;
				    String c=textField.getText();
					String us = user.getText();
					String ps = pass.getText();
					if (us.isEmpty() || ps.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Username and password must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }if (!c.equals(captcha)) { // Compare entered captcha with generated one
				        textField.setText(""); 
				       // ll.setText("invalid captcha");
				        JOptionPane.showMessageDialog(null, "Invalid captcha. Please try again."); 
				       // ll.setText("");
				    } else {
					System.out.println(us);
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println(ps);
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					System.out.println("1");
					Statement st = con.createStatement();
					System.out.println("1");
					String sql = "Select user_name,password1 from signup";
					System.out.println("1");
					ResultSet rs = st.executeQuery(sql);
					System.out.println("1");
					while(rs.next()){
					String username = rs.getString("user_name");
					System.out.println("1-");
					String password = rs.getString("password1");
					System.out.println("1-");
					if(us.equals("suaru")&&ps.equals("Suba@3107")) {
						setVisible(false);
						manager frame = new manager();
						frame.setVisible(true);
					SwingUtilities.windowForComponent(btnNewButton).dispose();
						
					}

					else if(us.equals(username) && ps.equals(password)){
						setVisible(false);
						userpage frame = new userpage();
						frame.setVisible(true);
					SwingUtilities.windowForComponent(btnNewButton).dispose();
					er=0;
					}
					else{
					user.setText("");
					pass.setText("");
					System.out.println("false");
					er=1;
					}
					
					
				}
					if(er==1)
					{
						error.setVisible(true);
						error.setText("Invalid Username or Password");
					}
					}}
				catch(Exception o) {
					JOptionPane.showMessageDialog(null,o);
				}
				
			/*	try {
				    String us = user.getText();
				    String ps = new String(pass.getPassword()); // Use getPassword() for JPasswordField
				    System.out.println("User: " + us);
				    System.out.println("Pass: " + ps);
				    
				    Class.forName("com.mysql.cj.jdbc.Driver");
				    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");
				    String sql = "SELECT user_name, password1 FROM signup WHERE user_name = ? AND password1 = ?";
				    
				    PreparedStatement pstmt = con.prepareStatement(sql);
				    pstmt.setString(1, us);
				    pstmt.setString(2, ps);
				    
				    ResultSet rs = pstmt.executeQuery(); // Use executeQuery() for SELECT queries
				    
				    int rowsAffected = 0;
				    while (rs.next()) {
				        rowsAffected++;
				    }
				    
				    if (rowsAffected > 0) {
				    
				        setVisible(false);
				        new userpage().setVisible(true);
				    } else {
				        System.out.println("Invalid username or password");
				    }
				    
				    rs.close();
				    pstmt.close();
				    con.close();
				} catch (Exception o) {
				    JOptionPane.showMessageDialog(null, o);
				}*/

			

				/*String us = user.getText();
				String ps = pass.getText();
				try {
				    Connection con = ConnectionProvider.getCon();
				    PreparedStatement pst = con.prepareStatement("select * from login where user =? and pass=?");
				    pst.setString(1, us);
				    pst.setString(2, ps);
				   
				    
				    int rowsAffected = pst.executeUpdate();
				    if (rowsAffected > 0) {
				        
				        setVisible(false);
				        new Employee().setVisible(true);
				    } else {
				        JOptionPane.showMessageDialog(null, "Failed to Delete");
				    }
				    
				    pst.close();
				    con.close();
				} catch (SQLException e1) {
				    e1.printStackTrace();
				    // Handle any SQL errors
				}*/

			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(617, 486, 137, 39);
		btnNewButton_1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				try {/*
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
					new Reset().setVisible(true);
					System.out.println("true");
					SwingUtilities.windowForComponent(btnNewButton).dispose();
					}
					else{
					user.setText("");
					pass.setText("");
					System.out.println("false");
					continue;
					}
					*/
					Reset frame = new Reset();
					frame.setVisible(true);
				}
				catch(Exception o) {
					JOptionPane.showMessageDialog(btnNewButton, this, "Error while establishing connection failed", 0);
				}
			
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 22));
		contentPane.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show password");
		rdbtnNewRadioButton.setBounds(1122, 329, 174, 25);
		rdbtnNewRadioButton.setForeground(new Color(218, 112, 214));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					pass.setEchoChar((char)0);
				}
				else {
					pass.setEchoChar('*');
				}
			}
			
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(rdbtnNewRadioButton);
		
		 error = new JLabel("");
		 error.setBounds(835, 416, 237, 25);
		 error.setForeground(new Color(255, 0, 0));
		contentPane.add(error);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-user.gif"));
		lblNewLabel_5.setBounds(531, 226, 73, 66);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-password.gif"));
		lblNewLabel_6.setBounds(534, 323, 57, 49);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-captcha-40.png"));
		lblNewLabel_3.setBounds(534, 420, 46, 39);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\login1.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_7);
	}
}
