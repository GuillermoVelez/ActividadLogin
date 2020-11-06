package app;

//import app.VistaPrincipal.VistaPrincipalTemplate;
import app.login.LoginTemplate;
import com.sun.glass.ui.Cursor;
import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        
        Runnable runAplicacion = new Runnable() {
            @Override
            public void run() {
                
                //VistaPrincipalTemplate vista = new VistaPrincipalTemplate();
                LoginTemplate login = new LoginTemplate();
                login.setVisible(true);
                
            }
        };
        
        SwingUtilities.invokeLater(runAplicacion);

    }
    
}
