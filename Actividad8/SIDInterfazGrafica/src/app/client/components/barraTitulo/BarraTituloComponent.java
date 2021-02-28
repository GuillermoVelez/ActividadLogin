/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.barraTitulo;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author alexh
 */
public class BarraTituloComponent extends MouseAdapter implements ActionListener{
    
    private BarraTituloTemplate barraTituloTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private JTextField text;
    private String placeholder="Buscar";
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
    @Override
     public void mouseClicked(MouseEvent me) {
         if(me.getSource() instanceof JTextField){
            text= (JTextField) me.getSource();
            if(text.getText().equals(placeholder))
                text.setText("");
            
        }
     }
    @Override
     public void mouseEntered(MouseEvent me) {
       if(me.getSource() instanceof JButton){
       JButton boton = (JButton) me.getSource();
       boton.setContentAreaFilled(true);
       boton.setBackground(barraTituloTemplate.getsRecursos().getColorFondoClaro());
       }
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
       if(me.getSource() instanceof JButton){
       JButton boton = (JButton) me.getSource();
       boton.setContentAreaFilled(false);
       boton.setBackground(barraTituloTemplate.getsRecursos().getColorFondoClaro());
       }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
   /* @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource()-- barraTituloTemplate.getBMinimizar()){
        
    }
        
        if (e.getSource()-- barraTituloTemplate.getBCerrar()) {
        
    }
        
    }*/

    




