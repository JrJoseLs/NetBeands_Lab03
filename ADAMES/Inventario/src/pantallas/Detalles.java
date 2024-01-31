package pantallas;

import Modelos.CCliente;
import conexiones.Execute;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 
 *  José Luis Isabel Matos 2018-2394
    Anthony Cruz Reynoso – 20172077 
    María Alexandra Adames Trinidad - 20191311
 */


public final class Detalles extends javax.swing.JFrame {

   private static int codigoMaster;
   
    public Detalles() {
        initComponents();
        llenarCProductos();
        Detalles.codigoMaster = codigoMaster;
        cargar();
    }
    
     public Detalles(int codigoMaster) {
        initComponents();
        llenarCProductos();
        Detalles.codigoMaster = codigoMaster;
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        JTCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JLTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Detalles de productos");

        jLabel2.setText("Producto");

        jLabel3.setText("Cantidad");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Facturar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Total:");

        JLTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLTotal.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(JTCantidad))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JLTotal)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JLTotal))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Execute update = new Execute();
        update.ExecuteQueryUpdate("VentasMaster set Estado = 'Cancelada' where Codigo = "+Detalles.codigoMaster);
        Menu menu = new Menu();
        menu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Execute insertar = new Execute();
        //agregar codigo de vendedor despues
        String[] datos = jComboBox1.getSelectedItem().toString().split(" - ");
        int producto = ValidaProducto(datos[0]);
        
        if(producto != 0)
        {
            String query = "VentasDetalles set cantidad ="+(producto+Integer.parseInt(JTCantidad.getText()))+" where CodigoMaster = "+Detalles.codigoMaster+" and producto = "+datos[0];

            insertar.ExecuteQueryUpdate(query);
        }
        else
        {
            boolean insertarData = insertar.ExecuteQueryInserts("VentasDetalles (CodigoMaster, producto, Cantidad) values ("+Detalles.codigoMaster+","+datos[0]+","+JTCantidad.getText()+" )");
        }
   
         
        SumarioTotal();
        cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public int ValidaProducto(String codigo)
    {
        Execute Buscar = new Execute();
        
        try
        {   
 
            String query = "select Cantidad from VentasDetalles where CodigoMaster ="+Detalles.codigoMaster+" and producto ="+codigo;
 
            CallableStatement  cts = Buscar.GetConnection().prepareCall(query);
            
            ResultSet rs=cts.executeQuery();
            
           while (rs.next()){
               
              return rs.getInt("Cantidad");
            }
        } 
        catch(Exception err)
        {
            System.err.println(err.getMessage());
        }
           
        return 0;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
                // TODO add your handling code here:
        Execute update = new Execute();
        update.ExecuteQueryUpdate("VentasMaster set Estado = 'Facturada' where Codigo = "+Detalles.codigoMaster);
        
        JOptionPane.showMessageDialog(null, "Compra Realizada  satisfactoriamente!!");
        this.hide();
        Menu menu = new Menu();
        menu.setVisible(true);
        generalDocumentos();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void buscarCliente()
    {
        Execute Buscar = new Execute();
        try
        {   String query = "select Cedula, Nombre,TipoCompra from clientes cli inner join VentasMaster ventas on ventas.Cliente = cli.Codigo where ventas.Codigo = "+Detalles.codigoMaster;
 
        CallableStatement  cts = Buscar.GetConnection().prepareCall(query);
            
            ResultSet rs=cts.executeQuery();
           while (rs.next()){
               CCliente.Cedula = rs.getString("Cedula");
               CCliente.Nombre = rs.getString("Nombre");
               CCliente.TipoCompra = rs.getString("TipoCompra");

            }
        } 
        catch(Exception err)
        {
            System.err.println(err.getMessage());
        }
    }
    
    public void generalDocumentos()
    {
        try 
        {
            buscarCliente();
            String ruta = "C:/Users/Susanita/Documents/NetBeansProjects/Inventario/src/Facturas/"+Detalles.codigoMaster +"-"+CCliente.Cedula+"-Factura.txt";

            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("---------FACTURA-----------\n");
            bw.write("Cedula: "+CCliente.Cedula+ "\nNombre: "+ CCliente.Nombre+"\nTipo Compra: "+CCliente.TipoCompra+"\nFecha: "+formatter.format(date));

            bw.write("\n");
            bw.write("\n---------DETALLES----------");

            Execute Buscar = new Execute();

            String query = "select pro.Nombre,ventas.Cantidad,pro.precio as 'Precio Unitario', (pro.precio * ventas.Cantidad) Total  from productos pro inner join VentasDetalles ventas  on ventas.producto = pro.Codigo where ventas.CodigoMaster = "+Detalles.codigoMaster;

            CallableStatement  cts = Buscar.GetConnection().prepareCall(query);

            ResultSet rs=cts.executeQuery();
            int sumarioTotal = 0;
            while (rs.next())
            {
                if(sumarioTotal != 0)
                {   
                    bw.write("\n---------------------------");
                }
                
                String detalle =  "Nombre: " + rs.getString("Nombre") + "\nCantidad: "+rs.getString("Cantidad") +"\nPrecio: " + rs.getString("Precio Unitario")+"\nTotal: "+ rs.getString("Total");

                bw.write("\n"+detalle);
                
                
                sumarioTotal++;
            }
            
            bw.write("\n");
            
            bw.write("\n---------SUMARIO-----------\n");
            bw.write("Productos Totales: "+sumarioTotal+".00\n");
            bw.write("Precio Total: "+JLTotal.getText());
            
            bw.close();

        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
    
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalles().setVisible(true);
            }
        });
    }
    
    public void cargar()
    {
 
     Execute Buscar = new Execute();
     
       DefaultTableModel tabla= new DefaultTableModel();
       
       try{
            tabla.addColumn("Nombre");
            tabla.addColumn("Cantidad");
            tabla.addColumn("precio");
            tabla.addColumn("Total");
            
            CallableStatement  cts=Buscar.GetConnection().prepareCall("select pro.Nombre,ventas.Cantidad,pro.precio,(pro.precio * ventas.Cantidad) as Total from VentasDetalles ventas inner join Productos pro on pro.Codigo = ventas.producto inner join VentasMaster Maste on Maste.Codigo = ventas.CodigoMaster where Maste.Codigo = "+Detalles.codigoMaster);

            ResultSet r=cts.executeQuery();
            
       while (r.next()){
            Object dato[]=new  Object[4];
            
            for (int i=0; i<4; i++){
                dato[i]=r.getString(i+1);
            }
            
            tabla.addRow(dato);
       }
 
       jTable1.setModel(tabla);//jTable---jdatos
 
       }catch (Exception e)
       {
           System.err.println(e.getMessage());
       }
}
    
    public void llenarCProductos()
    {
        Execute Buscar = new Execute();
        
        try
        {
             CallableStatement  cts = Buscar.GetConnection().prepareCall("SELECT Codigo, Nombre FROM Productos");
            
            ResultSet rs=cts.executeQuery();
           while (rs.next()){
              jComboBox1.addItem(rs.getInt("Codigo") +" - "+ rs.getString("Nombre"));
              //combo.getItemCount(rs.getInt("codigo"));
            }
        } 
        catch(Exception err)
        {
            System.err.println(err.getMessage());
        }
        
    }
     
    public void SumarioTotal()
    {
        Execute Buscar = new Execute();
        
        try
        {   String query = "select ISNULL(sum((pro.precio * ventas.Cantidad)),0) as Total  from VentasDetalles ventas inner join Productos pro on pro.Codigo = ventas.producto where ventas.CodigoMaster = "+Detalles.codigoMaster;
 
        CallableStatement  cts = Buscar.GetConnection().prepareCall(query);
            
            ResultSet rs=cts.executeQuery();
           while (rs.next()){
              JLTotal.setText(rs.getString("Total") + ".00");
            }
        } 
        catch(Exception err)
        {
            System.err.println(err.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLTotal;
    private javax.swing.JTextField JTCantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
