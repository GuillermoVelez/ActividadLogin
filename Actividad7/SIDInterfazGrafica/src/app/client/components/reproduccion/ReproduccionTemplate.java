package app.client.components.reproduccion;

import app.services.ObjetosGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author alexh
 */
public class ReproduccionTemplate extends JPanel {

    private ReproduccionComponent reproduccionComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;

    // Declaración objetos gráficos
    private JPanel pInferior;
    
    //private JLabel lLogo, lsuscripcion;
    private JButton bInicio, bPlay, bFin, bRepetir, bShuffle, bVolumen, bLista, bEspera, bMas, bMicrofono, bFavorito;

    // Declaración Objetos Decoradores
    private ImageIcon iInicio, iPlay, iFin, iRepetir, iShuffle, iVolumen, iLista, iEspera, iMas, iMicrofono, iFavorito, iDimAux;

    public ReproduccionTemplate(ReproduccionComponent reproduccionComponent) {

        this.reproduccionComponent = reproduccionComponent;
        this.sObjGraficos = ObjetosGraficosService.getServicio();
        this.sRecursos = RecursosService.getServicio();

        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJButtons();

        this.setSize(1200, 70);
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(sRecursos.getColorRep());
    }

    public void crearJPanels() {
        this.pInferior = sObjGraficos.construirPanel(
                0, 605, 1200, 70,
                sRecursos.getColorPrincipal(),
                sRecursos.getBorderPOpciones()
        );
        this.add(pInferior);

    }

