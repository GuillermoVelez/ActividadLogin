package app.client.login;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import app.services.graphicServices.ObjetosGraficosService;
import app.services.graphicServices.RecursosService;

public class LoginTemplate extends JFrame {

    //Declaracion de objetos graficos
    private JPanel pIzquierda, pDerecha;
    private JLabel lTituloApp, lTituloLogin, lNotificaciones, lRecuperar;
    private JLabel lFondo;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bApple, bFace, bGoogle;
    private JCheckBox checkSi;

    //Declaracion de objetos decoradores
    private ImageIcon  iconodeezerO, iconoPanel, iconoPanelO, iconodeezer, iconoApple, iconoApple2, iconoFace, iconoFace2, iconoGoogle  , iDimAux;

    public ObjetosGraficosService getsObjGraficos() {
        return sObjGraficos;
    }

    public RecursosService getsRecursos() {
        return sRecursos;
    }

    //Declaracion de servivicios
    private ObjetosGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private LoginComponent loginComponent;

    public LoginTemplate(LoginComponent logincomponent) {

        super("Deezer");
        sObjGraficos = ObjetosGraficosService.getServicio();
        sRecursos = RecursosService.getServicio();
        this.loginComponent = logincomponent;
        crearObjetosDecoradores();
        crearJPanels();
        crearJTextFields();
        crearJPasswordField();
        crearJButtons();
        crearJCheckBoxes();
        crearJLabels();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000, 540);
        setLocationRelativeTo(this);
        setVisible(true);

    }

    public void crearJPanels() {
        pDerecha = sObjGraficos.construirPanel(0, 0, 600, 500, new Color(240, 240, 240), null);
        this.add(pDerecha);
        pIzquierda = sObjGraficos.construirPanel(600, 0, 400, 500, new Color(39, 73, 109), null);
        this.add(pIzquierda);

    }

    public void crearObjetosDecoradores() {
        iconoPanel = new ImageIcon("resources//imagenes//FondoLogin.png");
        iconodeezer = new ImageIcon("resources//imagenes//deezerLogo.png");
        iconoApple = new ImageIcon("resources//imagenes//AppleLogo.png");
        iconoApple2 = new ImageIcon("resources//imagenes//AppleLogo2.png");
        iconoFace = new ImageIcon("resources//imagenes//facebookLogo.png");
        iconoFace2 = new ImageIcon("resources//imagenes//facebookLogo2.png");
        iconoGoogle = new ImageIcon("resources//imagenes//GoogleLogo.png");

    }

    public void crearJTextFields() {
        tNombreUsuario = sObjGraficos.construirJTextField("Usuario", 0, 0, 260, 40, Color.WHITE, Color.DARK_GRAY, Color.BLUE, null);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 220);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.addMouseListener(loginComponent);
        pDerecha.add(tNombreUsuario);

    }

    public void crearJPasswordField() {
        tClaveUsuario = sObjGraficos.construirJPasswordField("Clave Usuario", 0, 0, 260, 40, Color.WHITE, Color.DARK_GRAY, Color.BLUE, null);

        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 280);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tClaveUsuario.addMouseListener(loginComponent);
        pDerecha.add(tClaveUsuario);

    }

    public void crearJLabels() {
        iconoPanelO = new ImageIcon(iconoPanel.getImage().getScaledInstance(pIzquierda.getWidth(), pIzquierda.getHeight(), Image.SCALE_DEFAULT));
        lFondo = sObjGraficos.construirJLabel(null, 0, 0, pIzquierda.getWidth(), pIzquierda.getHeight(), null, null, null, null, null, null, null);
        lFondo.setIcon(iconoPanelO);
        pIzquierda.add(lFondo);

        lTituloApp = sObjGraficos.construirJLabel(null, 50, 20, 150, 30, null, null, null, null, null, null, null);
        iconodeezerO = new ImageIcon(iconodeezer.getImage().getScaledInstance(lTituloApp.getWidth(), lTituloApp.getHeight(), Image.SCALE_DEFAULT));
        lTituloApp.setIcon(iconodeezerO);
        pDerecha.add(lTituloApp);

        lTituloLogin = sObjGraficos.construirJLabel("Conectarse", (pDerecha.getWidth() - 150) / 2, 50, 150, 30, null, null, sRecursos.getFontTitulo(), null, Color.BLACK, null, null);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = sObjGraficos.construirJLabel("¿Recibir Notificaciones?", (pDerecha.getWidth() - 140) / 2, 450, 140, 20, null, null, null, null, Color.DARK_GRAY, null, null);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);

        pDerecha.add(lNotificaciones);

        lRecuperar = sObjGraficos.construirJLabel("¿Has olvidado tu contraseña?", (pDerecha.getWidth() - 190) / 2, 430, 190, 30, null, null, null, null, Color.BLACK, null, null);
        lRecuperar.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lRecuperar);
    }

    public void crearJCheckBoxes() {
        checkSi = sObjGraficos.construirJCheckBoxes("¿Recordar Usuario?", 0, 0, 140, 25, new Color(240, 240, 240), Color.BLACK);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2, 330);
        pDerecha.add(checkSi);

    }

    public void crearJButtons() {
        bEntrar = sObjGraficos.construirJButton("Iniciar sesión", (pDerecha.getWidth() - 250) / 2, 370, 250, 45, sRecursos.getcMano(), null, sRecursos.getColorRojoSesion(), Color.WHITE, "t", true, null);
        bEntrar.addActionListener(loginComponent);
        bEntrar.addMouseListener(loginComponent);
        pDerecha.add(bEntrar);

        bRegistrarse = sObjGraficos.construirJButton("Registrarse", 255, 15, 115, 30, sRecursos.getcMano(), null, sRecursos.getColorAzul(), Color.WHITE, "t", true, null);
        bRegistrarse.addActionListener(loginComponent);
        bRegistrarse.addMouseListener(loginComponent);
        pIzquierda.add(bRegistrarse);

        //BOTON GOOGLE
        iDimAux = new ImageIcon(
                iconoGoogle.getImage()
                        .getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING)
        );
        this.bGoogle = sObjGraficos.construirJButton(
                "Google",
                180, 170, 115, 30,
                sRecursos.getcMano(),
                null,
                new Color(255, 255, 255),
                new Color(117, 117, 117),
                " ", true, null
        );
        bGoogle.setIcon(iDimAux);
        bGoogle.addMouseListener(loginComponent);
        pDerecha.add(bGoogle);

        //BOTON APPLE
        iDimAux = new ImageIcon(
                iconoApple.getImage()
                        .getScaledInstance(21, 21, Image.SCALE_AREA_AVERAGING)
        );
        this.bApple = sObjGraficos.construirJButton(
                "Apple",
                180, 130, 115, 30,
                sRecursos.getcMano(),
                null,
                Color.BLACK,
                Color.white,
                " ", true, null
        );
        bApple.setIcon(iDimAux);
        bApple.addMouseListener(loginComponent);
        pDerecha.add(bApple);

        //BOTON FACEBOOK
        iDimAux = new ImageIcon(
                iconoFace.getImage()
                        .getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING)
        );
        this.bFace = sObjGraficos.construirJButton(
                "Facebook",
                305, 130, 115, 30,
                sRecursos.getcMano(),
                null,
                sRecursos.getColorAzulF(),
                Color.white,
                " ", true, null
        );
        bFace.setIcon(iDimAux);
        bFace.addMouseListener(loginComponent);
        pDerecha.add(bFace);

    }

    public ImageIcon getIconoEstado1(JButton boton) {

        if (boton == bFace) {
            iDimAux = new ImageIcon(
                    iconoFace.getImage()
                            .getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING)
            );
        }

        if (boton == bApple) {
            iDimAux = new ImageIcon(
                    iconoApple.getImage()
                            .getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING)
            );
        }

        return iDimAux;
    }

    public ImageIcon getIconoEstado2(JButton boton) {

        if (boton == bFace) {
            iDimAux = new ImageIcon(
                    iconoFace2.getImage()
                            .getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING)
            );
        }

        if (boton == bApple) {
            iDimAux = new ImageIcon(
                    iconoApple2.getImage()
                            .getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING)
            );
        }
        return iDimAux;
    }

    public JButton getbEntrar() {
        return bEntrar;
    }

    public JButton getbCerrar() {
        return bCerrar;
    }

    public JButton getbApple() {
        return bApple;
    }

    public JButton getbFace() {
        return bFace;
    }

    public JButton getbGoogle() {
        return bGoogle;
    }

    public JButton getbRegistrarse() {
        return bRegistrarse;
    }

    public JTextField gettNombreUsuario() {
        return tNombreUsuario;
    }

    public JPasswordField gettClaveUsuario() {
        return tClaveUsuario;
    }

}
