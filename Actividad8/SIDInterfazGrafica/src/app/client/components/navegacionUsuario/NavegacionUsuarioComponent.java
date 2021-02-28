package app.client.components.navegacionUsuario;

/**
 *
 * @author alexh
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class NavegacionUsuarioComponent extends MouseAdapter implements ActionListener{

    private NavegacionUsuarioTemplate navegacionUsuarioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public NavegacionUsuarioComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        
        this.navegacionUsuarioTemplate = new NavegacionUsuarioTemplate(this);
    }

    public NavegacionUsuarioTemplate getNavegacionUsuarioTemplate() {
        return this.navegacionUsuarioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        boton.setForeground(Color.red);
      //  boton.setBorder(navegacionUsuarioTemplate.getsRecursos().getBorderBotonesVP());
        this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim());

    }
   /* @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }*/

    @Override
    public void mouseEntered(MouseEvent me) {
        JButton boton = (JButton) me.getSource();
        boton.setForeground(Color.red);
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        JButton boton = (JButton) me.getSource();
        if(me.getSource()== navegacionUsuarioTemplate.getbMusica() || me.getSource()==navegacionUsuarioTemplate.getbShows()|| me.getSource()== navegacionUsuarioTemplate.getbExplorar() || me.getSource()== navegacionUsuarioTemplate.getbFavoritos()){
            boton.setForeground(Color.white);
        }else{
            boton.setForeground(Color.darkGray);    
        }
    }
}
