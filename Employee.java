package Employee;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Employee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.setBounds(526, 647, 95, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField_7.getText();
				String fname=textField.getText();
				String lname=textField_1.getText();
			   String location=textField_2.getText();
			String contact=textField_3.getText();
			String quali=textField_4.getText();
			String job=textField_5.getText();
				String salary=textField_6.getText();
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    
				   
				    PreparedStatement pst = con.prepareStatement("update employee set First_name=?,Last_name=?,location=?,Contact=?,Qualification=?,Job_status=?,Salaray=? where emp_id=?");
				
				    pst.setString(1, fname);
				    pst.setString(2, lname);
				    pst.setString(3, location);
				    pst.setString(4, contact);
				    pst.setString(5, quali);
				    pst.setString(6, job);
				    pst.setString(7, salary);
				    pst.setString(8, id);
				    
				    
				   
				    
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
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(727, 647, 95, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField_7.getText();
				String fname=textField.getText();
				String lname=textField_1.getText();
			   String location=textField_2.getText();
			String contact=textField_3.getText();
			String quali=textField_4.getText();
			String job=textField_5.getText();
				String salary=textField_6.getText();
				
				try {
			        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");

			        // Insert into the employee table
			        String query1 = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			        PreparedStatement pst1 = con.prepareStatement(query1);
			        pst1.setString(1, id);
			        pst1.setString(2, fname);
			        pst1.setString(3, lname);
			        pst1.setString(4, location);
			        pst1.setString(5, contact);
			        pst1.setString(6, quali);
			        pst1.setString(7, job);
			        pst1.setString(8, salary);
			        if (id.isEmpty() ||fname.isEmpty() || lname.isEmpty() || location.isEmpty() || contact.isEmpty() || quali.isEmpty() || job.isEmpty() || salary.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "All fields are required", "Error", JOptionPane.ERROR_MESSAGE);
			            return; // Stop further execution
			        }


			        int rowsAffected1 = pst1.executeUpdate();

			        // Insert default leave values into the leave1 table
			        String query2 = "INSERT INTO leave1 (medical,casual,annual,id) VALUES (20, 20, 20, ?)";
			        PreparedStatement pst2 = con.prepareStatement(query2);
			        pst2.setString(1, id);

			        int rowsAffected2 = pst2.executeUpdate();

			        if (rowsAffected1 > 0 && rowsAffected2 > 0) {
			            JOptionPane.showMessageDialog(null, "Successfully Inserted");
			            setVisible(false);
			            new access().setVisible(true);
			        } else {
			            JOptionPane.showMessageDialog(null, "Failed to Insert");
			        }

			        pst1.close();
			        pst2.close();
			        con.close();
			    } catch (SQLException e1) {
			        e1.printStackTrace();
			        JOptionPane.showMessageDialog(null, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
			    }
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(939, 647, 114, 34);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField_7.getText();
				
				try {
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Suba@3107");
					
				    PreparedStatement pst = con.prepareStatement("delete from employee where emp_id =?");
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
		btnNewButton_2.setBackground(new Color(211, 211, 211));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Employee Information System");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(472, 10, 703, 70);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		
		JLabel lblNewLabel_8 = new JLabel("Employee ID");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(506, 114, 163, 25);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(507, 173, 142, 25);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(507, 229, 142, 38);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_3 = new JLabel("Location");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(507, 300, 114, 25);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_4 = new JLabel("Contact");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(506, 370, 114, 25);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_7 = new JLabel("Qualification");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(506, 432, 177, 25);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_5 = new JLabel("Job Status");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(506, 502, 143, 25);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_6 = new JLabel("Annual Salary");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(511, 561, 224, 38);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		textField_7 = new JTextField();
		textField_7.setBounds(803, 113, 306, 30);
		contentPane.add(textField_7);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(803, 170, 306, 34);
		contentPane.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(803, 233, 306, 34);
		contentPane.add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(803, 299, 306, 30);
		contentPane.add(textField_2);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(803, 369, 306, 30);
		contentPane.add(textField_3);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(803, 431, 306, 30);
		contentPane.add(textField_4);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(803, 501, 306, 30);
		contentPane.add(textField_5);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(803, 566, 306, 33);
		contentPane.add(textField_6);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\pr2.jpg"));
		lblNewLabel_9.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_9);
	}
}
