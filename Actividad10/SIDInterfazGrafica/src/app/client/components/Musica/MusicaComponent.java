/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.components.Musica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author alexh
 */
public class MusicaComponent extends MouseAdapter implements ActionListener {

    private MusicaTemplate musicaTemplate;
    private Timer timerC, timerP;
    private int direccionC, posicionInicialC, direccionP, posicionInicialP;
    private int cont;

    public MusicaComponent() {

        this.musicaTemplate = new MusicaTemplate(this);
        timerC = new Timer(0, this);
        timerP = new Timer(0, this);

    }

    public MusicaTemplate getMusicaTemplate() {
        return this.musicaTemplate;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() instanceof JButton) {
            JButton boton = (JButton) me.getSource();
            boton.setContentAreaFilled(true);
            boton.setBackground(musicaTemplate.getsRecursos().getColorFondoClaro());
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource() instanceof JButton) {
            JButton boton = (JButton) me.getSource();
            boton.setContentAreaFilled(false);
            boton.setBackground(musicaTemplate.getsRecursos().getColorFondoClaro());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() instanceof JButton) {
            if (ae.getSource() == musicaTemplate.getbSuperiorPrev() || ae.getSource() == musicaTemplate.getbSuperiorNext()) {
                cont = 1;
                if (ae.getSource() == musicaTemplate.getbSuperiorPrev()) {
                    this.direccionC = 1;
                }
                if (ae.getSource() == musicaTemplate.getbSuperiorNext()) {
                    this.direccionC = -1;
                }
                posicionInicialC = musicaTemplate.getpCanciones().getX();
                this.timerC.start();
            }
            if (ae.getSource() == musicaTemplate.getbInferiorPrev() || ae.getSource() == musicaTemplate.getbInferiorNext()) {
                cont = 0;
                if (ae.getSource() == musicaTemplate.getbInferiorPrev()) {
                    this.direccionP = 1;
                }
                if (ae.getSource() == musicaTemplate.getbInferiorNext()) {
                    this.direccionP = -1;
                }
                posicionInicialP = musicaTemplate.getpPlaylists().getX();
                this.timerP.start();
            }
        }
        this.moverCanciones2(cont);

    }

    public void moverCanciones2(int aux) {
        if (aux == 1) {
            if (musicaTemplate.getpCanciones().getX() == 0 && direccionC == 1
                    || musicaTemplate.getpCanciones().getX() == -960 && direccionC == -1) {
                assert true;
            } else {
                if (musicaTemplate.getpCanciones().getX() == posicionInicialC + 240
                        || musicaTemplate.getpCanciones().getX() == posicionInicialC - 240) {
                    timerC.stop();
                } else {
                    musicaTemplate.getpCanciones().setLocation(
                            musicaTemplate.getpCanciones().getX() + direccionC,
                            musicaTemplate.getpCanciones().getY()
                    );
                }

            }

            musicaTemplate.repaint();
        } else {
            if (musicaTemplate.getpPlaylists().getX() == 0 && direccionP == 1
                    || musicaTemplate.getpPlaylists().getX() == -960 && direccionP == -1) {
                assert true;
            } else {
                if (musicaTemplate.getpPlaylists().getX() == posicionInicialP + 240
                        || musicaTemplate.getpPlaylists().getX() == posicionInicialP - 240) {
                    timerP.stop();
                } else {
                    musicaTemplate.getpPlaylists().setLocation(
                            musicaTemplate.getpPlaylists().getX() + direccionP,
                            musicaTemplate.getpPlaylists().getY()
                    );
                }
            }
            musicaTemplate.repaint();
        }
    }

}
