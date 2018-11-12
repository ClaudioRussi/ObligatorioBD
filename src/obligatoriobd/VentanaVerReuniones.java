/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Agustín
 */
public class VentanaVerReuniones extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVerReuniones
     */
    
    
    DefaultListModel modeloLista;
    ArrayList<Reunion> reuniones = new ArrayList();    
    
   
    
    public VentanaVerReuniones() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/imagenes/fondoCelesteFinoFlecha.jpg");
        this.lblfondoCeleste.setIcon(icon);
        modeloLista = new DefaultListModel();
        //Consulta SQL
        Reunion.buscarReunionesPorUsuario(reuniones, ObligatorioBD.usuarioLoggeado.getId());
        
        //
        
        //
        for(Reunion reunion : reuniones){
            String elementoLista;
            int total = (reunion.getDeuda() / reunion.getCantidadIntegrantes()) - reunion.getPagosUsuario(ObligatorioBD.usuarioLoggeado.getId());
            elementoLista = reunion.getIDReunion()+" | " +reunion.getNombre()+ " | "+ total ;
            modeloLista.addElement(elementoLista);
        }
        listaReuniones.setModel(modeloLista);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAtras = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaReuniones = new javax.swing.JList<>();
        btnAbandonar = new javax.swing.JButton();
        btnCrearReunion = new javax.swing.JButton();
        btnGestionar = new javax.swing.JButton();
        btnInvitaciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        btnBorarReunion = new javax.swing.JButton();
        btnAgregarPago = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spPago = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(779, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setPreferredSize(new java.awt.Dimension(739, 300));

        jScrollPane1.setViewportView(listaReuniones);

        btnAbandonar.setText("Abandonar reunión");
        btnAbandonar.setActionCommand("abandonar");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        btnCrearReunion.setText("Crear reunión");
        btnCrearReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearReunionActionPerformed(evt);
            }
        });

        btnGestionar.setText("Gestionar reunión");
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });

        btnInvitaciones.setText("Ver invitaciones");
        btnInvitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitacionesActionPerformed(evt);
            }
        });

        jLabel1.setText("ID | Reunión | Pago");

        btnBorarReunion.setText("Borrar reunión");
        btnBorarReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorarReunionActionPerformed(evt);
            }
        });

        btnAgregarPago.setText("Agregar");
        btnAgregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPagoActionPerformed(evt);
            }
        });

        jLabel2.setText("Agregar pago:");

        spPago.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBlancoLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(btnAgregarPago))))
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAbandonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGestionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spPago, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnInvitaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearReunion)
                        .addGap(94, 94, 94))))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPago)
                    .addComponent(spPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnGestionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbandonar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearReunion)
                    .addComponent(btnInvitaciones))
                .addContainerGap())
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
         if(this.listaReuniones.getSelectedIndex() >= 0){
            //Tomo el id de la fila seleccionada 
            
            Reunion reunion = reuniones.get(this.listaReuniones.getSelectedIndex());
            
            UsuarioReunion.abandonarReunion(ObligatorioBD.usuarioLoggeado.getId(), reunion.getIDReunion());
            
            //Elimino visualmente el elemento de la lista
            Reunion reunionAux = reuniones.get(this.listaReuniones.getSelectedIndex());
            modeloLista.remove(this.listaReuniones.getSelectedIndex());
            reuniones.remove(reunion);
            
        }
    }//GEN-LAST:event_btnAbandonarActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void btnCrearReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearReunionActionPerformed
        VentanaCrearReunion vent = new VentanaCrearReunion();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearReunionActionPerformed

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        if(this.listaReuniones.getSelectedIndex() != -1){
            Reunion reunion = reuniones.get(this.listaReuniones.getSelectedIndex());
            if(ObligatorioBD.usuarioLoggeado.getId() == reunion.getIDUsuarioCreador()
                    || Reunion.verificarGestion(ObligatorioBD.usuarioLoggeado.getId(), reunion.getIDReunion())){
                VentanaReunion vent = new VentanaReunion(reuniones.get(this.listaReuniones.getSelectedIndex()));
                vent.setVisible(true);
                this.dispose();  
            } else{
                this.lblError.setText("No tienes permisos para gestionar esta reunion");
            }
            
        }
        
        
    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnInvitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitacionesActionPerformed
        VentanaInvitaciones vent = new VentanaInvitaciones();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInvitacionesActionPerformed

    private void btnBorarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorarReunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorarReunionActionPerformed

    private void btnAgregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPagoActionPerformed
        // TODO add your handling code here:
        if(this.listaReuniones.getSelectedIndex() >= 0){
            Pago pago = new Pago((int) this.spPago.getValue(), Calendar.getInstance(), ObligatorioBD.usuarioLoggeado.getId(),reuniones.get(this.listaReuniones.getSelectedIndex()).getIDReunion(),false);
            pago.Save();
        }
    }//GEN-LAST:event_btnAgregarPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JButton btnAgregarPago;
    private javax.swing.JButton btnBorarReunion;
    private javax.swing.JButton btnCrearReunion;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnInvitaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JList<String> listaReuniones;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JSpinner spPago;
    // End of variables declaration//GEN-END:variables
}
