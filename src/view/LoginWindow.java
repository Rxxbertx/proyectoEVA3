package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuarioLogin;
	private JTextField textFieldContraseñaLogin;
	private JTextField textFieldNombreRegistro;
	private JTextField textFieldApellidosRegistro;
	private JTextField textFieldUsuarioRegistro;
	private JTextField textFieldContraseñaRegistro;
	private JPanel panelRegistrar;
	private JButton btnAlta;
	private JButton btnAltaLogin;
	private JButton btnEntrar;
	private JPanel panelLogin;
	private JPanel panelCard;

	/**
	 * Create the frame.
	 */
	public LoginWindow() {
		setTitle("App");
		setBackground(new Color(128, 0, 0));
		setFont(new Font("Arial", Font.PLAIN, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 811);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(128, 0, 0), 12, true));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(4, 4));

		panelCard = new JPanel();
		contentPane.add(panelCard, BorderLayout.CENTER);
		panelCard.setLayout(new CardLayout(3, 3));

		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		panelCard.add(panelLogin, "panelLogin");

		JLabel lblNewLabel_1 = new JLabel("Iniciar Sesion");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 10, 0, (Color) new Color(128, 0, 0)));
		lblNewLabel_1.setBounds(187, 38, 306, 98);
		panelLogin.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(118, 246, 146, 31);
		panelLogin.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(118, 356, 146, 37);
		panelLogin.add(lblNewLabel_3);

		textFieldUsuarioLogin = new JTextField();
		textFieldUsuarioLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textFieldUsuarioLogin.setColumns(10);
		textFieldUsuarioLogin.setBounds(340, 240, 216, 43);
		panelLogin.add(textFieldUsuarioLogin);

		textFieldContraseñaLogin = new JTextField();
		textFieldContraseñaLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textFieldContraseñaLogin.setColumns(10);
		textFieldContraseñaLogin.setBounds(340, 353, 216, 43);
		panelLogin.add(textFieldContraseñaLogin);

		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnEntrar.setBorderPainted(false);
		btnEntrar.setBackground(new Color(128, 0, 0));
		btnEntrar.setBounds(204, 476, 271, 77);
		panelLogin.add(btnEntrar);

		JLabel lblNewLabel_4 = new JLabel("No tienes cuenta? Date de ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(129, 651, 279, 31);
		panelLogin.add(lblNewLabel_4);

		btnAltaLogin = new JButton("ALTA");
		btnAltaLogin.setForeground(new Color(128, 0, 0));
		btnAltaLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnAltaLogin.setContentAreaFilled(false);
		btnAltaLogin.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		btnAltaLogin.setBounds(404, 644, 89, 43);
		panelLogin.add(btnAltaLogin);

		panelRegistrar = new JPanel();
		panelCard.add(panelRegistrar, "panelRegistrar");
		panelRegistrar.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("Registrarse");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1_1.setBorder(new MatteBorder(0, 0, 10, 0, (Color) new Color(128, 0, 0)));
		lblNewLabel_1_1.setBounds(189, 75, 306, 98);
		panelRegistrar.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Nombre");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(121, 276, 146, 31);
		panelRegistrar.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Apellidos");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_1.setBounds(121, 351, 146, 37);
		panelRegistrar.add(lblNewLabel_3_1);

		textFieldNombreRegistro = new JTextField();
		textFieldNombreRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textFieldNombreRegistro.setColumns(10);
		textFieldNombreRegistro.setBounds(316, 270, 216, 43);
		panelRegistrar.add(textFieldNombreRegistro);

		textFieldApellidosRegistro = new JTextField();
		textFieldApellidosRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textFieldApellidosRegistro.setColumns(10);
		textFieldApellidosRegistro.setBounds(316, 348, 216, 43);
		panelRegistrar.add(textFieldApellidosRegistro);

		btnAlta = new JButton("ALTA");
		btnAlta.setForeground(Color.WHITE);
		btnAlta.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAlta.setBorderPainted(false);
		btnAlta.setBackground(new Color(128, 0, 0));
		btnAlta.setBounds(204, 595, 271, 77);
		panelRegistrar.add(btnAlta);

		JLabel lblNewLabel_2_1_1 = new JLabel("Usuario");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1_1.setBounds(121, 423, 146, 31);
		panelRegistrar.add(lblNewLabel_2_1_1);

		textFieldUsuarioRegistro = new JTextField();
		textFieldUsuarioRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textFieldUsuarioRegistro.setColumns(10);
		textFieldUsuarioRegistro.setBounds(316, 417, 216, 43);
		panelRegistrar.add(textFieldUsuarioRegistro);

		JLabel lblNewLabel_2_1_2 = new JLabel("Contraseña");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1_2.setBounds(121, 494, 146, 31);
		panelRegistrar.add(lblNewLabel_2_1_2);

		textFieldContraseñaRegistro = new JTextField();
		textFieldContraseñaRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		textFieldContraseñaRegistro.setColumns(10);
		textFieldContraseñaRegistro.setBounds(316, 488, 216, 43);
		panelRegistrar.add(textFieldContraseñaRegistro);

		JPanel panel = new JPanel();

		panel.setBackground(new Color(128, 0, 0));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblNewLabel = new JLabel(new ImageIcon(LoginWindow.class.getResource("/images/lateral.png")));
		panel.add(lblNewLabel);

		// Agregar "pegamento" horizontal para rellenar el espacio sobrante
		panel.add(Box.createVerticalGlue());
		panel.add(lblNewLabel);
		setVisible(true);
		setLocationRelativeTo(null);

	}

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @return the textFieldUsuarioLogin
	 */
	public JTextField getTextFieldUsuarioLogin() {
		return textFieldUsuarioLogin;
	}

	/**
	 * @return the textFieldContraseñaLogin
	 */
	public JTextField getTextFieldContraseñaLogin() {
		return textFieldContraseñaLogin;
	}

	/**
	 * @return the textFieldNombreRegistro
	 */
	public JTextField getTextFieldNombreRegistro() {
		return textFieldNombreRegistro;
	}

	/**
	 * @return the textFieldApellidosRegistro
	 */
	public JTextField getTextFieldApellidosRegistro() {
		return textFieldApellidosRegistro;
	}

	/**
	 * @return the textFieldUsuarioRegistro
	 */
	public JTextField getTextFieldUsuarioRegistro() {
		return textFieldUsuarioRegistro;
	}

	/**
	 * @return the textFieldContraseñaRegistro
	 */
	public JTextField getTextFieldContraseñaRegistro() {
		return textFieldContraseñaRegistro;
	}

	/**
	 * @return the panelRegistrar
	 */
	public JPanel getPanelRegistrar() {
		return panelRegistrar;
	}

	/**
	 * @return the btnAlta
	 */
	public JButton getBtnAlta() {
		return btnAlta;
	}

	/**
	 * @return the btnAltaLogin
	 */
	public JButton getBtnAltaLogin() {
		return btnAltaLogin;
	}

	/**
	 * @return the btnEntrar
	 */
	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	/**
	 * @return the panelLogin
	 */
	public JPanel getPanelLogin() {
		return panelLogin;
	}

	/**
	 * @return the panelCard
	 */
	public JPanel getPanelCard() {
		return panelCard;
	}
}
