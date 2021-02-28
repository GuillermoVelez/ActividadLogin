/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.login;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Guillermo_Velez
 */
public class LoginComponent extends MouseAdapter implements ActionListener{
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    private JTextField text;
    private String[] placeholder = {"Correo electronico", "Clave Usuario"};
    
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
        if (vistaPrincipal == null)
            this.vistaPrincipal = new VistaPrincipalComponent(this);
        else
            this.vistaPrincipal.getVistaPrincipalTemplate().setVisible(true);
        loginTemplate.setVisible(false);
  }
     @Override
     public void mouseEntered(MouseEvent me) {
        if(me.getSource()==loginTemplate.getbApple()){
            JButton boton= (JButton) me.getSource();
            loginTemplate.getbApple().setBackground(Color.white);
            loginTemplate.getbApple().setForeground(Color.black);
            loginTemplate.getbApple().setBorder(loginTemplate.getsRecursos().getBorderApple());
            loginTemplate.getbApple().setIcon(loginTemplate.getIconoEstado2(boton));
        }
        if(me.getSource()==loginTemplate.getbFace()){
            JButton boton= (JButton) me.getSource();
            loginTemplate.getbFace().setBackground(Color.white);
            loginTemplate.getbFace().setForeground(loginTemplate.getsRecursos().getColorAzulF());
            loginTemplate.getbFace().setBorder(loginTemplate.getsRecursos().getBorderFb());
            loginTemplate.getbFace().setIcon(loginTemplate.getIconoEstado2(boton));
        }
        if(me.getSource()==loginTemplate.getbGoogle()){
            loginTemplate.getbGoogle().setBackground(loginTemplate.getsRecursos().getColorAzulG());
            loginTemplate.getbGoogle().setForeground(Color.white);
        }
        if(me.getSource()==loginTemplate.getbRegistrarse()){
            loginTemplate.getbRegistrarse().setBackground(loginTemplate.getsRecursos().getColorAzulR());
        }
        if(me.getSource()==loginTemplate.getbEntrar()){
            loginTemplate.getbEntrar().setBackground(loginTemplate.getsRecursos().getColorRojoSesion2());
        }
        
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource() instanceof JTextField){
            text= (JTextField) me.getSource();
            if(text.getText().equals(placeholder[0]) || text.getText().equals(placeholder[1]))
                text.setText("");
            
        }

    }
    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource()==loginTemplate.getbApple()){
           JButton boton= (JButton) me.getSource();
           loginTemplate.getbApple().setBackground(Color.black);
           loginTemplate.getbApple().setForeground(Color.white);
           loginTemplate.getbApple().setBorder(null);
           loginTemplate.getbApple().setIcon(loginTemplate.getIconoEstado1(boton));
        }
        if(me.getSource()==loginTemplate.getbFace()){
            JButton boton= (JButton) me.getSource();
            loginTemplate.getbFace().setBackground(loginTemplate.getsRecursos().getColorAzulF());
            loginTemplate.getbFace().setForeground(Color.white);
            loginTemplate.getbFace().setBorder(null);
            loginTemplate.getbFace().setIcon(loginTemplate.getIconoEstado1(boton));
        }
        if(me.getSource()==loginTemplate.getbGoogle()){
            loginTemplate.getbGoogle().setBackground(Color.white);
            loginTemplate.getbGoogle().setForeground(Color.gray);
        }
        if(me.getSource()==loginTemplate.getbRegistrarse()){
            loginTemplate.getbRegistrarse().setBackground(loginTemplate.getsRecursos().getColorAzul());
        }
        if(me.getSource()==loginTemplate.getbEntrar()){
            loginTemplate.getbEntrar().setBackground(loginTemplate.getsRecursos().getColorRojoSesion());
        }
    }
}

