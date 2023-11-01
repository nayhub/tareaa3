package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal() {
        exp = new PanelExpendedor();
        PanelComprador cf = new PanelComprador();
        this.setBackground(Color.white);
    }

}