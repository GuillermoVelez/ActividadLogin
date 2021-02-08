/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Guillermo_Velez
 */
public class LoginComponent implements ActionListener{
    private LoginTemplate loginTemplate;
    
    public LoginComponent(){
        loginTemplate= new LoginTemplate(this);
    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==loginTemplate.getbEntrar()){
           Entrar();
           
        }
        if(ae.getSource()==loginTemplate.getbRegistrarse()){
          
        }
        if(ae.getSource()==loginTemplate.getbApple()){
          
        }
        if(ae.getSource()==loginTemplate.getbFace()){
          
        }
        if(ae.getSource()==loginTemplate.getbGoogle()){
          
        }
    }
    
    public void Entrar(){
        VistaPrincipalComponent vpComponent = new  VistaPrincipalComponent();
        loginTemplate.setVisible(false);
    }
}
