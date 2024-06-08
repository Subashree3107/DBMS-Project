package Employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class frontpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JDesktopPane desktopPane_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontpage frame = new frontpage();
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
	public frontpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Signup");
		btnNewButton_1.setBounds(1377, 24, 136, 43);
		btnNewButton_1.setForeground(new Color(25, 25, 112));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				portal frame = new portal();
				frame.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Creativity Beyond Limit");
		lblNewLabel_2.setBounds(678, 416, 524, 53);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("INFINITY");
		lblNewLabel_3.setBounds(523, 302, 498, 116);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Algerian", Font.BOLD, 99));
		contentPane.add(lblNewLabel_3);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(1240, 24, 116, 43);
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				login frame = new login();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnNewButton);
		
		
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(216, 323, 1, 1);
		contentPane.add(desktopPane);
		
		desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(131, 303, 1, 1);
		contentPane.add(desktopPane_1);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBounds(178, 394, 179, 0);
		contentPane.add(desktopPane_2);
		
		lblNewLabel = 
				new JLabel(" ");
		lblNewLabel.setBounds(0, 0, 1900, 1000);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 59));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fp25.jpg"));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("INFINITY");
		lblNewLabel_1.setBounds(604, 207, 294, 43);
		contentPane.add(lblNewLabel_1);
	}
}
