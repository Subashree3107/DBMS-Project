package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Projects extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JTextField textField_5;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projects frame = new Projects();
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
	public Projects() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROJECTS");
		lblNewLabel.setBackground(new Color(64, 0, 64));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(670, 46, 253, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Projects Worked On");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(533, 124, 253, 35);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Current Project");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(533, 197, 240, 27);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Domain");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(533, 265, 240, 22);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Time Duration");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(533, 334, 240, 27);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Manager Name");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(533, 394, 240, 27);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Are You A Lead");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(533, 466, 240, 35);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(821, 126, 368, 35);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(821, 195, 368, 35);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(821, 265, 368, 35);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(821, 332, 368, 35);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(821, 392, 368, 35);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(821, 467, 78, 35);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"YES", "NO"}));
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBounds(803, 631, 120, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pas_pro=textField.getText();
				String curr_pro=textField_1.getText();
			   String domain=textField_2.getText();
			   String time=textField_3.getText();
			   String lead=textField_4.getText();
			String team=(String)comboBox.getSelectedItem();
			String id=textField_5.getText();
			System.out.print(team);
			  if (pas_pro.isEmpty() ||curr_pro.isEmpty() ||  domain.isEmpty() || time.isEmpty() || lead.isEmpty() || team.isEmpty() || id.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
		            return; // Stop further execution
		        }

			
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    String query = "INSERT INTO project VALUES (?, ?, ?, ?,?,?,?)";
				    PreparedStatement pst = con.prepareStatement(query);
				    pst.setString(1, pas_pro);
				    pst.setString(2, curr_pro);
				    pst.setString(3, domain);
				    pst.setString(4, time);
				    pst.setString(5, lead);
				    pst.setString(6, team);
				    pst.setString(7, id);
				    
				   
				    
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Emloyee ID");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(533, 533, 240, 27);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(821, 531, 373, 35);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("EDIT");
		btnNewButton_1.setBounds(569, 631, 101, 35);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pas_pro=textField.getText();
				String curr_pro=textField_1.getText();
			   String domain=textField_2.getText();
			   String time=textField_3.getText();
			   String lead=textField_4.getText();
	          String id=textField_5.getText();
			
			
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					PreparedStatement pst = con.prepareStatement("update project set worked_projects=?,current_project=?,Domain=?,Time_duration=?,Lead_Name=? where emp_id=?");
					    pst.setString(1, pas_pro);
					    pst.setString(2, curr_pro);
					    pst.setString(3, domain);
					    pst.setString(4, time);
					    pst.setString(5, lead);
					     pst.setString(6, id);  
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
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setBounds(1035, 631, 140, 35);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String id=textField_5.getText();
					
					try {
						Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
						
					    PreparedStatement pst = con.prepareStatement("delete from project where emp_id =?");
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
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBackground(new Color(0, 0, 0));
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\pr2.jpg"));
		lblNewLabel_8.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_8);
	}

}
