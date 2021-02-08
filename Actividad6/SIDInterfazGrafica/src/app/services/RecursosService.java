/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Guillermo_Velez
 */
public class RecursosService {
    private static RecursosService servicio;
    
    private Color colorPrincipal, colorSecundario, colorGris, colorNegroTransparente;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontLigera;
    private Border BorderPOpciones, BordePaneles, BorderPBarraTitulo,BorderPInfOpciones;
    private Cursor cMano;
    
    
    public Cursor getcMano() {
        return cMano;
    }
    public Font getFontTPrincipal() {
        return fontTPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }
    
    private RecursosService(){
        CrearColores();
        CrearFuentes();
        CrearCursor();
        CrearBordes();
    }
    public void CrearColores(){
        colorPrincipal = new Color(30,28,42);
        colorSecundario = new Color(37,35,53);
        colorGris = new Color(80, 80, 80);
        colorNegroTransparente = new Color(30, 30, 30, 30);
    }
    public void CrearFuentes(){
        fontTPrincipal = new Font("FontRockwell Extra Bold", Font.PLAIN, 30);
        fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 22);
        fontLigera = new Font("Calibri (Cuerpo)", Font.BOLD, 12);
    }
    public void CrearBordes(){
        BorderPOpciones= BorderFactory.createMatteBorder(1, 1, 0, 1, Color.GRAY);
        BordePaneles=BorderFactory.createLineBorder(Color.GRAY);
        BorderPBarraTitulo=BorderPOpciones=BorderFactory.createMatteBorder(1, 0, 0, 1, Color.GRAY);
        BorderPInfOpciones=BorderFactory.createMatteBorder(0, 0, 0, 1, Color.GRAY);
    }

    public Border getBorderPInfOpciones() {
        return BorderPInfOpciones;
    }

    public Border getBorderPBarraTitulo() {
        return BorderPBarraTitulo;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Border getBorderPOpciones() {
        return BorderPOpciones;
    }

    public Border getBordePaneles() {
        return BordePaneles;
    }
    public void CrearCursor(){
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }
    public Color getColorPrincipal() {
        return colorPrincipal;
    }
    public Color getcolorSecundario() {
        return colorSecundario;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Color getColorNegroTransparente() {
        return colorNegroTransparente;
    }

    public Font getFontLigera() {
        return fontLigera;
    }
    
        
      public static RecursosService getServicio() {
        if(servicio==null)
            servicio =new RecursosService();
        return servicio;
    }
}
