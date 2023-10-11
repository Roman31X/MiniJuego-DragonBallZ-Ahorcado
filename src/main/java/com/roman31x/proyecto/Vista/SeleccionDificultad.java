package com.roman31x.proyecto.Vista;

import com.roman31x.proyecto.Modelo.FondoPanel;

/**
 *
 * @author Roman31X
 */
public class SeleccionDificultad extends javax.swing.JFrame {

    public FondoPanel fondo = new FondoPanel("fondoDificultad.jpg");
    
    public SeleccionDificultad() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new FondoPanel("fondoDificultad.jpg");
        fase4 = new javax.swing.JLabel();
        FACIL = new javax.swing.JButton();
        NORMAL = new javax.swing.JButton();
        DIFICIL = new javax.swing.JButton();
        DIOS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nube4 = new javax.swing.JLabel();
        nube3 = new javax.swing.JLabel();
        nube1 = new javax.swing.JLabel();
        nube2 = new javax.swing.JLabel();
        fase1 = new javax.swing.JLabel();
        fase2 = new javax.swing.JLabel();
        fase3 = new javax.swing.JLabel();
        Atras = new javax.swing.JLabel();
        Silla = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/LogoGitHub.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fase4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        FACIL.setBackground(new java.awt.Color(255, 153, 0));
        FACIL.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        FACIL.setForeground(new java.awt.Color(0, 51, 255));
        FACIL.setText("FACIL");
        jPanel1.add(FACIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 150, 30));

        NORMAL.setBackground(new java.awt.Color(255, 153, 0));
        NORMAL.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        NORMAL.setForeground(new java.awt.Color(0, 51, 255));
        NORMAL.setText("NORMAL");
        jPanel1.add(NORMAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 150, 30));

        DIFICIL.setBackground(new java.awt.Color(255, 153, 0));
        DIFICIL.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        DIFICIL.setForeground(new java.awt.Color(0, 51, 255));
        DIFICIL.setText("DIFICIL");
        jPanel1.add(DIFICIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 150, 30));

        DIOS.setBackground(new java.awt.Color(255, 153, 0));
        DIOS.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        DIOS.setForeground(new java.awt.Color(0, 51, 255));
        DIOS.setText("NIVEL DIOS");
        jPanel1.add(DIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("SELECCION DE DIFICULTAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
        jPanel1.add(nube4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 50, 30));
        jPanel1.add(nube3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 30));
        jPanel1.add(nube1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 30));
        jPanel1.add(nube2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 50, 30));
        jPanel1.add(fase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel1.add(fase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanel1.add(fase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        Atras.setBackground(new java.awt.Color(255, 255, 255));
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/atras.png"))); // NOI18N
        jPanel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Silla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dificultad/Silla.png"))); // NOI18N
        jPanel1.add(Silla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 222));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosImagen/LogoGitHub.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Atras;
    public javax.swing.JButton DIFICIL;
    public javax.swing.JButton DIOS;
    public javax.swing.JButton FACIL;
    public javax.swing.JButton NORMAL;
    public javax.swing.JLabel Silla;
    public javax.swing.JLabel fase1;
    public javax.swing.JLabel fase2;
    public javax.swing.JLabel fase3;
    public javax.swing.JLabel fase4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nube1;
    public javax.swing.JLabel nube2;
    public javax.swing.JLabel nube3;
    public javax.swing.JLabel nube4;
    // End of variables declaration//GEN-END:variables
}
