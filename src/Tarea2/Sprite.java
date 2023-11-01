package Tarea2;

import Tarea2.Bebida;

/**
 * Clase que representa una bebida de Tarea2.Sprite
 * Hereda de la clase Tarea2.Bebida.
 */
public class Sprite extends Bebida {
    /**
     * Constructor de la clase Tarea2.Sprite.
     * @param s El número de serie de la bebida.
     */
    public Sprite(int s){ super(s); }

    /**
     * Método abstracto que devuelve el nombre de la bebida
     * @return El nombre de la bebida
     */
    @Override
    public String sonido() {
        return "sprite";
    }
}