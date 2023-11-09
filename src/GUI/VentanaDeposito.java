package GUI;

import Tarea2.CocaCola;
import Tarea2.Expendedor;
import Tarea2.Producto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaDeposito extends JPanel {
    protected ArrayList<String> elementos;
    private Expendedor expendedor;

    public VentanaDeposito(Expendedor expendedor){
        elementos = new ArrayList<>();
        this.expendedor = expendedor;
    }

    public void agregarElemento() {
        elementos.add("");
        repaint();
    }
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
