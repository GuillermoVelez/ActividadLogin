/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Canciones;

import javax.swing.ImageIcon;

/**
 *
 * @author Guillermo_Velez
 */
public class CancionesComponent {
     private CancionesTemplate cancionesTemplate;
    

    public CancionesComponent(String texto, ImageIcon iImagen) {
            
        this.cancionesTemplate = new CancionesTemplate(this,texto,iImagen);
    }

    public CancionesTemplate getCancionesTemplate() {
        
        return this.cancionesTemplate;
    }
}
