package com.viktoraparra.form;

import com.viktoraparra.connectors.ConnectorMySQL;
import com.viktoraparra.entities.Factura;
import com.viktoraparra.repositories.interfaces.I_FacturaR;
import com.viktoraparra.repositories.jdbc.FacturaR;
import com.viktoraparra.utils.swing.Table;
import com.viktoraparra.utils.swing.TxtValidator;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class FormFactura extends javax.swing.JInternalFrame {
        DefaultTableModel modelo;

    private I_FacturaR fact;
    public FormFactura() {
    fact= new FacturaR(ConnectorMySQL.getConnection());
        initComponents();
        cargar();
        // Organizacion de tabla de Factura
        modelo = (DefaultTableModel) tblFactura.getModel();
//        tblFactura.getColumn("Codigo").setWidth(15);
//        tblFactura.getColumn("Codigo").setPreferredWidth(15);
//        tblFactura.getColumn("Descripcion").setWidth(220);
//        tblFactura.getColumn("Descripcion").setPreferredWidth(220);
//        tblFactura.getColumn("Cantidad").setWidth(20);
//        tblFactura.getColumn("Cantidad").setPreferredWidth(20);
//        tblFactura.getColumn("U/Medida").setWidth(20);
//        tblFactura.getColumn("U/Medida").setPreferredWidth(20);
//        tblFactura.getColumn("P/Unitario").setWidth(20);
//        tblFactura.getColumn("P/Unitario").setPreferredWidth(20);
//        tblFactura.getColumn("Total").setWidth(20);
//        tblFactura.getColumn("Total").setPreferredWidth(20);

    }
    private void cargar(){
        new Table<Factura>().cargar(tblFactura, fact.getAll());
    }
     private void limpiar(){
        txtId.setText("");
        txtLinea.setText("");
        txtProveedor.setText("");
    }
//    private boolean validar(){
//        //txtNombre entre 2 y 25 caracteres
//        if(!new TxtValidator(txtNombreRS).length(2, 25))   return false;
//        //txtUsuario entre 2 y 10 caracteres
//        if(!new TxtValidator(txtTelefono).length(2, 14))  return false;    
//        // txtClave es un una clave entre 6 y 12
//        if(!new TxtValidator(txtDomicilio).length(2, 25))    return false;
//        
//        return true;
//    }
//    
    public static void setLinea(String id, String linea){
        txtIdLinea.setText(id);
        txtLinea.setText(linea);
    }
    public static void setProveedor(String id, String proveedor){
        txtIdLinea.setText(id);
        txtLinea.setText(proveedor);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        tblFacturas = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        btnNuevo = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JToggleButton();
        btnLinea = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        txtIdLinea = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ID:");

        jLabel2.setText("Linea:");

        jLabel3.setText("Proveedor");

        jLabel4.setText("Fecha:");

        txtId.setEditable(false);

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Cantidad", "UMedida", "P/Unitario", "Total"
            }
        ));
        tblFacturas.setViewportView(tblFactura);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLinea.setText("...");
        btnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineaActionPerformed(evt);
            }
        });

        btnProveedor.setText("...");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        txtIdLinea.setEditable(false);

        txtIdProveedor.setEditable(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tblFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProveedor)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txtLinea))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnLinea)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnProveedor)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLinea)
                    .addComponent(txtIdLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnProveedor)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(tblFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Evento Nuevo
     int filas = tblFactura.getRowCount();
     int contar = 1; 
        for (int n = 1; filas > n; n++) {
            contar++;
        }
        if (contar>10) {
            modelo.addRow(new Object[](contar,"","","","",""));
        } else {
            modelo.addRow(new Object[]("0"+contar,"","","","",""));
        }      
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineaActionPerformed
        // JDialog Buscar Linea
        FormBuscarLineas formBL = new FormBuscarLineas(new JFrame(),true);
        formBL.setVisible(true);
        
    }//GEN-LAST:event_btnLineaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // JDialog BuscarProveedores
        FormBuscarProveedores formP = new FormBuscarProveedores(new JFrame(),true);
        formP.setVisible(true);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JButton btnLinea;
    private javax.swing.JToggleButton btnNuevo;
    private javax.swing.JButton btnProveedor;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tblFactura;
    private javax.swing.JScrollPane tblFacturas;
    private javax.swing.JTextField txtId;
    private static javax.swing.JTextField txtIdLinea;
    private static javax.swing.JTextField txtIdProveedor;
    private static javax.swing.JTextField txtLinea;
    private static javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
