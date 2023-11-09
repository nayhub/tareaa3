package Tarea2;

public class MonedaEspecial extends Moneda {
    private int Valor;

    public MonedaEspecial(){ }
    @Override
    public int getValor() {
        return Valor;
    }
    public void addValor (int a){
        Valor += a;
    }
    public void reiniciarValor(){
        Valor = 0;
    }
}
