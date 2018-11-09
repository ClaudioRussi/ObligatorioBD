package obligatoriobd;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agustín
 */
public class VentanaInsumo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInsumo
     */
    public VentanaInsumo() {
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

        btnCrearInsumo = new javax.swing.JButton();
        lblAtras = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        nombrelbl = new javax.swing.JLabel();
        descripcionlbl = new javax.swing.JLabel();
        lblInsumo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearInsumo.setText("Crear");
        btnCrearInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearInsumoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 266, -1, -1));
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 300));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        txtDescripcion.setText("descripcionInsumo");

        txtNombre.setText("nombreInsumo");

        nombrelbl.setText("Nombre:");

        descripcionlbl.setText("Descripcion:");

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(nombrelbl)
                                .addGap(35, 35, 35)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(descripcionlbl)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lblInsumo)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nombrelbl))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(descripcionlbl))
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(lblInsumo)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 700, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearInsumoActionPerformed
        // TODO add your handling code here:
        Insumo insmo = new Insumo(this.txtNombre.getText(), this.txtDescripcion.getText());
        insmo.Save();
        if(Insumo.errorAlGuardar){
            System.out.println("Hubo un problema al guardar");
            this.lblInsumo.setText("Hubo un erro al guardar");
        }
        else{
            this.lblInsumo.setText("Insumo guardado correctamente");
        }
    }//GEN-LAST:event_btnCrearInsumoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearInsumo;
    private javax.swing.JLabel descripcionlbl;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblInsumo;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
