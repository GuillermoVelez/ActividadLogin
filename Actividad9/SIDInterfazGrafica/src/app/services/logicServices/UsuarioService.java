package app.services.logicServices;

import logic.ControlUsuarios;
import models.Usuario;

/**
 *
 * @author alexh
 */
public class UsuarioService {

    private static UsuarioService servicio;
    private ControlUsuarios cUsuario;

    private Usuario usuarioConectado; //IMPORTANTE

    private UsuarioService() {
        cUsuario = new ControlUsuarios();
    }

    public boolean verificarUsuario(String nombreUsuiario, String claveUsuario) {
        if (cUsuario.verificarUsuario(nombreUsuiario, claveUsuario)) {
            this.usuarioConectado = cUsuario.devolverUsuario(nombreUsuiario);
            return true;
        }
        return false;
    }
    
    public Usuario getUsuarioConectado(){
        return this.usuarioConectado;
    }

    public static UsuarioService geService() {
        if (servicio == null) {
            servicio = new UsuarioService();
        }
        return servicio;
    }

}
