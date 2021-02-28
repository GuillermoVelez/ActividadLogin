/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.barraTitulo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import app.services.ObjetosGraficosService;
import app.services.RecursosService;

/**
 *
 * @author alexh
 */
public class BarraTituloTemplate extends JPanel {

    private BarraTituloComponent barraTituloComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;

    //Declaracion objetos graficos
    private JButton  bBuscar, bUsuario, bNotificacion;
    private JTextField tBuscar;
    private JLabel lBuscar;
    //private JTextField tBuscar;
           

    //Declaracion objetos decoradores
    private ImageIcon iBuscar, iUsuario, iNotificacion, iDimAux;

    public BarraTituloTemplate(BarraTituloComponent barraTituloComponent) {
        this.barraTituloComponent = barraTituloComponent;
        this.sObjGraficos = ObjetosGraficosService.getServicio();
        this.sRecursos = RecursosService.getServicio();

        this.crearObjetosDecoradores();
        this.crearJLabels();
        this.crearJButtons();
        this.crearJTextFields();
        
        this.setSize(990, 45);
        this.setBackground(sRecursos.getColorFondo());
        this.setBorder(sRecursos.getBorderPBarraTitulo());
        this.setLayout(null);
        this.setVisible(true);

    }

    public void crearObjetosDecoradores() {
        iBuscar = new ImageIcon("resources//imagenes//buscar.png");
        iNotificacion = new ImageIcon("resources//imagenes//notificacion.png");
        iUsuario = new ImageIcon("resources//imagenes//usuario.png");

    }

    public void crearJButtons() {

        iDimAux = new ImageIcon(
                iBuscar.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
      /*  this.bBuscar = sObjGraficos.construirJButton(
                "      Buscar",
                10, 10, 130, 30,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "l",false
        );
        this.bBuscar.setIcon(iDimAux);
        this.bBuscar.addActionListener(barraTituloComponent);
        this.add(bBuscar);*/

        
        iDimAux = new ImageIcon(
                iNotificacion.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        
        this.bNotificacion = sObjGraficos.construirJButton(
                null,
                910, 5, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "t",false
        );
        this.bNotificacion.setIcon(iDimAux);
        this.bNotificacion.addMouseListener(barraTituloComponent);
        this.add(bNotificacion);
        
        iDimAux = new ImageIcon(
                iUsuario.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.bUsuario = sObjGraficos.construirJButton(
                null,
                950, 5, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "t",false
        );
        this.bUsuario.setIcon(iDimAux);
        this.bUsuario.addMouseListener(barraTituloComponent);
        this.add(bUsuario);

        /*iDimAux = new ImageIcon(
      sRecursos.getIMinimizar().getImage()
        .getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)
    );
    bMinimizar = sObjGraficos.construirJButton(
      null,
      750, 10, 45, 30,
      sRecursos.getCMano(),
      iDimAux,
      null, null, null, null,
      "c",
      false
    );
    bMinimizar.addActionListener(barraTituloComponent);
    this.add(bMinimizar);*/
    }
    
    /*public void crearJTextfields(){
        iDimAux = new ImageIcon(
                iBuscar.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        this.tBuscar = sObjGraficos.construirJTextField("Buscar", 30, 10, 150, 35, Color.orange, Color.orange, Color.yellow);
        this.tBuscar.setIcon(iDimAux);
        this.add(tBuscar);
    }*/
    public void crearJTextFields(){
        this.tBuscar=sObjGraficos.construirJTextField("Buscar", 40, 0, 800, 45, null, Color.white, null,null);
        tBuscar.addMouseListener(barraTituloComponent);
        this.add(tBuscar);
        
    }
    public void crearJLabels() {
        iDimAux = new ImageIcon(
                iBuscar.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        lBuscar=sObjGraficos.construirJLabel(null, 10, -2, 50, 50,null, iDimAux, null, null, null, null,null);
        this.add(lBuscar);
        /*iDimAux = new ImageIcon(
      iLogoApp.getImage()
        .getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING)
    );
    ILogoApp = sObjGraficos.construirJLabel(
      null,
      210, 0, 50, 50,
      null,
      iDimAux,
      null, null, null, null  
    );
    this.add(ILogoApp);

    lTituloApp = sObjGraficos.construirJLabel(
      "ProductList",
      40, 5, 200, 40,
      null, null,
      fontTituloBarra,
      null,
      sRecursos.getColorPrincipal(),
      null,
    /*iDimAux = new ImageIcon(
      sRecursos.getIMinimizar().getImage()
        .getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING)
    );
    bMinimizar = sObjGraficos.construirJButton(
      null,
      750, 10, 45, 30,
      sRecursos.getCMano(),
      iDimAux,
      null, null, null, null,
      "c",
      false
    );
    bMinimizar.addActionListener(barraTituloComponent);
    this.add(bMinimizar);*/
    }

   /*public void crearJLabels() {
        /*iDimAux = new ImageIcon(
      iLogoApp.getImage()
        .getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING)
    );
    ILogoApp = sObjGraficos.construirJLabel(
      null,
      210, 0, 50, 50,
      null,
      iDimAux,
      null, null, null, null  
    );
    this.add(ILogoApp);

    lTituloApp = sObjGraficos.construirJLabel(
      "ProductList",
      40, 5, 200, 40,
      null, null,
      fontTituloBarra,
      null,
      sRecursos.getColorPrincipal(),
      null,
      "c"
    );
    this.add(lTituloApp);*/

    public JButton getbBuscar() {
        return bBuscar;
    }

    public JButton getbUsuario() {
        return bUsuario;
    }

    public JButton getbNotificacion() {
        return bNotificacion;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }
    
    }

    /* public JButton getBCerrar() { return bCerrar; }

  public JButton getBMinimizar() { return bMinimizar; }*/

