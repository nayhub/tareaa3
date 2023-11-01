package Tarea2;

/**
 * Enumeración que representa los productos disponibles en un expendedor.
 */
public enum seleccionarProducto {
    coca(1, 1000),
    sprite(2, 1000),
    fanta(3, 1000),
    snickers(4, 500),
    super8(5, 500);

    private int opcion;
    private int valor;

    /**
     * Constructor de la enumeración Tarea2.seleccionarProducto.
     * @param opcion El número de opción del producto.
     * @param valor El valor del producto.
     */
    seleccionarProducto(int opcion, int valor) {
        this.opcion = opcion;
        this.valor = valor;
    }

    /**
     * Método que devuelve el número de opción del producto.
     * @return El número de opción del producto.
     */
    public int getOpcion() {
        return opcion;
    }

    /**
     * Método que devuelve el valor del producto.
     * @return El valor del producto.
     */
    public int getValor() {
        return valor;
    }
}