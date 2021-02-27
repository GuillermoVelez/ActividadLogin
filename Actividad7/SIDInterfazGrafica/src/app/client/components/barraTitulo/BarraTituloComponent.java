/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.barraTitulo;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alexh
 */
public class BarraTituloComponent implements ActionListener{
    
    private BarraTituloTemplate barraTituloTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    
    public BarraTituloComponent(VistaPrincipalComponent vistaPrincipalComponent) {
    this.vistaPrincipalComponent = vistaPrincipalComponent;
    this.barraTituloTemplate = new BarraTituloTemplate(this);
  } 

    public BarraTituloComponent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

    public BarraTituloTemplate getBarraTituloTemplate(){
        return barraTituloTemplate;
    }     

   
   /* @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource()-- barraTituloTemplate.getBMinimizar()){
        
    }
        
        if (e.getSource()-- barraTituloTemplate.getBCerrar()) {
        
    }
        
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

