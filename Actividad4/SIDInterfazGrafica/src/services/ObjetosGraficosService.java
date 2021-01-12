/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 *
 * @author Guillermo Velez
 */
public class ObjetosGraficosService {
    private static ObjetosGraficosService servicio;
    private JPanel panel;
    private JButton boton;
    private JLabel label;
    private JCheckBox checkbox;
    private JPasswordField contrasenia;
    private JTextField usuario;
    private ObjetosGraficosService(){
        
    }
    public JPanel construirPanel(int x, int y, int ancho, int alto, Color colorfondo, Border borde){
        panel= new JPanel();
        panel.setSize(ancho,alto);
        panel.setLocation(x,y);
        panel.setLayout(null);
        panel.setBackground(colorfondo);
        panel.setBorder(borde);
        return panel;
    }
    public JButton construirJButton(String texto,int x, int y, int ancho, int alto, Cursor cursor, Color colorFondo ,Color colorFuente){
        boton=new JButton(texto);
        boton.setSize(ancho,alto);
        boton.setLocation(x,y);
        boton.setFocusable(false);
        boton.setCursor(cursor);
        boton.setBackground(colorFondo);
        boton.setForeground(colorFuente);
        return boton;
    }
     public JLabel construirJLabel(String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen, Font fuente, Color colorFondo, Color colorFuente, Border borde) {
        label = new JLabel(texto);
        label.setLocation(x, y);
        label.setSize(ancho, alto);
        label.setLayout(null);
        label.setForeground(colorFuente);
        label.setCursor(cursor);
        label.setIcon(imagen);
        label.setBorder(borde);
        label.setFont(fuente);
        return label;
     }
     public JCheckBox construirJCheckBoxes(String texto, int x, int y, int ancho, int alto, Color colorFondo ,Color colorFuente){
         checkbox= new JCheckBox(texto);
         checkbox.setSize(ancho, alto);
         checkbox.setLocation(x, y);
         checkbox.setFocusable(false);
         checkbox.setBackground(colorFondo);
         checkbox.setForeground(colorFuente);
         return checkbox;
     }
      public JTextField construirJTextField(String texto, int x, int y, int ancho, int alto, Color colorFondo ,Color colorFuente, Color caretColor ){
         usuario= new JTextField(texto);
         usuario.setLocation(x, y);
         usuario.setSize(ancho, alto);
         usuario.setBackground(colorFondo);
         usuario.setForeground(colorFuente);
         usuario.setCaretColor(caretColor);
         return usuario;
     }
     public JPasswordField construirJPasswordField(String texto, int x, int y, int ancho, int alto, Color colorFondo ,Color colorFuente, Color caretColor ){
         contrasenia= new JPasswordField(texto);
         contrasenia.setLocation(x, y);
         contrasenia.setSize(ancho, alto);
         contrasenia.setBackground(colorFondo);
         contrasenia.setForeground(colorFuente);
         contrasenia.setCaretColor(caretColor);
         return contrasenia;
     }
    public static ObjetosGraficosService getServicio() {
        if(servicio==null)
            servicio =new ObjetosGraficosService();
        return servicio;
    }
    
}
