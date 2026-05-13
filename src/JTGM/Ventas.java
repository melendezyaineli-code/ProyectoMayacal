package JTGM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class Ventas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCant;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
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
	public Ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 451);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(136, 219, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\mayacal.png"));
		btnNewButton.setBounds(0, 0, 288, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblVentas = new JLabel("Ventas");
		lblVentas.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblVentas.setBounds(317, 11, 207, 27);
		contentPane.add(lblVentas);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel.setBounds(46, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboCliente = new JComboBox();
		comboCliente.setBounds(116, 49, 93, 22);
		contentPane.add(comboCliente);
		
		JButton btnAgre_Cliente = new JButton("+");
		btnAgre_Cliente.setBounds(219, 49, 41, 23);
		contentPane.add(btnAgre_Cliente);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(26, 82, 115, 84);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(212, 82, 115, 84);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setBounds(391, 82, 115, 84);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblCal = new JLabel("Cal");
		lblCal.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblCal.setBounds(26, 167, 46, 14);
		contentPane.add(lblCal);
		
		JLabel lblCemento = new JLabel("Cemento");
		lblCemento.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblCemento.setBounds(212, 167, 76, 14);
		contentPane.add(lblCemento);
		
		JLabel lblGrava = new JLabel("Grava");
		lblGrava.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblGrava.setBounds(391, 167, 46, 14);
		contentPane.add(lblGrava);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(26, 192, 115, 84);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(212, 192, 115, 84);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(391, 192, 115, 84);
		contentPane.add(textPane_2);
		
		JButton btnSelec = new JButton("Seleccionar");
		btnSelec.setBackground(new Color(0, 43, 85));
		btnSelec.setForeground(new Color(255, 255, 255));
		btnSelec.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnSelec.setBounds(212, 357, 115, 23);
		contentPane.add(btnSelec);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(26, 287, 66, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cantidad");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(212, 287, 66, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cantidad");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_2.setBounds(391, 287, 66, 27);
		contentPane.add(lblNewLabel_1_2);
		
		textCant = new JTextField();
		textCant.setBounds(26, 308, 86, 20);
		contentPane.add(textCant);
		textCant.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(212, 308, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(391, 308, 86, 20);
		contentPane.add(textField_1);

	}
}
