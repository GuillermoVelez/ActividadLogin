/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
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
    private JSlider slider;

    private ObjetosGraficosService() {

    }

    public JPanel construirPanel(int x, int y, int ancho, int alto, Color colorfondo, Border borde) {
        panel = new JPanel();
        panel.setSize(ancho, alto);
        panel.setLocation(x, y);
        panel.setLayout(null);
        panel.setBackground(colorfondo);
        panel.setBorder(borde);
        return panel;
    }

    public JButton construirJButton(String texto, int x, int y, int ancho, int alto, Cursor cursor, Border borde, Color colorFondo, Color colorFuente, String direccion,boolean esSolido) {
        boton = new JButton(texto);
        boton.setSize(ancho, alto);
        boton.setLocation(x, y);
        boton.setFocusable(false);
        boton.setCursor(cursor);
        boton.setBorder(null);
        boton.setBackground(colorFondo);
        boton.setForeground(colorFuente);
        boton.setContentAreaFilled(esSolido);
        switch (direccion) {
            case "l":
                boton.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "r":
                boton.setHorizontalAlignment(SwingConstants.RIGHT);
                boton.setHorizontalTextPosition(SwingConstants.LEFT);
                break;
            case "t":
                boton.setVerticalTextPosition(SwingConstants.TOP);
                boton.setHorizontalTextPosition(SwingConstants.CENTER);
                break;
            case "b":
                boton.setVerticalTextPosition(SwingConstants.BOTTOM);
                boton.setHorizontalTextPosition(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return boton;
    }

    public JLabel construirJLabel(String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen, Font fuente, Color colorFondo, Color colorFuente, Border borde, String direccion) {
        label = new JLabel(texto);
        label.setLocation(x, y);
        label.setSize(ancho, alto);
        label.setLayout(null);
        label.setForeground(colorFuente);
        label.setCursor(cursor);
        label.setIcon(imagen);
        label.setBorder(borde);
        label.setFont(fuente);
        if (colorFondo != null) {
            label.setOpaque(true);
            label.setBackground(colorFondo);
        }
     /*  switch (direccion) {
        case "c":
          label.setHorizontalAlignment(SwingConstants.CENTER);
          break;
        case "r":
          label.setHorizontalAlignment(SwingConstants.RIGHT);
          label.setHorizontalTextPosition(SwingConstants.LEFT);
          break;
        case "t":
          label.setHorizontalAlignment(SwingConstants.CENTER);
          label.setVerticalTextPosition(SwingConstants.TOP);
          label.setHorizontalTextPosition(SwingConstants.CENTER);
          break;
        case "b":
          label.setHorizontalAlignment(SwingConstants.CENTER);
          label.setVerticalTextPosition(SwingConstants.BOTTOM);
          label.setHorizontalTextPosition(SwingConstants.CENTER);
          break;
        default:
          break;
    }*/
        return label;
    }

    public JCheckBox construirJCheckBoxes(String texto, int x, int y, int ancho, int alto, Color colorFondo, Color colorFuente) {
        checkbox = new JCheckBox(texto);
        checkbox.setSize(ancho, alto);
        checkbox.setLocation(x, y);
        checkbox.setFocusable(false);
        checkbox.setBackground(colorFondo);
        checkbox.setForeground(colorFuente);
        return checkbox;
    }

    public JTextField construirJTextField(String texto, int x, int y, int ancho, int alto, Color colorFondo, Color colorFuente, Color caretColor, Border border) {
        usuario = new JTextField(texto);
        usuario.setLocation(x, y);
        usuario.setSize(ancho, alto);
        usuario.setBackground(colorFondo);
        usuario.setForeground(colorFuente);
        usuario.setCaretColor(caretColor);
        usuario.setBorder(border);
        return usuario;
    }

    public JPasswordField construirJPasswordField(String texto, int x, int y, int ancho, int alto, Color colorFondo, Color colorFuente, Color caretColor, Border border) {
        contrasenia = new JPasswordField(texto);
        contrasenia.setLocation(x, y);
        contrasenia.setSize(ancho, alto);
        contrasenia.setBackground(colorFondo);
        contrasenia.setForeground(colorFuente);
        contrasenia.setCaretColor(caretColor);
        contrasenia.setBorder(border);
        return contrasenia;
    }
    
    
    public JSlider construirJSlider(int min, int max, int x, int y, Color colorFondo,boolean a){
        
        slider = new JSlider();
        slider.setLocation(x, y);
        slider.setSize(min, max);
        slider.setBackground(colorFondo);
        slider.setPaintTicks(a);
        return slider;
                
    }

    public static ObjetosGraficosService getServicio() {
        if (servicio == null) {
            servicio = new ObjetosGraficosService();
        }
        return servicio;
    }

}
