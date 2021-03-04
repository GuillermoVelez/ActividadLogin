package app.client.components.reproduccion;

/**
 *
 * @author alexh
 */

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ReproduccionComponent extends MouseAdapter implements ActionListener {
    
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
     public void mouseEntered(MouseEvent me) {
       JButton boton = (JButton) me.getSource();
       boton.setContentAreaFilled(true);
       boton.setBackground(reproduccionTemplate.getsRecursos().getColorFondoClaro());
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
       JButton boton = (JButton) me.getSource();
       boton.setContentAreaFilled(false);
       boton.setBackground(reproduccionTemplate.getsRecursos().getColorFondoClaro());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
}
