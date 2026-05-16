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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class Ticket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableTicket;
	private DefaultTableModel model;
	private JTextField textSubtotal;
	private JTextField textIVA;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket frame = new Ticket();
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
	public Ticket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 313);
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
		
		JLabel lblNewLabel_1 = new JLabel("Ticket");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel_1.setBounds(312, 11, 89, 27);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 414, 129);
		contentPane.add(scrollPane);
		
		tableTicket = new JTable();
	    model = new DefaultTableModel();
		tableTicket.setModel(model);
		model.addColumn("ID Ticket");
		model.addColumn("ID Cliente");
		model.addColumn("ID Producto");
		model.addColumn("Producto");
		model.addColumn("Cantidad");
		model.addColumn("Precio");
		
		scrollPane.setViewportView(tableTicket);
		
		JLabel lblNewLabel = new JLabel("Subtotal");
		lblNewLabel.setBounds(292, 189, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("IVA");
		lblNewLabel_2.setBounds(292, 224, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setBounds(292, 255, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textSubtotal = new JTextField();
		textSubtotal.setBounds(338, 189, 86, 20);
		contentPane.add(textSubtotal);
		textSubtotal.setColumns(10);
		
		textIVA = new JTextField();
		textIVA.setColumns(10);
		textIVA.setBounds(338, 221, 86, 20);
		contentPane.add(textIVA);
		
		textTotal = new JTextField();
		textTotal.setColumns(10);
		textTotal.setBounds(338, 252, 86, 20);
		contentPane.add(textTotal);
		
		JButton btnImprimir = new JButton("Imprimir en Word");
		btnImprimir.setForeground(new Color(255, 255, 255));
		btnImprimir.setBackground(new Color(0, 64, 128));
		btnImprimir.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnImprimir.setBounds(10, 219, 144, 23);
		contentPane.add(btnImprimir);

	}
}
