package GUI;

public class Moneda100Deposito extends MonedaDeposito{
    public Moneda100Deposito(PanelComprador panelComprador) {
        super(panelComprador);
    }

    @Override
    public void agregarMonedas() {
        depositoMonedas.add("100");
    }
}
