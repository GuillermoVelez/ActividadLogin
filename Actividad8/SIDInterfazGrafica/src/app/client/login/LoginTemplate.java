package app.client.login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import app.services.ObjetosGraficosService;
import app.services.RecursosService;

public class LoginTemplate extends JFrame {

    //Declaracion de objetos graficos
    private JPanel pIzquierda, pDerecha;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones, lRecuperar;
    private JLabel lFondo, lLogo;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox<String> cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3, bApple, bFace, bGoogle;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    
    //Declaracion de objetos decoradores
 
   
   
    private Border bInferiorazul;
    private ImageIcon iFondo, iLogo, iCerrar,iconodeezerO ,iconoPanel,iconoPanelO,iconodeezer,iconoApple,iconoApple2,iconoAppleO,iconoFace,iconoFace2,iconoFaceO,iconoGoogle,iconoGoogleO,iconoO;

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
        sObjGraficos=  ObjetosGraficosService.getServicio();
        sRecursos=  RecursosService.getServicio();
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
        pDerecha=sObjGraficos.construirPanel(0, 0, 600, 500, new Color(240, 240, 240),null);
        this.add(pDerecha);
        pIzquierda=sObjGraficos.construirPanel(600, 0, 400, 500, new Color(39, 73, 109),null);
        this.add(pIzquierda);
       
    }

    public void crearObjetosDecoradores() {
        iFondo = new ImageIcon("resources/imagesxxxxxxxxxxx");
        iconoPanel = new ImageIcon("resources//imagenes//FondoLogin.png");
        iconodeezer = new ImageIcon("resources//imagenes//deezerLogo.png");
        iconoApple = new ImageIcon("resources//imagenes//AppleLogo.png");
        iconoApple2 = new ImageIcon("resources//imagenes//AppleLogo2.png");
        iconoFace = new ImageIcon("resources//imagenes//facebookLogo.png");
        iconoFace2 = new ImageIcon("resources//imagenes//facebookLogo2.png");
        iconoGoogle = new ImageIcon("resources//imagenes//GoogleLogo.png");
        

        
        //fontSubtitulo = new Font("FontRockwell Extra Bold", Font.PLAIN,20);

        

        //bInferiorazul = BorderFactory.createLineBorder(Color.ORANGE,10, true);
        
    }

    public void crearJTextFields() {
        tNombreUsuario =sObjGraficos.construirJTextField("Correo electronico", 0, 0, 260, 40, Color.WHITE, Color.DARK_GRAY, Color.BLUE,null);
        /*tNombreUsuario = new JTextField("Correo electronico");
        tNombreUsuario.setSize(260, 40);
        
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        */
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 220);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.addMouseListener(loginComponent);
        //tNombreUsuario.setBorder(bInferiorazul);
        pDerecha.add(tNombreUsuario);

    }

    public void crearJPasswordField() {
        tClaveUsuario=sObjGraficos.construirJPasswordField("Clave Usuario", 0, 0, 260, 40, Color.WHITE, Color.DARK_GRAY, Color.BLUE,null);
        /*tClaveUsuario = new JPasswordField("Clave Usuario");
        tClaveUsuario.setSize(260, 40);
        
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);*/
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 280);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tClaveUsuario.addMouseListener(loginComponent);
        pDerecha.add(tClaveUsuario);

    }

    public void crearJLabels() {
        iconoPanelO = new ImageIcon(iconoPanel.getImage().getScaledInstance(pIzquierda.getWidth(), pIzquierda.getHeight(), Image.SCALE_DEFAULT));
        lFondo=sObjGraficos.construirJLabel(null, 0, 0,  pIzquierda.getWidth(), pIzquierda.getHeight(), null, null,null, null, null, null,null);
        lFondo.setIcon(iconoPanelO);
        pIzquierda.add(lFondo);
        
       
        lTituloApp=sObjGraficos.construirJLabel(null, 50, 20,  150,30 , null, null,null, null, null, null,null);
        iconodeezerO = new ImageIcon(iconodeezer.getImage().getScaledInstance(lTituloApp.getWidth(), lTituloApp.getHeight(), Image.SCALE_DEFAULT));
        lTituloApp.setIcon(iconodeezerO);
        pDerecha.add(lTituloApp);
        
        
        lTituloLogin=sObjGraficos.construirJLabel("Conectarse", (pDerecha.getWidth() - 150) / 2, 50,  150,30 , null, null,sRecursos.getFontTitulo(), null, Color.BLACK, null,null);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);
        
        
        
        lNotificaciones=sObjGraficos.construirJLabel("¿Recibir Notificaciones?", (pDerecha.getWidth() - 140) / 2, 450,  140,20 , null, null,null, null, Color.DARK_GRAY, null,null);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        
        /*lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setSize(140, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 450);
        //lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        //lNotificaciones.setForeground(Color.DARK_GRAY);
       */
        
        pDerecha.add(lNotificaciones);

        lRecuperar=sObjGraficos.construirJLabel("¿Has olvidado tu contraseña?", (pDerecha.getWidth() - 190) / 2, 430,  190,30 , null, null,null, null, Color.BLACK, null,null);
        lRecuperar.setHorizontalAlignment(SwingConstants.CENTER);
        /*lRecuperar = new JLabel("¿Has olvidado tu contraseña?");
        lRecuperar.setSize(190, 30);
        lRecuperar.setLocation((pDerecha.getWidth() - lRecuperar.getWidth()) / 2, 430);
        lRecuperar.setForeground(Color.BLACK);
        lRecuperar.setHorizontalAlignment(SwingConstants.CENTER);
        */
        pDerecha.add(lRecuperar);

        

    }

    public void crearJCheckBoxes() {
       checkSi= sObjGraficos.construirJCheckBoxes("¿Recordar Usuario?", 0, 0, 140, 25, new Color(240, 240, 240), Color.BLACK);
       /* checkSi = new JCheckBox("¿Recordar Usuario?");
        checkSi.setSize(140, 25);
        checkSi.setFocusable(false);
        checkSi.setForeground(Color.BLACK);
        checkSi.setBackground(new Color(240, 240, 240));*/
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2, 330);
        pDerecha.add(checkSi);

    }

    public void crearJButtons() {
        bEntrar= sObjGraficos.construirJButton("Iniciar sesión", (pDerecha.getWidth() - 250) / 2, 370, 250, 45, sRecursos.getcMano(),null, sRecursos.getColorRojoSesion(), Color.WHITE,"t",true);
        bEntrar.addActionListener(loginComponent);
        bEntrar.addMouseListener(loginComponent);
        pDerecha.add(bEntrar);
       

        bRegistrarse= sObjGraficos.construirJButton("Registrarse", 255, 15, 115, 30, sRecursos.getcMano(),null, sRecursos.getColorAzul(), Color.WHITE,"t",true);
        bRegistrarse.addActionListener(loginComponent);
        bRegistrarse.addMouseListener(loginComponent);
        pIzquierda.add(bRegistrarse);
      
       
        bApple= sObjGraficos.construirJButton("Apple", 180, 130, 115, 30, sRecursos.getcMano(),null, Color.BLACK, Color.white," ",true);
        iconoAppleO = new ImageIcon(iconoApple.getImage().getScaledInstance(bApple.getWidth() / 4, bApple.getHeight(), Image.SCALE_DEFAULT));
        bApple.setIcon(iconoAppleO);
        bApple.addMouseListener(loginComponent);
        pDerecha.add(bApple);
      
        
        bFace= sObjGraficos.construirJButton("Facebook", 305, 130, 115, 30, sRecursos.getcMano(), null, sRecursos.getColorAzulF(), Color.white," ",true);
        iconoFaceO = new ImageIcon(iconoFace.getImage().getScaledInstance(bFace.getWidth() / 6, bFace.getHeight(), Image.SCALE_DEFAULT));
        bFace.setIcon(iconoFaceO);
        bFace.addMouseListener(loginComponent);
        pDerecha.add(bFace);
       
        
        bGoogle= sObjGraficos.construirJButton("Google", 180, 170, 115, 30, sRecursos.getcMano(), null, new Color(255, 255, 255), new Color(117, 117, 117)," ",true);
        iconoGoogleO = new ImageIcon(iconoGoogle.getImage().getScaledInstance(bGoogle.getWidth() / 5, bGoogle.getHeight(), Image.SCALE_DEFAULT));
        bGoogle.setIcon(iconoGoogleO);
        bGoogle.addMouseListener(loginComponent);
        pDerecha.add(bGoogle);
       
    }

    /*private void generarFuentes() {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(
                    Font.TRUETYPE_FONT,
                    new File("Clase3/resources/fonts/LUZRO.ttf")
            ));
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }*/
    public ImageIcon getIconoEstado1(JButton boton){
        if(boton==bFace){
            iconoO = new ImageIcon(iconoFace.getImage().getScaledInstance(bFace.getWidth() / 6, bFace.getHeight(), Image.SCALE_DEFAULT));
        }
        if(boton==bApple){
            iconoO = new ImageIcon(iconoApple.getImage().getScaledInstance(bApple.getWidth() / 4, bApple.getHeight(), Image.SCALE_DEFAULT));
        }
        return iconoO;
    }
    public ImageIcon getIconoEstado2(JButton boton){
        if(boton==bFace){
            iconoO = new ImageIcon(iconoFace2.getImage().getScaledInstance(bFace.getWidth() / 6, bFace.getHeight(), Image.SCALE_DEFAULT));
        }
        if(boton==bApple){
            iconoO = new ImageIcon(iconoApple2.getImage().getScaledInstance(bApple.getWidth() / 4, bApple.getHeight()-5, Image.SCALE_DEFAULT));
        }
        return iconoO;
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
    
}

