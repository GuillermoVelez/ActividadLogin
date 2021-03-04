/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Musica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author alexh
 */
public class MusicaComponent extends MouseAdapter{
    
    private MusicaTemplate musicaTemplate;
    

    public MusicaComponent() {
            
        this.musicaTemplate = new MusicaTemplate(this);
    }

    public MusicaTemplate getMusicaTemplate() {
        
        return this.musicaTemplate;
    }
     @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() instanceof JButton) {
            

        }
    }
     @Override
     public void mouseEntered(MouseEvent me) {
        if (me.getSource() instanceof JButton) {
            JButton boton = (JButton) me.getSource();
            boton.setContentAreaFilled(true);
            boton.setBackground(musicaTemplate.getsRecursos().getColorFondoClaro());
        }
    }
     @Override
    public void mouseExited(MouseEvent me) {
       if (me.getSource() instanceof JButton) {
            JButton boton = (JButton) me.getSource();
            boton.setContentAreaFilled(false);
            boton.setBackground(musicaTemplate.getsRecursos().getColorFondoClaro());
        }
    }
}
