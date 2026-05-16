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
import javax.swing.JTextField;

public class Clientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNom_Cliente;
	private JTextField textID_Cliente;
	private JTextField textTele;
	private JTextField textGenero;
	private JTextField textActivo;
	private JTextField textCred;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 301);
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
		
		JLabel lblNewLabel_1 = new JLabel("Clientes");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel_1.setBounds(298, 11, 89, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel.setBounds(123, 49, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdcliente = new JLabel("ID_Cliente");
		lblIdcliente.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblIdcliente.setBounds(123, 74, 69, 14);
		contentPane.add(lblIdcliente);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblTelefono.setBounds(123, 99, 69, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccin = new JLabel("Genero");
		lblDireccin.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblDireccin.setBounds(123, 124, 69, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblActivo = new JLabel("Activo");
		lblActivo.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblActivo.setBounds(123, 149, 69, 14);
		contentPane.add(lblActivo);
		
		JLabel lblCredito = new JLabel("Credito");
		lblCredito.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblCredito.setBounds(123, 174, 69, 14);
		contentPane.add(lblCredito);
		
		textNom_Cliente = new JTextField();
		textNom_Cliente.setBounds(202, 49, 86, 20);
		contentPane.add(textNom_Cliente);
		textNom_Cliente.setColumns(10);
		
		textID_Cliente = new JTextField();
		textID_Cliente.setColumns(10);
		textID_Cliente.setBounds(202, 72, 86, 20);
		contentPane.add(textID_Cliente);
		
		textTele = new JTextField();
		textTele.setColumns(10);
		textTele.setBounds(202, 97, 86, 20);
		contentPane.add(textTele);
		
		textGenero = new JTextField();
		textGenero.setColumns(10);
		textGenero.setBounds(202, 122, 86, 20);
		contentPane.add(textGenero);
		
		textActivo = new JTextField();
		textActivo.setColumns(10);
		textActivo.setBounds(202, 147, 86, 20);
		contentPane.add(textActivo);
		
		textCred = new JTextField();
		textCred.setColumns(10);
		textCred.setBounds(202, 172, 86, 20);
		contentPane.add(textCred);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 64, 128));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnNewButton_1.setBounds(144, 210, 89, 23);
		contentPane.add(btnNewButton_1);

	}

}
