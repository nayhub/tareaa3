package GUI;

import Tarea2.NoHayProductoException;
import Tarea2.PagoInsuficienteException;
import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * EstadoPanel es una clase que extiende JPanel y representa el estado del panel expendedor.
 * Contiene un JLabel que muestra el estado actual del panel.
 */
public class EstadoPanel extends JPanel implements ActionListener {
    JLabel estado;
    private PanelComprador panelComprador;
    private PanelExpendedor panelExpendedor;

    /**
     * Constructor de la clase EstadoPanel.
     * Crea un nuevo objeto EstadoPanel con un JLabel que menciona que selecciones un producto.
     */
    public EstadoPanel() {

        estado = new JLabel("Seleccione un producto");
        setLayout(null);
        //estado.setText("si apretas un producto aquí aparecerá su precio:)");
        estado.setForeground(new Color(229,43,80));
        estado.setBounds(500, 25, 300, 80);
        estado.setOpaque(true);
        estado.setBackground(new Color(255, 205, 205));
        estado.setHorizontalAlignment(SwingConstants.CENTER);
        estado.setVerticalAlignment(SwingConstants.CENTER);
        add(estado); // Agregar el JLabel al panel
        estado.setVisible(true);
        repaint();
    }

    /**
     * Este método actualiza el estado del panel.
     * @param a El nuevo estado del panel.
     */
    public void refreshEstadoPanel(String a){
        estado.setText(a);
        repaint();
    }

    /**
     * Este método se encarga de manejar los eventos de acción.
     * @param e El precio y nombre del producto.
     */
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "1":
                estado.setText(" COCACOLA $1000 ");
                break;
            case "             2":
                estado.setText(" SPRITE $1000 ");
                break;
            case "3":
                estado.setText(" FANTA $1000 ");
                break;
            case "4":
                estado.setText(" SUPER 8 $500 ");
                break;
            case "       5":
                estado.setText(" SNICKERS $500 ");
                break;

        }

    }

    /**
     * Este método se encarga de dibujar los componentes del panel.
     * @param g El objeto Graphics utilizado para dibujar los componentes.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    /**
     * Método principal de la clase EstadoPanel.
     * Crea una ventana de prueba y la hace visible.
     * @param args Los argumentos de la línea de comandos.
     * @throws NoHayProductoException Si no hay productos disponibles.
     * @throws PagoInsuficienteException Si el pago es insuficiente.
     */
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException {
        ventanaTest v = new ventanaTest();
        v.setVisible(true);
    }
}
