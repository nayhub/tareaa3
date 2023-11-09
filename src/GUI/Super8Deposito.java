package GUI;

import Tarea2.Expendedor;

import javax.swing.*;

public class Super8Deposito extends VentanaDeposito {
    private Expendedor expendedor;
    public Super8Deposito(Expendedor expendedor) {
        super(expendedor);
        this.expendedor = expendedor;
    }

    @Override
    public void agregarElemento() {
        elementos.add("Super8Deposito");
        repaint();
    }
    public JFrame getVentanaDeposito(String a){
        JFrame frame = new JFrame("Deposito");
        CocacolaDeposito graficador = new CocacolaDeposito(expendedor);
        graficador.agregarElemento();
        frame.add(graficador);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);
        frame.setVisible(true);
        return frame;
    }
}