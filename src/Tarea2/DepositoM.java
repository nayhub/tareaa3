package Tarea2;

import java.util.ArrayList;
/**
 * Clase que representa un depósito de monedas.
 */
public class DepositoM{
    private ArrayList<Moneda> mon;
    /**
     * Constructor de la clase Tarea2.DepositoM.
     */
    public DepositoM(){ mon = new ArrayList(); }
    /**
     * Método que agrega una moneda al depósito.
     * @param b La moneda a agregar al depósito.
     */
    public void addMoneda(Moneda b){ mon.add(b); }
    /**
     * Método que devuelve la primera moneda del depósito y la elimina del mismo.
     * @return La primera moneda del depósito.
     */
    public Moneda getMoneda(){
        if(mon.size()==0) return null;

        Moneda b = mon.remove(0);
        return b;
    }
}