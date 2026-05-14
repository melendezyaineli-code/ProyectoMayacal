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
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Produccion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produccion frame = new Produccion();
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
	public Produccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(136, 219, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\mayacal.png"));
		btnNewButton.setBounds(0, 0, 324, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Producción");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel.setBounds(88, 53, 207, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Producto");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(55, 107, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboProdu = new JComboBox();
		comboProdu.setBounds(119, 104, 94, 22);
		contentPane.add(comboProdu);
		
		JLabel lblNewLabel_1_1 = new JLabel("Código");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(55, 141, 85, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnAgre_Produ = new JButton("+");
		btnAgre_Produ.setBounds(227, 104, 41, 23);
		contentPane.add(btnAgre_Produ);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cantidad");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(55, 187, 85, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textCant = new JTextField();
		textCant.setBounds(119, 185, 94, 20);
		contentPane.add(textCant);
		textCant.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tipo");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(55, 226, 85, 22);
		contentPane.add(lblNewLabel_1_2_1);
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.setBounds(119, 227, 94, 22);
		contentPane.add(comboTipo);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setForeground(new Color(255, 255, 255));
		btnRegistrar.setBackground(new Color(0, 43, 85));
		btnRegistrar.setBounds(119, 275, 89, 23);
		contentPane.add(btnRegistrar);

	}
}
