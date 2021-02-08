package app.client.components.navegacionUsuario;

/**
 *
 * @author alexh
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.client.VistaPrincipal.VistaPrincipalComponent;

public class NavegacionUsuarioComponent implements ActionListener {

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
        this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim());
    }
}
