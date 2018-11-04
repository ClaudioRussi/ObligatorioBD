/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

/**
 *
 * @author Agustín
 */
public class VentanaEvento extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEvento
     */
    public VentanaEvento() {
        initComponents();
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
        crearEvento = new javax.swing.JButton();
        lblAtras = new javax.swing.JLabel();
        lblfondoCeleste = new javax.swing.JLabel();
        panelBlanco = new javax.swing.JPanel();
        calendarioEvento = new com.toedter.calendar.JCalendar();
        descripcionEvento = new javax.swing.JTextField();
        eventoAnual = new javax.swing.JRadioButton();
        eventoMensual = new javax.swing.JRadioButton();
        horaEvento = new javax.swing.JSpinner();
        minutoEvento = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        categoriaEvento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        eventoSemanal = new javax.swing.JRadioButton();
        eventoDiario = new javax.swing.JRadioButton();
        btnVerEventos = new javax.swing.JButton();

        jLabel5.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearEvento.setText("Crear");
        getContentPane().add(crearEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 266, -1, -1));
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfondoCeleste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCelesteFinoFlecha.jpg"))); // NOI18N
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));

        descripcionEvento.setText("Descripcion");

        eventoAnual.setText("Evento anual");
        eventoAnual.setContentAreaFilled(false);

        eventoMensual.setText("Evento mensual");
        eventoMensual.setContentAreaFilled(false);
        eventoMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoMensualActionPerformed(evt);
            }
        });

        jLabel9.setText(":");

        categoriaEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Categoría:");

        eventoSemanal.setText("Evento semanal");
        eventoSemanal.setContentAreaFilled(false);

        eventoDiario.setText("Evento diario");
        eventoDiario.setContentAreaFilled(false);

        btnVerEventos.setText("Ver eventos");

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addComponent(calendarioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventoSemanal)
                            .addComponent(eventoAnual)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(horaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9)
                                .addGap(4, 4, 4)
                                .addComponent(minutoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(categoriaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(eventoMensual)
                            .addComponent(eventoDiario))))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerEventos)
                .addGap(82, 82, 82))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(descripcionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))
                            .addComponent(minutoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBlancoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(categoriaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eventoDiario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventoSemanal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventoMensual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventoAnual)
                        .addGap(3, 3, 3))
                    .addComponent(calendarioEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnVerEventos)
                .addContainerGap())
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 700, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventoMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoMensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventoMensualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerEventos;
    private com.toedter.calendar.JCalendar calendarioEvento;
    private javax.swing.JComboBox<String> categoriaEvento;
    private javax.swing.JButton crearEvento;
    private javax.swing.JTextField descripcionEvento;
    private javax.swing.JRadioButton eventoAnual;
    private javax.swing.JRadioButton eventoDiario;
    private javax.swing.JRadioButton eventoMensual;
    private javax.swing.JRadioButton eventoSemanal;
    private javax.swing.JSpinner horaEvento;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JSpinner minutoEvento;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
}
