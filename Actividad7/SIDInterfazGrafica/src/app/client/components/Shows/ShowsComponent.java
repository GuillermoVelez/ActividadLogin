/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Shows;

/**
 *
 * @author alexh
 */
public class ShowsComponent {
    
    private ShowsTemplate showsTemplate;
    

    public ShowsComponent() {
            
        this.showsTemplate = new ShowsTemplate(this);
    }

    public ShowsTemplate getShowsTemplate() {
        
        return this.showsTemplate;
    }
    
}
