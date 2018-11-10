/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import javax.swing.ImageIcon;

/**
 *
 * @author Agustín
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ///
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.lblUsuario.setText(ObligatorioBD.usuarioLoggeado.getUsername());
        ImageIcon icon = new ImageIcon("src/imagenes/fondoCeleste.jpg");
        this.lblFondoCeleste.setIcon(icon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        botonConsumicion = new javax.swing.JButton();
        botonCompra = new javax.swing.JButton();
        botonReunion = new javax.swing.JButton();
        botonEvento = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));
        setPreferredSize(new java.awt.Dimension(738, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCeleste.jpg"))); // NOI18N
        getContentPane().add(lblFondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 360));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        botonConsumicion.setText("Consumicion");
        botonConsumicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsumicionActionPerformed(evt);
            }
        });

        botonCompra.setText("Compra");
        botonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompraActionPerformed(evt);
            }
        });

        botonReunion.setText("Reunion");
        botonReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReunionActionPerformed(evt);
            }
        });

        botonEvento.setText("Evento");
        botonEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEventoActionPerformed(evt);
            }
        });

        lblUsuario.setText("Username");
        lblUsuario.setToolTipText("");

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setToolTipText("");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnInsumos.setText("Insumos");
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(btnCerrarSesion))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsumos)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(botonEvento)
                                .addGap(43, 43, 43)
                                .addComponent(botonReunion)
                                .addGap(39, 39, 39)
                                .addComponent(botonCompra)
                                .addGap(31, 31, 31)
                                .addComponent(botonConsumicion)))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(41, 41, 41))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblUsuario)
                .addGap(58, 58, 58)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEvento)
                    .addComponent(botonReunion)
                    .addComponent(botonCompra)
                    .addComponent(botonConsumicion))
                .addGap(30, 30, 30)
                .addComponent(btnInsumos)
                .addGap(3, 3, 3)
                .addComponent(btnCerrarSesion)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 680, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEventoActionPerformed
        VentanaEvento ventanaEvento = new VentanaEvento();
        ventanaEvento.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonEventoActionPerformed

    private void botonReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReunionActionPerformed
        VentanaVerReuniones ventanaReunion = new VentanaVerReuniones();
        ventanaReunion.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonReunionActionPerformed

    private void botonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompraActionPerformed
        VentanaCompra ventanaCompra = new VentanaCompra();
        ventanaCompra.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonCompraActionPerformed

    private void botonConsumicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsumicionActionPerformed
        VentanaConsumicion ventanaConsumicion = new VentanaConsumicion();
        ventanaConsumicion.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonConsumicionActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        ObligatorioBD.usuarioLoggeado = null; 
        VentanaSesion vtn = new VentanaSesion();
        vtn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        VentanaAgregarInsumo vent = new VentanaAgregarInsumo();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInsumosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCompra;
    private javax.swing.JButton botonConsumicion;
    private javax.swing.JButton botonEvento;
    private javax.swing.JButton botonReunion;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnInsumos;
    private javax.swing.JLabel lblFondoCeleste;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
}
