/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Explorar;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author alexh
 */
public class ExplorarTemplate extends JPanel {

    private ExplorarComponent explorarComponent;

    public ExplorarTemplate(ExplorarComponent explorarComponent) {
        this.explorarComponent = explorarComponent;
        this.explorarComponent.getClass();
        this.setSize(990, 560);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
        this.setVisible(true);
    }

}
