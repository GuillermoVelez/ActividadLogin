/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Playlist;

import javax.swing.ImageIcon;

/**
 *
 * @author Guillermo_Velez
 */
public class PlaylistComponent {
    private PlaylistTemplate playlisttemplate;
    

    public PlaylistComponent(String texto,String texto2, ImageIcon iImagen) {
            
        this.playlisttemplate = new PlaylistTemplate(this,texto,texto2,iImagen);
    }

    public PlaylistTemplate getPlaylistTemplate() {
        
        return this.playlisttemplate;
    }
}
