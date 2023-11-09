package GUI;

import Tarea2.Expendedor;

import javax.swing.*;
import java.awt.*;

public class FantaDeposito extends VentanaDeposito {
    private Expendedor expendedor;
    public FantaDeposito(Expendedor expendedor) {
        super(expendedor);
        this.expendedor = expendedor;
    }

    @Override
    public void agregarElemento() {
        elementos.add("Fanta");
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String elemento : elementos) {
            g.setColor(Color.ORANGE);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.WHITE);
            g.drawString(elemento.toString(), x + 3, y + 20);
            x += 60;
        }
    }
}
