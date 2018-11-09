/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriobd;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustín
 */
public class VentanaVerEventos extends javax.swing.JFrame {
    
    DefaultListModel modeloLista;
    ArrayList<Evento> array = new ArrayList();
    
    /**
     * Creates new form VentanaVerEventos
     */
    public VentanaVerEventos() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/imagenes/fondoCelesteFinoFlecha.jpg");
        this.lblfondoCeleste.setIcon(icon);
        modeloLista = new DefaultListModel();
        Evento.buscarEventosPorUsuario(array, ObligatorioBD.usuarioLoggeado.getId());
        for(Evento evento : array){
            String elementoLista;
            elementoLista = evento.getTipo() + " " + evento.getDescripcion() + " " + evento.getFecha();
            modeloLista.addElement(elementoLista);
        }
        listaEventos.setModel(modeloLista);        
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
        listaEventos = new javax.swing.JList<>();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(739, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        lblfondoCeleste.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblfondoCeleste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        panelBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelBlanco.setPreferredSize(new java.awt.Dimension(739, 300));

        listaEventos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaEventos);

        btnConfirmar.setText("Eliminar evento");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBlancoLayout = new javax.swing.GroupLayout(panelBlanco);
        panelBlanco.setLayout(panelBlancoLayout);
        panelBlancoLayout.setHorizontalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBlancoLayout.createSequentialGroup()
                .addGroup(panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConfirmar))
                    .addGroup(panelBlancoLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        panelBlancoLayout.setVerticalGroup(
            panelBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBlancoLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnConfirmar)
                .addGap(27, 27, 27))
        );

        getContentPane().add(panelBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        int pos;
        int res;
        res = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este evento?");
        if (res == 0){
            pos = listaEventos.getSelectedIndex();
            modeloLista.remove(pos);
            Evento evento = array.get(pos);
            array.remove(pos);
            evento.Delete();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblfondoCeleste;
    private javax.swing.JList<String> listaEventos;
    private javax.swing.JPanel panelBlanco;
    // End of variables declaration//GEN-END:variables
}
