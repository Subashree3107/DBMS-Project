package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Achievements extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achievements frame = new Achievements();
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
	public Achievements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACHIEVEMENTS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(673, 67, 366, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Awards");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(539, 169, 158, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Certifications");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(539, 249, 175, 25);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Credits Earned");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(539, 321, 188, 25);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Employee of the month");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(539, 399, 291, 25);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(849, 157, 377, 37);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(849, 235, 377, 37);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(849, 309, 377, 37);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.setBounds(805, 571, 138, 37);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String awards=textField.getText();
				String certification=textField_1.getText();
			   String credits=textField_2.getText();
			String emp=(String)comboBox.getSelectedItem();
			String id=textField_3.getText();
			System.out.print(emp);
			
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    String query = "INSERT INTO achieve1 VALUES (?, ?, ?, ?,?)";
				    PreparedStatement pst = con.prepareStatement(query);
				    pst.setString(1, awards);
				    pst.setString(2, certification);
				    pst.setString(3, credits);
				    pst.setString(4, emp);
				    pst.setString(5, id);
				    if (awards.isEmpty() ||  certification.isEmpty() || credits.isEmpty() || emp.isEmpty() ||  id.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
			            return; // Stop further execution
			        }

				    
				   
				    
				    int rowsAffected = pst.executeUpdate();
				    if (rowsAffected > 0) {
				        JOptionPane.showMessageDialog(null, "Successfully Inserted");
				        setVisible(false);
				        new access().setVisible(true);
				    } else {
				        JOptionPane.showMessageDialog(null, "Failed to Insert");
				    }
				    
				    pst.close();
				    con.close();
				} catch (SQLException e1) {
				    e1.printStackTrace();
				    // Handle any SQL errors
				}

				
			}

			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(848, 386, 79, 37);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"YES", "NO"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Employee ID");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(539, 478, 236, 25);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(849, 462, 377, 41);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("EDIT");
		btnNewButton.setBounds(580, 572, 105, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String awards=textField.getText();
				String certification=textField_1.getText();
			   String credits=textField_2.getText();
			String emp=(String)comboBox.getSelectedItem();
			String id=textField_3.getText();
			System.out.print(emp);
			
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					PreparedStatement pst = con.prepareStatement("update achieve1 set awards=?,certifications=?,credits=?,emp_of_month=? where emp_id=?");
					    pst.setString(1, awards);
					    pst.setString(2, certification);
					    pst.setString(3, credits);
					    pst.setString(4, emp);
					    pst.setString(5, id);
					    int rowsAffected = pst.executeUpdate();
					    if (rowsAffected > 0) {
					        JOptionPane.showMessageDialog(null, "Successfully updated");
					        setVisible(false);
					        
					    } else {
					        JOptionPane.showMessageDialog(null, "Failed to update");
					    }
					    
					    pst.close();
					    con.close();
					} catch (SQLException e1) {
					    e1.printStackTrace();
					    // Handle any SQL errors
					}

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setBounds(1040, 571, 138, 37);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               String id=textField_3.getText();
				
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    PreparedStatement pst = con.prepareStatement("delete from achieve1 where emp_id =?");
				    pst.setString(1, id);
				   
				    
				    int rowsAffected = pst.executeUpdate();
				    if (rowsAffected > 0) {
				        JOptionPane.showMessageDialog(null, "Successfully Deleted");
				        setVisible(false);
				        
				    } else {
				        JOptionPane.showMessageDialog(null, "Failed to Delete");
				    }
				    
				    pst.close();
				    con.close();
				} catch (SQLException e1) {
				    e1.printStackTrace();
				    // Handle any SQL errors
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\pr2.jpg"));
		lblNewLabel_6.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_6);
	}
}
