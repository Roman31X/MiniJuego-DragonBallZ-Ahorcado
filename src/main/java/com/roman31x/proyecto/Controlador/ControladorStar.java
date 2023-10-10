package com.roman31x.proyecto.Controlador;

import com.roman31x.proyecto.Vista.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

/**
 *
 * @author Roman31X
 */
public class ControladorStar implements MouseListener,ActionListener{
    private StarGame inicio;
    private ControlDificultad dificil;
    private SeleccionDificultad seleccion;
    
    private Clip fondoMusica;
    private Clip musica;

    public ControladorStar(StarGame inicio1) {
        this.inicio = inicio1;
        
        inicio.JUGAR.addMouseListener(this);
        inicio.salir.addMouseListener(this);
        inicio.JUGAR.addActionListener(this);
        inicio.salir.addActionListener(this);
        
    }
    
    public void Mostrar(){
        inicio.setVisible(true);
    }
    
    public void Play() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        InputStream ruta = null;
        ruta =getClass().getResourceAsStream("/AudioJuego/PrimerPanel.wav");
        fondoMusica = AudioSystem.getClip();
        fondoMusica.open(AudioSystem.getAudioInputStream(ruta));
        fondoMusica.start();
    }
    
    public Clip ReproducirAudio(int dato)throws LineUnavailableException{
        InputStream ruta = null;
        if(dato == 1){
            
        }else if(dato == 2){
            ruta =getClass().getResourceAsStream("/AudioJuego/iniciar.wav");
        }else if(dato == 3){
            ruta =getClass().getResourceAsStream("/AudioJuego/Jugar.wav");
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
        seleccion = new SeleccionDificultad();
        fondoMusica.stop();
        switch(accion){
            case "INICIAR":
                dificil = new ControlDificultad(seleccion);
                dificil.Mostrar();
            {
                try {
                    dificil.Play();
                } catch (LineUnavailableException ex) {
                    System.out.println(ex);
                } catch (UnsupportedAudioFileException ex) {
                    System.out.println(ex);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
                inicio.setVisible(false);
                break;

            case "SALIR":
                System.exit(0);
                break;
        }        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == inicio.JUGAR){
            if(musica.isRunning()){
                musica.stop();
                musica.close();
            }
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
        if(e.getSource() == inicio.JUGAR){
            inicio.nub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/nub.png")));
            try {
                musica = ReproducirAudio(2);
                musica.start();
            } catch (LineUnavailableException ex) {
                System.out.println(ex);
            }
        }else if (e.getSource() == inicio.salir){
            inicio.nub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/nub.png")));
            try {
                musica = ReproducirAudio(3);
                musica.start();
            } catch (LineUnavailableException ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == inicio.JUGAR){
            inicio.nub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            musica.stop();
        }else if (e.getSource() == inicio.salir){
            inicio.nub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            musica.stop();
        }
    }
}
