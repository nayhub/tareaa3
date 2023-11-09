package Tarea2;

import Tarea2.CocaCola;
import Tarea2.Deposito;
import Tarea2.DepositoM;

/**
 * Clase que representa un expendedor.
 */
public class Expendedor {
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> Super8;
    private Deposito<Producto> snikers;
    private DepositoM monVu;
    private int precio;
    public int numProducto;

    /**
     * Constructor de la clase Tarea2.Expendedor.
     * @param numBebidas El número de bebidas disponibles en el expendedor.
     */
    public Expendedor(int numBebidas) {
        numProducto = numBebidas;
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        Super8 = new Deposito<>();
        snikers = new Deposito<>();
        monVu = new DepositoM();
        //precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.addProducto(cc);
            Producto sp = new Sprite(200 + i);
            sprite.addProducto(sp);
            Producto ft = new Fanta(300 + i);
            fanta.addProducto(ft);
            Producto s8 = new Super8(i);
            Super8.addProducto(s8);
            Producto sn = new Snickers((50 + i));
            snikers.addProducto(sn);

        }
    }
    /**
     * Método que permite comprar un producto del expendedor.
     * @param m La moneda utilizada para la compra.
     * @param n El número del producto a comprar.
     * @return El producto comprado.
     * @throws NoHayProductoException Si no hay suficientes unidades del producto para la venta.
     * @throws PagoIncorrectoException Si la moneda es nula.
     * @throws PagoInsuficienteException Si el pago es insuficiente para comprar el producto.
     */

    public Producto comprarProducto(Moneda m, int n) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        if (m == null) throw new PagoIncorrectoException("Pago Invalido");
        int vuelto = m.getValor();
        Producto cc = null;
        Producto sp = null;
        Producto ft = null;
        Producto sk = null;
        Producto s8 = null;

        switch (n) {
            case 1:
                if (m.getValor() >= seleccionarProducto.coca.getValor()) {
                    cc = (Producto) coca.getProducto();
                    if (cc != null) {
                        vuelto = m.getValor() - seleccionarProducto.coca.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 2:
                if (m.getValor() >= seleccionarProducto.sprite.getValor()) {
                    sp = (Producto) sprite.getProducto();
                    if (sp != null) {
                        vuelto = m.getValor() - seleccionarProducto.sprite.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 3:
                if (m.getValor() >= seleccionarProducto.fanta.getValor()) {
                    ft = (Producto) fanta.getProducto();
                    if (ft != null) {
                        vuelto = m.getValor() - seleccionarProducto.fanta.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 4:
                if (m.getValor() >= seleccionarProducto.snickers.getValor()) {
                    sk = (Producto) snikers.getProducto();
                    if (sk != null) {
                        vuelto = m.getValor() - seleccionarProducto.snickers.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            case 5:
                if (m.getValor() >= seleccionarProducto.super8.getValor()) {
                    s8 = (Producto) Super8.getProducto();
                    if (s8 != null) {
                        vuelto = m.getValor() - seleccionarProducto.super8.getValor();
                    } else {
                        throw new NoHayProductoException("No hay producto, elija otro por favor");
                    }
                } else {
                    throw new PagoInsuficienteException("Pago insuficiente");
                }
                break;
            default:
                throw new NoHayProductoException("No existe ese producto, elija otro por favor");
        }

        while (vuelto > 0) {
            monVu.addMoneda(new Moneda100());
            vuelto = vuelto - 100;
        }

        switch (n) {
            case 1:
                return cc;
            case 2:
                return sp;
            case 3:
                return ft;
            case 4:
                return sk;
            case 5:
                return s8;
            default:
                return null;
        }
    }
    /**
     * Método que devuelve el vuelto del comprador.
     * @return El vuelto del comprador en forma de monedas de 100.
     */
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
    public void recargarProductos(){

        //elimina todos los productos de todos los depositos, para que queden en el mismo valor (0)
        for (int i = 0; i < numProducto; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.removeProducto();
            Producto sp = new Sprite(200 + i);
            sprite.removeProducto();
            Producto ft = new Fanta(300 + i);
            fanta.removeProducto();
            Producto s8 = new Super8(i);
            Super8.removeProducto();
            Producto sn = new Snickers((50 + i));
            snikers.removeProducto();

        }
        //Recarga los depositos
        for (int i = 0; i < numProducto; i++) {
            Producto cc = new CocaCola(100 + i);
            coca.addProducto(cc);
            Producto sp = new Sprite(200 + i);
            sprite.addProducto(sp);
            Producto ft = new Fanta(300 + i);
            fanta.addProducto(ft);
            Producto s8 = new Super8(i);
            Super8.addProducto(s8);
            Producto sn = new Snickers((50 + i));
            snikers.addProducto(sn);

        }
    }
}