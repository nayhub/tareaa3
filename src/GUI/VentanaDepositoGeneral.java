package GUI;

import Tarea2.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * VentanaDepositoGeneral es una clase que representa la ventana de depósitos del expendedor.
 * Contiene los depósitos de monedas y productos.
 */
public class VentanaDepositoGeneral {
    private Expendedor expendedor;
    private PanelComprador panelComprador;

    private CocacolaDeposito cocacolaDeposito;
    private Super8Deposito super8Deposito;
    private SpriteDeposito spriteDeposito;
    private FantaDeposito fantaDeposito;
    private SnickersDeposito snickersDeposito;
    private MonedaDeposito monedaDeposito;

    /**
     * Constructor de la clase VentanaDepositoGeneral.
     * Crea un nuevo objeto VentanaDepositoGeneral con los depósitos de monedas y productos.
     * @param expendedor El expendedor de la aplicación.
     * @param monedaDeposito El depósito de monedas de la aplicación.
     */
    public VentanaDepositoGeneral(Expendedor expendedor, MonedaDeposito monedaDeposito){
        this.expendedor = expendedor;
        this.monedaDeposito = monedaDeposito;

       // monedaDeposito = new MonedaDeposito(expendedor, panelComprador.moneda);
        cocacolaDeposito = new CocacolaDeposito(expendedor);
        super8Deposito = new Super8Deposito(expendedor);
        spriteDeposito = new SpriteDeposito(expendedor);
        fantaDeposito = new FantaDeposito(expendedor);
        snickersDeposito = new SnickersDeposito(expendedor);


    }

    /**
     * Devuelve un objeto JFrame que representa la ventana de depósito del expendedor.
     * La ventana contiene los depósitos de monedas y productos.
     * @return Un objeto JFrame que representa la ventana de depósito del expendedor.
     */
    public JFrame getVentanaDeposito(){
        JFrame frame = new JFrame("Deposito");

        frame.setLayout(new GridLayout(6,1) );
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //se recargan todos los depositos

                for(int i=0; i<expendedor.numProducto; i++){
                    cocacolaDeposito.borrarElemento();
                    super8Deposito.borrarElemento();
                    spriteDeposito.borrarElemento();
                    fantaDeposito.borrarElemento();
                    snickersDeposito.borrarElemento();

                }
                for(int i=0; i<expendedor.numProducto;i++){
                    cocacolaDeposito.agregarElemento();
                    super8Deposito.agregarElemento();
                    spriteDeposito.agregarElemento();
                    fantaDeposito.agregarElemento();
                    snickersDeposito.agregarElemento();
                }

                expendedor.recargarProductos();

            }
        });


        cocacolaDeposito = new CocacolaDeposito(expendedor);
        super8Deposito = new Super8Deposito(expendedor);
        spriteDeposito = new SpriteDeposito(expendedor);
        fantaDeposito = new FantaDeposito(expendedor);
        snickersDeposito = new SnickersDeposito(expendedor);


        for(int i=0; i<expendedor.numProducto;i++){
            cocacolaDeposito.agregarElemento();
            super8Deposito.agregarElemento();
            spriteDeposito.agregarElemento();
            fantaDeposito.agregarElemento();
            snickersDeposito.agregarElemento();
        }
        frame.add(cocacolaDeposito);
        frame.add(super8Deposito);
        frame.add(spriteDeposito);
        frame.add(fantaDeposito);
        frame.add(snickersDeposito);
        //frame.add(monedaDeposito);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);
        frame.setVisible(true);
        return frame;
    }
    public void getCocacola(){
        cocacolaDeposito.borrarElemento();
    }
    public void getSprite(){
        spriteDeposito.borrarElemento();
    }
    public void getFanta(){
        fantaDeposito.borrarElemento();
    }
    public void getSnickers(){
        snickersDeposito.borrarElemento();
    }
    public void getSuper8(){
        super8Deposito.borrarElemento();
    }
}
