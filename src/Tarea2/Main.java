package Tarea2;

import Tarea2.Comprador;
import Tarea2.Expendedor;

public class Main {
    public static void main(String[] args) {

        Expendedor exp = new Expendedor(6);
        Moneda m = null;
        Comprador comprador = null;

        try {
            Moneda1000 m1000 = new Moneda1000();
            Moneda100 m100 = new Moneda100();
            Moneda500 m500 = new Moneda500();
            Moneda1500 m1500 = new Moneda1500();

            comprador = new Comprador(m1500, seleccionarProducto.sprite.getOpcion(), exp);

            System.out.println(comprador.queConsumiste() + "\n" + comprador.cuantoVuelto());

        } catch (PagoInsuficienteException ins) {
            //int a = comprador.cuantoVuelto();
            System.out.println("No le alcanza el producto");
        } catch (NoHayProductoException noHay) {
            //int a = comprador.cuantoVuelto();
            System.out.println("No queda el dulce o bebida elegido");
        } catch (PagoIncorrectoException ErrorEnPago) {
            System.out.println("Error en su pago, intente nuevamente");
        }
    }
}