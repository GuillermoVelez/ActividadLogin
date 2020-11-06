package app;

import app.VistaPrincipal.VistaPrincipalTemplate;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        
        Runnable runAplicacion = new Runnable() {
            @Override
            public void run() {
                
                VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
                
            }
        };
        
        SwingUtilities.invokeLater(runAplicacion);

    }
    
}
