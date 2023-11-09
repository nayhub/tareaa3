package GUI;

import Tarea2.NoHayProductoException;
import Tarea2.PagoInsuficienteException;
import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstadoPanel extends JPanel implements ActionListener {
    JLabel estado;
    private PanelComprador panelComprador;
    private PanelExpendedor panelExpendedor;

    public EstadoPanel() {


        estado = new JLabel("Seleccione un producto");
        setLayout(null);
        //estado.setText("si apretas un producto aquí aparecerá su precio:)");
        estado.setForeground(new Color(229,43,80));
        //estado.setFont(new Font("Elephant", Font.PLAIN, 12));
        estado.setBounds(500, 25, 300, 80);
        estado.setOpaque(true);
        estado.setBackground(new Color(255, 205, 205));
        estado.setHorizontalAlignment(SwingConstants.CENTER);
        estado.setVerticalAlignment(SwingConstants.CENTER);
        add(estado); // Agregar el JLabel al panel
        estado.setVisible(true);
        repaint();
    }
    public void refreshEstadoPanel(String a){
        estado.setText(a);
        repaint();
    }
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "1":
                estado.setText(" COCACOLA $1000 ");
                break;
            case "             2":
                estado.setText(" SPRITE $1000 ");
                break;
            case "3":
                estado.setText(" FANTA $1000 ");
                break;
            case "4":
                estado.setText(" SUPER 8 $500 ");
                break;
            case "       5":
                estado.setText(" SNICKERS $500 ");
                break;

        }

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException {
        ventanaTest v = new ventanaTest();
        //JFrame v = new JFrame();
        //EstadoPanel panel = new EstadoPanel();
        //v.add(panel);
        v.setVisible(true);
    }
}
