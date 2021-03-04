package models;

import javax.swing.ImageIcon;

/**
 *
 * @author alexh
 */
public class Usuario {

    private String nombreUsuario;
    private String claveUsuario;
    private ImageIcon imagenUsuario;
    
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public ImageIcon getImagenUsuario() {
        return imagenUsuario;
    }

    public void setImagenUsuario(ImageIcon imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }

    
}
