package Tarea2;

import Tarea2.Dulce;

/**
 * Clase que representa un dulce Tarea2.Super8
 * Hereda de la clase Tarea2.Dulce
 */
public class Super8 extends Dulce {
    /**
     * Constructor de la clase Tarea2.Super8.
     * @param serie El número de serie del dulce
     */

    public Super8(int serie) {
        super(serie);
    }

    /**
     * Método abstracto que devuelve el nombre del dulce
     * @return El nombre del dulce
     */
    @Override
    public String sonido() {
        return "Super8";
    }
}
