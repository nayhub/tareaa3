package Tarea2;

import Tarea2.Bebida;

/**
 * Clase que representa una bebida de Tarea2.Fanta
 * Hereda de la clase Tarea2.Bebida.
 */
public class Fanta extends Bebida {
    /**
     * Constructor de la clase Tarea2.Fanta.
     * @param serie El número de serie de la bebida.
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * Método abstracto que devuelve el nombre de la bebida
     * @return El nombre de la bebida
     */
    @Override
    public String sonido() {
        return "Fanta";
    }
}
