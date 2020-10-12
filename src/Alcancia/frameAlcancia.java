package Alcancia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class frameAlcancia extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameAlcancia frame = new frameAlcancia();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int recibirMoneda(int Monedas )
    {
        Monedas = Monedas + 1;
        return Monedas;
    }
	
	public int calcularMoneda(int Monedas, int Valor )
    {
        int calculo;
        calculo = Monedas * Valor;
        return calculo;
    }
     
    public int calcularTotalDinero(int Monedas50, int Monedas100, int Monedas200, int Monedas500, int Monedas1000)
    {
        return Monedas50 * 50 + Monedas100 * 100 + Monedas200 * 200 + Monedas500 * 500 + Monedas1000 * 1000;
    }
    
    public int calcularTotalMonedas(int Monedas50, int Monedas100, int Monedas200, int Monedas500, int Monedas1000)
    {
    	return Monedas50 + Monedas100 + Monedas200 + Monedas500 + Monedas1000;
    }
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public frameAlcancia() {
		setTitle("Alcancia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 259);
		getContentPane().setLayout(null);
		
		JLabel lbl50 = new JLabel("$50");
		lbl50.setBounds(24, 35, 50, 20);
		getContentPane().add(lbl50);
		
		JLabel lbl100 = new JLabel("$100");
		lbl100.setBounds(24, 65, 50, 20);
		getContentPane().add(lbl100);
		
		JLabel lbl200 = new JLabel("$200");
		lbl200.setBounds(24, 95, 50, 20);
		getContentPane().add(lbl200);
		
		JLabel lbl500 = new JLabel("$500");
		lbl500.setBounds(24, 125, 50, 20);
		getContentPane().add(lbl500);
		
		JLabel lbl1000 = new JLabel("$1000");
		lbl1000.setBounds(24, 155, 50, 20);
		getContentPane().add(lbl1000);
		
		JLabel Moneda = new JLabel("Moneda");
		Moneda.setFont(new Font("Tahoma", Font.BOLD, 11));
		Moneda.setHorizontalAlignment(SwingConstants.CENTER);
		Moneda.setBounds(24, 5, 50, 20);
		getContentPane().add(Moneda);
		
		JLabel Cantidad = new JLabel("Cantidad");
		Cantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		Cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		Cantidad.setBounds(84, 5, 50, 20);
		getContentPane().add(Cantidad);
		
		JLabel cant50 = new JLabel("0");
		cant50.setHorizontalAlignment(SwingConstants.TRAILING);
		cant50.setBounds(84, 35, 50, 20);
		getContentPane().add(cant50);
		
		JLabel cant100 = new JLabel("0");
		cant100.setHorizontalAlignment(SwingConstants.TRAILING);
		cant100.setBounds(84, 65, 50, 20);
		getContentPane().add(cant100);
		
		JLabel cant200 = new JLabel("0");
		cant200.setHorizontalAlignment(SwingConstants.TRAILING);
		cant200.setBounds(84, 95, 50, 20);
		getContentPane().add(cant200);
		
		JLabel cant500 = new JLabel("0");
		cant500.setHorizontalAlignment(SwingConstants.TRAILING);
		cant500.setBounds(84, 125, 50, 20);
		getContentPane().add(cant500);
		
		JLabel cant1000 = new JLabel("0");
		cant1000.setHorizontalAlignment(SwingConstants.TRAILING);
		cant1000.setBounds(84, 155, 50, 20);
		getContentPane().add(cant1000);
		
		JLabel lblDinero = new JLabel("Dinero");
		lblDinero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDinero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDinero.setBounds(144, 5, 50, 20);
		getContentPane().add(lblDinero);
		
		JLabel lblAgregar = new JLabel("Agregar");
		lblAgregar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar.setBounds(204, 5, 80, 20);
		getContentPane().add(lblAgregar);
		
		JLabel dinero50 = new JLabel("$0");
		dinero50.setHorizontalAlignment(SwingConstants.TRAILING);
		dinero50.setBounds(144, 35, 50, 20);
		getContentPane().add(dinero50);
		
		JLabel dinero100 = new JLabel("$0");
		dinero100.setHorizontalAlignment(SwingConstants.TRAILING);
		dinero100.setBounds(144, 65, 50, 20);
		getContentPane().add(dinero100);
		
		JLabel dinero200 = new JLabel("$0");
		dinero200.setHorizontalAlignment(SwingConstants.TRAILING);
		dinero200.setBounds(144, 95, 50, 20);
		getContentPane().add(dinero200);
		
		JLabel dinero500 = new JLabel("$0");
		dinero500.setHorizontalAlignment(SwingConstants.TRAILING);
		dinero500.setBounds(144, 125, 50, 20);
		getContentPane().add(dinero500);
		
		JLabel dinero1000 = new JLabel("$0");
		dinero1000.setHorizontalAlignment(SwingConstants.TRAILING);
		dinero1000.setBounds(144, 155, 50, 20);
		getContentPane().add(dinero1000);
		
		JLabel totales = new JLabel("Totales");
		totales.setFont(new Font("Tahoma", Font.BOLD, 11));
		totales.setHorizontalAlignment(SwingConstants.CENTER);
		totales.setBounds(24, 185, 50, 20);
		getContentPane().add(totales);
		
		JLabel totalesCant = new JLabel("0");
		totalesCant.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalesCant.setHorizontalAlignment(SwingConstants.TRAILING);
		totalesCant.setBounds(84, 185, 50, 20);
		getContentPane().add(totalesCant);
		
		JLabel totalesDinero = new JLabel("$0");
		totalesDinero.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalesDinero.setHorizontalAlignment(SwingConstants.TRAILING);
		totalesDinero.setBounds(144, 185, 50, 20);
		getContentPane().add(totalesDinero);
		
		JButton btn50 = new JButton("$50");
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int Monedas = Integer.parseInt(cant50.getText());
				int NuevaCantidad = recibirMoneda(Monedas);
				cant50.setText(String.valueOf(NuevaCantidad));
				int NuevoDinero = calcularMoneda(NuevaCantidad,50);
				dinero50.setText("$ " + String.valueOf(NuevoDinero));
				int NuevoTotalCantidad = calcularTotalMonedas(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				int NuevoTotalDinero = calcularTotalDinero(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				
				totalesCant.setText(String.valueOf(NuevoTotalCantidad));
				totalesDinero.setText("$ " + String.valueOf(NuevoTotalDinero));
			}
		});
		btn50.setBounds(204, 35, 80, 20);
		getContentPane().add(btn50);
		
		JButton btn100 = new JButton("$100");
		btn100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Monedas = Integer.parseInt(cant100.getText());
				int NuevaCantidad = recibirMoneda(Monedas);
				cant100.setText(String.valueOf(NuevaCantidad));
				int NuevoDinero = calcularMoneda(NuevaCantidad,100);
				dinero100.setText("$ " + String.valueOf(NuevoDinero));
				int NuevoTotalCantidad = calcularTotalMonedas(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				int NuevoTotalDinero = calcularTotalDinero(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				
				totalesCant.setText(String.valueOf(NuevoTotalCantidad));
				totalesDinero.setText("$ " + String.valueOf(NuevoTotalDinero));
			}
		});
		btn100.setBounds(204, 64, 80, 20);
		getContentPane().add(btn100);
		
		JButton btn200 = new JButton("$200");
		btn200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Monedas = Integer.parseInt(cant200.getText());
				int NuevaCantidad = recibirMoneda(Monedas);
				cant200.setText(String.valueOf(NuevaCantidad));
				int NuevoDinero = calcularMoneda(NuevaCantidad,200);
				dinero200.setText("$ " + String.valueOf(NuevoDinero));
				int NuevoTotalCantidad = calcularTotalMonedas(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				int NuevoTotalDinero = calcularTotalDinero(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				
				totalesCant.setText(String.valueOf(NuevoTotalCantidad));
				totalesDinero.setText("$ " + String.valueOf(NuevoTotalDinero));
			}
		});
		btn200.setBounds(204, 94, 80, 20);
		getContentPane().add(btn200);
		
		JButton btn500 = new JButton("$500");
		btn500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Monedas = Integer.parseInt(cant500.getText());
				int NuevaCantidad = recibirMoneda(Monedas);
				cant500.setText(String.valueOf(NuevaCantidad));
				int NuevoDinero = calcularMoneda(NuevaCantidad,500);
				dinero500.setText("$ " + String.valueOf(NuevoDinero));
				int NuevoTotalCantidad = calcularTotalMonedas(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				int NuevoTotalDinero = calcularTotalDinero(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				
				totalesCant.setText(String.valueOf(NuevoTotalCantidad));
				totalesDinero.setText("$ " + String.valueOf(NuevoTotalDinero));
			}
		});
		btn500.setBounds(204, 124, 80, 20);
		getContentPane().add(btn500);
		
		JButton btn1000 = new JButton("$1000");
		btn1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Monedas = Integer.parseInt(cant1000.getText());
				int NuevaCantidad = recibirMoneda(Monedas);
				cant1000.setText(String.valueOf(NuevaCantidad));
				int NuevoDinero = calcularMoneda(NuevaCantidad,1000);
				dinero1000.setText("$ " + String.valueOf(NuevoDinero));
				int NuevoTotalCantidad = calcularTotalMonedas(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				int NuevoTotalDinero = calcularTotalDinero(Integer.parseInt(cant50.getText()),Integer.parseInt(cant100.getText()),Integer.parseInt(cant200.getText()),Integer.parseInt(cant500.getText()),Integer.parseInt(cant1000.getText()));
				
				totalesCant.setText(String.valueOf(NuevoTotalCantidad));
				totalesDinero.setText("$ " + String.valueOf(NuevoTotalDinero));
			}
		});
		btn1000.setBounds(204, 154, 80, 20);
		getContentPane().add(btn1000);
		
		JButton nueva = new JButton("Nueva");
		nueva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(totalesCant.getText()!="0") {
				int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(opcion==0) {
				dinero1000.setText(String.valueOf("$0"));
				cant1000.setText(String.valueOf("0"));
				dinero500.setText(String.valueOf("$0"));
				cant500.setText(String.valueOf("0"));
				dinero200.setText(String.valueOf("$0"));
				cant200.setText(String.valueOf("0"));
				dinero100.setText(String.valueOf("$0"));
				cant100.setText(String.valueOf("0"));
				dinero50.setText(String.valueOf("$0"));
				cant50.setText(String.valueOf("0"));
				totalesCant.setText(String.valueOf("0"));
				totalesDinero.setText(String.valueOf("$0"));
				}
				}else {
					JOptionPane.showMessageDialog(null, "La alcancía esta vacia", "Alerta!", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		nueva.setBounds(204, 184, 80, 20);
		getContentPane().add(nueva);
	}
}
