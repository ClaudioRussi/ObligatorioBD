/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Agustín
 */
public class VentanaReunion extends javax.swing.JFrame {

    static boolean errorAlGuardar;
    static String url = "jdbc:postgresql://192.168.56.1:5432/BD2018-1";
    static String usuario = "postgres"; 
    static String contrasenia = "test123";
    
    ArrayList<Usuario> creadores = new ArrayList();
    DefaultListModel modeloLista;
    /**
     * Creates new form VentanaEvento
     */
    Reunion reunion;
    public VentanaReunion(Reunion reunion) {
        initComponents();
        ImageIcon icon = new ImageIcon("src/imagenes/fondoCelesteFinoFlecha.jpg");
        this.lblfondoCeleste.setIcon(icon);
        this.reunion = reunion;
        
        modeloLista = new DefaultListModel();
        
        UsuarioReunion.obtenerIntegrantes(creadores, reunion.getIDReunion());
        for(Usuario user : creadores){
            String elementoLista;
            elementoLista = user.getId()+" | " +user.getUsername();
            modeloLista.addElement(elementoLista);
        }
        this.listaCreadores.setModel(modeloLista);
        
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
        panelBlanco = new javax.swing.JPanel();
        txtidUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        agregarUsuario = new javax.swing.JButton();
        btnAgregarInsumo = new javax.swing.JButton();
        btnVerPagos = new javax.swing.JButton();
        creador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCreadores = new javax.swing.JList<>();
        asignarCreador = new javax.swing.JButton();
        finalizarReunion = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnAgregarEvento = new javax.swing.JButton();
        btnVerInsumo = new javax.swing.JButton();
        lblOtrasOpciones = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();

        jLabel5.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(799, 300));
        setPreferredSize(new java.awt.Dimension(799, 300));
        setSize(new java.awt.Dimension(7, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 40, 30));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        txtidUsuario.setText("idUsuario");
        txtidUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidUsuarioActionPerformed(evt);
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

        btnAgregarInsumo.setText("Agregar insumo");
        btnAgregarInsumo.setActionCommand("agregarInsumo");
        btnAgregarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInsumoActionPerformed(evt);
            }
        });

        btnVerPagos.setText("Ver pagos");
        btnVerPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPagosActionPerformed(evt);
            }
        });

        creador.setText("Asignar creador:");

        jScrollPane1.setViewportView(listaCreadores);

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

        btnVerInsumo.setText("Ver insumo");
        btnVerInsumo.setActionCommand("agregarInsumo");
        btnVerInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerInsumoActionPerformed(evt);
            }
        });

        lblOtrasOpciones.setText("Otras opciones:");

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(creador)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarUsuario)
                                    .addComponent(asignarCreador))))
                        .addGap(54, 54, 54)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(finalizarReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBlancoLayout.createSequentialGroup()
                                    .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAgregarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAgregarEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnVerPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVerInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                            .addComponent(lblOtrasOpciones, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarUsuario))
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblOtrasOpciones))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asignarCreador)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerInsumo)
                            .addComponent(btnAgregarEvento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarInsumo)
                            .addComponent(btnVerPagos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarReunion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 740, 300));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidUsuarioActionPerformed

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        VentanaVerReuniones vent = new VentanaVerReuniones();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void agregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsuarioActionPerformed
        try{
            Class.forName("org.postgresql.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, contrasenia);
            java.sql.Statement st = conexion.createStatement();
            //=Obtener la id dado el username=================
            
            String sql = "SELECT id_usuario FROM usuario WHERE username = '" +this.txtidUsuario.getText()+ "';";
            ResultSet result = st.executeQuery(sql);
            int idUserAux= -1;
            while(result.next()){
                 idUserAux = result.getInt("id_usuario");
            }
            result.close();
            st.close();
            if(idUserAux == -1){
                this.lblError.setText("No existe el usuario que se quiere agregar");
                
            }else{
//                ArrayList<Usuario> usuarios = new ArrayList();
//                UsuarioReunion.obtenerIntegrantes(usuarios, this.reunion.getIDReunion());
//                if(usuarios.contains(Usuario.buscarUserPorId(idUserAux))){
//                    this.lblError.setText("Ya ha sido agregado anteriormente.");
//                }
//                 else{
                    st = conexion.createStatement();
                    String insertion = "INSERT INTO usuario_reunion VALUES ("+idUserAux+", "+this.reunion.getIDReunion()+", false);"; 
                    System.out.println("ID REUNION DE CLASE: " + this.reunion.getIDReunion());
                    //TEST
                    System.out.println("VA INSERCION");
                    System.out.println(insertion);
                    //
                    st.executeUpdate(insertion);
                    this.lblError.setText("Se ha agregado correctamente.");
                    st.close();

                    conexion.close();
                    errorAlGuardar = false;
                //}   
            }
            
        }catch (SQLException e){
            System.out.println("ERROR DE CONEXION " + e.getMessage());
            errorAlGuardar = true;
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR AL GUARDAR LA CLASE "+ e.getMessage());
            errorAlGuardar = true;
        }    
    }//GEN-LAST:event_agregarUsuarioActionPerformed

    private void asignarCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCreadorActionPerformed
        if(this.listaCreadores.getSelectedIndex() >= 0){
            Usuario usuario = creadores.get(this.listaCreadores.getSelectedIndex());
            //Me auto asigno como creador
            Reunion.asignarCreador(usuario, reunion);
            if(Reunion.errorAlGuardar == true){
                this.lblError.setText("El usuario ya gestiona el grupo");
            }else{
                this.lblError.setText("Agregado correctamente");
            }
        }
    }//GEN-LAST:event_asignarCreadorActionPerformed

    private void btnVerPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPagosActionPerformed
        VentanaPagos vent = new VentanaPagos(reunion);
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerPagosActionPerformed

    private void finalizarReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarReunionActionPerformed
        this.reunion.Delete();
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_finalizarReunionActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
        VentanaEvento vent = new VentanaEvento();
        vent.idReunion = reunion.getIDReunion();
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void btnAgregarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInsumoActionPerformed
        VentanaCompra vent = new VentanaCompra(reunion);
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarInsumoActionPerformed

    private void btnVerInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerInsumoActionPerformed
        VentanaVerInsumos vent = new VentanaVerInsumos(reunion);
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerInsumoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarUsuario;
    private javax.swing.JButton asignarCreador;
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnAgregarInsumo;
    private javax.swing.JButton btnVerInsumo;
    private javax.swing.JButton btnVerPagos;
    private javax.swing.JLabel creador;
    private javax.swing.JButton finalizarReunion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblOtrasOpciones;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JList<String> listaCreadores;
    private javax.swing.JPanel panelBlanco;
    private javax.swing.JTextField txtidUsuario;
    // End of variables declaration//GEN-END:variables
}
