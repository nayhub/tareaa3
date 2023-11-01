package Tarea2;

/**
 * Clase abstracta que representa una bebida.
 * Hereda de la clase Tarea2.Producto.
 */
public abstract class Dulce extends Producto {
    /**
     * Constructor de la clase Tarea2.Dulce.
     * @param serie El número de serie del dulce.
     */

    public Dulce(int serie) {
        super(serie);
    }
    /**
     * Método que devuelve el número de serie del dulce.
     * @return El número de serie del dulce.
     */
    public int getSerie() {
        return serie;
    }
    /**
     * Método que devuelve el nombre del dulce.
     * @return El nombre del dulce.
     */
    @Override
    public String sonido() {
        return null;
    }
    //public abstract String comer();

}