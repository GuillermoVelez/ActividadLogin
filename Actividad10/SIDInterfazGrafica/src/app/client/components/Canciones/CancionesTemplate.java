/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Canciones;

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
 * @author Guillermo_Velez
 */
public class CancionesTemplate extends JPanel{
    private CancionesComponent cancionesComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JLabel lImagen,lTexto;
    private JButton bReproducir;
    private ImageIcon iDimAux,iReproducir;
    

    public CancionesTemplate(CancionesComponent cancionesComponent, String texto, ImageIcon iImagen) {
        sObjGraficos= ObjetosGraficosService.getServicio();
        sRecursos= RecursosService.getServicio();
        this.cancionesComponent = cancionesComponent;
        this.cancionesComponent.getClass();
        
        iReproducir= new ImageIcon("resources//imagenes//image003.png");
        iDimAux= new ImageIcon(iReproducir.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        bReproducir=sObjGraficos.construirJButton(null, 85, 80, 40, 40,sRecursos.getcMano(), null, null, null, "", false,null);
        bReproducir.setIcon(iDimAux);
        bReproducir.addMouseListener(cancionesComponent);
        this.add(bReproducir);
        iDimAux= new ImageIcon(iImagen.getImage().getScaledInstance(200, 200, Image.SCALE_AREA_AVERAGING));
        lImagen=sObjGraficos.construirJLabel(
                null, 0, 0, 200, 200,
                null, iDimAux, null, null, 
                null, null,null);
        this.add(lImagen);
        
        this.lTexto=sObjGraficos.construirJLabel(
                "<html><div align='left'>"+texto+"</div></html>", 0, 196, 234, 43,
                null, null, sRecursos.getFontCanciones(), null,
                Color.WHITE , null,"l");
        this.add(lTexto);
        
        this.setSize(200, 234);
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
    public JLabel getlImagen() {
        return lImagen;
    }

    public ImageIcon getiDimAux() {
        return iDimAux;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }
    
}
