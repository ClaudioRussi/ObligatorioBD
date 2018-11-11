/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustín
 */
public class VentanaVerInsumos extends javax.swing.JFrame {

    DefaultListModel modeloLista;
    ArrayList<Insumo> insumos = new ArrayList();
    /**
     * Creates new form VerInsumos
     */
    public VentanaVerInsumos() {
        initComponents();
        modeloLista = new DefaultListModel();
        //Consulta SQL
        Insumo.buscarInsumoPorUsuario(insumos, ObligatorioBD.usuarioLoggeado.getId());
        for(Insumo insumo : insumos){
            String elementoLista;
            elementoLista = insumo.getNombre()+ " | " + insumo.getDescripcion() + " | "+ insumo.getCantidad();
            modeloLista.addElement(elementoLista);
        }
        listaInsumos.setModel(modeloLista);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBlanco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInsumos = new javax.swing.JList<>();
        btnInsumo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setPreferredSize(new java.awt.Dimension(739, 300));

        jScrollPane1.setViewportView(listaInsumos);

        btnInsumo.setText("Eliminar insumo");
        btnInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumoActionPerformed(evt);
            }
        });

        jLabel1.setText("Insumo | Descripción | Cantidad");

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnInsumo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnInsumo)
                .addGap(28, 28, 28))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        int pos;
        int res;
        Posee posee;
        if(this.listaInsumos.getSelectedIndex() != -1){
            res = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este evento?");
            if (res == 0){
                pos = listaInsumos.getSelectedIndex();
                modeloLista.remove(pos);
                Insumo insumo = insumos.get(pos);
                insumos.remove(pos);
                posee = Posee.buscarPoseePorInsumo(insumo.getIDInsumo(), ObligatorioBD.usuarioLoggeado.getId());
                posee.Delete();
                //insumo.Delete();
                
            }
        }
        
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        VentanaInsumo vent = new VentanaInsumo();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JList<String> listaInsumos;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
}
