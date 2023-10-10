package com.roman31x.proyecto.Controlador;

import com.roman31x.proyecto.Modelo.*;
import com.roman31x.proyecto.Paneles.*;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Roman31X
 */
public class ControlJuego implements MouseListener,ActionListener{
    private final CampoBatalla campo;
    private SeleccionDificultad dificultad;
    private GamerOver fin;
    
    private final PanelTres tres = new PanelTres();;
    private final PanelCuatro cuatro = new PanelCuatro();
    private final PanelCinco cinco = new PanelCinco();
    private final PanelSeis seis = new PanelSeis();
    private final PanelSiete siete = new PanelSiete();
    private final PanelOcho ocho = new PanelOcho();
    private final PanelNueve nueve = new PanelNueve();
    
    private ControlDificultad controlDicicultad;
    private ControladorGameOver perdiste;
    private SeleccionPanel panel;
    private DatosPersonajes personaje;
    
    static char[] otroNuevo;
    private char[] palabra;
    public static int contador = 0;
    public static int contadorDos = 0;
    public static int nivelPoder = 0;
    
    private Clip fondoMusica;
    private Clip musica;

    public ControlJuego(CampoBatalla campo1,char[] palabra1) {
        this.campo = campo1;
        this.palabra = palabra1;
        otroNuevo = palabra;
        campo.Regresar.addMouseListener(this);
        campo.Refrescar.addMouseListener(this);
        
        campo.A.addActionListener(this);
        campo.B.addActionListener(this);
        campo.C.addActionListener(this);
        campo.D.addActionListener(this);
        campo.E.addActionListener(this);
        campo.F.addActionListener(this);
        campo.G.addActionListener(this);
        campo.H.addActionListener(this);
        campo.I.addActionListener(this);
        campo.J.addActionListener(this);
        campo.K.addActionListener(this);
        campo.L.addActionListener(this);
        campo.M.addActionListener(this);
        campo.N.addActionListener(this);
        campo.Ñ.addActionListener(this);
        campo.O.addActionListener(this);
        campo.P.addActionListener(this);
        campo.Q.addActionListener(this);
        campo.R.addActionListener(this);
        campo.S.addActionListener(this);
        campo.T.addActionListener(this);
        campo.U.addActionListener(this);
        campo.V.addActionListener(this);
        campo.W.addActionListener(this);
        campo.X.addActionListener(this);
        campo.Y.addActionListener(this);
        campo.Z.addActionListener(this);
    }
    
    public void Mostrar(){
        campo.setVisible(true);
    }
    
