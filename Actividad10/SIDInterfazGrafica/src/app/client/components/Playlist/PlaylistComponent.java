/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Playlist;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Guillermo_Velez
 */
public class PlaylistComponent extends MouseAdapter{
    private PlaylistTemplate playlisttemplate;
    private ImageIcon iDimAux;

    public PlaylistComponent(String texto,String texto2, ImageIcon iImagen) {
            
        this.playlisttemplate = new PlaylistTemplate(this,texto,texto2,iImagen);
    }

    public PlaylistTemplate getPlaylistTemplate() {
        
        return this.playlisttemplate;
    }
    @Override
     public void mouseEntered(MouseEvent me) {
       JButton boton = (JButton) me.getSource();
       boton.setIcon(playlisttemplate.getBreproducirGrande());
       

        
    }
     @Override
    public void mouseExited(MouseEvent me) {
       JButton boton = (JButton) me.getSource();
       boton.setIcon(playlisttemplate.getBreproducirPequeño());
    }
}
