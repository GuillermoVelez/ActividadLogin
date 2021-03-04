package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import models.Usuario;

/**
 *
 * @author alexh
 */
public class ControlUsuarios {

    private ArrayList<Usuario> usuarios;

    public ControlUsuarios() {
        usuarios = new ArrayList<Usuario>();
        cargarDatos();
    }
    
    public Usuario devolverUsuario(String nombreUsuario){
        for (Usuario usuario : usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario))
                return usuario;
        }
        return null;           
    }
    
    public boolean verificarUsuario(String nombreUsuiario, String claveUsuario){
        for (Usuario usuario : usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuiario))
                if(usuario.getClaveUsuario().equals(claveUsuario))
                    return true;
        }
        return false;
    }

    public void cargarDatos() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("src/archives/usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] atributos = linea.split(",");
                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(atributos[0]);
                usuario.setClaveUsuario(atributos[1]);
                usuario.setImagenUsuario(new ImageIcon(atributos[2]));
                
                usuarios.add(usuario);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
