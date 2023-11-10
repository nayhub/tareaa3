package GUI;

import Tarea2.Expendedor;

import javax.swing.*;
import java.awt.*;

/**
 * Subclase de VentanaDeposito que sirve como deposito para Sprite
 */
public class SpriteDeposito extends VentanaDeposito {
    private Expendedor expendedor;

    /**
     * Constructor para la clase SpriteDeposito.
     *
     * @param expendedor Una instancia de la clase Expendedor.
     */
    public SpriteDeposito(Expendedor expendedor) {
        super(expendedor);
        this.expendedor = expendedor;
    }

    /**
     * Agrega un elemento a la lista elementos y repinta el componente.
     */
    @Override
    public void agregarElemento() {
        elementos.add("Sprite");
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String elemento : elementos) {
            g.setColor(Color.green);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.WHITE);
            g.drawString(elemento.toString(), x + 3, y + 20);
            x += 60;
        }
    }
}