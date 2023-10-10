package com.roman31x.proyecto.Controlador;

import com.roman31x.proyecto.Modelo.*;
import com.roman31x.proyecto.Vista.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Roman31X
 */
public class ControladorGameOver implements MouseListener{
    private final GamerOver finjuego;
    private CampoBatalla nuevaBatalla;
    
    private ControlJuego nuevojuego;
    private DatosPersonajes nuevopersonaje;
    private SeleccionPanel panel;
    
    private String grupo;
    
    private Clip fondoMusica;
    private Clip musica;
    
    public ControladorGameOver(GamerOver finjuego1,String grupo1) {
        this.finjuego = finjuego1;
        this.grupo = grupo1;
        
        finjuego.continuar.addMouseListener(this);
        finjuego.salir.addMouseListener(this);
    }
    
    public void Mostrar(){
        finjuego.setVisible(true);
    }
        
    public void Play() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        InputStream ruta = null;
        ruta =getClass().getResourceAsStream("/AudioJuego/CuartoPanel.wav");
        fondoMusica = AudioSystem.getClip();
        fondoMusica.open(AudioSystem.getAudioInputStream(ruta));
        fondoMusica.start();
    }
    
    public Clip ReproducirAudio(int dato)throws LineUnavailableException{
        InputStream ruta = null;
        switch(dato){
            case 1:
                ruta =getClass().getResourceAsStream("/AudioJuego/Continuar.wav");
                break;
            case 2:
                ruta =getClass().getResourceAsStream("/AudioJuego/SalirFin.wav");
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
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == finjuego.salir){
            System.exit(0);
        }else if(e.getSource() == finjuego.continuar){
            nuevaBatalla = new CampoBatalla();
            nuevopersonaje = new DatosPersonajes();
            int nuevoNumero = nuevopersonaje.TipoArreglo(grupo);
            int nuevoRandon = (int)(Math.random()*9);
            char[] nuevo = nuevopersonaje.Nombre(nuevoNumero, nuevoRandon);
            int nuevoTamaño = nuevo.length;
            nuevojuego = new ControlJuego(nuevaBatalla,nuevo);
            nuevojuego.CambioPanel(1,nuevo,'X');
            nuevaBatalla.Tipo.setText(grupo);
            fondoMusica.stop();
            nuevojuego.Mostrar();
            try {
                nuevojuego.Play();
            } catch (LineUnavailableException ex) {
                System.out.println(ex);
            } catch (UnsupportedAudioFileException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            finjuego.setVisible(false);
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
        if(e.getSource() == finjuego.continuar){
            finjuego.esfera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/IcoEsfera.png")));
            finjuego.continuar.setForeground(new java.awt.Color(241, 14, 14));
            finjuego.continuar.setFont(new java.awt.Font("Stencil", 1, 24));  
            try {
                musica = ReproducirAudio(1);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ControlDificultad.class.getName()).log(Level.SEVERE, null, ex);
            }
            musica.start();
        }else if(e.getSource() == finjuego.salir){
            finjuego.esfera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/IcoEsfera.png")));
            finjuego.salir.setForeground(new java.awt.Color(241, 14, 14));
            finjuego.salir.setFont(new java.awt.Font("Stencil", 1, 24));
            try {
                musica = ReproducirAudio(2);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ControlDificultad.class.getName()).log(Level.SEVERE, null, ex);
            }
            musica.start();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == finjuego.continuar){
            finjuego.esfera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            finjuego.continuar.setForeground(new java.awt.Color(255, 255, 0));
            finjuego.continuar.setFont(new java.awt.Font("Stencil", 1, 18));
            musica.stop();
        }else if(e.getSource() == finjuego.salir){
            finjuego.esfera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/Vacio.png")));
            finjuego.salir.setForeground(new java.awt.Color(255, 255, 0));
            finjuego.salir.setFont(new java.awt.Font("Stencil", 1, 18));
            musica.stop();
        }
    }
    
}
