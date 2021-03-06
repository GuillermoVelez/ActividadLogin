/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Favoritos;

/**
 *
 * @author alexh
 */
public class FavoritosComponent {
    
    private FavoritosTemplate favoritosTemplate;
    

    public FavoritosComponent() {
            
        this.favoritosTemplate = new FavoritosTemplate(this);
    }

    public FavoritosTemplate getFavoritosTemplate() {
        
        return this.favoritosTemplate;
    }
}
