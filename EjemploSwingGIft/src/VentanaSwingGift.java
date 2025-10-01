import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VentanaSwingGift extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pNorte, pEste, pOeste, pCentro, pSur;
	private JButton btnmdat, btnlimpiar, btnsalir;
	private JTabbedPane panelPestanias;
	private JMenuBar barraMenu;
	private JMenu menuFichero;
	private JMenuItem itemMostrar, itemLimpiar, itemSalir;
	
	public VentanaSwingGift() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo de Componentes Swing");
		setSize(640, 840);
		setLocationRelativeTo(null);
		
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		menuFichero = new JMenu("Fichero");
		barraMenu.add(menuFichero);
		
		itemMostrar = new JMenuItem("Mostrar");
		menuFichero.add(itemMostrar);
		
		itemSalir = new JMenuItem("Exit");
		menuFichero.add(itemSalir);
		
		panelPestanias = new JTabbedPane();
		add(panelPestanias, BorderLayout.CENTER);
		
		panelPestanias.addTab("Datos personales", new JPanel());
		panelPestanias.add("Información", new JPanel());
		panelPestanias.add("Comentarios", new JPanel());

		setVisible(true);
	}
	public static void main(String[] args) {
		new VentanaSwingGift();
	}

}


