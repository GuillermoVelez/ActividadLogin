/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Explorar;


/**
 *
 * @author alexh
 */
public class ExplorarComponent {
    
    private ExplorarTemplate explorarTemplate;
    

    public ExplorarComponent() {
            
        this.explorarTemplate = new ExplorarTemplate(this);
    }

    public ExplorarTemplate getExplorarTemplate() {
        
        return this.explorarTemplate;
    }
    
}
