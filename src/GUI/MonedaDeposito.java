package GUI;

import Tarea2.Expendedor;
import Tarea2.Moneda;
import Tarea2.MonedaEspecial;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MonedaDeposito extends JPanel {
    private PanelComprador panelComprador;
    protected ArrayList <String> depositoMonedas;
    private Moneda moneda;
    private MonedaEspecial monedaEspecial;
    public MonedaDeposito(PanelComprador panelComprador) {
        this.panelComprador = panelComprador;
        depositoMonedas = new ArrayList<>();
        monedaEspecial = new MonedaEspecial();
    }
    public void agregarMonedas(){
        depositoMonedas.add("TEST");
        repaint();
    }
    public Moneda getMonedaTotal(){
        monedaEspecial.addValor(panelComprador.precioTotalmonedasArraylist());
        return monedaEspecial;
    }
    //transformar de moneda a String
    public void getStringMonedaArraylist(int a){
        String moneda = panelComprador.monedasArraylist.get(a).getValor() + "";
        depositoMonedas.add(moneda);
    }

    public void borrarMonedas(){
        depositoMonedas.clear();
        monedaEspecial.reiniciarValor();
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String monedas : depositoMonedas) {
            g.setColor(Color.orange);
            g.fillRect(x, y, 58, 30);
            g.setColor(Color.BLACK);
            g.drawString(monedas.toString(), x + 3, y + 20);
            x += 60;
        }
    }
    public void repaintMonedas(){
        repaint();
    }
    public void TEST(){
        System.out.println("Moneda Ingresada: "+depositoMonedas.get(0));

    }

    public ArrayList<String> getDepositoMonedas() {
        return depositoMonedas;
    }
}