    public void Play() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        InputStream ruta = null;
        ruta =getClass().getResourceAsStream("/AudioJuego/TercerPanel.wav");
        fondoMusica = AudioSystem.getClip();
        fondoMusica.open(AudioSystem.getAudioInputStream(ruta));
        fondoMusica.start();
    }

    public Clip ReproducirAudio(int dato)throws LineUnavailableException{
        InputStream ruta = null;
        switch(dato){
            case 1:
                ruta =getClass().getResourceAsStream("/AudioJuego/KrilinPartes.wav");
                break;
            case 2:
                ruta =getClass().getResourceAsStream("/AudioJuego/NoteMuevas.wav");
                break;
            case 3:
                ruta =getClass().getResourceAsStream("/AudioJuego/Gokuuuu.wav");
                break;
            case 4:
                ruta =getClass().getResourceAsStream("/AudioJuego/AumentoPoder.wav");
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
        switch(accion){
            case "A": campo.A.setEnabled(false);
                    CambioPanel(2,otroNuevo,'A');
                    break;
            case "B": campo.B.setEnabled(false);
                    CambioPanel(2,otroNuevo,'B');
                    break;
            case "C": campo.C.setEnabled(false);
                    CambioPanel(2,otroNuevo,'C');
                    break;
            case "D": campo.D.setEnabled(false);
                    CambioPanel(2,otroNuevo,'D');
                    break;
            case "E": campo.E.setEnabled(false);
                    CambioPanel(2,otroNuevo,'E');
                    break;
            case "F": campo.F.setEnabled(false);
                    CambioPanel(2,otroNuevo,'F');
                    break;
            case "G": campo.G.setEnabled(false);
                    CambioPanel(2,otroNuevo,'G');
                    break;
            case "H": campo.H.setEnabled(false);
                    CambioPanel(2,otroNuevo,'H');
                    break;
            case "I": campo.I.setEnabled(false);
                    CambioPanel(2,otroNuevo,'I');
                    break;
            case "J": campo.J.setEnabled(false);
                    CambioPanel(2,otroNuevo,'J');
                    break;
            case "K": campo.K.setEnabled(false);
                    CambioPanel(2,otroNuevo,'K');
                    break;
            case "L": campo.L.setEnabled(false);
                    CambioPanel(2,otroNuevo,'L');
                    break;
            case "M": campo.M.setEnabled(false);
                    CambioPanel(2,otroNuevo,'M');
                    break;
            case "N": campo.N.setEnabled(false);
                    CambioPanel(2,otroNuevo,'N');
                    break;
            case "Ñ": campo.Ñ.setEnabled(false);
                    CambioPanel(2,otroNuevo,'Ñ');
                    break;
            case "O": campo.O.setEnabled(false);
                    CambioPanel(2,otroNuevo,'O');
                    break;
            case "P": campo.P.setEnabled(false);
                    CambioPanel(2,otroNuevo,'P');
                    break;
            case "Q": campo.Q.setEnabled(false);
                    CambioPanel(2,otroNuevo,'Q');
                    break;
            case "R": campo.R.setEnabled(false);
                    CambioPanel(2,otroNuevo,'R');
                    break;
            case "S": campo.S.setEnabled(false);
                    CambioPanel(2,otroNuevo,'S');
                    break;
            case "T": campo.T.setEnabled(false);
                    CambioPanel(2,otroNuevo,'T');
                    break;
            case "U": campo.U.setEnabled(false);
                    CambioPanel(2,otroNuevo,'U');
                    break;
            case "V": campo.V.setEnabled(false);
                    CambioPanel(2,otroNuevo,'V');
                    break;
            case "W": campo.W.setEnabled(false);
                    CambioPanel(2,otroNuevo,'W');
                    break;
            case "X": campo.X.setEnabled(false);
                    CambioPanel(2,otroNuevo,'X');
                    break;
            case "Y": campo.Y.setEnabled(false);
                    CambioPanel(2,otroNuevo,'Y');
                    break;
            case "Z": campo.Z.setEnabled(false);
                    CambioPanel(2,otroNuevo,'Z');
                    break;
        }
        
        switch(contador){
            case 1: campo.Cabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Cabeza.png")));
                    try {
                        musica = ReproducirAudio(1);
                    } catch (LineUnavailableException ex) {
                        System.out.println(ex);
                    }
                    musica.start();
                    break;

            case 2: campo.Pecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Pecho.png")));
                    try {
                        musica = ReproducirAudio(1);
                    } catch (LineUnavailableException ex) {
                        System.out.println(ex);
                    }
                    musica.start();
                    break;
            case 3: campo.BraIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Izquierdo.png")));
                    try {
                        musica = ReproducirAudio(1);
                    } catch (LineUnavailableException ex) {
                        System.out.println(ex);
                    }
                    musica.start();
                    break;
            case 4: campo.BraDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Derecho.png")));
                    try {
                        musica = ReproducirAudio(1);
                    } catch (LineUnavailableException ex) {
                        System.out.println(ex);
                    }
                    musica.start();
                    break;
            case 5: campo.PieIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/PieIzquierdo.png")));
                    try {
                        musica = ReproducirAudio(1);
                    } catch (LineUnavailableException ex) {
                        System.out.println(ex);
                    }
                    musica.start();
                    break;
            case 6: campo.PieDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/PieDerecho.png")));
                    try {
                        musica = ReproducirAudio(2);
                    } catch (LineUnavailableException ex) {
                        System.out.println(ex);
                    }
                    musica.start();
                    break;
            case 7:
                campo.Cabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
                campo.Pecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
                campo.BraIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
                campo.BraDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
                campo.PieIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
                campo.PieDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
                campo.Expota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/FIN.png")));
                String secreto = "";
                for (int i = 0; i < otroNuevo.length; i++) {
                    secreto += otroNuevo[i]+" ";
                }
                try {
                    musica = ReproducirAudio(3);
                } catch (LineUnavailableException ex) {
                    System.out.println(ex);
                }
                musica.start();
                JOptionPane.showMessageDialog(null,"NO PUDISTES SALVAR A KRILIN\n"+
                                                               "  ASI COMO TU RELACION \n"+
                                                               "El personaje era : "+secreto );
                fin = new GamerOver();
                perdiste = new ControladorGameOver(fin,campo.Tipo.getText());
                fondoMusica.stop();
                perdiste.Mostrar();
                try {
                    perdiste.Play();
                } catch (LineUnavailableException ex) {
                    System.out.println(ex);
                } catch (UnsupportedAudioFileException ex) {
                    System.out.println(ex);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
                campo.setVisible(false);
                contador = 0;
                contadorDos = 0;
                nivelPoder = 0;
            break;
        }
    }
    
    public void CambioPanel(int codigo,char[] secreto,char a){
        int tamaño = secreto.length;
        String letra = "";
        String clave = "";
        for (int i = 0; i < secreto.length; i++) {
            clave += secreto[i];
        }
        switch(tamaño){
            case 3:
                if(codigo == 1){
                    panel = new SeleccionPanel (campo.PanelPalabra,tres.PanelTres);
                    tres.Caja1.setText("_");
                    tres.Caja2.setText("_");
                    tres.Caja3.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    tres.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    tres.Caja2.setText(letra);
                                    contadorDos +=1;                                    
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    tres.Caja3.setText(letra);
                                    contadorDos +=1;
                                }
                            }
                        }
                        if(contadorDos == 3){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                break;
            case 4:
                if(codigo == 1){                    
                    panel = new SeleccionPanel (campo.PanelPalabra,cuatro.PanelCuatro);
                    cuatro.Caja1.setText("_");
                    cuatro.Caja2.setText("_");
                    cuatro.Caja3.setText("_");
                    cuatro.Caja4.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    cuatro.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    cuatro.Caja2.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    cuatro.Caja3.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 3){
                                    letra = String.valueOf(a);
                                    cuatro.Caja4.setText(letra);
                                    contadorDos +=1;
                                }                              
                            }
                        }
                        if(contadorDos == 4){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                break;
            case 5:
                if(codigo == 1){                    
                    panel = new SeleccionPanel (campo.PanelPalabra,cinco.PanelCinco);
                    cinco.Caja1.setText("_");
                    cinco.Caja2.setText("_");
                    cinco.Caja3.setText("_");
                    cinco.Caja4.setText("_");
                    cinco.Caja5.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    cinco.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    cinco.Caja2.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    cinco.Caja3.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 3){
                                    letra = String.valueOf(a);
                                    cinco.Caja4.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 4){
                                    letra = String.valueOf(a);
                                    cinco.Caja5.setText(letra);
                                    contadorDos +=1;
                                }                                
                            }
                        }
                        if(contadorDos == 5){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                
                break;
            case 6:
                if(codigo == 1){                    
                    panel = new SeleccionPanel (campo.PanelPalabra,seis.PanelSeis);
                    seis.Caja1.setText("_");
                    seis.Caja2.setText("_");
                    seis.Caja3.setText("_");
                    seis.Caja4.setText("_");
                    seis.Caja5.setText("_");
                    seis.Caja6.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    seis.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    seis.Caja2.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    seis.Caja3.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 3){
                                    letra = String.valueOf(a);
                                    seis.Caja4.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 4){
                                    letra = String.valueOf(a);
                                    seis.Caja5.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 5){
                                    letra = String.valueOf(a);
                                    seis.Caja6.setText(letra);
                                    contadorDos +=1;
                                }                               
                            }
                        }
                        if(contadorDos == 6){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                
                break;
            case 7:
                if(codigo == 1){                    
                    panel = new SeleccionPanel (campo.PanelPalabra,siete.PanelSiete);
                    siete.Caja1.setText("_");
                    siete.Caja2.setText("_");
                    siete.Caja3.setText("_");
                    siete.Caja4.setText("_");
                    siete.Caja5.setText("_");
                    siete.Caja6.setText("_");
                    siete.Caja7.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    siete.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    siete.Caja2.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    siete.Caja3.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 3){
                                    letra = String.valueOf(a);
                                    siete.Caja4.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 4){
                                    letra = String.valueOf(a);
                                    siete.Caja5.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 5){
                                    letra = String.valueOf(a);
                                    siete.Caja6.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 6){
                                    letra = String.valueOf(a);
                                    siete.Caja7.setText(letra);
                                    contadorDos +=1;
                                }                                 
                            }
                        }
                        if(contadorDos == 7){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                
                break;
            case 8:
                if(codigo == 1){                    
                    panel = new SeleccionPanel (campo.PanelPalabra,ocho.PanelOcho);
                    ocho.Caja1.setText("_");
                    ocho.Caja2.setText("_");
                    ocho.Caja3.setText("_");
                    ocho.Caja4.setText("_");
                    ocho.Caja5.setText("_");
                    ocho.Caja6.setText("_");
                    ocho.Caja7.setText("_");
                    ocho.Caja8.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    ocho.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    ocho.Caja2.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    ocho.Caja3.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 3){
                                    letra = String.valueOf(a);
                                    ocho.Caja4.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 4){
                                    letra = String.valueOf(a);
                                    ocho.Caja5.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 5){
                                    letra = String.valueOf(a);
                                    ocho.Caja6.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 6){
                                    letra = String.valueOf(a);
                                    ocho.Caja7.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 7){
                                    letra = String.valueOf(a);
                                    ocho.Caja8.setText(letra);
                                    contadorDos +=1;
                                }                                  
                            }
                        }
                        if(contadorDos == 8){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                break;
            case 9:
                if(codigo == 1){                    
                    panel = new SeleccionPanel (campo.PanelPalabra,nueve.PanelNueve);
                    nueve.Caja1.setText("_");
                    nueve.Caja2.setText("_");
                    nueve.Caja3.setText("_");
                    nueve.Caja4.setText("_");
                    nueve.Caja5.setText("_");
                    nueve.Caja6.setText("_");
                    nueve.Caja7.setText("_");
                    nueve.Caja8.setText("_");
                    nueve.Caja9.setText("_");
                }else if(codigo == 2){
                    if(clave.contains(String.valueOf(a))){
                        for (int i = 0; i < clave.length(); i++) {
                            if(clave.charAt(i) == a){
                                if(i == 0){
                                    letra = String.valueOf(a);
                                    nueve.Caja1.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 1){
                                    letra = String.valueOf(a);
                                    nueve.Caja2.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 2){
                                    letra = String.valueOf(a);
                                    nueve.Caja3.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 3){
                                    letra = String.valueOf(a);
                                    nueve.Caja4.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 4){
                                    letra = String.valueOf(a);
                                    nueve.Caja5.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 5){
                                    letra = String.valueOf(a);
                                    nueve.Caja6.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 6){
                                    letra = String.valueOf(a);
                                    nueve.Caja7.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 7){
                                    letra = String.valueOf(a);
                                    nueve.Caja8.setText(letra);
                                    contadorDos +=1;
                                }else if(i == 8){
                                    letra = String.valueOf(a);
                                    nueve.Caja9.setText(letra);
                                    contadorDos +=1;
                                }                                   
                            }
                        }
                        if(contador == 9){
                            JOptionPane.showMessageDialog(null,"MUY BIEN SALVASTE A KRILIN\n"+
                                                                           "POR CADA PALABRA COMPLETADA\n"+
                                                                           " TU KI AUMENTARA EN 1000");
                            nivelPoder+=1000;
                            try {
                                musica = ReproducirAudio(4);
                            } catch (LineUnavailableException ex) {
                                System.out.println(ex);
                            }
                            musica.start();
                            campo.Puntaje.setText(String.valueOf(nivelPoder));
                            NuevoNivel();
                            contadorDos = 0;
                        }
                    }else{
                        contador++;
                    }
                }
                break;
            }
    }

    public void NuevoNivel(){
        personaje = new DatosPersonajes();
        int numero = personaje.TipoArreglo(campo.Tipo.getText());
        int randon = (int)(Math.random()*9);
        otroNuevo = personaje.Nombre(numero, randon);
        CambioPanel(1,otroNuevo,'X');

        campo.Cabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
        campo.Pecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
        campo.BraIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
        campo.BraDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
        campo.PieIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));
        campo.PieDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Partes/Vacio.png")));

        campo.A.setEnabled(true);
        campo.B.setEnabled(true);
        campo.C.setEnabled(true);
        campo.D.setEnabled(true);
        campo.E.setEnabled(true);
        campo.F.setEnabled(true);
        campo.G.setEnabled(true);
        campo.H.setEnabled(true);
        campo.I.setEnabled(true);
        campo.J.setEnabled(true);
        campo.K.setEnabled(true);
        campo.L.setEnabled(true);
        campo.M.setEnabled(true);
        campo.N.setEnabled(true);
        campo.Ñ.setEnabled(true);
        campo.O.setEnabled(true);
        campo.P.setEnabled(true);
        campo.Q.setEnabled(true);
        campo.R.setEnabled(true);
        campo.S.setEnabled(true);
        campo.T.setEnabled(true);
        campo.U.setEnabled(true);
        campo.V.setEnabled(true);
        campo.W.setEnabled(true);
        campo.X.setEnabled(true);
        campo.Y.setEnabled(true);
        campo.Z.setEnabled(true);
        contador = 0;
        contadorDos = 0;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == campo.Regresar){
            dificultad = new SeleccionDificultad();
            controlDicicultad = new ControlDificultad(dificultad);
            controlDicicultad.Mostrar();
            fondoMusica.stop();
            try {
                controlDicicultad.Play();
            } catch (LineUnavailableException ex) {
                System.out.println(ex);
            } catch (UnsupportedAudioFileException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            }
            campo.setVisible(false);
            contador = 0;
            contadorDos = 0;
        }else if(e.getSource() == campo.Refrescar){
            NuevoNivel();
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
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
