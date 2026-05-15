package JTGM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class Corte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	LocalDate hoy = LocalDate.now();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Corte frame = new Corte();
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
	public Corte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(140, 236, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha de venta:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel.setBounds(10, 52, 111, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\mayacal.png"));
		btnNewButton.setBounds(0, 0, 288, 38);
		contentPane.add(btnNewButton);
		
		JComboBox comboDia = new JComboBox();
		comboDia.setBounds(119, 54, 44, 22);
		comboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		contentPane.add(comboDia);
		
		JComboBox comboMes = new JComboBox();
		comboMes.setBounds(173, 54, 94, 22);
		comboMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		contentPane.add(comboMes);
		
		JComboBox comboAño = new JComboBox();
		comboAño.setBounds(279, 54, 70, 22);
		comboAño.setModel(new DefaultComboBoxModel(new String[] {"2026", "2027", "2028", "2029", "2030", "2031", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
		contentPane.add(comboAño);
		
		comboDia.setSelectedIndex(hoy.getDayOfMonth()-1);
		comboMes.setSelectedIndex(hoy.getMonthValue()-1);
		comboAño.setSelectedIndex(hoy.getYear()-2026);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setBackground(new Color(0, 64, 128));
		btnBuscar.setBounds(10, 88, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnNewButton_1 = new JButton("Guardar en Excel");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 64, 128));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnNewButton_1.setBounds(135, 248, 153, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Corte");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel_1.setBounds(303, 11, 89, 27);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 125, 414, 112);
		contentPane.add(textPane);
		

	}
}
