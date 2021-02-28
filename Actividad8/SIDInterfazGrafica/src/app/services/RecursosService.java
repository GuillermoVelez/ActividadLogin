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
    private int radius;

    
    private static RecursosService servicio;
    
    private Color colorPrincipal,colorFondoClaro, colorSecundario,colorAzul,colorAzulG,colorAzulR,colorAzulF,colorRojoSesion2,colorRojoSesion, colorGris, colorNegroTransparente, colorRep, colorFondo;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontLigera;
    private Border BorderPOpciones,BorderApple,BorderFb, BordePaneles, BorderPBarraTitulo,BorderPInfOpciones,BorderBotonesVP;
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
        colorPrincipal = new Color(25,25,34);
        colorFondoClaro= new Color(55,55,67);
        colorSecundario = new Color(37,35,53);
        colorAzul= new Color(45, 150, 200);
        colorAzulG= new Color(0, 117, 252);
        colorAzulR= new Color(55, 111, 175);
        colorAzulF= new Color(37, 83, 180);
        colorGris = new Color(80, 80, 80);
        colorRojoSesion= new Color(239, 84, 102);
        colorRojoSesion2= new Color(189, 32, 86);
        colorNegroTransparente = new Color(30, 30, 30, 30);
        colorRep = new Color(35,35,45);
        colorFondo = new Color(18,18,22);
    }

    public Color getColorFondoClaro() {
        return colorFondoClaro;
    }

    public Color getColorRojoSesion() {
        return colorRojoSesion;
    }

    public Color getColorRojoSesion2() {
        return colorRojoSesion2;
    }

    public Color getColorAzulF() {
        return colorAzulF;
    }

    public Color getColorAzulR() {
        return colorAzulR;
    }

    public Color getColorAzulG() {
        return colorAzulG;
    }

    public Color getColorAzul() {
        return colorAzul;
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
        BorderApple=BorderFactory.createLineBorder(Color.black, 2);
        BorderFb=BorderFactory.createLineBorder(this.colorAzulF, 2);
        BorderBotonesVP=BorderFactory.createMatteBorder(0, 1, 0,  0, Color.red);
        //BordeCircularBotones=
    }

    public Border getBorderBotonesVP() {
        return BorderBotonesVP;
    }

    public void setBorderBotonesVP(Border BorderBotonesVP) {
        this.BorderBotonesVP = BorderBotonesVP;
    }

    public Border getBorderFb() {
        return BorderFb;
    }

    public Border getBorderApple() {
        return BorderApple;
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

    public Color getColorFondo() {
        return colorFondo;
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

    public Color getColorRep() {
        return colorRep;
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
