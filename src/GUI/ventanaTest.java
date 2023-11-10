package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * ventanaTest es una clase que extiende JFrame y representa la ventana principal del expendedor.
 * Contiene el título de la ventana, el diseño, el tamaño, la ubicación, la imagen del icono y la visibilidad.
 */

public class ventanaTest extends JFrame {

    public ventanaTest(){
        super("EXPENDEDOR");
        setLayout( new BorderLayout());
        setSize(900, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/Images/icono.jpg");
        setIconImage(image.getImage());
        setVisible(true);
    }
}
