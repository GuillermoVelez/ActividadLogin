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
      //  JButton CambiarColor= new JButton();
        this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim());
        
      //  CambiarColor=(JButton) e.getSource();
      //  CambiarColor.setForeground(Color.red);
        /*if(e.getSource()==navegacionUsuarioTemplate.getbAlbumes()){
            CambiarColor=navegacionUsuarioTemplate.getbAlbumes();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbAlbumes(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbArtistas()){
            CambiarColor=navegacionUsuarioTemplate.getbArtistas();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbArtistas(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbMFavoritos()){
            CambiarColor=navegacionUsuarioTemplate.getbMFavoritos();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbMFavoritos(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbExplorar()){
            CambiarColor=navegacionUsuarioTemplate.getbExplorar();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbExplorar(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbFavoritos()){
            CambiarColor=navegacionUsuarioTemplate.getbFavoritos();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbFavoritos(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbMusica()){
            CambiarColor=navegacionUsuarioTemplate.getbMusica();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbMusica(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbPlaylist()){
            CambiarColor=navegacionUsuarioTemplate.getbPlaylist();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbPlaylist(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbPodcasts()){
            CambiarColor=navegacionUsuarioTemplate.getbPodcasts();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbPodcasts(CambiarColor);
        }
        if(e.getSource()==navegacionUsuarioTemplate.getbShows()){
            CambiarColor=navegacionUsuarioTemplate.getbShows();
            CambiarColor.setForeground(Color.red);
            navegacionUsuarioTemplate.setbShows(CambiarColor);
        }*/
    }
}
