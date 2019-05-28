package com.viktoraparra.form;

import com.viktoraparra.connectors.ConnectorMySQL;
import com.viktoraparra.entities.Linea;
import com.viktoraparra.repositories.interfaces.I_LineaR;
import com.viktoraparra.repositories.jdbc.LineaR;
import com.viktoraparra.utils.swing.Table;
import java.awt.Point;
import javax.swing.JTable;

public class FormBuscarLineas extends javax.swing.JDialog {
    private I_LineaR lin;
    public FormBuscarLineas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        lin = new LineaR(ConnectorMySQL.getConnection());
        initComponents();
        cargar();
        tblLineas.getColumnModel().getColumn(0).setMaxWidth(0);
        tblLineas.getColumnModel().getColumn(0).setMinWidth(0);
        tblLineas.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    private void cargar(){
        new Table<Linea>().cargar(tblLineas, lin.getAll());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarLinea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLineas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lineas");

        txtBuscarLinea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarLineaKeyReleased(evt);
            }
        });

        tblLineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLineasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblLineas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarLineaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarLineaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarLineaKeyReleased

    private void tblLineasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLineasMousePressed
        // TODO add your handling code here:
        JTable jtbl= (JTable) evt.getSource();
        Point pt=  evt.getPoint();
        int  row = jtbl.rowAtPoint(pt);
        if (evt.getClickCount()==2) {
            String id = tblLineas.getValueAt(tblLineas.getSelectedRow(), 0).toString();
            String linea = tblLineas.getValueAt(tblLineas.getSelectedRow(), 1).toString();
            FormFactura.setLinea(id,linea);
            this.dispose();
        }
        
    }//GEN-LAST:event_tblLineasMousePressed

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
            java.util.logging.Logger.getLogger(FormBuscarLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarLineas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormBuscarLineas dialog = new FormBuscarLineas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLineas;
    private javax.swing.JTextField txtBuscarLinea;
    // End of variables declaration//GEN-END:variables
}
