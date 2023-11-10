package GUI;

import Tarea2.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelComprador extends JPanel {
    private Comprador comprador;
    public Moneda moneda;
    public int totalmonedasArraylist;
    public ArrayList <Moneda> monedasArraylist;
    private EstadoPanel estadoPanel;
    private MonedaDeposito monedaDeposito;

    public PanelComprador(EstadoPanel estadoPanel){
        this.estadoPanel = estadoPanel;
        monedasArraylist = new ArrayList<>();
        moneda = new MonedaEspecial();
        monedaDeposito = new MonedaDeposito(this);
        //ventanaMonedas.getVentanaMonedas();

        //estadoPanel.setVisible(true);
        setLayout(new GridLayout(2, 2));
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
            moneda100.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Moneda100 moneda100 = new Moneda100();
                    moneda = moneda100;
                    addmonedasArrayList(moneda);
                    //monedasArraylist.add(moneda);
                    estadoPanel.refreshEstadoPanel("seleccione el producto");

                    //ventanaMonedas.addMoneda("100");

                }
            });


        JButton moneda500 = new JButton("500");
        moneda500.setForeground(Color.BLACK);
        moneda500.setBackground(Color.PINK);
        add(moneda500);
        moneda500.setHorizontalTextPosition(JButton.CENTER);
        moneda500.setVerticalTextPosition(JButton.CENTER);
        moneda500.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda500.setFocusable(false);
            moneda500.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Moneda moneda500 = new Moneda500();
                    moneda = moneda500;
                    addmonedasArrayList(moneda);

                    estadoPanel.refreshEstadoPanel("seleccione el producto");
                }
            });




        JButton moneda1000 = new JButton("1000");
        moneda1000.setForeground(Color.BLACK);
        moneda1000.setBackground(Color.PINK);
        add(moneda1000);
        moneda1000.setHorizontalTextPosition(JButton.CENTER);
        moneda1000.setVerticalTextPosition(JButton.CENTER);
        moneda1000.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda1000.setFocusable(false);
        moneda1000.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Moneda1000 moneda1000 = new Moneda1000();
                moneda = moneda1000;
                addmonedasArrayList(moneda);

                estadoPanel.refreshEstadoPanel("seleccione el producto");
            }
        });


        JButton moneda1500 = new JButton("1500");
        moneda1500.setForeground(Color.BLACK);
        moneda1500.setBackground(Color.PINK);
        add(moneda1500);
        moneda1500.setHorizontalTextPosition(JButton.CENTER);
        moneda1500.setVerticalTextPosition(JButton.CENTER);
        moneda1500.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda1500.setFocusable(false);
        moneda1500.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Moneda1500 moneda1500 = new Moneda1500();
                moneda = moneda1500;
                addmonedasArrayList(moneda);
                estadoPanel.refreshEstadoPanel("seleccione el producto");
            }
        });


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

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }


    public EstadoPanel getEstadoPanel(){
        return estadoPanel;
    }
    public int precioTotalmonedasArraylist(){
        totalmonedasArraylist = 0;
        for(int i=0; i<monedasArraylist.size(); i++){
            totalmonedasArraylist += monedasArraylist.get(i).getValor();
        }
        return totalmonedasArraylist;
    }
    public void reiniciarprecioTotalmonedasArraylist(){
            monedasArraylist.clear();
    }
    public void addmonedasArrayList(Moneda a){
        monedasArraylist.add(a);
        monedaDeposito.borrarMonedas();
        for(int i=0; i<monedasArraylist.size();i++){
            monedaDeposito.getStringMonedaArraylist(i);
            monedaDeposito.agregarMonedas();
            monedaDeposito.TEST();
        }
        System.out.println(""+precioTotalmonedasArraylist());
    }

    public MonedaDeposito getMonedaDeposito() {
        return monedaDeposito;
    }
}

