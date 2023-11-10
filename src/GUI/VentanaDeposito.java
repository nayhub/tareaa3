package GUI;

import Tarea2.CocaCola;
import Tarea2.Expendedor;
import Tarea2.Producto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * VentanaDeposito es una clase que extiende JPanel y representa el depósito de monedas y productos del expendedor (La aplicación Expendedor).
 * Contiene los elementos del depósito y el expendedor.
 */
public class VentanaDeposito extends JPanel {
    protected ArrayList<String> elementos;
    private Expendedor expendedor;

    /**
     * Constructor de la clase VentanaDeposito.
     * Crea un nuevo objeto VentanaDeposito con los elementos del depósito y el expendedor de la aplicación.
     * @param expendedor El expendedor de la aplicación.
     */
    public VentanaDeposito(Expendedor expendedor){
        elementos = new ArrayList<>();
        this.expendedor = expendedor;
    }

    /**
     * Agrega un elemento al depósito.
     */
    public void agregarElemento() {
        elementos.add("");
        repaint();
    }

    /**
     * Borra el último elemento del depósito.
     */
    public void borrarElemento() {
        if (!elementos.isEmpty()) {
            elementos.remove(elementos.size() - 1);
            repaint();
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String elemento : elementos) {
            g.setColor(Color.gray);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.WHITE);
            g.drawString(elemento.toString(), x + 3, y + 20);
            x += 60;
        }
    }
}
