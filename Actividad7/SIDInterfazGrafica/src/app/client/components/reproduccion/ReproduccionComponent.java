package app.client.components.reproduccion;

/**
 *
 * @author alexh
 */

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReproduccionComponent implements ActionListener {
    
    private ReproduccionTemplate reproduccionTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public ReproduccionComponent (VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        
        this.reproduccionTemplate = new ReproduccionTemplate(this);
    }
    
    public ReproduccionTemplate getReproduccionTemplate(){
        return this.reproduccionTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
}
