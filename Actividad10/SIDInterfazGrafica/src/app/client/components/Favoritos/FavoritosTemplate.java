/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Favoritos;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author alexh
 */
public class FavoritosTemplate extends JPanel{
    
     private FavoritosComponent favoritosComponent;

    public FavoritosTemplate(FavoritosComponent favoritosComponent) {
        this.favoritosComponent = favoritosComponent;
        this.favoritosComponent.getClass();
        
        this.setSize(990, 560);
        this.setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true);
    }
    
}
