/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Estructuras.CircularSimp;
import Estructuras.Nodo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;
import tienda.Producto;
import tienda.Tienda;
import static tienda.Tienda.productos;

/**
 *
 * @author Saul
 */
public class AgrProd extends javax.swing.JFrame {

    Tienda principal = new Tienda();
    FileNameExtensionFilter imagenes = new FileNameExtensionFilter(
            "Archivos de imagenes (.jpg/.png)", "jpg", "png");
    FileNameExtensionFilter productos = new FileNameExtensionFilter(
            "Archivos de productos (.proadd)", "proadd");
    FileWriter archivo;
    BufferedWriter buffer;
    String rutaTienda = principal.getRuta();
    String rutaArchivo = principal.getRuta();
    String nombreTienda = "";
    String mensaje = "PRODUCTO AGREGADO";

    public AgrProd() {
        initComponents();
        setLocationRelativeTo(null);
        jFileChooser1.setCurrentDirectory(new File(System.getProperty("user.home")));
        labelShop.setText(rutaTienda);
        labelArch.setText(rutaArchivo);
    }

    private ImageIcon imagenLabel(String direccion) {
        Image original = new ImageIcon(direccion).getImage();
        Image escalada = original.getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_FAST);
        ImageIcon imagenLabel = new ImageIcon(escalada);
        return imagenLabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        desc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelShop = new javax.swing.JLabel();
        labelArch = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ruta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("CARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Trabajando en Archivo:");

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del producto");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion");

        jLabel4.setText("Precio");

        jLabel5.setText("Cantidad");

        jButton4.setText("VOLVER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        imgLabel.setBackground(new java.awt.Color(153, 153, 153));
        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setText("IMAGEN");
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Ruta de la imagen:");

        jButton5.setText("USAR ESTE ARCHIVO EN LA TIENDA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Archivo cargado en la tienda:");

        labelShop.setText("jLabel8");

        labelArch.setText("jLabel9");

        jLabel10.setText("IDENTIFICADOR");

        ruta.setEditable(false);
        ruta.setColumns(20);
        ruta.setLineWrap(true);
        ruta.setRows(5);
        jScrollPane1.setViewportView(ruta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(desc)
                                .addComponent(nombre)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelShop, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelArch, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelShop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelArch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        boolean copia = false;
        if (!rutaArchivo.equals("Ningun Archivo")) {
            if (nombre.getText().equals("")
                    || desc.getText().equals("")
                    || precio.getText().equals("")
                    || cantidad.getText().equals("")
                    || ruta.getText().equals("")
                    || ID.getText().equals("")) {
                jOptionPane1.showMessageDialog(this, "HACEN FALTA CAMPOS");
            } else {
                if (rutaArchivo.equals(rutaTienda) && !rutaArchivo.equals("Ningun Archivo") && !rutaTienda.equals("Ningun Archivo")) {
                    if ( principal.productos.cabeza() != null){
                        System.out.println("checando copia");
                        Nodo<Producto> inicio = principal.productos.cabeza();
                        Nodo<Producto> iterador = inicio;
                        while (true) {
                            String IDLista = iterador.contenido().getID();
                            String IDChequeo = ID.getText().toUpperCase();
                            System.out.print(IDLista + " - " +IDChequeo + "\n");
                            if (iterador.contenido().getID().equals(ID.getText().toUpperCase())) {
                                copia = true;
                                jOptionPane1.showMessageDialog(this, "ESTE PRODUCTO YA EXISTE");
                                break;
                            } else if(iterador.siguiente() != inicio ){
                                iterador = iterador.siguiente();
                            } else{
                                System.out.println("No encontre copias");
                                break;}
                        }
                    }
                } else {
                    CircularSimp<Producto> chequeo = new CircularSimp();
                    System.out.println("Se creo la lista de chequeo");
                    //
                    try {
                        FileReader lector = new FileReader(rutaArchivo);
                        BufferedReader lectorBuffer = new BufferedReader(lector);
                        String linea = lectorBuffer.readLine();
                        String[] datos;
                        while (linea != null) {
                            datos = linea.split(",");
                            Producto agregar
                                    = new Producto(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                            chequeo.nuevo(agregar);
                            System.out.println(linea);
                            linea = lectorBuffer.readLine();
                        }
                        lector.close();
                        lectorBuffer.close();
                    } catch (IOException ex) {
                        System.out.println("Hubo problemas hijo");
                    }
                    //
                    System.out.println("checando copia en lista chequeo");
                    Nodo<Producto> inicio = chequeo.cabeza();
                    Nodo<Producto> iterador = inicio;
                    while (true) {
                        if (iterador.contenido().getID().equals(ID.getText().toUpperCase())) {
                            copia = true;
                            jOptionPane1.showMessageDialog(this, "ESTE PRODUCTO YA EXISTE");
                            break;
                        } else if (iterador.siguiente() != inicio){
                            iterador = iterador.siguiente();
                        } else{
                            System.out.println("no encontré copias");
                            break;}
                    }
                }
                if (!copia) {
                    String nuevo
                            = ID.getText().toUpperCase() + ","
                            + nombre.getText() + ","
                            + desc.getText() + ","
                            + precio.getText() + ","
                            + cantidad.getText() + ","
                            + ruta.getText() + "\n";
                    Producto nuevoProd = new Producto(
                            ID.getText().toUpperCase(),
                            nombre.getText(),
                            desc.getText(),
                            precio.getText(),
                            cantidad.getText(),
                            ruta.getText());
                    try {
                        archivo = new FileWriter(rutaArchivo, true);
                        buffer = new BufferedWriter(archivo);
                        buffer.write(nuevo);
                        if (rutaArchivo.equals(rutaTienda) && !rutaArchivo.equals("Ningun Archivo") && !rutaTienda.equals("Ningun Archivo")) {
                            principal.productos.nuevo(nuevoProd);
                            mensaje = "PRODUCTO GUARDADO Y AGREGADO A LA TIENDA";
                        }

                        buffer.flush();
                        archivo.flush();
                        jOptionPane1.showMessageDialog(this, mensaje);
                    } catch (IOException ex) {
                        System.out.println("Hubo un problema al hacer la escritura al archivo");
                    }
                }
            }
        } else {
            jOptionPane1.showMessageDialog(this, "NO HAS CARGADO UN ARCHIVO");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jFileChooser1.setDialogTitle("CARGAR UNA IMAGEN");
        jFileChooser1.setFileFilter(imagenes);
        int caso = jFileChooser1.showSaveDialog(null);
        if (caso == jFileChooser1.APPROVE_OPTION) {
            File seleccion = jFileChooser1.getSelectedFile();
            String direccion = seleccion.getAbsolutePath();
            ruta.setText(direccion);
            imgLabel.setText("");
            imgLabel.setIcon(imagenLabel(direccion));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VntProd volver = new VntProd();
        this.dispose();
        volver.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFileChooser1.setDialogTitle("CARGAR UN ARCHIVO DE PRODUCTOS");
        jFileChooser1.setFileFilter(productos);
        int caso = jFileChooser1.showSaveDialog(null);
        if (caso == jFileChooser1.APPROVE_OPTION) {
            File seleccion = jFileChooser1.getSelectedFile();
            String direccion = seleccion.getAbsolutePath();
            nombreTienda = seleccion.getName();
            rutaArchivo = direccion;
            labelArch.setText(direccion);
            jOptionPane1.showMessageDialog(this, "SE HA CARGADO: \n" + nombreTienda);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean aplicar = true;
        if(rutaArchivo.equals("Ningun Archivo")){
            jOptionPane1.showMessageDialog(this, "NO HAY NINGUN ARCHIVO CARGADO");
            aplicar = false;
        }
        else if(rutaArchivo.equals(rutaTienda)){
            jOptionPane1.showMessageDialog(this, "LA TIENDA YA ESTA USANDO ESE ARCHIVO");
            aplicar = false;
        }
        if(aplicar){
            principal.setRuta(rutaArchivo);
            principal.productos.reiniciar();
            principal.cargarTienda();
            rutaTienda = rutaArchivo;
            labelShop.setText(rutaTienda);
            jOptionPane1.showMessageDialog(this, "TIENDA AHORA USA: \n" + nombreTienda);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AgrProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgrProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgrProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgrProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgrProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelArch;
    private javax.swing.JLabel labelShop;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JTextArea ruta;
    // End of variables declaration//GEN-END:variables
}
