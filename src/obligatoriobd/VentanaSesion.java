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
public class VentanaSesion extends javax.swing.JFrame {

    /**
     * Creates new form VentanaSesion2
     */
    public VentanaSesion() {
        initComponents();
         ImageIcon icon = new ImageIcon("src/imagenes/fondologo.jpg");
        this.fondoCeleste.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblError = new javax.swing.JLabel();
        idUsuario = new javax.swing.JTextField();
        contraseniaUsuario = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        acceder = new javax.swing.JButton();
        fondoCeleste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));
        getContentPane().add(idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 180, 20));

        contraseniaUsuario.setText("jPasswordField1");
        getContentPane().add(contraseniaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 180, -1));

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, 20));

        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, 20));

        crear.setText("Sign up");
        crear.setFocusPainted(false);
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 80, -1));

        acceder.setText("Log in");
        acceder.setFocusPainted(false);
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });
        getContentPane().add(acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 80, -1));
        getContentPane().add(fondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario(idUsuario.getText(), new String(contraseniaUsuario.getPassword()));
        usuario.Save();
        if(!usuario.RegisterError){
            ObligatorioBD.usuarioLoggeado = usuario;
            VentanaPrincipal vent = new VentanaPrincipal();
            
            vent.setVisible(true);
            this.dispose();
        }
        else{
            this.lblError.setText("Ya existe un usuario con ese nombre.\n");
            //System.out.println("Ya existe un usuario con ese nombre.\n");
        }
    }//GEN-LAST:event_crearActionPerformed

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        // TODO add your handling code here:
        Usuario usr = Usuario.LogIn(idUsuario.getText(), new String(contraseniaUsuario.getPassword()));
        if(!Usuario.LogInError){
            ObligatorioBD.usuarioLoggeado = usr;
            VentanaPrincipal vent = new VentanaPrincipal(); // pasar por parametro el usuario
            vent.setVisible(true);
            this.dispose();
        }
        else{
            this.lblError.setText("Error al loguearse\n");
            //System.out.println("Error al logearse.\n");
        }
    }//GEN-LAST:event_accederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder;
    private javax.swing.JPasswordField contraseniaUsuario;
    private javax.swing.JButton crear;
    private javax.swing.JLabel fondoCeleste;
    private javax.swing.JTextField idUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblError;
    // End of variables declaration//GEN-END:variables
}
