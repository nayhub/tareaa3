package Tarea2;

/**
 * Clase abstracta que representa una moneda.
 * Implementa la interfaz Comparable.
 */
public abstract class Moneda implements Comparable <Moneda> {
    /**
     * Constructor de la clase Tarea2.Moneda.
     */
    public Moneda() { }
    /**
     * Método que compara dos objetos de tipo Tarea2.Moneda.
     * @param o El objeto a comparar con el objeto actual.
     * @return El resultado de la comparación entre los dos objetos.
     */
    @Override
    public int compareTo(Moneda o) {
        return Integer.compare(getValor(),(o.getValor()));
    }
    /**
     * Método abstracto que devuelve el valor de la moneda.
     * @return El valor de la moneda.
     */
    public abstract int getValor();

}