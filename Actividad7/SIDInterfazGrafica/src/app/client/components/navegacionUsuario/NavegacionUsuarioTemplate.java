package app.client.components.navegacionUsuario;

/**
 *
 * @author alexh
 */
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import app.services.RecursosService;
import app.services.ObjetosGraficosService;

public class NavegacionUsuarioTemplate extends JPanel {
    //private static final long serialVersionUID = 1L;

    private NavegacionUsuarioComponent navegacionUsuarioComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración objetos gráficos
    private JPanel pSuperior, pInferior;
    private JLabel lLogo, lsuscripcion;
    private JButton bMusica, bShows, bExplorar, bFavoritos, bMFavoritos, bPlaylist, bAlbumes, bArtistas, bPodcasts ;

    // Declaración Objetos Decoradores
    private ImageIcon iLogo, iSuscripcion, iMusica, iShows, iExplorar, iFavoritos, iDimAux;
    private Border bVacio;

    public NavegacionUsuarioTemplate(NavegacionUsuarioComponent navegacionUsuarioComponent) {

        this.navegacionUsuarioComponent = navegacionUsuarioComponent;
        this.sObjGraficos = ObjetosGraficosService.getServicio();
        this.sRecursos = RecursosService.getServicio();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJLabels();
        this.crearJButtons();

        this.setSize(210, 620);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.yellow);
    }

    public void crearJPanels() {
        this.pSuperior = sObjGraficos.construirPanel(
                0, 0, 210, 250,
                sRecursos.getColorPrincipal(),
                sRecursos.getBorderPOpciones()
        );
        this.add(pSuperior);

        this.pInferior = sObjGraficos.construirPanel(
                0, 250, 210, 370,
                sRecursos.getColorPrincipal(),
                sRecursos.getBorderPInfOpciones()
        );
        this.add(pInferior);
    }

    public void crearObjetosDecoradores() {

        this.iLogo = new ImageIcon("resources//imagenes//LogoW.png");
        this.iSuscripcion = new ImageIcon("resources//imagenes//suscripcion.png");
        this.iMusica = new ImageIcon("resources//imagenes//musica.png");
        this.iShows = new ImageIcon("resources//imagenes//shows.png");
        this.iExplorar = new ImageIcon("resources//imagenes//explorar.png");
        this.iFavoritos = new ImageIcon("resources//imagenes//favorito.png");

        this.bVacio = new EmptyBorder(2, 20, 2, 2);
    }

    public void crearJLabels() {

        //ICONO DEEZER
        iDimAux = new ImageIcon(
                iLogo.getImage().getScaledInstance(125, 25, Image.SCALE_AREA_AVERAGING)
        );
        this.lLogo = sObjGraficos.construirJLabel(
                null,
                20, 20, 125, 25,
                null,
                iDimAux,
                null, null, null, null,null
        );
        this.pSuperior.add(lLogo);

        //IMAGEN SUSCRIPCION
        iDimAux = new ImageIcon(
                iSuscripcion.getImage()
                        .getScaledInstance(180, 150, Image.SCALE_AREA_AVERAGING)
        );
        this.lsuscripcion = sObjGraficos.construirJLabel(
                null,
                (this.pSuperior.getWidth() - 180) / 2, 75, 180, 150,
                null,
                iDimAux,
                null, null, null, null,null
            
        );
        this.pSuperior.add(lsuscripcion);

    }

    public void crearJButtons() {

        //BOTON MUSICA
        iDimAux = new ImageIcon(
                iMusica.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bMusica = sObjGraficos.construirJButton(
                "      Musica",
                30, 5, 150, 30,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bMusica.setIcon(iDimAux);
        this.bMusica.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bMusica);

        //BOTON SHOWS
        iDimAux = new ImageIcon(
                iShows.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bShows = sObjGraficos.construirJButton(
                "      Shows",
                30, 45, 150, 30,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bShows.setIcon(iDimAux);
        this.bShows.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bShows);

        //BOTON EXPLORAR
        iDimAux = new ImageIcon(
                iExplorar.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bExplorar = sObjGraficos.construirJButton(
                "      Explorar",
                30, 85, 150, 30,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bExplorar.setIcon(iDimAux);
        this.bExplorar.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bExplorar);

        //BOTON FAVORITOS
        iDimAux = new ImageIcon(
                iFavoritos.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bFavoritos = sObjGraficos.construirJButton(
                "      Favoritos",
                30, 125, 150, 30,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bFavoritos.setIcon(iDimAux);
        this.bFavoritos.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bFavoritos);
        
        //BOTON MIS FAVORITOS
        this.bMFavoritos = sObjGraficos.construirJButton(
                "Mis favoritas",
                71, 170, 120, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.darkGray,
                "l",false
        );
        this.bMFavoritos.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bMFavoritos);
        
        //BOTON MIS PLAYLISTS
        this.bPlaylist = sObjGraficos.construirJButton(
                "Playlists",
                71, 195, 120, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.darkGray,
                "l",false
        );
        this.bPlaylist.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bPlaylist);
        
        //BOTON MIS ALBUMES
        this.bAlbumes = sObjGraficos.construirJButton(
                "Álbumes",
                71, 220, 120, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.darkGray,
                "l",false
        );
        this.bAlbumes.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bAlbumes);
        
        //BOTON ARTISTAS
        this.bArtistas = sObjGraficos.construirJButton(
                "Artistas",
                71, 245, 120, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.darkGray,
                "l",false
        );
        this.bArtistas.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bArtistas);
        
        //BOTON PODCASTS
        this.bPodcasts = sObjGraficos.construirJButton(
                "Podcasts",
                71, 270, 120, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.darkGray,
                "l",false
        );
        this.bPodcasts.addActionListener(navegacionUsuarioComponent);
        this.pInferior.add(bPodcasts);
        

    }

    public void setbMusica(JButton bMusica) {
        this.bMusica = bMusica;
    }

    public void setbShows(JButton bShows) {
        this.bShows = bShows;
    }

    public void setbExplorar(JButton bExplorar) {
        this.bExplorar = bExplorar;
    }

    public void setbFavoritos(JButton bFavoritos) {
        this.bFavoritos = bFavoritos;
    }

    public void setbMFavoritos(JButton bMFavoritos) {
        this.bMFavoritos = bMFavoritos;
    }

    public void setbPlaylist(JButton bPlaylist) {
        this.bPlaylist = bPlaylist;
    }

    public void setbAlbumes(JButton bAlbumes) {
        this.bAlbumes = bAlbumes;
    }

    public void setbArtistas(JButton bArtistas) {
        this.bArtistas = bArtistas;
    }

    public void setbPodcasts(JButton bPodcasts) {
        this.bPodcasts = bPodcasts;
    }

    public JButton getbMusica() {
        return bMusica;
    }

    public JButton getbShows() {
        return bShows;
    }

    public JButton getbExplorar() {
        return bExplorar;
    }

    public JButton getbFavoritos() {
        return bFavoritos;
    }

    public JButton getbMFavoritos() {
        return bMFavoritos;
    }

    public JButton getbPlaylist() {
        return bPlaylist;
    }

    public JButton getbAlbumes() {
        return bAlbumes;
    }

    public JButton getbArtistas() {
        return bArtistas;
    }

    public JButton getbPodcasts() {
        return bPodcasts;
    }

}
