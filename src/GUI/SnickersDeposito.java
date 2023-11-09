package GUI;

import Tarea2.Expendedor;

import javax.swing.*;

public class SnickersDeposito extends VentanaDeposito {
    private Expendedor expendedor;
    public SnickersDeposito(Expendedor expendedor) {
        super(expendedor);
        this.expendedor = expendedor;
    }

    @Override
    public void agregarElemento() {
        elementos.add("Cocacola");
        repaint();
    }
    public JFrame getVentanaDeposito(String a){
        JFrame frame = new JFrame("Deposito");
        SnickersDeposito graficador = new SnickersDeposito(expendedor);
        graficador.agregarElemento();
        frame.add(graficador);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);
        frame.setVisible(true);
        return frame;
    }
}
