package GUI;

import Tarea2.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * PanelExpendedor es una clase que extiende JPanel y representa el panel expendedor de la aplicación.
 * Contiene los botones de selección de producto, el estado del panel y el depósito de monedas.
 */
public class PanelExpendedor extends JPanel {
    private VentanaDepositoGeneral VentanaDeposito;
    private EstadoPanel estadoPanel;
    private PanelComprador panelComprador;
    private int seleccion;
    private MonedaDeposito monedaDeposito;
    private MonedaDepositoGeneral monedaDepositoGeneral;

    //Array de Jbutton para configurar cuando un boton está seleccionado
    private JButton[] botones;

    /**
     * Constructor de la clase PanelExpendedor.
     * Crea un nuevo objeto PanelExpendedor con los botones de selección de producto, el estado del panel y el depósito de monedas.
     * @param panelComprador El panel del comprador.
     * @param estadoPanel El estado del panel.
     */
    public PanelExpendedor(PanelComprador panelComprador, EstadoPanel estadoPanel) {

        botones = new JButton[5];
        seleccion = 0;

        setLayout(new GridLayout(3, 3));
        setBounds(50, 50, 400, 300);
        setBackground(Color.pink);

        this.panelComprador = panelComprador;
        this.estadoPanel = estadoPanel;
        monedaDeposito = new MonedaDeposito(panelComprador);
        monedaDepositoGeneral = new MonedaDepositoGeneral(monedaDeposito);

        Expendedor expendedor = new Expendedor(5);
        VentanaDeposito = new VentanaDepositoGeneral(expendedor,monedaDeposito);
        VentanaDeposito.getVentanaDeposito();

        JLabel producto = new JLabel();
        //JLabel donde se devuelve el producto
        producto.setText("aquí está su producto!!!");
        producto.setForeground(new Color(229, 43, 80));
        producto.setFont(new Font("Elephant", Font.PLAIN, 12));
        producto.setOpaque(true);
        producto.setBackground(new Color(255, 205, 205));
        producto.setBounds(50, 370, 400, 50);



        JLabel precios;



        precios = new JLabel();

        //aquí es basicamente donde se muestra el precio y esas cosas, es un JLabel
        precios.setText("Seleccione un Producto:)");
        precios.setForeground(new Color(229, 43, 80));
        precios.setFont(new Font("Elephant", Font.PLAIN, 12));
        precios.setBounds(500, 15, 300, 80);
        precios.setOpaque(true);
        precios.setBackground(new Color(255, 205, 205));
        precios.setHorizontalAlignment(SwingConstants.CENTER);
        precios.setVerticalAlignment(SwingConstants.CENTER);


        //creando botones y agregandolos al panel del expendedor
        JButton botoncocacola = new JButton("1");
        botones[0] = botoncocacola;
        add(botoncocacola);
        botoncocacola.setForeground(new Color(229, 43, 80));
        botoncocacola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //seleccion 0 es cuando seleccionas por primera vez y seleccion 1 para cuando seleccionas por segunda vez para comprar
                    if (seleccion == 0) {
                        seleccion = 1;
                    } else if (seleccion == 1) {

                        if(monedaDeposito.getMonedaTotal().getValor() <= 0){
                            throw new PagoIncorrectoException("Pago Invalido, ingrese una moneda");
                        }


                        Comprador comprador = new Comprador(panelComprador.getMonedaDeposito().getMonedaTotal(), 1, expendedor);
                        VentanaDeposito.getCocacola();
                        estadoPanel.refreshEstadoPanel("Seleccione otro producto para volver a comprar");
                        compraAction(comprador.queConsumiste(), (monedaDeposito.getMonedaTotal().getValor() - seleccionarProducto.coca.getValor()));
                        monedaDeposito.borrarMonedas();
                        panelComprador.reiniciarprecioTotalmonedasArraylist();
                        seleccion = 0;
                    } else {
                        seleccion = 1;
                    }

                } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException | ArithmeticException ex) {
                    errorAction(ex);
                }
            }
        });
        botoncocacola.addActionListener(new ButtonClickListener());

        JButton botonsprite = new JButton("             2");
        botones[1] = botonsprite;
        add(botonsprite);
        botonsprite.setForeground(new Color(229, 43, 80));
        botonsprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (seleccion == 0) {
                        seleccion = 2;
                    } else if (seleccion == 2) {
                        if((monedaDeposito.getMonedaTotal().getValor()) == 0){
                            throw new PagoIncorrectoException("Pago Invalido, ingrese una moneda");
                        }else{

                            Comprador comprador = new Comprador(panelComprador.getMonedaDeposito().getMonedaTotal(), 2, expendedor);
                            VentanaDeposito.getSprite();
                            panelComprador.moneda = null;
                            compraAction(comprador.queConsumiste(), (monedaDeposito.getMonedaTotal().getValor() - seleccionarProducto.sprite.getValor()));
                            monedaDeposito.borrarMonedas();
                            panelComprador.reiniciarprecioTotalmonedasArraylist();
                        }
                        seleccion = 0;
                    } else {
                        seleccion = 2;
                    }


                } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException ex) {
                    errorAction(ex);
                }

            }
        });
        botonsprite.addActionListener(new ButtonClickListener());

        JButton botonfanta = new JButton("3");
        botones[2] = botonfanta;
        add(botonfanta);
        botonfanta.setForeground(new Color(229, 43, 80));
        botonfanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (seleccion == 0) {
                        seleccion = 3;
                    } else if (seleccion == 3) {
                        if((monedaDeposito.getMonedaTotal().getValor()) == 0){
                            throw new PagoIncorrectoException("Pago Invalido, ingrese una moneda");
                        }else {
                            Comprador comprador = new Comprador(panelComprador.getMonedaDeposito().getMonedaTotal(), 3, expendedor);
                            VentanaDeposito.getFanta();
                            panelComprador.moneda = null;
                            compraAction(comprador.queConsumiste(), (monedaDeposito.getMonedaTotal().getValor() - seleccionarProducto.fanta.getValor()));
                            monedaDeposito.borrarMonedas();
                            panelComprador.reiniciarprecioTotalmonedasArraylist();
                        }
                        seleccion = 0;
                    } else {
                        seleccion = 3;
                    }


                } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException ex) {
                    errorAction(ex);
                }

            }
        });
        botonfanta.addActionListener(new ButtonClickListener());

        JButton botonsuper8 = new JButton("4");
        botones[3] = botonsuper8;
        add(botonsuper8);
        botonsuper8.setForeground(new Color(229, 43, 80));
        botonsuper8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (seleccion == 0) {
                        seleccion = 4;
                    } else if (seleccion == 4) {
                        if((monedaDeposito.getMonedaTotal().getValor()) == 0){
                            throw new PagoIncorrectoException("Pago Invalido, ingrese una moneda");
                        }else {
                            Comprador comprador = new Comprador(panelComprador.getMonedaDeposito().getMonedaTotal(), 5, expendedor);
                            VentanaDeposito.getSuper8();
                            panelComprador.moneda = null;
                            compraAction(comprador.queConsumiste(), (monedaDeposito.getMonedaTotal().getValor() - seleccionarProducto.super8.getValor()));
                            monedaDeposito.borrarMonedas();
                            panelComprador.reiniciarprecioTotalmonedasArraylist();
                        }
                        seleccion = 0;
                    } else {
                        seleccion = 4;
                    }


                } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException ex) {
                    errorAction(ex);
                }

            }
        });
        botonsuper8.addActionListener(new ButtonClickListener());

        JButton botonsnickers = new JButton("       5");
        botones[4] = botonsnickers;
        add(botonsnickers);
        botonsnickers.setForeground(new Color(229, 43, 80));
        botonsnickers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (seleccion == 0) {
                        seleccion = 5;
                    } else if (seleccion == 5) {
                        if((monedaDeposito.getMonedaTotal().getValor()) == 0){
                            throw new PagoIncorrectoException("Pago Invalido, ingrese una moneda");
                        }else {
                            Comprador comprador = new Comprador(panelComprador.getMonedaDeposito().getMonedaTotal(), 4, expendedor);
                            VentanaDeposito.getSnickers();
                            panelComprador.moneda = null;
                            compraAction(comprador.queConsumiste(), (monedaDeposito.getMonedaTotal().getValor() - seleccionarProducto.snickers.getValor()));
                            monedaDeposito.borrarMonedas();
                            panelComprador.reiniciarprecioTotalmonedasArraylist();
                        }
                        seleccion = 0;
                    } else {
                        seleccion = 5;
                    }


                } catch (PagoInsuficienteException | NoHayProductoException | PagoIncorrectoException ex) {
                    errorAction(ex);
                }
            }
        });
        botonsnickers.addActionListener(new ButtonClickListener());

        JButton botonquenohacenada = new JButton();
        add(botonquenohacenada);
        botonquenohacenada.setForeground(new Color(229, 43, 80));
        botonquenohacenada.setEnabled(false);


        //aquí se le agrega un listener a todos los botones
        botoncocacola.addActionListener(estadoPanel);
        botonsprite.addActionListener(estadoPanel);
        botonfanta.addActionListener(estadoPanel);
        botonsuper8.addActionListener(estadoPanel);
        botonsnickers.addActionListener(estadoPanel);


        botoncocacola.setBackground(Color.pink);
        botonsprite.setBackground(Color.PINK);
        botonfanta.setBackground(Color.PINK);
        botonsuper8.setBackground(Color.PINK);
        botonsnickers.setBackground(Color.PINK);
        botonquenohacenada.setBackground(Color.PINK);

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

        //esto es para sacarle un borde feo alrededor de las imagenes
        botoncocacola.setFocusable(false);
        botonsprite.setFocusable(false);
        botonfanta.setFocusable(false);
        botonsuper8.setFocusable(false);
        botonsnickers.setFocusable(false);
        botonquenohacenada.setFocusable(false);

        //VentanaDeposito.getVentanaDeposito();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public void errorAction(Exception ex) {

        // crea la ventana emergente de error
        JFrame frame = new JFrame("Error");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Ha ocurrido un error:");
        JTextArea textArea = new JTextArea(ex.getMessage());
        textArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textArea);

        frame.add(panel);
        frame.setVisible(true);
        throw new RuntimeException(ex);
    }


    //ventana emergente que te dice lo que compraste
    public void compraAction(String a, int b) {
        JFrame frame = new JFrame("Compra realizada con exito");
        frame.setSize(500, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JLabel label = new JLabel("Gracias por su compra de: " + a + " Su vuelto es: " + b);

        JPanel panel = new JPanel();
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }

    //cambia el color de fondo del producto seleccionado
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            // Cambiar el fondo de todos los botones
            for (JButton button : botones) {
                if (button == source) {
                    button.setBackground(Color.orange);  // Cambiar color del botón seleccionado
                } else {
                    button.setBackground(Color.pink);    // Cambiar color de los demás botones
                }
            }
        }
    }
}

