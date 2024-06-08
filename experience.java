package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class experience extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					experience frame = new experience();
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
	public experience() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXPERIENCE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(608, 35, 315, 40);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Works of Experience(Past)");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(382, 127, 347, 34);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Works of Experience(Current)");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(382, 200, 383, 34);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Conference");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(382, 273, 246, 34);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Skill Set");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(382, 344, 246, 34);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(799, 127, 397, 34);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(799, 200, 397, 34);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(799, 273, 397, 34);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBounds(690, 570, 132, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pas_exp=textField.getText();
				String curr_exp=textField_1.getText();
			   String confer=textField_2.getText();
			   String skill=textField_4.getText();
			String onsite=(String)comboBox.getSelectedItem();
			String id=textField_3.getText();
			
			System.out.print(onsite);
			
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    String query = "INSERT INTO experience VALUES (?, ?, ?, ?,?,?)";
				    PreparedStatement pst = con.prepareStatement(query);
				    pst.setString(1,pas_exp );
				    pst.setString(2, curr_exp );
				    pst.setString(3, confer);
				    pst.setString(4, skill);
				    pst.setString(5, onsite);
				    pst.setString(6, id);
				    if (pas_exp.isEmpty() ||  curr_exp.isEmpty() || confer.isEmpty() || skill.isEmpty() || onsite.isEmpty()||  id.isEmpty()) {
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		textField_4 = new JTextField();
		textField_4.setBounds(799, 344, 397, 34);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Onsite Experience");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(382, 405, 246, 34);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_5);
		
	    comboBox = new JComboBox();
	    comboBox.setBounds(799, 409, 80, 34);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"YES", "NO"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Employee ID");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(383, 478, 269, 31);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(799, 475, 397, 34);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("EDIT");
		btnNewButton_1.setBounds(434, 570, 114, 34);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pas_exp=textField.getText();
				String curr_exp=textField_1.getText();
			   String confer=textField_2.getText();
			   String skill=textField_4.getText();
			String onsite=(String)comboBox.getSelectedItem();
			String id=textField_3.getText();
			
			System.out.print(onsite);
			
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					 PreparedStatement pst = con.prepareStatement("update experience set Past_Experience=?,Current_Experience=?,Conference=?,Skill_set=?,Onsite=? where emp_id=?");
					    pst.setString(1,pas_exp );
					    pst.setString(2, curr_exp );
					    pst.setString(3, confer);
					    pst.setString(4, skill);
					    pst.setString(5, onsite);
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
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setBounds(937, 570, 143, 34);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
             String id=textField_3.getText();
				
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    PreparedStatement pst = con.prepareStatement("delete from experience where emp_id =?");
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
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\pr2.jpg"));
		lblNewLabel_7.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_7);
	}
}
