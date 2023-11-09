package GUI;

import Tarea2.Expendedor;

import javax.swing.*;
import java.awt.*;

public class Super8Deposito extends VentanaDeposito {
    private Expendedor expendedor;
    public Super8Deposito(Expendedor expendedor) {
        super(expendedor);
        this.expendedor = expendedor;
    }

    @Override
    public void agregarElemento() {
        elementos.add("Super8");
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String elemento : elementos) {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.YELLOW);
            g.drawString(elemento.toString(), x + 3, y + 20);
            x += 60;
        }
    }
}