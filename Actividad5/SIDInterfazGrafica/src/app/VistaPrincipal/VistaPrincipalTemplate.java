package app.VistaPrincipal;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import services.ObjetosGraficosService;

//Autor: Alex Rodriguez

public class VistaPrincipalTemplate extends JFrame {
    
    private JButton bEntrar;
    private JTextField tNombre;
    private JLabel lNombre;
    private JPanel pOpciones, pImagenes, pReprouduccion;
    private ObjetosGraficosService sObjGraficos;
    private VistaPrincipalComponent VPComponent;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vpComponent){
        super("Vista Principal");// Titulo
        this.VPComponent=vpComponent;
        sObjGraficos =ObjetosGraficosService.getServicio();
        this.saludar();
        this.setUndecorated(false);
        this.setSize(1200, 700);// Tamaño
        this.setVisible(true);// Mostrar
        this.setLocationRelativeTo(null);//Centrar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Terminar la ejecucion
        this.setLayout(null);
        crearJPaneles();
            
    }
    public void crearJPaneles(){
        //public MatteBorder(int top, int left, int bottom, int right, Color matteColor) 
        pOpciones = sObjGraficos.construirPanel(0, 0, 250, 560, new Color(30,28,42), BorderFactory.createMatteBorder(1, 1, 0, 1, Color.GRAY));
        this.add(pOpciones);
        pImagenes = sObjGraficos.construirPanel(250, 0, 950, 560, Color.black, null);
        this.add(pImagenes);
        pReprouduccion = sObjGraficos.construirPanel(0, 560, 1200, 140, new Color(37,35,53), BorderFactory.createLineBorder(Color.GRAY));
        this.add(pReprouduccion);
        
    }
    
    public void saludar(){
        
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
    }

    public JPanel getpOpciones() {
        return pOpciones;
    }

    public JPanel getpImagenes() {
        return pImagenes;
    }

    public JPanel getpReproudccion() {
        return pReprouduccion;
    }
        
            
}
