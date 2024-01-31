package pantallas;

import Modelos.CCliente;
import Modelos.CVendedor;
import conexiones.Execute;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.concurrent.Task;

/**
 *
 * @author 
 *  José Luis Isabel Matos 2018-2394
    Anthony Cruz Reynoso – 20172077 
    María Alexandra Adames Trinidad - 20191311
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
      // RolUsuarios();
    }
    
    private void RolUsuarios()
    {
        String datos = CVendedor.Rol;
        
        if(datos.equalsIgnoreCase("Estandar"))
        {
            jButton2.setEnabled(false);
            jButton5.setEnabled(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Vendedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Productos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ventas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Factura");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Sistema Iventario");

        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Productos productos = new Productos();
        productos.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        VentaMaster VentaMaster = new VentaMaster();
        VentaMaster.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        generalDocumentos();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        CVendedor.Codigo = 0;
        CVendedor.Nombre = "";
        CVendedor.Rol = "";
        
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    
        public void generalDocumentos()
    {
        try 
        {
            
            Execute Buscar = new Execute();

            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyyhhmmss");
            
            String ruta = "C:/Users/Susanita/Documents/NetBeansProjects/Inventario/src/Reportes/"+CVendedor.Codigo +"-"+formatter.format(date)+"-Factura.txt";

            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("         FACTURA\n");
            
            
            
            String queryClientes = "select codigo, cedula, Nombre from clientes";

            CallableStatement  cts = Buscar.GetConnection().prepareCall(queryClientes);

            ResultSet rsCliente=cts.executeQuery();
            
            int detalles = 0;
            
            while (rsCliente.next())
            {
                
                    String queryMaster = "select maste.Codigo, maste.Fecha, ven.Nombre, maste.TipoCompra "
                            + "from VentasMaster maste inner join Clientes cli on cli.Codigo= maste.Cliente inner join Vendedor ven on ven.Codigo = maste.Vendedor "
                            + "where maste.Estado = 'Facturada' and cli.codigo = " + rsCliente.getString("codigo") ;

                    CallableStatement  ctsMAster = Buscar.GetConnection().prepareCall(queryMaster);

                    ResultSet rsMaster = ctsMAster.executeQuery();
                    

                    while (rsMaster.next())
                    {

                        bw.write("\n---------ENCABEZADO----------");

                        
                        //crear la cabecera
                        String detalle = "\nCedula: "+rsCliente.getString("cedula") 
                                        +"\nCliente: " + rsCliente.getString("Nombre") 
                                        +"\nVendedor: "+rsMaster.getString("Nombre") 
                                        +"\nFecha: "+rsMaster.getString("Fecha") 
                                        +"\nTipoCompra: "+rsMaster.getString("TipoCompra");

                        bw.write("\n"+detalle);
                        
                        
                         String queryDetalles = "select pro.Nombre,detalles.Cantidad,pro.precio,(detalles.Cantidad * pro.precio) Total "
                                 + "from VentasDetalles detalles inner join Productos pro on detalles.producto = pro.Codigo "
                                 + "where detalles.CodigoMaster = " +rsMaster.getString("Codigo") ;

                        CallableStatement  ctsMDetalles = Buscar.GetConnection().prepareCall(queryDetalles);

                        ResultSet rsDetalles = ctsMDetalles.executeQuery();
                        int detallesLabel = 0;

                        while (rsDetalles.next())
                        {
                            if(detallesLabel == 0)
                            {
                                bw.write("\n---------DETALLES----------");
                            }
                            else
                            {
                                bw.write("\n---------------------------");
                            }

                            detallesLabel=1;

                            //crear la cabecera
                            String detalleProductos = "\nNombre: "+rsDetalles.getString("Nombre") 
                                                    + "\nCliente: " + rsDetalles.getString("Cantidad") 
                                                    + "\nPrecio Unitario: "+rsDetalles.getString("precio") 
                                                    + "\nTotal Productos: "+rsDetalles.getString("Total");

                            bw.write("\n"+detalleProductos+"\n");





                        }

                        bw.write("\nCompra TOTAL: "+SumarioTotal(rsMaster.getString("Codigo")));

            
                        detallesLabel = 0;

                    }

            }
            
            bw.write("\n");
            
            bw.write("\n---------SUMARIO-----------\n");
            
            
            bw.write("\n");

            bw.close();

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
        
    public String SumarioTotal(String codigoMaster)
    {
        Execute Buscar = new Execute();
        String retorno ="";
        try
        {   String query = "select ISNULL(sum((pro.precio * ventas.Cantidad)),0) as Total  from VentasDetalles ventas inner join Productos pro on pro.Codigo = ventas.producto where ventas.CodigoMaster = "+codigoMaster;
 
        CallableStatement  cts = Buscar.GetConnection().prepareCall(query);
            
            ResultSet rs=cts.executeQuery();
           while (rs.next()){
              retorno = rs.getString("Total");
            }
        } 
        catch(Exception err)
        {
            System.err.println(err.getMessage());
        }
        
        return retorno;
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
