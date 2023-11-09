package GUI;

import Tarea2.Comprador;
import Tarea2.NoHayProductoException;
import Tarea2.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private Comprador comprador;
    public PanelComprador(){

        setLayout(new GridLayout(3, 3));
        setBounds(500, 100, 300, 230);
        setBackground(Color.WHITE);


        //añadir botones para panelcomprador
        JButton moneda100 = new JButton("100");
        moneda100.setForeground(Color.BLACK);
        moneda100.setBackground(Color.PINK);
        add(moneda100);
        moneda100.setHorizontalTextPosition(JButton.CENTER);
        moneda100.setVerticalTextPosition(JButton.CENTER);
        moneda100.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda100.setFocusable(false);

        JButton moneda500 = new JButton("500");
        moneda500.setForeground(Color.BLACK);
        moneda500.setBackground(Color.PINK);
        add(moneda500);
        moneda500.setHorizontalTextPosition(JButton.CENTER);
        moneda500.setVerticalTextPosition(JButton.CENTER);
        moneda500.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda500.setFocusable(false);

        JButton moneda1000 = new JButton("1000");
        moneda1000.setForeground(Color.BLACK);
        moneda1000.setBackground(Color.PINK);
        add(moneda1000);
        moneda1000.setHorizontalTextPosition(JButton.CENTER);
        moneda1000.setVerticalTextPosition(JButton.CENTER);
        moneda1000.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda1000.setFocusable(false);

        JButton moneda1500 = new JButton("1500");
        moneda1500.setForeground(Color.BLACK);
        moneda1500.setBackground(Color.PINK);
        add(moneda1500);
        moneda1500.setHorizontalTextPosition(JButton.CENTER);
        moneda1500.setVerticalTextPosition(JButton.CENTER);
        moneda1500.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda1500.setFocusable(false);


        //agregar las imagenes para las monedas
        ImageIcon moneda1 = new ImageIcon("src/Images/mmoneda.png");

        ImageIcon moneda2 = new ImageIcon("src/Images/mmoneda.png");
        ImageIcon moneda3 = new ImageIcon("src/Images/mmoneda.png");
        ImageIcon moneda4 = new ImageIcon("src/Images/mmoneda.png");


        //agregar imagenes a las monedas
        moneda100.setIcon(new ImageIcon(moneda1.getImage().getScaledInstance(100, 75, Image.SCALE_SMOOTH)));
        moneda500.setIcon(new ImageIcon(moneda2.getImage().getScaledInstance(100, 75, Image.SCALE_SMOOTH)));
        moneda1000.setIcon(new ImageIcon(moneda3.getImage().getScaledInstance(100, 75, Image.SCALE_SMOOTH)));
        moneda1500.setIcon(new ImageIcon(moneda4.getImage().getScaledInstance(100, 75, Image.SCALE_SMOOTH)));


        JButton pagar = new JButton("Aceptar");
        pagar.setForeground(new Color(0,150,0));
        pagar.setFont(new Font("Elephant", Font.PLAIN, 12));
        add(pagar);
        pagar.setFocusable(false);
        pagar.setBackground(new Color(255, 205, 205));

        JButton borrar = new JButton("Cancelar");
        borrar.setForeground(new Color(229,43,80));
        borrar.setFont(new Font("Elephant", Font.PLAIN, 12));
        add(borrar);
        borrar.setFocusable(false);
        borrar.setBackground(new Color(255, 205, 205));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException {
        ventanaTest v = new ventanaTest();
        PanelComprador panel = new PanelComprador();
        v.add(panel);
        v.setVisible(true);
    }
}

