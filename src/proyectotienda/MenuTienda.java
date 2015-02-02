/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotienda;

import conexionmysql.DatosConexion;
import static conexionmysql.DatosConexion.CONEXION;

/**
 *
 * @author Kote
 */
public class MenuTienda extends javax.swing.JFrame implements DatosConexion {

    /**
     * Creates new form MenuTienda
     */
    public MenuTienda() {
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

        BtnAgregar = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelesCombos = new javax.swing.JPanel();
        ComboNuevo = new javax.swing.JComboBox();
        ComboBorrar = new javax.swing.JComboBox();
        ComboBuscar = new javax.swing.JComboBox();
        ComboModificar = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Tienda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BtnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/add2-.png"))); // NOI18N
        BtnAgregar.setText("NUEVO");
        BtnAgregar.setToolTipText("Botón para agregar ");
        BtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAgregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/trash yellow.png"))); // NOI18N
        BtnBorrar.setText("BORRAR");
        BtnBorrar.setToolTipText("Botón para agregar ");
        BtnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBorrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/search.png"))); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.setToolTipText("Botón para agregar ");
        BtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BtnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/edit.png"))); // NOI18N
        BtnModificar.setText("MODIFICAR");
        BtnModificar.setToolTipText("Botón para agregar ");
        BtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpg/exit.png"))); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.setToolTipText("Botón para agregar ");
        BtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TUTIENDA: ELIGE UNA OPCION");

        PanelesCombos.setBackground(new java.awt.Color(204, 204, 255));

        ComboNuevo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Cliente", "Empleados", "Producto" , "Factura" }));

        ComboBorrar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Cliente", "Empleados", "Producto", "Factura" }));

        ComboBuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Cliente", "Empleados", "Producto" , "Factura"}));

        ComboModificar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Cliente", "Empleados", "Producto" , "Factura"}));

        javax.swing.GroupLayout PanelesCombosLayout = new javax.swing.GroupLayout(PanelesCombos);
        PanelesCombos.setLayout(PanelesCombosLayout);
        PanelesCombosLayout.setHorizontalGroup(
            PanelesCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelesCombosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(ComboBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelesCombosLayout.setVerticalGroup(
            PanelesCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelesCombosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelesCombosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(BtnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelesCombos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnAgregar, BtnBorrar, BtnBuscar, BtnModificar, BtnSalir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnModificar)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnBorrar)
                    .addComponent(BtnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelesCombos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnAgregar, BtnBorrar, BtnBuscar, BtnModificar, BtnSalir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
        CONEXION.desconectar_BD();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        int opcionComboNuevo = ComboNuevo.getSelectedIndex();

        if (opcionComboNuevo == 1) {
            Cliente nuevoCliente = new Cliente();//1
            nuevoCliente.setVisible(true);
        }
        if (opcionComboNuevo == 2) {
            Empleado nuevoEm = new Empleado();//1
            nuevoEm.setVisible(true);
        }

        if (opcionComboNuevo == 3) {
            Producto nuevoProducto = new Producto();//3
            nuevoProducto.setVisible(true);
        }

        if (opcionComboNuevo == 4) {
            Facturaa nuevaFactura = new Facturaa();//4
            nuevaFactura.setVisible(true);
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CONEXION.conectar_BD();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CONEXION.desconectar_BD();
    }//GEN-LAST:event_formWindowClosing

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        int opcionComboBorrar = ComboBorrar.getSelectedIndex();

        if (opcionComboBorrar == 1) {
            ClienteBorrar nuevoClienteBorrar = new ClienteBorrar();//1
            nuevoClienteBorrar.setVisible(true);
            
        }
        if (opcionComboBorrar == 2) {
            Empleado nuevoEm = new Empleado();//1
            nuevoEm.setVisible(true);
        }

        if (opcionComboBorrar == 3) {
            Producto nuevoProducto = new Producto();//3
            nuevoProducto.setVisible(true);
        }

        if (opcionComboBorrar == 4) {
            Facturaa nuevaFactura = new Facturaa();//4
            nuevaFactura.setVisible(true);
        }
    }//GEN-LAST:event_BtnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTienda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox ComboBorrar;
    private javax.swing.JComboBox ComboBuscar;
    private javax.swing.JComboBox ComboModificar;
    private javax.swing.JComboBox ComboNuevo;
    private javax.swing.JPanel PanelesCombos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}