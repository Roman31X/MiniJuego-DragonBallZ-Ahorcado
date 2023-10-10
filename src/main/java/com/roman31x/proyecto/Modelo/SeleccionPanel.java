package com.roman31x.proyecto.Modelo;

import javax.swing.JPanel;

/**
 *
 * @author Roman31X
 */
public class SeleccionPanel {
    public JPanel contenedor;
    public JPanel contenido;

    public SeleccionPanel(JPanel contenedor1, JPanel contenido1) {
        this.contenedor = contenedor1;
        this.contenido = contenido1;
        
        contenedor.removeAll();
        contenedor.add(this.contenido);
        contenedor.revalidate();
        contenedor.repaint();
    }
}
