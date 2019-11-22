/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Admin.DetalleProd;
import Estructuras.Nodo;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import tienda.Producto;
import tienda.Tienda;

/**
 *
 * @author Saul
 */
public class MenuTienda extends javax.swing.JFrame {
    DecimalFormat formato = new DecimalFormat("###,###,###,###.00");
    private Usuario user;
    private String datos[][] = {};
    private String columnas[] = {"Nombre", "Precio"};
    private DefaultTableModel modelo;
    private Tienda principal = new Tienda();
    private double total;

    public MenuTienda(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        this.user = user;
        jLabel1.setText("Hola, " + user.getNombre());
        modelo = new DefaultTableModel(datos, columnas);
        llenarTabla();
        jTable1.setModel(modelo);
        total = 0;
        if (user.getCarrito().cantidad() != 0) {
            updateCart();
        }
    }

    private void llenarTabla() {
        modelo.setRowCount(0);
        Nodo<Producto> inicio = principal.productos.cabeza();
        Nodo<Producto> iterador = inicio;
        if (iterador != null) {
            while (true) {
                if (iterador.siguiente() == inicio) {
                    String fila[] = {
                        iterador.contenido().getNombre(),
                        iterador.contenido().getPrecio()
                    };
                    modelo.addRow(fila);
                    break;
                } else {
                    String fila[] = {
                        iterador.contenido().getNombre(),
                        iterador.contenido().getPrecio()
                    };
                    modelo.addRow(fila);
                    iterador = iterador.siguiente();
                }
            }
        }
    }

    private void updateCart() {
        if (user.getCarrito().cantidad() == 1) {
            String precio = user.getCarrito().cabeza().contenido().getPrecio();
            this.total = Double.valueOf(precio);
            jButton3.setText("CARRITO (1) Q." + formato.format(total));
        } else {
            Nodo<Producto> cabeza = user.getCarrito().cabeza();
            Nodo<Producto> iterador = cabeza;
            double total = 0;
            while (iterador.siguiente() != cabeza) {
                total += Double.valueOf(iterador.contenido().getPrecio());
                iterador = iterador.siguiente();
                if (iterador.siguiente() == cabeza) {
                    total += Double.valueOf(iterador.contenido().getPrecio());
                }
            }
            this.total = total;
            jButton3.setText("CARRITO (" + user.getCarrito().cantidad() + ") Q." + formato.format(total));
        }
    }

    private void updateCart(Double precio) {
        total += precio;
        jButton3.setText("CARRITO (" + user.getCarrito().cantidad() + ") Q." + formato.format(total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HOLA [USUARIO]");

        jButton1.setText("Modificar Perfil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("CERRAR SESION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CARRITO (0) Q0.00.-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jButton3))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login cerrar = new Login();
        this.dispose();
        cerrar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = user.getNombre();
        String apellido = user.getApellido();
        String correo = user.getCorreo();
        String usuario = user.getUsuario();
        String contra = user.getContra();
        String numero = user.getTCredito().getNumero();
        String cvc = "" + user.getTCredito().getCVC();
        String fecha = user.getTCredito().getFechaV().toString();
        ModUser modificar = new ModUser(nombre, apellido, correo, usuario,
                contra, numero, cvc, fecha, user);
        this.dispose();
        modificar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int numtabla = jTable1.getSelectedRow() + 1;
        if (numtabla != -1) {
            Producto prod = principal.productos.indice(numtabla);
            user.getCarrito().nuevo(prod);
            updateCart(Double.valueOf(prod.getPrecio()));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (user.getCarrito().cantidad() != 0) {
            Carrito confirmar = new Carrito(user);
            this.dispose();
            confirmar.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
                new MenuTienda(new Usuario()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
