package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JLabel precios, vuelto;
    public MyFrame() {
        //cosas del JFrame

        super("EXPENDEDOR");
        setLayout(null);
        setSize(900, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Images/icono.jpg");
        setIconImage(image.getImage());



        //Aquí está la creación de los JPanels principales (:
        JPanel panelprincipal = new JPanel();
        JPanel panelexpendedor = new JPanel();
        JPanel panelcomprador = new JPanel();

        // creación de los JLabels
        JLabel producto = new JLabel();
        JLabel deposito = new JLabel();
        vuelto = new JLabel();
        precios = new JLabel();

        // el panel principal!!!
        panelprincipal.setLayout(null);
        panelprincipal.setBackground(new Color(255, 228, 225));
        panelprincipal.setSize(1000, 500);


        //el layout del panelexpendedor
        panelexpendedor.setLayout(new GridLayout(3, 3));
        panelexpendedor.setBounds(50, 50, 400, 300);
        panelexpendedor.setBackground(Color.pink);

        //el layout del panelcomprador (botones monedas)
        panelcomprador.setLayout(new GridLayout(3, 3));
        panelcomprador.setBounds(500, 100, 300, 230);
        panelcomprador.setBackground(Color.WHITE);

        //aquí es basicamente donde se muestra el precio y esas cosas, es un JLabel
        precios.setText("si apretas un producto aquí aparecerá su precio:)");
        precios.setForeground(new Color(229,43,80));
        precios.setFont(new Font("Elephant", Font.PLAIN, 12));
        precios.setBounds(500, 15, 300, 80);
        precios.setOpaque(true);
        precios.setBackground(new Color(255, 205, 205));
        precios.setHorizontalAlignment(SwingConstants.CENTER);
        precios.setVerticalAlignment(SwingConstants.CENTER);

        //JLabel donde se devuelve el producto
        producto.setText("aquí está su producto!!!");
        producto.setForeground(new Color(229,43,80));
        producto.setFont(new Font("Elephant", Font.PLAIN, 12));
        producto.setOpaque(true);
        producto.setBackground(new Color(255, 205, 205));
        producto.setBounds(50, 370, 400, 50);

        //Jlabel donde se da el vuelto
        vuelto.setBounds(500, 350, 300, 40);
        vuelto.setOpaque(true);
        vuelto.setBackground(new Color(255, 205, 205));
        vuelto.setText("vuelto!!!");
        vuelto.setForeground(new Color(229,43,80));
        vuelto.setFont(new Font("Elephant", Font.PLAIN, 12));
        vuelto.setHorizontalAlignment(SwingConstants.CENTER);
        vuelto.setVerticalAlignment(SwingConstants.CENTER);


        //creando botones y agregandolos al panel del expendedor
        JButton botoncocacola = new JButton("1");
        panelexpendedor.add(botoncocacola);
        botoncocacola.setForeground(new Color(229,43,80));

        JButton botonsprite = new JButton("             2");
        panelexpendedor.add(botonsprite);
        botonsprite.setForeground(new Color(229,43,80));

        JButton botonfanta = new JButton("3");
        panelexpendedor.add(botonfanta);
        botonfanta.setForeground(new Color(229,43,80));

        JButton botonsuper8 = new JButton("4");
        panelexpendedor.add(botonsuper8);
        botonsuper8.setForeground(new Color(229,43,80));

        JButton botonsnickers = new JButton("       5");
        panelexpendedor.add(botonsnickers);
        botonsnickers.setForeground(new Color(229,43,80));

        JButton botonquenohacenada = new JButton();
        panelexpendedor.add(botonquenohacenada);
        botonquenohacenada.setForeground(new Color(229,43,80));
        botonquenohacenada.setEnabled(false);

        //aquí se le agrega un listener a todos los botones
        botoncocacola.addActionListener(new BotonProductoListener());
        botonsprite.addActionListener(new BotonProductoListener());
        botonfanta.addActionListener(new BotonProductoListener());
        botonsuper8.addActionListener(new BotonProductoListener());
        botonsnickers.addActionListener(new BotonProductoListener());

        //el color de los botones
        botoncocacola.setBackground(Color.pink);
        botonsprite.setBackground(Color.PINK);
        botonfanta.setBackground(Color.PINK);
        botonsuper8.setBackground(Color.PINK);
        botonsnickers.setBackground(Color.PINK);
        botonquenohacenada.setBackground(Color.PINK);

        //esto es para sacarle un borde feo alrededor de las imagenes
        botoncocacola.setFocusable(false);
        botonsprite.setFocusable(false);
        botonfanta.setFocusable(false);
        botonsuper8.setFocusable(false);
        botonsnickers.setFocusable(false);
        botonquenohacenada.setFocusable(false);

        //agregar imagenes de los productos
        ImageIcon cocacola = new ImageIcon("src/Images/ccocacola.png");
        ImageIcon sprite = new ImageIcon("src/Images/spritee.png");
        ImageIcon fanta = new ImageIcon("src/Images/fanta.png");
        ImageIcon super8 = new ImageIcon("src/Images/super8.png");
        ImageIcon snickers = new ImageIcon("src/Images/snickers.png");

        //agregar las imagenes a los botones
        botoncocacola.setIcon(new ImageIcon(cocacola.getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH)));
        botonsprite.setIcon(new ImageIcon(sprite.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH)));
        botonfanta.setIcon(new ImageIcon(fanta.getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH)));
        botonsuper8.setIcon(new ImageIcon(super8.getImage().getScaledInstance(100, 130, Image.SCALE_SMOOTH)));
        botonsnickers.setIcon(new ImageIcon(snickers.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

        //añadir botones para panelcomprador
        JButton moneda100 = new JButton("100");
        moneda100.setForeground(Color.BLACK);
        moneda100.setBackground(Color.PINK);
        panelcomprador.add(moneda100);
        moneda100.setHorizontalTextPosition(JButton.CENTER);
        moneda100.setVerticalTextPosition(JButton.CENTER);
        moneda100.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda100.setFocusable(false);

        JButton moneda500 = new JButton("500");
        moneda500.setForeground(Color.BLACK);
        moneda500.setBackground(Color.PINK);
        panelcomprador.add(moneda500);
        moneda500.setHorizontalTextPosition(JButton.CENTER);
        moneda500.setVerticalTextPosition(JButton.CENTER);
        moneda500.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda500.setFocusable(false);

        JButton moneda1000 = new JButton("1000");
        moneda1000.setForeground(Color.BLACK);
        moneda1000.setBackground(Color.PINK);
        panelcomprador.add(moneda1000);
        moneda1000.setHorizontalTextPosition(JButton.CENTER);
        moneda1000.setVerticalTextPosition(JButton.CENTER);
        moneda1000.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda1000.setFocusable(false);

        JButton moneda1500 = new JButton("1500");
        moneda1500.setForeground(Color.BLACK);
        moneda1500.setBackground(Color.PINK);
        panelcomprador.add(moneda1500);
        moneda1500.setHorizontalTextPosition(JButton.CENTER);
        moneda1500.setVerticalTextPosition(JButton.CENTER);
        moneda1500.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,10));
        moneda1500.setFocusable(false);

        JButton pagar = new JButton("Aceptar");
        pagar.setForeground(new Color(0,150,0));
        pagar.setFont(new Font("Elephant", Font.PLAIN, 12));
        panelcomprador.add(pagar);
        pagar.setFocusable(false);
        pagar.setBackground(new Color(255, 205, 205));

        JButton borrar = new JButton("Cancelar");
        borrar.setForeground(new Color(229,43,80));
        borrar.setFont(new Font("Elephant", Font.PLAIN, 12));
        panelcomprador.add(borrar);
        borrar.setFocusable(false);
        borrar.setBackground(new Color(255, 205, 205));

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

        //agregar todos los paneles al frame!!!
        panelprincipal.add(panelexpendedor);
        panelprincipal.add(panelcomprador);
        panelprincipal.add(precios);
        panelprincipal.add(producto);
        panelprincipal.add(deposito);
        panelprincipal.add(vuelto);
        add(panelprincipal);
        setVisible(true);
    }

    //tengo esto aquí solamente para ir probando mientras edito el GUI. después hay que sacarlo
    /*public static void main(String[] args) {

        MyFrame frame = new MyFrame();
    }

     */

    public class BotonProductoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            switch (e.getActionCommand()) {
                case "1":
                    precios.setText(" COCACOLA $1000 ");
                    break;
                case "             2":
                    precios.setText(" SPRITE $1000 ");
                    break;
                case "3":
                    precios.setText(" FANTA $1000 ");
                    break;
                case "4":
                    precios.setText(" SUPER 8 $500 ");
                    break;
                case "       5":
                    precios.setText(" SNICKERS $500 ");
                    break;

            }

        }


    }
}
