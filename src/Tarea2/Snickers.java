package Tarea2;

import Tarea2.Dulce;

/**
 * Clase que representa un dulce de Tarea2.Snickers
 * Hereda de la clase Tarea2.Dulce
 */
public class Snickers extends Dulce {
    /**
     * Constructor de la clase Tarea2.Snickers
     * @param serie El número de serie del dulce.
     */
    public Snickers(int serie) {
        super(serie);
    }
    /**
     * Método abstracto que devuelve el nombre del dulce
     * @return El nombre del dulce
     */
    @Override
    public String sonido() {
        //super.sonido()
        return "Tarea2.Snickers";
    }
}
