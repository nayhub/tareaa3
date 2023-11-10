package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase que representa el deposito general.
 */
public class MonedaDepositoGeneral {
    private PanelComprador panelComprador;
    private MonedaDeposito monedaDeposito;

    /**
     * Constructor para la clase MonedaDepositoGeneral.
     *
     * @param monedaDeposito Una instancia de la clase MonedaDeposito.
     */
    public MonedaDepositoGeneral(MonedaDeposito monedaDeposito){
        //this.panelComprador = panelComprador;
        this.monedaDeposito = monedaDeposito;
    }

    /**
     * Imprime el depósito de monedas.
     *
     * @return Una instancia de la clase JFrame.
     */
    public JFrame printMonedaDeposito ( ){
        JFrame frame = new JFrame("Deposito Monedas");
        frame.setLayout( new GridLayout(1,1));
        frame.setLocation(0,800);
        frame.setSize(400,200);

        frame.addMouseListener(new MouseAdapter() {
                                   @Override
                                   public void mouseClicked(MouseEvent e) {
                                       super.mouseClicked(e);
                                       monedaDeposito.borrarMonedas();

                                   }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(monedaDeposito);


        return (frame);
    }
}
