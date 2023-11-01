package Tarea2;

import java.util.ArrayList;
/**
 * Clase que representa un depósito.
 * @param <T> El tipo de objeto que se almacena en el depósito.
 */
public class Deposito<T>{
    private ArrayList<T> al;
    /**
     * Constructor de la clase Tarea2.Deposito.
     */
    public Deposito(){ al = new ArrayList<>(); }
    /**
     * Método que agrega un producto al depósito.
     * @param b El producto a agregar al depósito.
     */
    public void addProducto(T b){ al.add(b); }
    /**
     * Método que devuelve el primer producto del depósito y lo elimina del mismo.
     * @return El primer producto del depósito.
     */
    public T getProducto(){

        if(al.size()==0) return null;

        T b = al.remove(0);
        return b;
    }
}