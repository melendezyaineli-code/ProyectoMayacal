package JTGM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 303);
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
		
		JLabel lblNewLabel = new JLabel("Seleccione que acción desea realizar");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel.setBounds(5, 49, 441, 72);
		contentPane.add(lblNewLabel);
		
		JButton btnProdu = new JButton("Agregar Producción");
		btnProdu.setBackground(new Color(0, 43, 85));
		btnProdu.setForeground(Color.WHITE);
		btnProdu.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnProdu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produccion frame = new Produccion();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				
			}
		});
		
		
		btnProdu.setBounds(55, 147, 161, 55);
		contentPane.add(btnProdu);
		
		JButton btnVenta = new JButton("Hacer una Venta");
		btnVenta.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		btnVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas frame = new Ventas();
				frame.setVisible(true);	
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnVenta.setForeground(Color.WHITE);
		btnVenta.setBackground(new Color(0, 43, 85));
		btnVenta.setBounds(248, 147, 143, 55);
		contentPane.add(btnVenta);

	}
}
