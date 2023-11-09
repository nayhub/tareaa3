package GUI;

import Tarea2.Expendedor;

import javax.swing.*;

public class SpriteDeposito extends VentanaDeposito {
    private Expendedor expendedor;
    public SpriteDeposito(Expendedor expendedor) {
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
        SpriteDeposito graficador = new SpriteDeposito(expendedor);
        graficador.agregarElemento();
        frame.add(graficador);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);
        frame.setVisible(true);
        return frame;
    }
}