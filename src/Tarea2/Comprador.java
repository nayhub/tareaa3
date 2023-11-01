package Tarea2;

/**
 * Clase que representa un comprador.
 */
public class Comprador {
    private String sonido;
    private Expendedor exp;
    private int vuelto;

    /**
     * Constructor de la clase Tarea2.Comprador.
     * @param m La moneda utilizada para la compra.
     * @param cualProducto El número del producto a comprar.
     * @param exp El expendedor utilizado para la compra.
     * @throws PagoInsuficienteException Si el pago es insuficiente para comprar el producto.
     * @throws NoHayProductoException Si no hay suficientes unidades del producto para la venta.
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoInsuficienteException, NoHayProductoException {
        this.exp = exp;
        Producto a = exp.comprarProducto(m, cualProducto);
        if (a== null) sonido = null;
        else{
            sonido = a.sonido();
        }
        boolean b = true ;
        while(b){

            Moneda s = exp.getVuelto();
            if (s != null) vuelto += s.getValor();
            else b = false;
        }
    }
    /**
     * Método que devuelve el vuelto del comprador.
     * @return El vuelto del comprador.
     */
    public int cuantoVuelto(){ return vuelto; }
    /**
     * Método que devuelve el nombre del producto consumido por el comprador.
     * @return El nombre del producto consumido por el comprador.
     */
    public String queConsumiste(){ return sonido; }
}