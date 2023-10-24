package game;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Numberguess extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final boolean True = false;
	private JPanel contentPane;
	public JTextField guessTextField;
	private JButton SubmitButton;
	private int RandomNumber;
    private int Count;
    public boolean guessedCorrectly;
    public JButton btnNewButton;
    

	
	

	
	public Numberguess() {
		setTitle("Number Guessing Game");
		RandomNumber = (int) (Math.random() * 100) + 1;
		Count = 0;
		guessedCorrectly = false;
		

		JPanel Panel = new JPanel();
		Panel.setBackground(new Color(128, 0, 255));
		Panel.setLayout(null);
	
		JLabel InstructionLabel_1 = new JLabel("Enter The Number");
		InstructionLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 26));
		InstructionLabel_1.setBounds(127, 153, 484, 45);
		Panel.add(InstructionLabel_1);

		guessTextField = new JTextField();
		guessTextField.setToolTipText("Enter Your Guess");
		guessTextField.setText("Enter The Number");
		guessTextField.setBounds(105, 209, 323, 35);
		Panel.add(guessTextField);
		guessTextField.setColumns(10);
		JLabel status = new JLabel("Show Status");
		status.setIcon(null);
		status.setForeground(Color.BLACK);
		status.setBackground(Color.ORANGE);
		status.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 17));
		status.setBounds(10, 374, 510, 35);
		Panel.add(status);

		SubmitButton = new JButton("Submit");
		SubmitButton.setToolTipText("Submit Your Guess");
		SubmitButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		SubmitButton.setBounds(75, 292, 133, 45);
		SubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Count++;

				int guessNumber = Integer.parseInt(guessTextField.getText());
				if (guessNumber > 100 || guessNumber <= 0) {
					status.setForeground(Color.orange);
					status.setText("Invalid!.Guess Between 1 and 100");
				}
				else if (guessNumber == RandomNumber) {
					status.setForeground(Color.green);
					guessedCorrectly = true;

				} else if (guessNumber > RandomNumber) {
					status.setText("Your guess is too high.");
					status.setForeground(Color.orange);

				} else {
					status.setText("Your guess is too low.");
					status.setForeground(Color.orange);
				}

				if (guessedCorrectly || Count == 4) {
					if (guessedCorrectly) {
						status.setText(" Congragulation!..You guessed correctly!");
						status.setForeground(Color.green);
					} else {
						status.setText("You ran out of guesses. The  number was " + RandomNumber + ".");
						status.setForeground(Color.orange);
					}
				}

			}

		});
		Panel.add(SubmitButton);

		getContentPane().add(Panel);

		JLabel lblNewLabel_1 = new JLabel("Number Guessing Game in Java");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 27));
		lblNewLabel_1.setBounds(35, 32, 546, 35);
		Panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("NOTE:You Have Only four Change To Win The Game");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		lblNewLabel.setBounds(75, 430, 415, 20);
		Panel.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guessTextField.setText("0");

			}
		});
		btnNewButton_1.setBounds(352, 292, 121, 45);
		Panel.add(btnNewButton_1);

		//JLabel lblNewLabel_2 = new JLabel("New label");
		//lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		//lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\atoz\\Desktop\\New folder\\use.jpg"));
		//lblNewLabel_2.setBounds(-257, 0, 1098, 507);
		//Panel.add(lblNewLabel_2);

		setSize(546, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Numberguess();
	}
}