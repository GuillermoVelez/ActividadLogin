package app.login;

import java.awt.Color;
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

public class LoginTemplate extends JFrame {

    //Declaracion de objetos graficos
    private JPanel pIzquierda, pDerecha;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones, lRecuperar;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox<String> cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;

    public LoginTemplate() {
        super("Login de usuario");

        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(new Color(39, 73, 109));
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLocation(600, 0);
        pDerecha.setBackground(Color.DARK_GRAY);
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lTituloApp = new JLabel("DEEZER", SwingConstants.CENTER);
        lTituloApp.setBounds(100, 20, 220, 30);
        lTituloApp.setLocation((pIzquierda.getWidth() - lTituloApp.getWidth()) / 2, 40);
        lTituloApp.setForeground(Color.WHITE);
        lTituloApp.setLayout(null);
        //lTituloApp.setOpaque(true);
        //lTituloApp.setBackground(Color.MAGENTA);
        pIzquierda.add(lTituloApp);

        lEslogan = new JLabel("Escucha musica para cada momento");
        lEslogan.setSize(230, 20);
        lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setForeground(Color.WHITE);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lEslogan);

        lTituloLogin = new JLabel("Inicio de sesion");
        lTituloLogin.setSize(150, 30);
        lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 100);
        lTituloLogin.setForeground(Color.WHITE);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setSize(140, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 370);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField("Nombre Usuario");
        tNombreUsuario.setSize(260, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 160);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField("Clave Usuario");
        tClaveUsuario.setSize(260, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 220);
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
        
        
        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 330);
        bEntrar.setBackground(new Color(20, 40, 80));
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setFocusable(false);
        pDerecha.add(bEntrar);

        /*bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(Color.BLUE);
        bCerrar.setForeground(Color.WHITE);
        pDerecha.add(bCerrar);*/
        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(230, 420, 145, 35);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(new Color(20, 40, 80));
        bRegistrarse.setForeground(Color.WHITE);
        pDerecha.add(bRegistrarse);

        checkSi = new JCheckBox("¿Recordar Usuario?");
        checkSi.setSize(140, 25);
        checkSi.setFocusable(false);
        checkSi.setForeground(Color.WHITE);
        checkSi.setBackground(Color.DARK_GRAY);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2, 270);
        pDerecha.add(checkSi);

        lRecuperar = new JLabel("Recuperar contraseña");
        lRecuperar.setSize(150, 30);
        lRecuperar.setLocation((pDerecha.getWidth() - lRecuperar.getWidth()) / 2, 290);
        lRecuperar.setForeground(new Color(0, 144, 158));
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

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(1000, 500);
        setLocationRelativeTo(this);

    }
}
