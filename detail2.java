package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class detail2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_3;
	private JLabel lblNewLabel_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detail2 frame = new detail2();
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
	public detail2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_4 = new JLabel("FIRST NAME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(533, 342, 147, 33);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_1 = new JLabel("EMPLOYEE INFORMATION");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel_1.setBounds(569, 49, 602, 43);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(782, 285, 421, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setBounds(786, 663, 421, 33);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setBounds(786, 535, 423, 33);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setBounds(788, 732, 421, 33);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setBounds(786, 600, 423, 33);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(786, 475, 421, 33);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(782, 346, 421, 33);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(672, 206, 330, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-search (1).gif"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Suba@3107");
					
				   Statement st=con.createStatement();
					String sql="select * from employee where Emp_id=?";
					
					PreparedStatement pts=con.prepareStatement(sql);
					pts.setString(1,textField.getText());
					ResultSet rs= pts.executeQuery();
					
					
					while(rs.next()) {
					
				   
					String fv=rs.getString("Emp_id");
					String vv=rs.getString("First_name");
					String kv=rs.getString("Last_name");
					String fs=rs.getString("location");
					String vs=rs.getString("Contact");
					String ks=rs.getString("Qualification");
					String vp=rs.getString("Job_status");
					String kt=rs.getString("Salaray");
					//String pvr=rs.getString("firstname");
					
					textField_1.setText(fv);
					textField_2.setText(vv);
					textField_3.setText(kv);
					textField_4.setText(fs);
					textField_5.setText(vs);
					textField_6.setText(ks);
					textField_7.setText(vp);
					textField_8.setText(kt);
					
					//textField_3.setText(pvr);
					
					
					
					
					
					}
			}
				catch(Exception ec) {
					JOptionPane.showMessageDialog(null,"it has not been registered");
					ec.printStackTrace();
				}
			}
		
				});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1.setBounds(1030, 206, 35, 33);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				userpage frame = new userpage();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_2.setBounds(456, 124, 99, 33);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel = new JLabel("EMPLOYEE ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(453, 206, 181, 33);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_3 = new JLabel("EMPLOYEE ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(533, 281, 147, 33);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("LAST NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(533, 408, 151, 37);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_5 = new JLabel("LOCATION");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(533, 469, 147, 37);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("CONTACT");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(533, 535, 137, 37);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("QUALIFICATION");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(533, 600, 171, 33);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("JOB STATUS");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(533, 663, 162, 33);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("SALARY");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(533, 728, 152, 33);
		contentPane.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(785, 414, 421, 33);
		contentPane.add(textField_3);
		
		lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp18.jpg"));
		lblNewLabel_10.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_10);
	}
}
