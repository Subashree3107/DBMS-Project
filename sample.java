package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class sample extends JFrame {

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
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample frame = new sample();
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
	public sample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROJECTS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(676, 42, 422, 49);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(569, 119, 344, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE ID");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(345, 119, 188, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setForeground(new Color(153, 51, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				userpage frame = new userpage();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(342, 53, 142, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-search (1).gif"));
		btnNewButton_1.setForeground(new Color(153, 51, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Suba@3107");
					
				   Statement st=con.createStatement();
					String sql="select * from project where emp_id=?";
					
					
					PreparedStatement pts=con.prepareStatement(sql);
					pts.setString(1,textField.getText());
					ResultSet rs= pts.executeQuery();
					
					while(rs.next()) {
					
				     /*Object o[]= {rs.getString("worked_projects")};
					dt.addRow( o);
					Object b[]= {rs.getString("current_project")};
					dt.addRow( b);
					Object c[]= {rs.getString("Domain")};
					dt.addRow( c);
					Object d[]= {rs.getString("Time_duration")};
					dt.addRow( d);
					Object e1[]= {rs.getString("Lead_Name")};
					dt.addRow( e1);
					Object f[]= {rs.getString("Team Lead")};
					dt.addRow( f);
					Object g[]= {rs.getString("emp_id")};
				
					dt.addRow( g);*/
					String fv=rs.getString("worked_projects");
					String vv=rs.getString("current_project");
					String kv=rs.getString("Domain");
					String fs=rs.getString("Time_duration");
					
					String ks=rs.getString("Lead_Name");
                    String fp =rs.getString("TeamLead");
					String ku=rs.getString("emp_id");
					
					
					
					
					textField_1.setText(fv);
					textField_2.setText(vv);
					textField_3.setText(kv);
					textField_4.setText(fs);
					
					textField_5.setText(ks);
                    textField_6.setText(fp);
					
					textField_7.setText(ku);
					
					
					
					
					
					}
			}
				catch(Exception ec) {
					JOptionPane.showMessageDialog(null,"it has not been registered");
					ec.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBounds(947, 124, 35, 32);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(769, 631, 482, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(769, 359, 482, 44);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(769, 428, 482, 43);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(769, 497, 482, 43);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setBounds(769, 567, 482, 43);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(769, 288, 482, 43);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setBounds(769, 214, 482, 43);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_2 = new JLabel("PROJECTS WORKED ON");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(345, 288, 344, 43);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("CURRENT PROJECT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(345, 360, 344, 43);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("DOMAIN");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(345, 428, 344, 43);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("TIME DURATION");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setBounds(345, 497, 344, 43);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("MANAGER NAME");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(345, 567, 344, 43);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("ARE YOU A TEAM LEAD");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setBounds(345, 631, 344, 43);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("EMPLOYEE ID");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setBounds(345, 214, 344, 43);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp18.jpg"));
		lblNewLabel_9.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_9);
	}
}
