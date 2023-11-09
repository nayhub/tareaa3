package GUI;

import Tarea2.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaDepositoGeneral {
    private Expendedor expendedor;

    private CocacolaDeposito cocacolaDeposito;
    private Super8Deposito super8Deposito;
    private SpriteDeposito spriteDeposito;
    private FantaDeposito fantaDeposito;
    private SnickersDeposito snickersDeposito;
    public VentanaDepositoGeneral(Expendedor expendedor){
        this.expendedor = expendedor;


        cocacolaDeposito = new CocacolaDeposito(expendedor);
        super8Deposito = new Super8Deposito(expendedor);
        spriteDeposito = new SpriteDeposito(expendedor);
        fantaDeposito = new FantaDeposito(expendedor);
        snickersDeposito = new SnickersDeposito(expendedor);

    }
    public JFrame getVentanaDeposito(){
        JFrame frame = new JFrame("Deposito");

        frame.setLayout(new GridLayout(5,1) );
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
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
