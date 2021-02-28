/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Shows;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author alexh
 */
public class ShowsTemplate extends JPanel {
    
    private ShowsComponent showsComponent;

    public ShowsTemplate(ShowsComponent showsComponent) {
        this.showsComponent = showsComponent;
        this.showsComponent.getClass();
        this.setSize(990, 560);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
