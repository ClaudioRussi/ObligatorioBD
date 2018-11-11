/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Agustín
 */
public class VentanaAgregarInsumo extends javax.swing.JFrame {

    DefaultListModel modeloLista;
    //ArrayList<Insumo> array = new ArrayList();
    ArrayList<Insumo> insumos = new ArrayList();
    /**
     * Creates new form VentanaAgregarInsumo2
     */
    public VentanaAgregarInsumo() {
        initComponents();        
        modeloLista = new DefaultListModel();
        //Consulta SQL
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblfondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInsumos = new javax.swing.JList<>();
        btnInsumo = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        lblCantidad = new javax.swing.JLabel();
        idInsumo = new javax.swing.JTextField();
        btnBuscarInsumo = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setPreferredSize(new java.awt.Dimension(739, 300));

        jScrollPane1.setViewportView(listaInsumos);

        btnInsumo.setText("Agregar insumo");
        btnInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumoActionPerformed(evt);
            }
        });

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblCantidad.setText("Cantidad:");

        idInsumo.setText("Insumo");

        btnBuscarInsumo.setText("Buscar");
        btnBuscarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInsumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(idInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarInsumo))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(lblError)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsumo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidad))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarInsumo))
                .addGap(27, 27, 27)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(13, 13, Short.MAX_VALUE)
                        .addComponent(btnInsumo)
                        .addGap(28, 28, 28))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblError)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        VentanaInsumo vent = new VentanaInsumo();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        //si el insumo esta en la bd tabla posee agregar cantidad sino agregarlo todo
        //posee tiene id insumo, id usuario y cantidad
        Insumo ins = insumos.get(this.listaInsumos.getSelectedIndex());
        
        Posee posee = Posee.buscarPoseePorInsumo(ins.getIDInsumo(), ObligatorioBD.usuarioLoggeado.getId());
        if(posee != null){
            posee.setCantidad(posee.getCantidad() + (int)this.spnCantidad.getValue());
            posee.Update();
            if(Posee.errorAlGuardar){
                this.lblError.setText("Error al guardar.");
            }
            else{
                this.lblError.setText("Se ha guardado correctamente.");
            }
        }
        else{
            posee = new Posee(ins.getIDInsumo(), ObligatorioBD.usuarioLoggeado.getId(), (int)this.spnCantidad.getValue());
            
            posee.Save();
            if(Posee.errorAlGuardar){
                this.lblError.setText("Error al guardar.");
            }
            else{
                this.lblError.setText("Se ha guardado correctamente.");
            }
        }
       
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btnBuscarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInsumoActionPerformed

        insumos = Insumo.buscarInsumosPorNombre(this.idInsumo.getText());
        //
        DefaultListModel demoList = new DefaultListModel();
        for(Insumo ins: insumos){
            demoList.addElement(ins.getNombre());
        }
        this.listaInsumos.setModel(demoList);
    }//GEN-LAST:event_btnBuscarInsumoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarInsumo;
    private javax.swing.JButton btnInsumo;
    private javax.swing.JTextField idInsumo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JList<String> listaInsumos;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JSpinner spnCantidad;
    // End of variables declaration//GEN-END:variables
}
