
package com.viktoraparra.form;

import com.viktoraparra.connectors.ConnectorMySQL;
import com.viktoraparra.entities.Proveedor;
import com.viktoraparra.repositories.interfaces.I_ProveedorR;
import com.viktoraparra.repositories.jdbc.ProveedorR;
import com.viktoraparra.utils.swing.Table;
import java.awt.Point;
import javax.swing.JTable;

public class FormBuscarProveedores extends javax.swing.JDialog {
    private I_ProveedorR prove;
    public FormBuscarProveedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        prove = new ProveedorR(ConnectorMySQL.getConnection());
        initComponents();
        tblProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProveedores.getColumnModel().getColumn(0).setMinWidth(0);
        tblProveedores.getColumnModel().getColumn(0).setPreferredWidth(0);
        cargar();
    }

    private void cargar(){
        new Table<Proveedor>().cargar(tblProveedores, prove.getAll());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscarP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedor");

        txtBuscarP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPKeyReleased(evt);
            }
        });

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProveedoresMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPKeyReleased

    private void tblProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMousePressed
        // Ingreso de Proveedor a la tabla Factura
        JTable jtbl= (JTable) evt.getSource();
        Point pt=  evt.getPoint();
        int  row = jtbl.rowAtPoint(pt);
        if (evt.getClickCount()==2) {
            String id = tblProveedores.getValueAt(tblProveedores.getSelectedRow(), 0).toString();
            String proveedor = tblProveedores.getValueAt(tblProveedores.getSelectedRow(), 1).toString();
            FormFactura.setProveedor(id,proveedor);
            this.dispose();
        }
    }//GEN-LAST:event_tblProveedoresMousePressed

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
            java.util.logging.Logger.getLogger(FormBuscarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormBuscarProveedores dialog = new FormBuscarProveedores(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtBuscarP;
    // End of variables declaration//GEN-END:variables
}
