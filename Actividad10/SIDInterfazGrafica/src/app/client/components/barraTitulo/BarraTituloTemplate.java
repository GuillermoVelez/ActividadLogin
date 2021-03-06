package app.client.components.barraTitulo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import app.services.graphicServices.ObjetosGraficosService;
import app.services.graphicServices.RecursosService;

/**
 *
 * @author alexh
 */
public class BarraTituloTemplate extends JPanel {

    private BarraTituloComponent barraTituloComponent;
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;

    //Declaracion objetos graficos
    private JButton bBuscar, bUsuario, bNotificacion;
    private JTextField tBuscar;
    private JLabel lBuscar;

    //Declaracion objetos decoradores
    private ImageIcon iBuscar, iNotificacion, iDimAux;

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
        this.setBorder(sRecursos.getBorderTitulo());
        this.setLayout(null);
        this.setVisible(true);

    }

    public void crearObjetosDecoradores() {
        iBuscar = new ImageIcon("resources//imagenes//buscar.png");
        iNotificacion = new ImageIcon("resources//imagenes//notificacion.png");


    }

    public void crearJButtons() {

        //BOTON BUSCAR
        iDimAux = new ImageIcon(
                iBuscar.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );


        //BOTON NOTIFICACION
        iDimAux = new ImageIcon(
                iNotificacion.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );

        this.bNotificacion = sObjGraficos.construirJButton(
                null,
                900, 5, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "t", false,null
        );
        this.bNotificacion.setIcon(iDimAux);
        this.bNotificacion.addMouseListener(barraTituloComponent);
        this.add(bNotificacion);

        //BOTON USUARIO
        iDimAux = new ImageIcon(
                barraTituloComponent.getUsuario().getImagenUsuario().getImage()
                        .getScaledInstance(35,35, Image.SCALE_AREA_AVERAGING));

        this.bUsuario = sObjGraficos.construirJButton(
                null,
                940, 5, 35, 35,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorPrincipal(),
                Color.WHITE,
                "t", false,null
        );
        this.bUsuario.setIcon(iDimAux);
        this.bUsuario.addMouseListener(barraTituloComponent);
        this.add(bUsuario);

    }

    public void crearJTextFields() {
        this.tBuscar = sObjGraficos.construirJTextField("Buscar", 40, 0, 800, 44, null, Color.white, null, null);
        tBuscar.addMouseListener(barraTituloComponent);
        this.add(tBuscar);

    }

    public void crearJLabels() {
        iDimAux = new ImageIcon(
                iBuscar.getImage()
                        .getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING)
        );
        lBuscar = sObjGraficos.construirJLabel(null, 10, -2, 50, 50, null, iDimAux, null, null, null, null, null);
        this.add(lBuscar);

    }


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

