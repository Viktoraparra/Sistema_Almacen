package com.viktoraparra.form;
import com.viktoraparra.repositories.jdbc.HoraR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FormPrincipal extends javax.swing.JFrame {


    public FormPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         new Thread(new HoraR(txtHora)).start();
         timer.start();
    }

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            Calendar ca= new GregorianCalendar();
            int dia,mes,aa;
            dia=ca.get(Calendar.DAY_OF_MONTH);
            mes=ca.get(Calendar.MONTH);
            aa=ca.get(Calendar.YEAR);
            txtFecha.setText(dia+"/"+(mes+1)+"/"+aa);
        }
    });
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        btnFacturas = new javax.swing.JButton();
        btnRecibos = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniConsultas = new javax.swing.JMenu();
        mniReportes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniDetalleDeRecibos = new javax.swing.JMenuItem();
        mniBaseDeDatos = new javax.swing.JMenu();
        mniRespaldar = new javax.swing.JMenuItem();
        menuHerramientas = new javax.swing.JMenu();
        mniUsuarios = new javax.swing.JMenuItem();
        mniLineas = new javax.swing.JMenuItem();
        mniProveedores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFacturas.setText("Facturas");
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });

        btnRecibos.setText("Recibos");
        btnRecibos.setMaximumSize(new java.awt.Dimension(71, 30));
        btnRecibos.setMinimumSize(new java.awt.Dimension(71, 30));
        btnRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibosActionPerformed(evt);
            }
        });

        btnAlmacen.setText("Almacen");
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Hora:");

        jLabel3.setText("Fecha:");

        txtUsuario.setEditable(false);

        txtHora.setEditable(false);
        txtHora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtFecha.setEditable(false);
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecibos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(txtHora)
                            .addComponent(txtUsuario))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mniConsultas.setText("Consultas");

        mniReportes.setText("Reportes");
        mniConsultas.add(mniReportes);

        jMenu1.setText("Detalle de Facturas");
        mniConsultas.add(jMenu1);

        mniDetalleDeRecibos.setText("detalle de Recibos");
        mniConsultas.add(mniDetalleDeRecibos);

        jMenuBar1.add(mniConsultas);

        mniBaseDeDatos.setText("Base de datos");

        mniRespaldar.setText("Respaldar / Restaurar");
        mniBaseDeDatos.add(mniRespaldar);

        jMenuBar1.add(mniBaseDeDatos);

        menuHerramientas.setText("Herramientas");

        mniUsuarios.setText("Usuarios");
        mniUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsuariosActionPerformed(evt);
            }
        });
        menuHerramientas.add(mniUsuarios);

        mniLineas.setText("Lineas");
        mniLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLineasActionPerformed(evt);
            }
        });
        menuHerramientas.add(mniLineas);

        mniProveedores.setText("Proveedores");
        mniProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProveedoresActionPerformed(evt);
            }
        });
        menuHerramientas.add(mniProveedores);

        jMenuBar1.add(menuHerramientas);

        jMenu2.setText("Opciones");

        mniInfo.setText("Informacion");
        jMenu2.add(mniInfo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktop))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecibosActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void mniUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsuariosActionPerformed
        // Evento Ventana Usuario
        FormUsuario formUsuarios = new FormUsuario();
        desktop.add(formUsuarios);
        formUsuarios.setVisible(true);
    }//GEN-LAST:event_mniUsuariosActionPerformed

    private void mniLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLineasActionPerformed
        // Evento Ventana Lineas
        FormLineas formLineas = new FormLineas();
        desktop.add(formLineas);
        formLineas.setVisible(true);
    }//GEN-LAST:event_mniLineasActionPerformed

    private void mniProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProveedoresActionPerformed
        // Evento Proveedores
        FormProveedores formProveedores = new FormProveedores();
        desktop.add(formProveedores);
        formProveedores.setVisible(true);
    }//GEN-LAST:event_mniProveedoresActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        // Evento Factura
        FormFactura formF = new FormFactura();
        desktop.add(formF);
        formF.setVisible(true);
    }//GEN-LAST:event_btnFacturasActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnRecibos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuHerramientas;
    private javax.swing.JMenu mniBaseDeDatos;
    private javax.swing.JMenu mniConsultas;
    private javax.swing.JMenuItem mniDetalleDeRecibos;
    private javax.swing.JMenuItem mniInfo;
    private javax.swing.JMenuItem mniLineas;
    private javax.swing.JMenuItem mniProveedores;
    private javax.swing.JMenuItem mniReportes;
    private javax.swing.JMenuItem mniRespaldar;
    private javax.swing.JMenuItem mniUsuarios;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
