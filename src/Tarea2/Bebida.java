package Tarea2;

/**
 * Clase abstracta que representa una bebida.
 * Hereda de la clase Tarea2.Producto.
 */
public abstract class Bebida extends Producto {
    /**
     * Constructor de la clase Tarea2.Bebida.
     * @param serie El número de serie de la bebida.
     */
    public Bebida(int serie){
        super(serie);
    }
    /**
     * Método que devuelve el número de serie de la bebida.
     * @return El número de serie de la bebida.
     */
    public int getSerie() { return serie; }

    /**
     * Método que devuelve el nombre de la bebida
     * @return El nombre de la bebida
     */
    @Override
    public String sonido() {
        return null;
    }

}