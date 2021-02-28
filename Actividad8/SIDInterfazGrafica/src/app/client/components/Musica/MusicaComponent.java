/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Musica;

/**
 *
 * @author alexh
 */
public class MusicaComponent {
    
    private MusicaTemplate musicaTemplate;
    

    public MusicaComponent() {
            
        this.musicaTemplate = new MusicaTemplate(this);
    }

    public MusicaTemplate getMusicaTemplate() {
        
        return this.musicaTemplate;
    }
    
}
