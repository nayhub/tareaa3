package GUI;

import Tarea2.Expendedor;
import Tarea2.Moneda;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MonedaDeposito extends JPanel {
    private PanelComprador panelComprador;
    protected ArrayList <String> depositoMonedas;
    private Moneda moneda;
    public MonedaDeposito(PanelComprador panelComprador) {
        this.panelComprador = panelComprador;
        depositoMonedas = new ArrayList<>();
    }


    private String getMonedaArraylist(int a){
        String moneda = panelComprador.monedasArraylist.get(a).getValor() + "";
        return moneda;
    }
    public void agregarMonedas(){
        depositoMonedas.add("");
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String monedas : depositoMonedas) {
            g.setColor(Color.YELLOW);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.BLACK);
            g.drawString(monedas.toString(), x + 3, y + 20);
            x += 60;
        }
    }

}
