/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Musica;


import app.client.components.Canciones.CancionesComponent;
import app.client.components.Canciones.CancionesTemplate;
import app.client.components.Playlist.PlaylistComponent;
import app.client.components.Playlist.PlaylistTemplate;
import app.services.ObjetosGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alexh
 */
public class MusicaTemplate extends JPanel{
    
    private MusicaComponent musicaComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    
    //Declaracion de Objetos graficos
    private JPanel pSuperior, pInferior,pCancion1,pCancion2,pCancion3,pCancion4;
    private ImageIcon iCancion1,iCancion2,iCancion3,iCancion4;
    private JLabel lTituloSuperior,lTituloInferior;
    private JButton bSuperiorNext,bSuperiorPrev,bSliderInferiorNext,bSuperiorInferiorPrev;
    public MusicaTemplate(MusicaComponent musicaComponent) {
        this.musicaComponent = musicaComponent;
        sObjGraficos= ObjetosGraficosService.getServicio();
        sRecursos= RecursosService.getServicio();
        this.musicaComponent.getClass();
        this.setSize(990, 560);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
        this.crearObjetosDecoradores();
        this.crearJpaneles();
        this.crearContenidoPSuperior();
        this.crearContenidoPinferior();
        }
    public void crearObjetosDecoradores(){
        this.iCancion1=new ImageIcon("resources//imagenes//Canciones//Album1.jpg");
        this.iCancion2=new ImageIcon("resources//imagenes//Canciones//Album2.jpg");
        this.iCancion3=new ImageIcon("resources//imagenes//Canciones//Album3.jpg");
        this.iCancion4=new ImageIcon("resources//imagenes//Canciones//Album4.jpg");
        
    }
    public void crearJpaneles(){
        this.pSuperior = sObjGraficos.construirPanel(
                0, 0, 990, 280,
                Color.black,
                null
        );
        this.add(pSuperior);

        this.pInferior = sObjGraficos.construirPanel(
                0, 280, 990, 280,
                Color.black,
                null
        );
        this.add(pInferior);
    }
    public void crearContenidoPSuperior(){
       lTituloSuperior=sObjGraficos.construirJLabel("Solo para ti", 40, 0, 100, 20,null, null, null, null, Color.white, null, null);
       pSuperior.add(lTituloSuperior);
       CancionesTemplate c1= new CancionesComponent("Un mix infinito de favoritos y  nuevas canciones",iCancion1).getCancionesTemplate();
       c1.setLocation(40,30);
       pSuperior.add(c1);
       CancionesTemplate c2= new CancionesComponent("Con Placebo, Red hot Chill Peppers, Kongs of Leon, Nirvana",iCancion2).getCancionesTemplate();
       c2.setLocation(80+c1.getWidth(),30);
       pSuperior.add(c2);
       CancionesTemplate c3= new CancionesComponent("Con R.E.M, U2, Depeche Mode The Police",iCancion3).getCancionesTemplate();
       c3.setLocation(120+c2.getWidth()*2,30);
       pSuperior.add(c3);
       CancionesTemplate c4= new CancionesComponent("Con The Cure , The Smiths , New Order , Faith and the Muse",iCancion4).getCancionesTemplate();
       c4.setLocation(160+c3.getWidth()*3,30);
       pSuperior.add(c4);
    }
    public void crearContenidoPinferior(){
       lTituloInferior=sObjGraficos.construirJLabel("Playlist recomendadas", 40, 0, 300, 20,null, null, null, null, Color.white, null, null);
       pInferior.add(lTituloInferior);
       PlaylistTemplate c1= new PlaylistComponent("Poperreo","47 canciones-124.593 fans",iCancion1).getPlaylistTemplate();
       c1.setLocation(40,30);
       pInferior.add(c1);
       PlaylistTemplate c2= new PlaylistComponent("Latinos revelacion","50 canciones-108.714 fans",iCancion2).getPlaylistTemplate();
       c2.setLocation(80+c1.getWidth(),30);
       pInferior.add(c2);
       PlaylistTemplate c3= new PlaylistComponent("Hard rock classics","47 canciones-207.535 fans",iCancion3).getPlaylistTemplate();
       c3.setLocation(120+c2.getWidth()*2,30);
       pInferior.add(c3);
       PlaylistTemplate c4= new PlaylistComponent("Rock en español","47 canciones-80.133 fans",iCancion4).getPlaylistTemplate();
       c4.setLocation(160+c3.getWidth()*3,30);
       pInferior.add(c4);
    }
}
