package com.roman31x.proyecto.Aplicacion;

import com.roman31x.proyecto.Controlador.*;
import com.roman31x.proyecto.Vista.*;
import java.io.IOException;
import javax.sound.sampled.*;

/**
 *
 * @author Roman31X
 */
public class AplicacionInicializador {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        StarGame iniciar = new StarGame();
        ControladorStar juego = new ControladorStar(iniciar);
        juego.Play();
        juego.Mostrar();
    }    
}
