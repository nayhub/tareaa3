package GUI;

import javax.swing.*;
import java.awt.*;

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
