package com.roman31x.proyecto.Controlador;

import com.roman31x.proyecto.Modelo.*;
import com.roman31x.proyecto.Vista.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.sound.sampled.*;

/**
 *
 * @author Roman31X
 */
public class ControlDificultad implements MouseListener,ActionListener{
    private final SeleccionDificultad dificultad;
    private StarGame inicio;
    private CampoBatalla batalla;    
    
    private ControladorStar reiniciar;
    private ControlJuego juego;
    private SeleccionPanel panel;
    
    private DatosPersonajes personaje;
    private Clip fondoMusica;
    private Clip musica;

    public ControlDificultad(SeleccionDificultad dificultad1) {
        this.dificultad = dificultad1;
        
        dificultad.FACIL.addActionListener(this);
        dificultad.FACIL.addMouseListener(this);
        dificultad.fase1.addMouseListener(this);
        dificultad.nube1.addMouseListener(this);
        dificultad.NORMAL.addActionListener(this);
        dificultad.NORMAL.addMouseListener(this);
        dificultad.fase2.addMouseListener(this);
        dificultad.nube2.addMouseListener(this);
        dificultad.DIFICIL.addActionListener(this);
        dificultad.DIFICIL.addMouseListener(this);
        dificultad.fase3.addMouseListener(this);
        dificultad.nube3.addMouseListener(this);
        dificultad.DIOS.addActionListener(this);
        dificultad.DIOS.addMouseListener(this);
        dificultad.fase4.addMouseListener(this);
        dificultad.nube4.addMouseListener(this);
        dificultad.Atras.addMouseListener(this);
        dificultad.Silla.addMouseListener(this);
    }
    
    public void Mostrar(){
        dificultad.setVisible(true);
    }
    
    public void Play() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        InputStream ruta = null;
        ruta =getClass().getResourceAsStream("/AudioJuego/SegundoPanel.wav");
        fondoMusica = AudioSystem.getClip();
        fondoMusica.open(AudioSystem.getAudioInputStream(ruta));
        fondoMusica.start();
    }
    
    public Clip ReproducirAudio(int dato)throws LineUnavailableException{
        InputStream ruta = null;
        switch(dato){
            case 1:
                ruta =getClass().getResourceAsStream("/AudioJuego/Fase1.wav");
                break;
            case 2:
                ruta =getClass().getResourceAsStream("/AudioJuego/Fase2.wav");
                break;
            case 3:
                ruta =getClass().getResourceAsStream("/AudioJuego/Fase3.wav");
                break;
            case 4:
                ruta =getClass().getResourceAsStream("/AudioJuego/Fase4.wav");
                break;  
        }
        
        Clip clip;
        clip = AudioSystem.getClip();
        try {
            clip.open(AudioSystem.getAudioInputStream(ruta));
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } 
        return clip;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        batalla = new CampoBatalla();
        personaje = new DatosPersonajes();
        char [] texto = new char[0];
        int numero;
        switch(accion){
            case "FACIL":
                batalla.Tipo.setText(personaje.SeleccionTipo(1));
                numero = (int)(Math.random()*9);
                texto = personaje.Nombre(1, numero);
                break;
            case "NORMAL":
                batalla.Tipo.setText(personaje.SeleccionTipo(2));
                numero = (int)(Math.random()*9);
                texto = personaje.Nombre(2, numero);
            break;
            case "DIFICIL":
                batalla.Tipo.setText(personaje.SeleccionTipo(3));
                numero = (int)(Math.random()*9);
                texto = personaje.Nombre(3, numero);
            break;
            case "NIVEL DIOS":
                batalla.Tipo.setText(personaje.SeleccionTipo(4));
                numero = (int)(Math.random()*9);
                texto = personaje.Nombre(4, numero);
            break;
        }
        juego = new ControlJuego(batalla,texto);
        juego.CambioPanel(1,texto,'X');
        fondoMusica.stop();
        try {
            juego.Play();
        } catch (LineUnavailableException ex) {
            System.out.println(ex);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        juego.Mostrar();
        dificultad.setVisible(false);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == dificultad.Atras){
            inicio = new StarGame();
            reiniciar = new ControladorStar(inicio);
            try {
                reiniciar.Play();
            } catch (LineUnavailableException ex) {
                System.out.println(ex);
            } catch (UnsupportedAudioFileException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            fondoMusica.stop();
            reiniciar.Mostrar();
            dificultad.setVisible(false);
        }        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == dificultad.FACIL){
            dificultad.fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/fase1.png")));
            dificultad.nube1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/nub.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            try {
                musica = ReproducirAudio(1);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ControlDificultad.class.getName()).log(Level.SEVERE, null, ex);
            }
            musica.start();
        }else if(e.getSource() == dificultad.NORMAL){
            dificultad.fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/fase2.png")));
            dificultad.nube2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/nub.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            try {
                musica = ReproducirAudio(2);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ControlDificultad.class.getName()).log(Level.SEVERE, null, ex);
            }
            musica.start();
        }else if(e.getSource() == dificultad.DIFICIL){
            dificultad.fase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/fase3.png")));
            dificultad.nube3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/nub.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            try {
                musica = ReproducirAudio(3);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ControlDificultad.class.getName()).log(Level.SEVERE, null, ex);
            }
            musica.start();
        }else if(e.getSource() == dificultad.DIOS){
            dificultad.fase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Fase4.png")));
            dificultad.nube4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/nub.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            try {
                musica = ReproducirAudio(4);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ControlDificultad.class.getName()).log(Level.SEVERE, null, ex);
            }
            musica.start();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == dificultad.FACIL){
            dificultad.fase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            dificultad.nube1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Silla.png")));
            musica.stop();
        }else if(e.getSource() == dificultad.NORMAL){
            dificultad.fase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            dificultad.nube2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Silla.png")));
            musica.stop();
        }else if(e.getSource() == dificultad.DIFICIL){
            dificultad.fase3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            dificultad.nube3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Silla.png")));
            musica.stop();
        }else if(e.getSource() == dificultad.DIOS){
            dificultad.fase4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Vacio.png")));
            dificultad.nube4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            dificultad.Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Silla.png")));
            musica.stop();
        }
    }
}
