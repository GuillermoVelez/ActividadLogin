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
import app.services.graphicServices.ObjetosGraficosService;
import app.services.graphicServices.RecursosService;
import java.awt.Color;
import java.awt.Image;
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
    private JPanel pSuperior, pInferior,pCanciones,pPlaylists;
    private ImageIcon iCancion1,iCancion2,iCancion3,iCancion4,iCancion5,iCancion6,iCancion7,iCancion8;
    private ImageIcon iPlayList1,iPlayList2,iPlayList3,iPlayList4,iPlayList5,iPlayList6,iPlayList7,iPlayList8;
   // private ImageIcon iCancion1,iCancion2,iCancion3,iCancion4;
    private ImageIcon iPrev,iNext,iDimAux,iDimAux2;
    private JLabel lTituloSuperior,lTituloInferior;
    private JButton bSuperiorNext,bSuperiorPrev,bInferiorNext,bInferiorPrev;
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
        this.crearJButtons();
        this.crearContenidoPCanciones();
        this.crearContenidoPPlaylists();
        }
    public void crearObjetosDecoradores(){
        this.iCancion1=new ImageIcon("resources//imagenes//Canciones//Album1.jpg");
        this.iCancion2=new ImageIcon("resources//imagenes//Canciones//Album2.jpg");
        this.iCancion3=new ImageIcon("resources//imagenes//Canciones//Album3.jpg");
        this.iCancion4=new ImageIcon("resources//imagenes//Canciones//Album4.jpg");
        this.iCancion5=new ImageIcon("resources//imagenes//Canciones//BringMe.jpg");
        this.iCancion6=new ImageIcon("resources//imagenes//Canciones//CourtesyCall.jpg");
        this.iCancion7=new ImageIcon("resources//imagenes//Canciones//IveDone.jpg");
        this.iCancion8=new ImageIcon("resources//imagenes//Canciones//ACDC.jpg");
        this.iPlayList1=new ImageIcon("resources//imagenes//Canciones//Poperreo.jpg");
        this.iPlayList2=new ImageIcon("resources//imagenes//Canciones//karol.jpg");
        this.iPlayList3=new ImageIcon("resources//imagenes//Canciones//Playlist3.jpg");
        this.iPlayList4=new ImageIcon("resources//imagenes//Canciones//Playlist4.jpg");
        this.iPlayList5=new ImageIcon("resources//imagenes//Canciones//LaPlaya.jpg");
        this.iPlayList6=new ImageIcon("resources//imagenes//Canciones//Mason.jpg");
        this.iPlayList7=new ImageIcon("resources//imagenes//Canciones//daftpunk.jpg");
        this.iPlayList8=new ImageIcon("resources//imagenes//Canciones//karolg2.jpg");
        this.iPrev= new ImageIcon("resources//imagenes//menor.png");
        this.iNext= new ImageIcon("resources//imagenes//mayor.png");
        
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
        this.pCanciones = sObjGraficos.construirPanel(
                0, 25, 1980, 255,
                Color.black,
                null
        );   
        pSuperior.add(pCanciones);
        this.pPlaylists = sObjGraficos.construirPanel(
                0, 25, 1980, 255,
                Color.black,
                null
        );
        pInferior.add(pPlaylists);
        
    }
    
    public void crearContenidoPSuperior(){
       lTituloSuperior=sObjGraficos.construirJLabel("Solo para ti", 40, 5, 100, 20,null, null, sRecursos.getFontTiutlosMusica(), null, Color.white, null, null);
       pSuperior.add(lTituloSuperior);
       
    }
    public void crearContenidoPinferior(){
       lTituloInferior=sObjGraficos.construirJLabel("Playlist recomendadas", 40, 0, 300, 20,null, null, sRecursos.getFontTiutlosMusica(), null, Color.white, null, null);
       pInferior.add(lTituloInferior);
       
    }
    public void crearJButtons(){
        iDimAux = new ImageIcon(
                this.iPrev.getImage()
                        .getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)
        );
        iDimAux2 = new ImageIcon(
                this.iNext.getImage()
                        .getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)
        );
       bSuperiorPrev=sObjGraficos.construirJButton(null, 900, 5, 15, 15,sRecursos.getcMano(), null, null, null, "", false,null);
       bSuperiorPrev.setIcon(iDimAux);
       bSuperiorPrev.addActionListener(musicaComponent);
       pSuperior.add(bSuperiorPrev);
       bSuperiorNext=sObjGraficos.construirJButton(null, 925, 5, 15, 15,sRecursos.getcMano(), null, null, null, "", false,null);
       bSuperiorNext.setIcon(iDimAux2);    
       bSuperiorNext.addActionListener(musicaComponent);
       pSuperior.add(bSuperiorNext);
       bInferiorPrev=sObjGraficos.construirJButton(null, 900, 2, 15, 15,sRecursos.getcMano(), null, null, null, "", false,null);
       bInferiorPrev.addActionListener(musicaComponent);
       bInferiorNext=sObjGraficos.construirJButton(null, 925, 2, 15, 15,sRecursos.getcMano(), null, null, null, "", false,null);
       bInferiorNext.addActionListener(musicaComponent);
       bInferiorPrev.setIcon(iDimAux);
       bInferiorNext.setIcon(iDimAux2);    
       pInferior.add(bInferiorPrev);
       pInferior.add(bInferiorNext);
    }
    
    public void crearContenidoPCanciones(){
       CancionesTemplate c1= new CancionesComponent("Un mix infinito de favoritos y  nuevas canciones",iCancion1).getCancionesTemplate();
       c1.setLocation(40,10);
       pCanciones.add(c1);
       CancionesTemplate c2= new CancionesComponent("Con Placebo, Red hot Chill Peppers, Kongs of Leon, Nirvana",iCancion2).getCancionesTemplate();
       c2.setLocation(80+c1.getWidth(),10);
       pCanciones.add(c2);
       CancionesTemplate c3= new CancionesComponent("Con R.E.M, U2, Depeche Mode The Police",iCancion3).getCancionesTemplate();
       c3.setLocation(120+c2.getWidth()*2,10);
       pCanciones.add(c3);
       CancionesTemplate c4= new CancionesComponent("Con The Cure , The Smiths , New Order , Faith and the Muse",iCancion4).getCancionesTemplate();
       c4.setLocation(160+c3.getWidth()*3,10);
       pCanciones.add(c4);
       CancionesTemplate c5= new CancionesComponent("Con Gorillaz , Cage The Elephant , Beach Bunny ",iCancion5).getCancionesTemplate();
       c5.setLocation(200+c4.getWidth()*4,10);
       pCanciones.add(c5);
       CancionesTemplate c6= new CancionesComponent("Con Thousand Foot Krutch, Queen , Pink Floyd",iCancion6).getCancionesTemplate();
       c6.setLocation(240+c5.getWidth()*5,10);
       pCanciones.add(c6); 
       CancionesTemplate c8= new CancionesComponent("Con AC-DC , The Smiths , New Order , Faith and the Muse",iCancion8).getCancionesTemplate();
       c8.setLocation(280+c6.getWidth()*6,10);
       pCanciones.add(c8); 
       CancionesTemplate c9= new CancionesComponent("Con Linkin Park , Nirvana , Metallica , Aerosmith",iCancion7).getCancionesTemplate();
       c9.setLocation(320+c8.getWidth()*7,10);
       pCanciones.add(c9); 
    }
    public void crearContenidoPPlaylists(){
       PlaylistTemplate c1= new PlaylistComponent("Poperreo","47 canciones-124.593 fans",iPlayList1).getPlaylistTemplate();
       c1.setLocation(40,10);
       pPlaylists.add(c1);
       PlaylistTemplate c2= new PlaylistComponent("Latinos revelacion","50 canciones-108.714 fans",iPlayList2).getPlaylistTemplate();
       c2.setLocation(80+c1.getWidth(),10);
       pPlaylists.add(c2);
       PlaylistTemplate c3= new PlaylistComponent("Hard rock classics","47 canciones-207.535 fans",iPlayList3).getPlaylistTemplate();
       c3.setLocation(120+c2.getWidth()*2,10);
       pPlaylists.add(c3);
       PlaylistTemplate c4= new PlaylistComponent("Rock en español","47 canciones-80.133 fans",iPlayList4).getPlaylistTemplate();
       c4.setLocation(160+c3.getWidth()*3,10);
       pPlaylists.add(c4);
       PlaylistTemplate c5= new PlaylistComponent("Vamos a La Playa","40 canciones-56.180 fans",iPlayList5).getPlaylistTemplate();
       c5.setLocation(200+c4.getWidth()*4,10);
       pPlaylists.add(c5);
       PlaylistTemplate c6= new PlaylistComponent("Rock Vanguardista","47 canciones-95.422 fans",iPlayList6).getPlaylistTemplate();
       c6.setLocation(240+c5.getWidth()*5,10);
       pPlaylists.add(c6);
       PlaylistTemplate c7= new PlaylistComponent("Top Hits Colombia","50 canciones-100.000 fans",iPlayList7).getPlaylistTemplate();
       c7.setLocation(280+c6.getWidth()*6,10);
       pPlaylists.add(c7);
       PlaylistTemplate c8= new PlaylistComponent("Hoy Es Viernes","60 canciones-89.244 fans",iPlayList8).getPlaylistTemplate();
       c8.setLocation(320+c7.getWidth()*7,10);
       pPlaylists.add(c8);
    }
    public RecursosService getsRecursos() {
        return sRecursos;
    }

    public JPanel getpPlaylists() {
        return pPlaylists;
    }

    public JPanel getpCanciones() {
        return pCanciones;
    }

    public JButton getbSuperiorNext() {
        return bSuperiorNext;
    }

    public JButton getbSuperiorPrev() {
        return bSuperiorPrev;
    }

    public JButton getbInferiorNext() {
        return bInferiorNext;
    }

    public JButton getbInferiorPrev() {
        return bInferiorPrev;
    }
    
}
