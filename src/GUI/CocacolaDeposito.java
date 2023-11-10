package GUI;

import Tarea2.Expendedor;

import javax.swing.*;
import java.awt.*;

/**
 * Subclase de VentanaDeposito que sirve como deposito para CocaCola.
 */
public class CocacolaDeposito extends VentanaDeposito {
    private Expendedor expendedor;

    /**
     * Constructor para la clase CocacolaDeposito.
     *
     * @param expendedor Una instancia de la clase Expendedor.
     */
    public CocacolaDeposito(Expendedor expendedor) {
        super(expendedor);
        this.expendedor = expendedor;
    }

    /**
     * Agrega un elemento a la lista elementos y repinta el componente.
     */
    @Override
    public void agregarElemento() {
        elementos.add("Cocacola");
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String elemento : elementos) {
            g.setColor(Color.RED);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.WHITE);
            g.drawString(elemento.toString(), x + 3, y + 20);
            x += 60;
        }
    }
}
