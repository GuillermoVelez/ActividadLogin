package app;

//import app.VistaPrincipal.VistaPrincipalTemplate;
import app.login.LoginComponent;

import com.sun.glass.ui.Cursor;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        
        Runnable runAplicacion = new Runnable() {
            @Override
            public void run() {
                
                //VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
                LoginComponent login = new LoginComponent();
               // login.setVisible(true);
                
            }
        };
        
        SwingUtilities.invokeLater(runAplicacion);

    }
    
}
