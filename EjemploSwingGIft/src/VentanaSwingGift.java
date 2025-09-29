import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaSwingGift extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pNorte, pEste, pOeste, pCentro, pSur;
	private JButton btnmdat, btnlimpiar, btnsalir;
	
	public VentanaSwingGift() {
		setTitle("Ejemplo de Componentes Swing");
		setBounds(600, 800, 600, 800);
		setLocationRelativeTo(null);;
		
		
		pNorte = new JPanel();
		pEste = new JPanel();
		pOeste = new JPanel();
		pCentro = new JPanel();

		btnmdat = new JButton("Mostrar Datos");
		btnlimpiar = new JButton("Limpiar");
		
		getContentPane().add(pSur, BorderLayout.SOUTH);
		
		pSur.add(btnmdat);
		pSur.add(btnlimpiar);
		pSur.add(btnsalir);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaSwingGift();
	}

}
