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
import javax.swing.UIManager;
import javax.swing.JTextField;

public class Productos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
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
	public Productos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 231);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(132, 237, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\mayacal.png"));
		btnNewButton.setBounds(0, 0, 288, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Productos");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel_1.setBounds(298, 11, 131, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Producto");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel.setBounds(127, 49, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdProducto = new JLabel("ID Producto");
		lblIdProducto.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblIdProducto.setBackground(UIManager.getColor("Button.background"));
		lblIdProducto.setBounds(127, 75, 86, 14);
		contentPane.add(lblIdProducto);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblTipo.setBackground(UIManager.getColor("Button.background"));
		lblTipo.setBounds(127, 100, 64, 14);
		contentPane.add(lblTipo);
		
		textField = new JTextField();
		textField.setBounds(217, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 73, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 98, 86, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 64, 128));
		btnNewButton_1.setBounds(156, 139, 89, 23);
		contentPane.add(btnNewButton_1);

	}

}