    public void crearObjetosDecoradores() {

        this.iInicio = new ImageIcon("resources//imagenes//inicio.png");
        this.iPlay = new ImageIcon("resources//imagenes//play.png");
        this.iFin = new ImageIcon("resources//imagenes//fin.png");
        this.iRepetir = new ImageIcon("resources//imagenes//repetir.png");
        this.iShuffle = new ImageIcon("resources//imagenes//shuffle.png");
        this.iVolumen = new ImageIcon("resources//imagenes//volumen.png");
        this.iLista = new ImageIcon("resources//imagenes//lista.png");
        this.iEspera = new ImageIcon("resources//imagenes//Canciones//CourtesyCall.jpg");
        this.iMas = new ImageIcon("resources//imagenes//mas.png");
        this.iMicrofono = new ImageIcon("resources//imagenes//microfono.png");
        this.iFavorito = new ImageIcon("resources//imagenes//favorito.png");
        

    }
    
    
    public void crearJButtons(){
        
        //BOTON INICIO
        iDimAux = new ImageIcon(
                iInicio.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bInicio = sObjGraficos.construirJButton(
                null,
                25, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bInicio.setIcon(iDimAux);
        this.bInicio.addActionListener(reproduccionComponent);
        this.add(bInicio);
        
        //BOTON PLAY
        iDimAux = new ImageIcon(
                iPlay.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bPlay = sObjGraficos.construirJButton(
                null,
                60, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bPlay.setIcon(iDimAux);
        this.bPlay.addActionListener(reproduccionComponent);
        this.add(bPlay);
        
        //BOTON FIN
        iDimAux = new ImageIcon(
                iFin.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bFin = sObjGraficos.construirJButton(
                null,
                95, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bFin.setIcon(iDimAux);
        this.bFin.addActionListener(reproduccionComponent);
        this.add(bFin);
        
        //BOTON REPETIR
        iDimAux = new ImageIcon(
                iRepetir.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bRepetir = sObjGraficos.construirJButton(
                null,
                860, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bRepetir.setIcon(iDimAux);
        this.bRepetir.addActionListener(reproduccionComponent);
        this.add(bRepetir);
        
        //BOTON SHUFFLE
        iDimAux = new ImageIcon(
                iShuffle.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bShuffle = sObjGraficos.construirJButton(
                null,
                895, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bShuffle.setIcon(iDimAux);
        this.bShuffle.addActionListener(reproduccionComponent);
        this.add(bShuffle);
        
        //BOTON VOLUMEN
        iDimAux = new ImageIcon(
                iVolumen.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bVolumen = sObjGraficos.construirJButton(
                null,
                930, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bVolumen.setIcon(iDimAux);
        this.bVolumen.addActionListener(reproduccionComponent);
        this.add(bVolumen);
        
        //BOTON LISTA
        iDimAux = new ImageIcon(
                iLista.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bLista = sObjGraficos.construirJButton(
                null,
                965, 18, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bLista.setIcon(iDimAux);
        this.bLista.addActionListener(reproduccionComponent);
        this.add(bLista);
        
        
         //BOTON ESPERA
        iDimAux = new ImageIcon(
                iEspera.getImage()
                        .getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING)
        );
        this.bEspera = sObjGraficos.construirJButton(
                "  Lista de espera",
                1020, 18, 180, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bEspera.setIcon(iDimAux);
        this.bEspera.addActionListener(reproduccionComponent);
        this.add(bEspera);
        
        //BOTON MAS
        iDimAux = new ImageIcon(
                iMas.getImage()
                        .getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)
        );
        this.bMas = sObjGraficos.construirJButton(
                null,
                650, 18, 20, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bMas.setIcon(iDimAux);
        this.bMas.addActionListener(reproduccionComponent);
        this.add(bMas);
        
        //BOTON MICROFONO
        iDimAux = new ImageIcon(
                iMicrofono.getImage()
                        .getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)
        );
        this.bMicrofono = sObjGraficos.construirJButton(
                null,
                685, 18, 20, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bMicrofono.setIcon(iDimAux);
        this.bMicrofono.addActionListener(reproduccionComponent);
        this.add(bMicrofono);
        
        //BOTON FAVORITO
        iDimAux = new ImageIcon(
                iFavorito.getImage()
                        .getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING)
        );
        this.bFavorito = sObjGraficos.construirJButton(
                null,
                720, 18, 20, 20,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bFavorito.setIcon(iDimAux);
        this.bFavorito.addActionListener(reproduccionComponent);
        this.add(bFavorito);
    }
    
    
    
    
    public void setbInicio(JButton bInicio) {
        this.bInicio = bInicio;
    }

    public void setbPlay(JButton bPlay) {
        this.bPlay = bPlay;
    }

    public void setbFin(JButton bFin) {
        this.bFin = bFin;
    }

    public void setbRepetir(JButton bRepetir) {
        this.bRepetir = bRepetir;
    }

    public JButton getbPlay() {
        return bPlay;
    }

    public JButton getbFin() {
        return bFin;
    }

    public JButton getbRepetir() {
        return bRepetir;
    }

    public JButton getbInicio() {
        return bInicio;
    }

    public JButton getbShuffle() {
        return bShuffle;
    }

    public JButton getbVolumen() {
        return bVolumen;
    }

    public JButton getbLista() {
        return bLista;
    }

    public JButton getbEspera() {
        return bEspera;
    }

    public JButton getbMas() {
        return bMas;
    }

    public void setbMas(JButton bMas) {
        this.bMas = bMas;
    }

    public JButton getbMicrofono() {
        return bMicrofono;
    }

    public void setbMicrofono(JButton bMicrofono) {
        this.bMicrofono = bMicrofono;
    }

    public JButton getbFavorito() {
        return bFavorito;
    }

    public void setbFavorito(JButton bFavorito) {
        this.bFavorito = bFavorito;
    }
    

    public void setbEspera(JButton bEspera) {
        this.bEspera = bEspera;
    }
    

    public void setbShuffle(JButton bShuffle) {
        this.bShuffle = bShuffle;
    }

    public void setbVolumen(JButton bVolumen) {
        this.bVolumen = bVolumen;
    }

    public void setbLista(JButton bLista) {
        this.bLista = bLista;
    }
    

}
