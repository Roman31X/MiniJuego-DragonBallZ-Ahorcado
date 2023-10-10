package com.roman31x.proyecto.Modelo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Roman31X
 */
public class FondoPanel extends JPanel{
    private Image foto;
    private String dato;

    public FondoPanel (String dato1) {
        this.dato = dato1;
    }

    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }
        
    @Override
    public void paint(Graphics g){
        foto = new ImageIcon(getClass().getResource("/Fondos/"+dato)).getImage();
        //Ajuste automatico de la imagen a la ventana
        g.drawImage(foto,0, 0, getWidth(),getHeight(),this);

        setOpaque(false);

        super.paint(g);
    }
    
}
