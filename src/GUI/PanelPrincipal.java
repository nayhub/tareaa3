package GUI;

import Tarea2.Expendedor;
import Tarea2.NoHayProductoException;
import Tarea2.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
/**
 * PanelPrincipal es una clase que extiende JPanel y representa el panel principal del expendedor.
 * Contiene los paneles de comprador y expendedor, así como el estado del panel.
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private EstadoPanel estadoPanel;
    private Expendedor expendedor;
    /**
     * Constructor de la clase PanelPrincipal.
     * Crea un nuevo objeto PanelPrincipal con los paneles de comprador y expendedor, así como el estado del panel.
     */
    public PanelPrincipal () {
        estadoPanel = new EstadoPanel();
        com = new PanelComprador(estadoPanel);
        exp = new PanelExpendedor (com, estadoPanel);

        setLayout(null);
        setBackground(new Color(255, 228, 225));
        setSize(900, 500);

        add(com, BorderLayout.EAST);
        add(exp, BorderLayout.WEST);
        add(estadoPanel.estado, BorderLayout.NORTH);
    }

    /**
     * Este método se encarga de dibujar los componentes del panel.
     * @param g El objeto Graphics utilizado para dibujar los componentes.
     */
    public void paint (Graphics g) { //todo se dibuja a partir de este método
        super.paint(g);
    }

    /**
     * Método principal de la clase PanelPrincipal.
     * Crea una ventana de prueba y agrega un objeto PanelPrincipal a ella.
     * @param args Los argumentos de la línea de comandos.
     * @throws NoHayProductoException Si no hay productos disponibles.
     * @throws PagoInsuficienteException Si el pago es insuficiente.
     */
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException {
        ventanaTest v = new ventanaTest();
        PanelPrincipal panel = new PanelPrincipal();
        v.add(panel, BorderLayout.CENTER);
        v.setVisible(true);
    }
}
