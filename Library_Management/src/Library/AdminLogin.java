package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class AdminLogin extends JFrame {
	
	static AdminLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminLogin();
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
	public AdminLogin() {
		super("Admin Login");		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		
		JLabel lblAdminLoginForm = new JLabel("Admin Login Page");
		lblAdminLoginForm.setBounds(236, 90, 258, 37);
		lblAdminLoginForm.setForeground(Color.GRAY);
		lblAdminLoginForm.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblEnterName = new JLabel("Enter Name:");
		lblEnterName.setBounds(163, 197, 106, 17);
		lblEnterName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(163, 272, 143, 14);
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textField = new JTextField();
		textField.setBounds(327, 198, 193, 37);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(301, 376, 86, 37);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("admin")&&password.equals("admin123")){
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(327, 264, 193, 37);
		contentPane.setLayout(null);
		contentPane.add(lblAdminLoginForm);
		contentPane.add(lblEnterName);
		contentPane.add(lblEnterPassword);
		contentPane.add(passwordField);
		contentPane.add(textField);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 743, 468);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\istockphoto-1083619832-1024x1024.jpg"));
		//java.lang.System.out.println(new javax.swing.ImageIcon(Library.AdminLogin.class.getResource("/Library/5028521.jpg")));. 
		contentPane.add(lblNewLabel);
	}
}

