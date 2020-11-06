package app.login;

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
    private Color colorPrincipal, colorGris, colorNegroTransparente;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo;
    private Cursor cMano;
    private Border bInferiorazul;
    private ImageIcon iFondo, iLogo, iCerrar;
    

    public LoginTemplate() {
        
        super("Login de usuario");

        colorPrincipal = new Color(60, 78, 120);
        colorGris = new Color(80, 80, 80);
        colorNegroTransparente = new Color(30, 30, 30, 30);

        fontTPrincipal = new Font("FontRockwell Extra Bold", Font.PLAIN, 30);
        fontTitulo = new Font("Calibri (Cuerpo)", Font.BOLD, 22);
        //fontSubtitulo = new Font("FontRockwell Extra Bold", Font.PLAIN,20);
        
        cMano = new Cursor(Cursor.HAND_CURSOR);
        
        //bInferiorazul = BorderFactory.createLineBorder(Color.ORANGE,10, true);
        
        iFondo = new ImageIcon("resources/imagesxxxxxxxxxxx");

        pDerecha = new JPanel();
        pDerecha.setSize(600, 500);
        pDerecha.setLocation(0, 0);
        pDerecha.setBackground(new Color(240, 240, 240));
        pDerecha.setLayout(null);
        this.add(pDerecha);

        pIzquierda = new JPanel();
        pIzquierda.setSize(400, 500);
       
        pIzquierda.setLocation(600, 0);
        pIzquierda.setBackground(new Color(39, 73, 109));
        pIzquierda.setLayout(null);
        this.add(pIzquierda);
        
      
        ImageIcon iconoPanel = new ImageIcon("imagenes//FondoLogin.png");
        ImageIcon iconoPanelO = new ImageIcon(iconoPanel.getImage().getScaledInstance(pIzquierda.getWidth(), pIzquierda.getHeight(), Image.SCALE_DEFAULT));
        lFondo = new JLabel(iconoPanelO);
        lFondo.setBounds(0, 0, pIzquierda.getWidth(), pIzquierda.getHeight());
        //lTituloApp.setLocation((pIzquierda.getWidth() - lTituloApp.getWidth()) / 2, 40);
        lFondo.setLayout(null);
        pIzquierda.add(lFondo);
        
        lTituloApp = new JLabel();
        lTituloApp.setBounds(50, 20, 150, 30);
        ImageIcon iconodeezer = new ImageIcon("imagenes//deezerLogo.png");
        ImageIcon iconodeezerO = new ImageIcon(iconodeezer.getImage().getScaledInstance(lTituloApp.getWidth(), lTituloApp.getHeight(), Image.SCALE_DEFAULT));
        lTituloApp.setIcon(iconodeezerO);
        //lTituloApp.setLocation((pIzquierda.getWidth() - lTituloApp.getWidth()) / 2, 40);
        lTituloApp.setForeground(Color.BLACK);
        lTituloApp.setLayout(null);
        lTituloApp.setFont(fontTitulo);
        //lTituloApp.setOpaque(true);
        //lTituloApp.setBackground(Color.MAGENTA);
        pDerecha.add(lTituloApp);


        /*lEslogan = new JLabel("Escucha musica para cada momento");
        lEslogan.setSize(230, 20);
        lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setForeground(Color.WHITE);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lEslogan);*/

        lTituloLogin = new JLabel("Conectarse");
        lTituloLogin.setSize(150, 30);
        lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 50);
        lTituloLogin.setLayout(null);
        lTituloLogin.setForeground(Color.BLACK);
        lTituloLogin.setFont(fontTitulo);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setSize(140, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 450);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField("Correo electronico");
        tNombreUsuario.setSize(260, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 220);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        //tNombreUsuario.setBorder(bInferiorazul);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField("Clave Usuario");
        tClaveUsuario.setSize(260, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 280);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);

        /*cbTipoUsuario = new JComboBox<String>();
        cbTipoUsuario.addItem("Cliente");
        cbTipoUsuario.addItem("Cajero");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.setSize(220, 30);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 185);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoUsuario);*/
        
        
        bEntrar = new JButton("Iniciar sesión");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 370);
        bEntrar.setBackground(new Color(239, 84, 102));
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setFocusable(false);
        bEntrar.setCursor(cMano);
        pDerecha.add(bEntrar);

        /*bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(Color.BLUE);
        bCerrar.setForeground(Color.WHITE);
        pDerecha.add(bCerrar);*/
        
        
        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(200, 30, 145, 35);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(new Color(20, 40, 80));
        bRegistrarse.setForeground(Color.WHITE);
        bRegistrarse.setCursor(cMano);
        pIzquierda.add(bRegistrarse);
        
        
        bApple = new JButton("Apple");
        bApple.setBounds(180, 130, 115, 30);
        ImageIcon iconoApple = new ImageIcon("imagenes//AppleLogo.png");
        ImageIcon iconoAppleO = new ImageIcon(iconoApple.getImage().getScaledInstance(bApple.getWidth()/4, bApple.getHeight(), Image.SCALE_DEFAULT));
        bApple.setIcon(iconoAppleO);
        bApple.setFocusable(false);
        bApple.setBackground(new Color(25, 25, 34));
        bApple.setForeground(new Color(255, 255, 255));
        bApple.setCursor(cMano);
        pDerecha.add(bApple);
        
        bFace = new JButton("Facebook");
        bFace.setBounds(305, 130, 115, 30);
        ImageIcon iconoFace = new ImageIcon("imagenes//facebookLogo.png");
        ImageIcon iconoFaceO = new ImageIcon(iconoFace.getImage().getScaledInstance(bFace.getWidth()/6, bFace.getHeight(), Image.SCALE_DEFAULT));
        bFace.setIcon(iconoFaceO);
        bFace.setFocusable(false);
        bFace.setBackground(new Color(37, 83, 180));
        bFace.setForeground(new Color(255, 255, 255));
        bFace.setCursor(cMano);
        pDerecha.add(bFace);
        
        bGoogle = new JButton("Google");
        bGoogle.setBounds(180, 170, 115, 30);
        ImageIcon iconoGoogle = new ImageIcon("imagenes//GoogleLogo.png");
        ImageIcon iconoGoogleO = new ImageIcon(iconoGoogle.getImage().getScaledInstance(bGoogle.getWidth()/5, bGoogle.getHeight(), Image.SCALE_DEFAULT));
        bGoogle.setIcon(iconoGoogleO);
        bGoogle.setFocusable(false);
        bGoogle.setBackground(new Color(255, 255, 255));
        bGoogle.setForeground(new Color(117, 117, 117));
        bGoogle.setCursor(cMano);
        pDerecha.add(bGoogle);

        checkSi = new JCheckBox("¿Recordar Usuario?");
        checkSi.setSize(140, 25);
        checkSi.setFocusable(false);
        checkSi.setForeground(Color.BLACK);
        checkSi.setBackground(new Color(240, 240, 240));
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2, 330);
        pDerecha.add(checkSi);

        lRecuperar = new JLabel("¿Has olvidado tu contraseña?");
        lRecuperar.setSize(190, 30);
        lRecuperar.setLocation((pDerecha.getWidth() - lRecuperar.getWidth()) / 2, 430);
        lRecuperar.setForeground(Color.BLACK);
        lRecuperar.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lRecuperar);


        /*bOpcion1 = new JButton();
        bOpcion1.setBounds(10, 220, 30, 20);
        pIzquierda.add(bOpcion1);

        bOpcion2 = new JButton();
        bOpcion2.setBounds(10, 250, 30, 20);
        pIzquierda.add(bOpcion2);

        bOpcion3 = new JButton();
        bOpcion3.setBounds(10, 280, 30, 20);
        pIzquierda.add(bOpcion3);

        checkSi = new JCheckBox("Si");
        checkSi.setSize(45, 25);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 345);
        pDerecha.add(checkSi);

        checkNo = new JCheckBox("No");
        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 345);
        pDerecha.add(checkNo);*/
        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);
        
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 600, 600);
        lFondo.setIcon(iFondo);
        //pIzquierda.add(iFondo);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000, 540);
        setLocationRelativeTo(this);

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

}
