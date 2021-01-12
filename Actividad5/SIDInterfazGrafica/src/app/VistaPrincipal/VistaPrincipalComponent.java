/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.VistaPrincipal;

/**
 *
 * @author Guillermo_Velez
 */
public class VistaPrincipalComponent {
    private VistaPrincipalTemplate vistaPrincipalTemplate;
    public VistaPrincipalComponent(){
        vistaPrincipalTemplate= new VistaPrincipalTemplate(this);
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }
    
}
