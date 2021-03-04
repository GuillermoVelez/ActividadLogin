/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Canciones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Guillermo_Velez
 */
public class CancionesComponent extends MouseAdapter{
     private CancionesTemplate cancionesTemplate;
     private ImageIcon iDimAux;
    

    public CancionesComponent(String texto, ImageIcon iImagen) {
            
        this.cancionesTemplate = new CancionesTemplate(this,texto,iImagen);
    }

    public CancionesTemplate getCancionesTemplate() {
        
        return this.cancionesTemplate;
    }
    @Override
     public void mouseEntered(MouseEvent me) {
  
       JButton boton = (JButton) me.getSource();
       boton.setIcon(cancionesTemplate.getBreproducirGrande());
       

        
    }
     @Override
    public void mouseExited(MouseEvent me) {
       JButton boton = (JButton) me.getSource();
       boton.setIcon(cancionesTemplate.getBreproducirPequeño());
    }
    
}
