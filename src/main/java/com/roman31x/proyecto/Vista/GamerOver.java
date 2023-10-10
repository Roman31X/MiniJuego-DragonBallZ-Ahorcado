package com.roman31x.proyecto.Vista;

import com.roman31x.proyecto.Modelo.FondoPanel;

/**
 *
 * @author Roman31X
 */
public class GamerOver extends javax.swing.JFrame {
    
    public FondoPanel fondo = new FondoPanel("Shen.gif");
    
    public GamerOver() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel("Shen.gif");
        gameover = new javax.swing.JLabel();
        continuar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        esfera1 = new javax.swing.JLabel();
        esfera2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameover.setFont(new java.awt.Font("Stencil", 1, 60)); // NOI18N
        gameover.setForeground(new java.awt.Color(0, 0, 255));
        gameover.setText("GAME OVER");
        jPanel1.add(gameover, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 360, 80));

        continuar.setBackground(new java.awt.Color(255, 255, 255));
        continuar.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        continuar.setForeground(new java.awt.Color(204, 0, 0));
        continuar.setText("CONTINUAR");
        jPanel1.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 20));

        salir.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(204, 0, 0));
        salir.setText("SALIR");
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, 20));
        jPanel1.add(esfera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 40, 40));
        jPanel1.add(esfera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel continuar;
    public javax.swing.JLabel esfera1;
    public javax.swing.JLabel esfera2;
    public javax.swing.JLabel gameover;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
}
