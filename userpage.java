package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;

public class userpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userpage frame = new userpage();
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
	public userpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REVIEW SECTION");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(610, 63, 407, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-info.gif"));
		btnNewButton.setBounds(174, 189, 102, 98);
		btnNewButton.setForeground(new Color(148, 0, 211));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				detail2 frame = new detail2();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-talent.gif"));
		btnNewButton_1.setBounds(543, 189, 102, 98);
		btnNewButton_1.setForeground(new Color(148, 0, 211));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Detail3 frame = new Detail3();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-win (1).gif"));
		btnNewButton_2.setBounds(882, 189, 102, 98);
		btnNewButton_2.setForeground(new Color(148, 0, 211));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detail4 frame = new detail4();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-assignment.gif"));
		btnNewButton_3.setBounds(1208, 189, 102, 98);
		btnNewButton_3.setForeground(new Color(148, 0, 211));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				sample frame = new sample();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-home (1).gif"));
		btnNewButton_4.setBounds(37, 20, 57, 57);
		btnNewButton_4.setForeground(new Color(148, 0, 211));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frontpage frame = new frontpage();
				frame.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-money.gif"));
		btnNewButton_5.setBounds(187, 461, 102, 98);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SAL frame = new SAL();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-stocks-growth.gif"));
		btnNewButton_6.setBounds(543, 461, 102, 98);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				hike frame = new hike();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("");
		btnNewButton_6_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-airplane-take-off.gif"));
		btnNewButton_6_1.setBounds(888, 465, 108, 94);
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				 leave frame = new leave();
                 frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-update.gif"));
		btnNewButton_7.setBounds(1202, 465, 108, 94);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				access frame = new access();
				frame.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("DETAILS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(155, 311, 203, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("HIKE");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(554, 584, 108, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ACHIEVEMENTS");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_2.setBounds(805, 311, 300, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("PROJECTS");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_3.setBounds(1172, 311, 203, 38);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("SALARY");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_4.setBounds(174, 584, 203, 38);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("EXPERIENCE");
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_5.setBounds(482, 311, 250, 38);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("LEAVE");
		lblNewLabel_1_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_6.setBounds(882, 584, 203, 38);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("UPDATE");
		lblNewLabel_1_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1_7.setBounds(1189, 584, 203, 38);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp11.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1900, 1000);
		contentPane.add(lblNewLabel_2);
	}
}
