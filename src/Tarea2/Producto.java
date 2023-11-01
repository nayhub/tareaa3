package Tarea2;

/**
 * Clase abstracta que representa un dulce o una bebida.
 * Superclase de Tarea2.Bebida y Tarea2.Dulce.
 */
public abstract class Producto {
    /**
     * Constructor de la clase Tarea2.Producto.
     * @param serie El número de del producto.
     */
    protected int serie;
    /**
     * Método que devuelve el número de serie del producto.
     * @return El número de serie del producto.
     */
    public Producto(int serie) {
        this.serie = serie;
    }
    /**
     * Método que devuelve el nombre de la bebida o el dulce.
     * @return El nombre de la bebida o del dulce.
     */
    public abstract String sonido();
}