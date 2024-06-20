/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;





import com.mycompany.biblioteca.SaveUsuarios;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;






/**
 *
 * @author NelsonRO
 */
public  class Ingresousuarios extends javax.swing.JPanel {

   
    /**
     * Creates new form formparasuarios
     */
    public Ingresousuarios() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnombre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdireccion = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtfechanacimiento = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txttelefono = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtfecharegistro = new javax.swing.JTextPane();
        btnguardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Nuevo Usuario");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Registro");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 60)));
        txtnombre.setToolTipText("Escriba el nombre");
        txtnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtnombre);
        txtnombre.getAccessibleContext().setAccessibleName("");

        txtdireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 60)));
        jScrollPane2.setViewportView(txtdireccion);

        txtfechanacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 60)));
        txtfechanacimiento.setToolTipText("Ejemplo.28-12-1999");
        jScrollPane3.setViewportView(txtfechanacimiento);

        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        txttelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 60)));
        txttelefono.setToolTipText("xx-xx-xx-xx");
        jScrollPane4.setViewportView(txttelefono);

        txtfecharegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 60)));
        txtfecharegistro.setToolTipText("Ejemplo.28-12-1999");
        jScrollPane5.setViewportView(txtfecharegistro);

        btnguardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 50)));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
      
 

    
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        
        String nombre1 = txtnombre.getText();
        String fechaNacimientoStr = txtfechanacimiento.getText();
        String direccion1 = txtdireccion.getText();
        String telefonoStr = txttelefono.getText();
        String fechaRegistroStr = txtfecharegistro.getText();
        
        if (nombre1.isEmpty() || fechaNacimientoStr.isEmpty() || direccion1.isEmpty() ||
        telefonoStr.isEmpty() || fechaRegistroStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        return; // Salir del método si algún campo está vacío
    }
     
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        dateFormat.setLenient(false); // Para un formato de fecha estricto
            
        try {
        Date fechaNacimiento = dateFormat.parse(fechaNacimientoStr);
        Date fechaRegistro = dateFormat.parse(fechaRegistroStr);
        java.sql.Date sqlfechaNacimiento = new java.sql.Date(fechaNacimiento.getTime());
        java.sql.Date sqlfechaRegistro = new java.sql.Date(fechaRegistro.getTime());
            int telefono1 = Integer.parseInt(telefonoStr);
            
            SaveUsuarios saveusuarios = new SaveUsuarios();
            saveusuarios.saveData(nombre1, sqlfechaNacimiento, direccion1, telefono1, sqlfechaRegistro);
            
           JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
        //limpia los cuadros de texto   
        txtnombre.setText("");
        txtfechanacimiento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtfecharegistro.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error en el formato del teléfono: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Error en el formato de la fecha: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error en los datos ingresados: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        
    
    }//GEN-LAST:event_btnguardarActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane txtdireccion;
    private javax.swing.JTextPane txtfechanacimiento;
    private javax.swing.JTextPane txtfecharegistro;
    private javax.swing.JTextPane txtnombre;
    private javax.swing.JTextPane txttelefono;
    // End of variables declaration//GEN-END:variables

    

  

}