package GUI;

import Tarea2.Expendedor;
import Tarea2.Moneda;
import Tarea2.MonedaEspecial;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Clase que extiende a JPanel y representa el deposito de monedas.
 */

public class MonedaDeposito extends JPanel {
    private PanelComprador panelComprador;
    protected ArrayList <String> depositoMonedas;
    private Moneda moneda;
    private MonedaEspecial monedaEspecial;

    /**
     * Constructor para la clase MonedaDeposito.
     *
     * @param panelComprador Una instancia de la clase panelComprador.
     */
    public MonedaDeposito(PanelComprador panelComprador) {
        this.panelComprador = panelComprador;
        depositoMonedas = new ArrayList<>();
        monedaEspecial = new MonedaEspecial();
        //moneda100Deposito = new Moneda100Deposito(this);

    }

    /**
     * Obtiene el valor total de la moneda.
     *
     * @return Una instancia de la clase Moneda.
     */
    public Moneda getMonedaTotal(){
        monedaEspecial.reiniciarValor();
        monedaEspecial.addValor(panelComprador.precioTotalmonedasArraylist());
        return monedaEspecial;
    }

    /**
     * Transforma la moneda a una cadena de caracteres.
     *
     * @param a Un entero que representa el índice de la moneda.
     */
    //transformar de moneda a String
    public void getStringMonedaArraylist(int a){
        String moneda = panelComprador.monedasArraylist.get(a).getValor() + "";
        depositoMonedas.add(moneda);
    }

    /**
     * Borra las monedas del depósito y repinta el componente.
     */
    public void borrarMonedas(){
        depositoMonedas.clear();
        //panelComprador.BorrarMonedasArrayList();
        repaintMonedas();
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50;
        int y = 50;

        for (String monedas : depositoMonedas) {
            g.setColor(Color.ORANGE);
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

    /**
     * Obtiene la lista de monedas del depósito.
     */
    public ArrayList<String> getDepositoMonedas() {
        return depositoMonedas;
    }


}
