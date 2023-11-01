package Tarea2;

/**
 * Clase que representa una bebida de Coca-Cola.
 * Hereda de la clase Tarea2.Bebida.
 */
public class CocaCola extends Bebida {
    /**
     * Constructor de la clase Tarea2.CocaCola.
     * @param s El número de serie de la bebida.
     */
    public CocaCola(int s){ super(s); }

    /**
     * Método abstracto que devuelve el nombre de la bebida
     * @return El nombre de la bebida
     */
    @Override
    public String sonido() {
        return "cocacola";
    }
}
