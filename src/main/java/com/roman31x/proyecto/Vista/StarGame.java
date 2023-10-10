package com.roman31x.proyecto.Vista;

import com.roman31x.proyecto.Modelo.FondoPanel;

/**
 *
 * @author Roman31X
 */
public class StarGame extends javax.swing.JFrame {

    public FondoPanel fondo = new FondoPanel("fondo.jpg");
    
    public StarGame() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel("fondo.jpg");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nub1 = new javax.swing.JLabel();
        nub2 = new javax.swing.JLabel();
        JUGAR = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCarga/selecc.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/LogoGitHub.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("MINI JUEGO AHORCADO ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("PERSONAJES DRAGON BALL Z");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel1.add(nub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 50, 30));
        jPanel1.add(nub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 50, 30));

        JUGAR.setBackground(new java.awt.Color(255, 153, 0));
        JUGAR.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        JUGAR.setForeground(new java.awt.Color(51, 51, 255));
        JUGAR.setText("INICIAR");
        jPanel1.add(JUGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 150, 35));

        salir.setBackground(new java.awt.Color(255, 153, 0));
        salir.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(51, 51, 255));
        salir.setText("SALIR");
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 150, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JUGAR;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nub1;
    public javax.swing.JLabel nub2;
    public javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
