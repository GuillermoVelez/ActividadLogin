package app.client.VistaPrincipal;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import app.services.ObjetosGraficosService;

//Autor: Alex Rodriguez
public class VistaPrincipalTemplate extends JFrame {
    //private static final long serialVersionUID = 1L;

    private JPanel pOpciones, pImagenes, pReprouduccion, pBuscar;
    private ObjetosGraficosService sObjGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent) {

        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.vistaPrincipalComponent.getClass();
        sObjGraficos = ObjetosGraficosService.getServicio();

        this.crearJPaneles();

        setDefaultCloseOperation(EXIT_ON_CLOSE); //Terminar la ejecucion
        setResizable(false);
        setSize(1200, 704);// Tamaño
        setLocationRelativeTo(null);//Centrar
        setLayout(null);
        setUndecorated(false);
        setVisible(true);// Mostrar

    }

    public void crearJPaneles() {
        //public MatteBorder(int top, int left, int bottom, int right, Color matteColor) 
        pOpciones = sObjGraficos.construirPanel(0, 0, 210, 605, null, null);
        this.add(pOpciones);
        pBuscar = sObjGraficos.construirPanel(210, 0, 990, 45, null, null);
        this.add(pBuscar);
        pImagenes = sObjGraficos.construirPanel(210, 45, 990, 560, null, null);
        this.add(pImagenes);
        pReprouduccion = sObjGraficos.construirPanel(0, 605, 1200, 70, null, null);
        this.add(pReprouduccion);

    }

    
    public JPanel getpOpciones() {
        return this.pOpciones;
    }

    public JPanel getpImagenes() {
        return this.pImagenes;
    }

    public JPanel getpReproudccion() {
        return this.pReprouduccion;
    }

    public JPanel getpBuscar() {
        return this.pBuscar;
    }

}
