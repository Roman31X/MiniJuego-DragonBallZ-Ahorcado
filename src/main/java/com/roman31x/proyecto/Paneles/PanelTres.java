package com.roman31x.proyecto.Paneles;

import com.roman31x.proyecto.Modelo.FondoPanel;

/**
 *
 * @author Roman31X
 */
public class PanelTres extends javax.swing.JFrame {

    public FondoPanel fondo = new FondoPanel("fondo4.jpg");
    
    public PanelTres() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTres = new FondoPanel("fondo4.jpg");
        Caja1 = new javax.swing.JButton();
        Caja2 = new javax.swing.JButton();
        Caja3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelTres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Caja1.setBackground(new java.awt.Color(255, 153, 0));
        Caja1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Caja1.setForeground(new java.awt.Color(0, 0, 255));
        Caja1.setText("_");
        Caja1.setAlignmentX(0.5F);
        Caja1.setAlignmentY(0.8F);
        Caja1.setBorder(null);
        Caja1.setBorderPainted(false);
        PanelTres.add(Caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, 40));

        Caja2.setBackground(new java.awt.Color(255, 153, 0));
        Caja2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Caja2.setForeground(new java.awt.Color(0, 0, 255));
        Caja2.setText("_");
        Caja2.setAlignmentX(0.5F);
        Caja2.setAlignmentY(0.8F);
        Caja2.setBorder(null);
        Caja2.setBorderPainted(false);
        PanelTres.add(Caja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 40, 40));

        Caja3.setBackground(new java.awt.Color(255, 153, 0));
        Caja3.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        Caja3.setForeground(new java.awt.Color(0, 0, 255));
        Caja3.setText("_");
        Caja3.setAlignmentX(0.5F);
        Caja3.setAlignmentY(0.8F);
        Caja3.setBorder(null);
        Caja3.setBorderPainted(false);
        PanelTres.add(Caja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTres, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Caja1;
    public javax.swing.JButton Caja2;
    public javax.swing.JButton Caja3;
    public javax.swing.JPanel PanelTres;
    // End of variables declaration//GEN-END:variables
}
