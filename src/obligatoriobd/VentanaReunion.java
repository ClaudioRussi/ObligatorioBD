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
public class VentanaReunion extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEvento
     */
    Reunion reunion;
    public VentanaReunion(Reunion reunion) {
        initComponents();
        ImageIcon icon = new ImageIcon("src/imagenes/fondoCelesteFinoFlecha.jpg");
        this.lblfondoCeleste.setIcon(icon);
        this.reunion = reunion;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        idUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        agregarUsuario = new javax.swing.JButton();
        agregarInsumo = new javax.swing.JButton();
        idInsumo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cantidadInsumo = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precioInsumo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        btnAgregarPago = new javax.swing.JButton();
        btnVerPagos = new javax.swing.JButton();
        creador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        asignarCreador = new javax.swing.JButton();
        finalizarReunion = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnAgregarEvento = new javax.swing.JButton();

        jLabel5.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 172, -1, -1));

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 40, 30));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 300));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        idUsuario.setText("idUsuario");
        idUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Agregar usuario:");

        agregarUsuario.setText("Agregar");
        agregarUsuario.setActionCommand("agregarUsuario");
        agregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsuarioActionPerformed(evt);
            }
        });

        agregarInsumo.setText("Agregar");
        agregarInsumo.setActionCommand("agregarInsumo");
        agregarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarInsumoActionPerformed(evt);
            }
        });

        idInsumo.setText("idInsumo");

        jLabel6.setText("Agregar insumo:");

        jLabel9.setText("Cantidad:");

        jLabel2.setText("Precio:");

        precioInsumo.setText("$");

        jLabel1.setText("Agregar pago:");

        pago.setText("$");

        btnAgregarPago.setText("Agregar");
        btnAgregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPagoActionPerformed(evt);
            }
        });

        btnVerPagos.setText("Ver pagos");
        btnVerPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPagosActionPerformed(evt);
            }
        });

        creador.setText("Asignar creador:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        asignarCreador.setText("Asignar");
        asignarCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCreadorActionPerformed(evt);
            }
        });

        finalizarReunion.setText("Finalizar Reunion");
        finalizarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarReunionActionPerformed(evt);
            }
        });

        btnAgregarEvento.setText("Agregar evento");
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(creador)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarUsuario)
                                    .addComponent(asignarCreador))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblError)
                        .addGap(91, 91, 91)))
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPago))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(cantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(precioInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(idInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(agregarInsumo)))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarEvento)
                .addGap(36, 36, 36)
                .addComponent(btnVerPagos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizarReunion)
                .addContainerGap())
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarInsumo)
                            .addComponent(idInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarUsuario))))
                .addGap(15, 15, 15)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarPago))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerPagos)
                            .addComponent(finalizarReunion)
                            .addComponent(lblError)
                            .addComponent(btnAgregarEvento))
                        .addContainerGap())
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(creador)
                        .addGap(18, 18, 18)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asignarCreador))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 700, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUsuarioActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarUsuarioActionPerformed

    private void agregarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarInsumoActionPerformed

    private void asignarCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCreadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asignarCreadorActionPerformed

    private void btnAgregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarPagoActionPerformed

    private void btnVerPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerPagosActionPerformed

    private void finalizarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarReunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarReunionActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
        VentanaEvento vent = new VentanaEvento();
        vent.idReunion = reunion.getIDReunion();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarEventoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarInsumo;
    private javax.swing.JButton agregarUsuario;
    private javax.swing.JButton asignarCreador;
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnAgregarPago;
    private javax.swing.JButton btnVerPagos;
    private javax.swing.JSpinner cantidadInsumo;
    private javax.swing.JLabel creador;
    private javax.swing.JButton finalizarReunion;
    private javax.swing.JTextField idInsumo;
    private javax.swing.JTextField idUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JTextField pago;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JTextField precioInsumo;
    // End of variables declaration//GEN-END:variables
}
