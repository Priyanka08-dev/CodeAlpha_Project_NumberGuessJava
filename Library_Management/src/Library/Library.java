package Library;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Library extends JFrame {
	static Library frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Library();
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
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibraryManagement = new JLabel("Library Management");
		lblLibraryManagement.setBounds(220, 24, 245, 34);
		lblLibraryManagement.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblLibraryManagement.setForeground(new Color(0, 0, 0));
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(245, 161, 199, 52);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setBounds(245, 258, 199, 53);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});
		btnLibrarianLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.setLayout(null);
		contentPane.add(lblLibraryManagement);
		contentPane.add(btnLibrarianLogin);
		contentPane.add(btnAdminLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\istockphoto-1460007178-1024x1024.jpg"));
		lblNewLabel.setBounds(0, 0, 700, 425);
		contentPane.add(lblNewLabel);
	}
}
