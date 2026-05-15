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
import javax.swing.JList;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSelec;

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
		setBounds(100, 100, 562, 525);
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
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\Cal.png"));
		btnNewButton_1.setBounds(26, 82, 115, 100);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\adhesivo.png"));
		btnNewButton_1_1.setBounds(212, 82, 115, 100);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\Yaineli\\Downloads\\Sin título.png"));
		btnNewButton_1_2.setBounds(391, 82, 115, 100);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblCal = new JLabel("Cal");
		lblCal.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblCal.setBounds(26, 189, 46, 14);
		contentPane.add(lblCal);
		
		JLabel lblCemento = new JLabel("Adhesivos");
		lblCemento.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblCemento.setBounds(212, 189, 76, 14);
		contentPane.add(lblCemento);
		
		JLabel lblGrava = new JLabel("Recubrimiento");
		lblGrava.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblGrava.setBounds(391, 189, 115, 14);
		contentPane.add(lblGrava);
		
		btnSelec = new JButton("Seleccionar");
		btnSelec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnSelec.addActionListener(this);
			Ticket frame = new Ticket();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			
			
			}
		});
		btnSelec.setBackground(new Color(0, 43, 85));
		btnSelec.setForeground(new Color(255, 255, 255));
		btnSelec.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnSelec.setBounds(219, 433, 115, 23);
		contentPane.add(btnSelec);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(26, 366, 66, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cantidad");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(219, 366, 66, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cantidad");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_2.setBounds(383, 366, 66, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(85, 369, 56, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(278, 369, 56, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(450, 366, 56, 22);
		contentPane.add(comboBox_2);
		
		JList list_1_1 = new JList();
		list_1_1.setBounds(26, 265, 115, 67);
		contentPane.add(list_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tipo");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_3.setBounds(10, 227, 66, 27);
		contentPane.add(lblNewLabel_1_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(46, 232, 95, 22);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tipo");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_3_1.setBounds(196, 234, 66, 27);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Tipo");
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1_3_2.setBounds(383, 234, 66, 27);
		contentPane.add(lblNewLabel_1_3_2);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(238, 230, 95, 22);
		contentPane.add(comboBox_3_1);
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setBounds(417, 230, 95, 22);
		contentPane.add(comboBox_3_2);
		
		JList list_1_1_1 = new JList();
		list_1_1_1.setBounds(219, 265, 115, 67);
		contentPane.add(list_1_1_1);
		
		JList list_1_1_2 = new JList();
		list_1_1_2.setBounds(391, 265, 115, 67);
		contentPane.add(list_1_1_2);
		
		JButton btnCorte = new JButton("Corte");
		btnCorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corte frame = new Corte();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
		});
		btnCorte.setForeground(Color.WHITE);
		btnCorte.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnCorte.setBackground(new Color(0, 43, 85));
		btnCorte.setBounds(431, 0, 115, 23);
		contentPane.add(btnCorte);

	}
}
