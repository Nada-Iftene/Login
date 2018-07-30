import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login to acces your account");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(47, 44, 267, 29);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(198, 148, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(198, 221, 150, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogin.setBounds(118, 318, 135, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNom.setBounds(10, 116, 155, 14);
		contentPane.add(lblNom);
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdresse.setBounds(10, 150, 155, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblNumroDimmatriculation = new JLabel("Num\u00E9ro d'immatriculation:");
		lblNumroDimmatriculation.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumroDimmatriculation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumroDimmatriculation.setBounds(10, 186, 155, 14);
		contentPane.add(lblNumroDimmatriculation);
		
		JLabel lblRfrenceDeLorganisme = new JLabel("R\u00E9f\u00E9rence de l'organisme aupr\u00E8s");
		lblRfrenceDeLorganisme.setHorizontalAlignment(SwingConstants.CENTER);
		lblRfrenceDeLorganisme.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRfrenceDeLorganisme.setBounds(10, 223, 178, 14);
		contentPane.add(lblRfrenceDeLorganisme);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(198, 184, 150, 20);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(198, 114, 150, 20);
		contentPane.add(passwordField_2);
		
		JLabel lblNewLabel_1 = new JLabel("L'employeur");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(126, 11, 114, 23);
		contentPane.add(lblNewLabel_1);
	}
}
