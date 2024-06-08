package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class access extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					access frame = new access();
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
	public access() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INFORMATION PORTAL");
		lblNewLabel.setBounds(594, 29, 548, 42);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-experience.gif"));
		btnNewButton_1.setBounds(738, 203, 121, 90);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				experience frame = new experience();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-win.gif"));
		btnNewButton_2.setBounds(1122, 203, 121, 90);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Achievements frame = new Achievements();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-projects-80.png"));
		btnNewButton_3.setBounds(528, 441, 121, 90);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Projects frame = new Projects();
				frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-home.gif"));
		btnNewButton_4.setBounds(951, 441, 121, 86);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frontpage frame = new frontpage();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-details (1).gif"));
		btnNewButton.setBounds(316, 203, 121, 94);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Employee frame = new Employee();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("DETAILS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setBounds(294, 322, 167, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("EXPERIENCE");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_1.setBounds(695, 322, 237, 32);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("ACHIEVEMENTS");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_2.setBounds(1079, 322, 289, 32);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("PROJECTS");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_3.setBounds(500, 561, 226, 32);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("HOME");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2_4.setBounds(951, 561, 167, 32);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\rhino-choco-XKXGghL7GQc-unsplash (2).jpg"));
		lblNewLabel_1.setBounds(0, 0, 1900, 1900);
		contentPane.add(lblNewLabel_1);
	}
}
