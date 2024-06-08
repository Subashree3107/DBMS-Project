package Employee;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class leave extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JDateChooser dateChooserFrom;
    private JDateChooser dateChooserTo;
    private JTextField textField_1;
    private JTextField textField_2;
    private JComboBox<String> comboBox;
    private String id;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    int leaveCount;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    leave frame = new leave();
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
    public leave() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1920, 1080);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton_3 = new JButton("calc");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			SimpleDateFormat sdf= new SimpleDateFormat("mm/dd/yyyy",Locale.ENGLISH);
        			 java.util.Date fromDate = dateChooserFrom.getDate();
                     java.util.Date toDate = dateChooserTo.getDate();
                     long diffInMillies = Math.abs(fromDate.getTime()-toDate.getTime());
                     long diff = TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
                     textField_2.setText(String.valueOf(diff));
                     
        		}
        		catch(Exception e1) {
        			e1.printStackTrace();
        		}
        		
        	}
        });
        btnNewButton_3.setBounds(1112, 535, 85, 21);
        contentPane.add(btnNewButton_3);

        JLabel lblNewLabel = new JLabel(" MEDICAL  LEAVE");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel.setBounds(467, 254, 227, 34);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("CASUAL  LEAVE");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_1.setBounds(740, 254, 220, 34);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("ANNUAL  LEAVE");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_2.setBounds(991, 254, 220, 34);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("FROM");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_3.setBounds(617, 395, 121, 26);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("TO");
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_4.setBounds(617, 459, 102, 32);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("LEAVE  TYPE");
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_5.setBounds(625, 600, 199, 44);
        contentPane.add(lblNewLabel_5);

        dateChooserFrom = new JDateChooser();
        dateChooserFrom.setBounds(868, 389, 199, 32);
        contentPane.add(dateChooserFrom);

        dateChooserTo = new JDateChooser();
        dateChooserTo.setBounds(868, 459, 199, 32);
        contentPane.add(dateChooserTo);

        l1 = new JLabel("");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l1.setBounds(546, 298, 57, 44);
        contentPane.add(l1);

        l2 = new JLabel("");
        l2.setForeground(new Color(0, 0, 0));
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setBounds(829, 299, 45, 42);
        contentPane.add(l2);

        l3 = new JLabel("");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setBounds(1063, 290, 45, 42);
        contentPane.add(l3);

        JButton btnNewButton = new JButton("APPLY");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.setBounds(788, 690, 116, 32);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               /* try {
                    id = textField_1.getText();
                   String noleave = textField_2.getText();
                   leaveCount = Integer.parseInt(noleave);
                   

                    java.util.Date fromDate = dateChooserFrom.getDate();
                    java.util.Date toDate = dateChooserTo.getDate();
                    String leave = (String) comboBox.getSelectedItem();

                    if (fromDate != null && toDate != null) {
                        // Convert java.util.Date to java.sql.Date
                        java.sql.Date sqlFromDate = new java.sql.Date(fromDate.getTime());
                        java.sql.Date sqlToDate = new java.sql.Date(toDate.getTime());

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");
                        String sql2 = "SELECT medical, casual, annual FROM leave1 WHERE id=?";
                        PreparedStatement pstmtSelect = con.prepareStatement(sql2);
                        pstmtSelect.setString(1, id);
                        if(medical<leaveCount)
                        {
                        	JOptionPane.showMessageDialog(null, "No matching records found");
                        }

                        ResultSet rs = pstmtSelect.executeQuery();
                        if (rs.next()) {
                            l1.setText(rs.getString("medical"));
                            l2.setText(rs.getString("casual"));
                            l3.setText(rs.getString("annual"));
                            int currentLeaveCount = rs.getInt(leave);
                            int newLeaveCount = currentLeaveCount - leaveCount;
                            String sql = "UPDATE leave1 SET " + leave + " = ? WHERE id = ?";
                            PreparedStatement pstmtUpdate = con.prepareStatement(sql);
                            pstmtUpdate.setInt(1, newLeaveCount); // Incrementing the leave count
                            pstmtUpdate.setString(2, id);

                            pstmtUpdate.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Successful");
                            login frame = new login();
                            frame.setVisible(true);
                            pstmtUpdate.close();
                        } else {
                            JOptionPane.showMessageDialog(null, "No matching records found", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select both dates", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(btnNewButton, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
                }*/
            	String id = textField_1.getText();
                String leaveType = (String) comboBox.getSelectedItem();
               // int leaveCount = Integer.parseInt(textField_2.getText()); // Assuming textField_2 contains the number of leaves to be applied

                try {
                    java.util.Date fromDate = dateChooserFrom.getDate();
                    java.util.Date toDate = dateChooserTo.getDate();

                    if (fromDate != null && toDate != null) {
                        // Convert java.util.Date to java.sql.Date
                    	 long diffInMillies = Math.abs(toDate.getTime() - fromDate.getTime());
                         long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                         int leaveCount = (int) diff + 1; // Add 1 to include the start date
                         

                        java.sql.Date sqlFromDate = new java.sql.Date(fromDate.getTime());
                        java.sql.Date sqlToDate = new java.sql.Date(toDate.getTime());

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");
                        String sql2 = "SELECT medical, casual, annual FROM leave1 WHERE id=?";
                        PreparedStatement pstmtSelect = con.prepareStatement(sql2);
                        pstmtSelect.setString(1, id);

                        ResultSet rs = pstmtSelect.executeQuery();
                        if (rs.next()) {
                            int currentLeaveCount = rs.getInt(leaveType);
              

                            if (currentLeaveCount >= leaveCount) {
                                l1.setText(rs.getString("medical"));
                                l2.setText(rs.getString("casual"));
                                l3.setText(rs.getString("annual"));

                                int newLeaveCount = currentLeaveCount - leaveCount;
                                String sql = "UPDATE leave1 SET " + leaveType + " = ? WHERE id = ?";
                                PreparedStatement pstmtUpdate = con.prepareStatement(sql);
                                pstmtUpdate.setInt(1, newLeaveCount); // Decrementing the leave count
                                pstmtUpdate.setString(2, id);

                                pstmtUpdate.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Leave applied successfully");
                               
                                pstmtUpdate.close();
                            } else {
                                JOptionPane.showMessageDialog(null, "Insufficient leave balance for " + leaveType, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No matching records found", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        pstmtSelect.close();
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select both dates", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
                }
            	/*String id = textField_1.getText();
                String leaveType = (String) comboBox.getSelectedItem();

                try {
                    java.util.Date fromDate = dateChooserFrom.getDate();
                    java.util.Date toDate = dateChooserTo.getDate();

                    if (fromDate != null && toDate != null) {
                        // Calculate the number of days between fromDate and toDate
                        long diffInMillies = Math.abs(toDate.getTime() - fromDate.getTime());
                        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                        int leaveCount = (int) diff + 1; // Add 1 to include the start date

                        // Convert java.util.Date to java.sql.Date
                        java.sql.Date sqlFromDate = new java.sql.Date(fromDate.getTime());
                        java.sql.Date sqlToDate = new java.sql.Date(toDate.getTime());

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "Suba@3107");
                        String sql2 = "SELECT medical, casual, annual FROM leave1 WHERE id=?";
                        PreparedStatement pstmtSelect = con.prepareStatement(sql2);
                        pstmtSelect.setString(1, id);

                        ResultSet rs = pstmtSelect.executeQuery();
                        if (rs.next()) {
                            int currentLeaveCount = rs.getInt(leaveType);

                            if (currentLeaveCount >= leaveCount) {
                                l1.setText(rs.getString("medical"));
                                l2.setText(rs.getString("casual"));
                                l3.setText(rs.getString("annual"));

                                int newLeaveCount = currentLeaveCount - leaveCount;
                                String sql = "UPDATE leave1 SET " + leaveType + " = ? WHERE id = ?";
                                PreparedStatement pstmtUpdate = con.prepareStatement(sql);
                                pstmtUpdate.setInt(1, newLeaveCount); // Decrementing the leave count
                                pstmtUpdate.setString(2, id);

                                pstmtUpdate.executeUpdate();
                                JOptionPane.showMessageDialog(null, "Leave applied successfully");

                                pstmtUpdate.close();
                            } else {
                                JOptionPane.showMessageDialog(null, "Insufficient leave balance for " + leaveType, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No matching records found", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        pstmtSelect.close();
                        con.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please select both dates", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }*/
    
            
    }
        });
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_9 = new JLabel("id");
        lblNewLabel_9.setBounds(428, 107, 0, 13);
        contentPane.add(lblNewLabel_9);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField_1.setBounds(761, 166, 196, 32);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_10 = new JLabel("TOTAL  DAYS");
        lblNewLabel_10.setForeground(Color.WHITE);
        lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_10.setBounds(617, 526, 187, 34);
        contentPane.add(lblNewLabel_10);

        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField_2.setBounds(868, 528, 199, 32);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        comboBox = new JComboBox<>();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
        comboBox.setBounds(868, 598, 199, 32);
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "medical", "casual", "annual" }));
        contentPane.add(comboBox);

        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\icons8-search (1).gif"));
        btnNewButton_1.setBounds(994, 166, 33, 32);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id = textField_1.getText(); // Ensure id is fetched from the textField
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Suba@3107");

                    String sql = "SELECT medical, casual, annual FROM leave1 WHERE id=?";
                    PreparedStatement pts = con.prepareStatement(sql);
                    pts.setString(1, id);
                    ResultSet rs = pts.executeQuery();

                    if (rs.next()) {
                        l1.setText(rs.getString("medical"));
                        l2.setText(rs.getString("casual"));
                        l3.setText(rs.getString("annual"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No matching records found", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    con.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(btnNewButton, "Error while establishing connection", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_6 = new JLabel("EMPLOYEE ID");
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_6.setBounds(528, 169, 210, 26);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_7 = new JLabel("LEAVE APPLICATION");
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 45));
        lblNewLabel_7.setBounds(645, 61, 491, 59);
        contentPane.add(lblNewLabel_7);
        
        JButton btnNewButton_2 = new JButton("BACK");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		userpage frame = new userpage();
				frame.setVisible(true);
        	}
        });
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2.setBounds(393, 77, 121, 34);
        contentPane.add(btnNewButton_2);
        
        JLabel lblNewLabel_8 = new JLabel("New label");
        lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\subas\\Downloads\\fpp14.jpg"));
        lblNewLabel_8.setBounds(0, 0, 1900, 1000);
        contentPane.add(lblNewLabel_8);
    }
}
