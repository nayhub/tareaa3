package Tarea2;

import Tarea2.Moneda;

/**
 * Clase que representa una moneda de 100.
 * Hereda de la clase Tarea2.Moneda.
 */
public class Moneda100 extends Moneda {
    /**
     * Constructor de la clase Tarea2.Moneda100.
     */
    public Moneda100(){ super(); }
    /**
     * Método que devuelve el valor de la moneda.
     * @return El valor de la moneda.
     */
    public int getValor(){ return 100; }
}