/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.VistaPrincipal;

import app.client.components.Explorar.ExplorarComponent;
import app.client.components.Favoritos.FavoritosComponent;
import app.client.components.Musica.MusicaComponent;
import app.client.components.Shows.ShowsComponent;
import app.client.components.barraTitulo.BarraTituloComponent;
import app.client.components.navegacionUsuario.NavegacionUsuarioComponent;
import app.client.components.reproduccion.ReproduccionComponent;
import app.client.login.LoginComponent;
import java.awt.Color;

/**
 *
 * @author Guillermo_Velez
 */
public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private ExplorarComponent explorarComponent;
    private FavoritosComponent favoritosComponent;
    private MusicaComponent musicaComponent;
    private ShowsComponent showsComponent;
    private LoginComponent loginComponent;
    private MusicaComponent musicacomponent;
    private ExplorarComponent explorarcomponent;
    private ShowsComponent showscomponent;
    private FavoritosComponent favoritoscomponent;

    private BarraTituloComponent btComponent;
    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private ReproduccionComponent reproduccionComponent;

    public VistaPrincipalComponent(LoginComponent loginComponent) {
        this.loginComponent = loginComponent;
        this.vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        this.btComponent = new BarraTituloComponent(this);
        this.navegacionUsuarioComponent = new NavegacionUsuarioComponent(this);
        this.musicaComponent = new MusicaComponent();
        this.reproduccionComponent = new ReproduccionComponent(this);
        
        vistaPrincipalTemplate.getpImagenes().add(musicaComponent.getMusicaTemplate());
        vistaPrincipalTemplate.getpBuscar().add(btComponent.getBarraTituloTemplate());
        vistaPrincipalTemplate.getpOpciones().add(navegacionUsuarioComponent.getNavegacionUsuarioTemplate());
        vistaPrincipalTemplate.getpReproudccion().add(reproduccionComponent.getReproduccionTemplate());
                
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {

        return this.vistaPrincipalTemplate;
    }

    public void mostrarComponente(String comando) {
        
        vistaPrincipalTemplate.getpImagenes().removeAll();
        
        switch (comando) {
            case "Explorar":
                if (this.explorarComponent == null) {
                    this.explorarComponent = new ExplorarComponent();
                    
                }

                vistaPrincipalTemplate.getpImagenes()
                        .add(explorarComponent.getExplorarTemplate());

                break;

            case "Favoritos":
                if (this.favoritosComponent == null) {
                    this.favoritosComponent = new FavoritosComponent();
                }

                vistaPrincipalTemplate.getpImagenes()
                        .add(favoritosComponent.getFavoritosTemplate());

                break;

            case "Música":
 
                vistaPrincipalTemplate.getpImagenes()
                        .add(musicaComponent.getMusicaTemplate());

                break;

            case "Shows":
                if (this.showsComponent == null) {
                    this.showsComponent = new ShowsComponent();
                }

                vistaPrincipalTemplate.getpImagenes()
                        .add(showsComponent.getShowsTemplate());

                break;
        }
        vistaPrincipalTemplate.repaint();
    }
}
