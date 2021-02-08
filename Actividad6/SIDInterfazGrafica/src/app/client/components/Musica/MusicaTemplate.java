/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Musica;


import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author alexh
 */
public class MusicaTemplate extends JPanel{
    
    private MusicaComponent musicaComponent;

    public MusicaTemplate(MusicaComponent musicaComponent) {
        this.musicaComponent = musicaComponent;
        this.musicaComponent.getClass();
        this.setSize(990, 560);
        this.setBackground(Color.GREEN);
        this.setLayout(null);
        this.setVisible(true);
        }
}
