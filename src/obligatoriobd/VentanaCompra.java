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
public class VentanaCompra extends javax.swing.JFrame {
    ArrayList<Insumo> insumos;
    /**
     * Creates new form VentanaEvento
     */
    public VentanaCompra() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/imagenes/fondoCelesteFinoFlecha.jpg");
        this.lblfondoCeleste.setIcon(icon);
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
        lblAtras = new javax.swing.JLabel();
        idInsumo = new javax.swing.JTextField();
        btnBuscarInsumo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstInsumos = new javax.swing.JList<>();
        lblInsumos = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        calendario = new com.toedter.calendar.JCalendar();
        jLabel7 = new javax.swing.JLabel();
        minutoCompra = new javax.swing.JSpinner();
        horaCompra = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        fldCantidadInsumo = new javax.swing.JSpinner();
        fldPrecioCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarCompra = new javax.swing.JButton();

        jLabel5.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Ventana compra"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAtrasMousePressed(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        idInsumo.setText("Insumo");
        getContentPane().add(idInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, -1));

        btnBuscarInsumo.setText("Buscar");
        btnBuscarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInsumoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        lstInsumos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstInsumos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 220, 160));

        lblInsumos.setText("Seleccionar insumo:");
        getContentPane().add(lblInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 300));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        calendario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText(":");

        jLabel6.setText("Cantidad:");

        fldPrecioCompra.setText("$");

        jLabel2.setText("Precio:");
        jLabel2.setToolTipText("");

        btnRegistrarCompra.setText("Registrar");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarCompra)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(horaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(minutoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2))
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(fldCantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fldPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(minutoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldCantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnRegistrarCompra)
                .addContainerGap())
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 700, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        // TODO add your handling code here:
        Calendar clndr = this.calendario.getCalendar();
        clndr.set(Calendar.HOUR_OF_DAY, (Integer)this.horaCompra.getValue());
        clndr.set(Calendar.MINUTE, (Integer)this.minutoCompra.getValue());
        clndr.set(Calendar.SECOND, 0);
        
        Insumo ins = insumos.get(this.lstInsumos.getSelectedIndex());
        Compra compr = new Compra(ObligatorioBD.usuarioLoggeado.getId(), ins.getIDInsumo(),
                Integer.parseInt(this.fldPrecioCompra.getText()),clndr ,(Integer)this.fldCantidadInsumo.getValue());
        compr.Save();
        if(Compra.errorAlGuardar){
            this.lblError.setText("Hubo un error al guardar la compra.");
        }
        else{
            this.lblError.setText("Se guardo la compra correctamente.");
        }
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

    private void btnBuscarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInsumoActionPerformed
        // TODO add your handling code here:
        
        insumos = Insumo.buscarInsumosPorNombre(this.idInsumo.getText());
        DefaultListModel demoList = new DefaultListModel();
        for(Insumo ins: insumos){
          demoList.addElement(ins.getNombre());
        }
        this.lstInsumos.setModel(demoList);
    }//GEN-LAST:event_btnBuscarInsumoActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        VentanaInsumo vent = new VentanaInsumo();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void lblAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMousePressed
        
    }//GEN-LAST:event_lblAtrasMousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarInsumo;
    private javax.swing.JButton btnRegistrarCompra;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JSpinner fldCantidadInsumo;
    private javax.swing.JTextField fldPrecioCompra;
    private javax.swing.JSpinner horaCompra;
    private javax.swing.JTextField idInsumo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblInsumos;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JList<String> lstInsumos;
    private javax.swing.JSpinner minutoCompra;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
}
