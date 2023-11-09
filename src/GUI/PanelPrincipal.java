package GUI;

import Tarea2.Expendedor;
import Tarea2.NoHayProductoException;
import Tarea2.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private EstadoPanel estadoPanel;
    private Expendedor expendedor;



    public PanelPrincipal () {
        estadoPanel = new EstadoPanel();
        com = new PanelComprador(estadoPanel);
        exp = new PanelExpendedor (com, estadoPanel);


        setLayout(null);
        setBackground(new Color(255, 228, 225));
        setSize(900, 500);






        add(com, BorderLayout.EAST);
        add(exp, BorderLayout.WEST);
        add(estadoPanel.estado, BorderLayout.NORTH);
    }
    public void paint (Graphics g) { //todo se dibuja a partir de este método
        super.paint(g);
    }
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException {
        ventanaTest v = new ventanaTest();
        PanelPrincipal panel = new PanelPrincipal();
        v.add(panel, BorderLayout.CENTER);
        v.setVisible(true);
    }
}
