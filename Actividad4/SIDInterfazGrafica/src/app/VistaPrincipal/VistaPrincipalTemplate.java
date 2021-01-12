package app.VistaPrincipal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import services.ObjetosGraficosService;

//Autor: Alex Rodriguez

public class VistaPrincipalTemplate extends JFrame {
    
    private JButton bEntrar;
    private JTextField tNombre;
    private JLabel lNombre;
    private ObjetosGraficosService sObjGraficos;
    
    public VistaPrincipalTemplate(){
        super("Vista Principal");// Titulo
        
        sObjGraficos =ObjetosGraficosService.getServicio();
        this.saludar();
        
        this.setSize(1200, 700);// Tamaño
        this.setVisible(true);// Mostrar
        this.setLocationRelativeTo(null);//Centrar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Terminar la ejecucion
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);//color al panel
        
            
    }
    
    public void saludar(){
        
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
    }
        
            
}
