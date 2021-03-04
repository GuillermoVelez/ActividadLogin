/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Playlist;

import app.client.components.Canciones.CancionesComponent;
import app.services.ObjetosGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Guillermo_Velez
 */
public class PlaylistTemplate extends JPanel{
    private CancionesComponent cancionesComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JLabel lImagen,lTexto,lTexto2;
    private JButton bReproducir;
    private ImageIcon iDimAux,iReproducir;
    private PlaylistComponent playlistComponent;

    public PlaylistTemplate(PlaylistComponent playlistComponent, String texto,String texto2, ImageIcon iImagen) {
       sObjGraficos= ObjetosGraficosService.getServicio();
        sRecursos= RecursosService.getServicio();
        this.playlistComponent = playlistComponent;
        this.playlistComponent.getClass();
        
        iReproducir= new ImageIcon("resources//imagenes//image003.png");
        iDimAux= new ImageIcon(iReproducir.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        bReproducir=sObjGraficos.construirJButton(null, 10, 150, 40, 40,sRecursos.getcMano(), null, null, null, "", false);
        bReproducir.setIcon(iDimAux);
        bReproducir.addMouseListener(playlistComponent);
        this.add(bReproducir);
        iDimAux= new ImageIcon(iImagen.getImage().getScaledInstance(200, 200, Image.SCALE_AREA_AVERAGING));
        lImagen=sObjGraficos.construirJLabel(
                null, 0, 0, 200, 200,
                null, iImagen, null, null, 
                null, null,null);
        this.add(lImagen);
        
        this.lTexto=sObjGraficos.construirJLabel(
                "<html><div align='justify'>" + texto + "</div></html>", 0, 196, 234, 45,
                null, null, null, null,
                Color.WHITE , null,"l");
        this.add(lTexto);
        this.lTexto2=sObjGraficos.construirJLabel(
                "<html><div align='justify'>" + texto2 + "</div></html>", 0, 210, 234, 45,
                null, null, null, null,
                Color.gray , null,"l");
        this.add(lTexto2);
        this.setSize(200, 250);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
    }
    public ImageIcon getBreproducirGrande(){
        iDimAux= new ImageIcon(iReproducir.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        return iDimAux;
    }
    public ImageIcon getBreproducirPequeño(){
        iDimAux= new ImageIcon(iReproducir.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        return iDimAux;
    }
    public RecursosService getsRecursos() {
        return sRecursos;
    }

    public JButton getbReproducir() {
        return bReproducir;
    }

    public ImageIcon getiReproducir() {
        return iReproducir;
    }
    
}
