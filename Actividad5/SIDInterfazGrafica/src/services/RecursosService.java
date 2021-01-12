/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

/**
 *
 * @author Guillermo_Velez
 */
public class RecursosService {
    private static RecursosService servicio;
    private Color colorPrincipal, colorGris, colorNegroTransparente;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo;
 
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
    }
    public void CrearColores(){
        colorPrincipal = new Color(60, 78, 120);
        colorGris = new Color(80, 80, 80);
        colorNegroTransparente = new Color(30, 30, 30, 30);
    }
    public void CrearFuentes(){
        fontTPrincipal = new Font("FontRockwell Extra Bold", Font.PLAIN, 30);
        fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 22);
    }
    public void CrearCursor(){
        cMano = new Cursor(Cursor.HAND_CURSOR);
    }
    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Color getColorNegroTransparente() {
        return colorNegroTransparente;
    }
    
      public static RecursosService getServicio() {
        if(servicio==null)
            servicio =new RecursosService();
        return servicio;
    }
}
