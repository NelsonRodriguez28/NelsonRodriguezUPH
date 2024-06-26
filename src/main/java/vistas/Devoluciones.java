/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import com.mycompany.biblioteca.Cconexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author NelsonRO
 */
public class Devoluciones extends javax.swing.JPanel {

    /**
     * Creates new form devoluciones
     */
    public Devoluciones() {
        initComponents();
        Cconexion conexion = new Cconexion();//inicializa la conexion
        restrictToNumbers(jTextPane1); //hace que solo se pueda escribir numeros enteros
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        btnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btndevolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidlibro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtidusuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfechaprestamo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnombrelibro = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnombreusuario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Devoluciones");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ID DE PRESTAMO");

        jScrollPane1.setViewportView(jTextPane1);

        btnbuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Detalles del Prestamo");

        btndevolver.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btndevolver.setText("DEVOLVER");
        btndevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndevolverActionPerformed(evt);
            }
        });

        txtidlibro.setBackground(new java.awt.Color(0, 0, 0));
        txtidlibro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtidlibro.setForeground(new java.awt.Color(102, 0, 102));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("ID libro");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("ID usuario");

        txtidusuario.setBackground(new java.awt.Color(0, 0, 0));
        txtidusuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtidusuario.setForeground(new java.awt.Color(102, 0, 102));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de Prestamo");

        txtfechaprestamo.setBackground(new java.awt.Color(0, 0, 0));
        txtfechaprestamo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtfechaprestamo.setForeground(new java.awt.Color(102, 0, 102));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Nombre del libro");

        txtnombrelibro.setBackground(new java.awt.Color(0, 0, 0));
        txtnombrelibro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnombrelibro.setForeground(new java.awt.Color(102, 0, 102));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Nombre del Usuario");

        txtnombreusuario.setBackground(new java.awt.Color(0, 0, 0));
        txtnombreusuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnombreusuario.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtnombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(26, 26, 26)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndevolver))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel4)))
                        .addContainerGap(623, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscar)
                        .addComponent(btndevolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   //no deja que se escriba otro caracter que no sean numeros enteros
    private void restrictToNumbers(javax.swing.JTextPane textPane) {
        textPane.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                handleInput(e);
            }

            public void removeUpdate(DocumentEvent e) {
                handleInput(e);
            }

            public void changedUpdate(DocumentEvent e) {
                handleInput(e);
            }

            private void handleInput(DocumentEvent e) {
                javax.swing.SwingUtilities.invokeLater(() -> {
                    String text = textPane.getText();
                    if (!text.matches("\\d*")) {
                        textPane.setText(text.replaceAll("[^\\d]", ""));
                    }
                });
            }
        });
    }
    
    
    
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
         String idPrestamo = jTextPane1.getText();
        if (idPrestamo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID de préstamo");
            return;
        }

        Connection conn = Cconexion.establecerConexion();
        try {
            String query = "SELECT p.idlibro, l.nombre AS nombre_libro, p.idusuarios, u.nombre AS nombre_usuario, p.fecha_prestamo "
                 + "FROM prestamos p "
                 + "JOIN libros l ON p.idlibro = l.idlibro "
                 + "JOIN usuarios u ON p.idusuarios = u.idusuarios "
                 + "WHERE p.id_prestamo = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, idPrestamo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                txtidlibro.setText(rs.getString("idlibro"));
                txtidusuario.setText(rs.getString("idusuarios"));
                txtfechaprestamo.setText(rs.getString("fecha_prestamo"));
                txtnombreusuario.setText(rs.getString("nombre_usuario"));
                txtnombrelibro.setText(rs.getString("nombre_libro"));
            } else {
                JOptionPane.showMessageDialog(this, "Préstamo no encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btndevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndevolverActionPerformed
        String idPrestamo = jTextPane1.getText();
    if (idPrestamo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un ID de préstamo");
        return;
    }

    Connection conn = Cconexion.establecerConexion();
    try {
        // Consulta para verificar si el préstamo ya fue entregado
        String queryCheck = "SELECT fecha_entrega FROM prestamos WHERE id_prestamo = ?";
        PreparedStatement stmtCheck = conn.prepareStatement(queryCheck);
        stmtCheck.setString(1, idPrestamo);
        ResultSet rsCheck = stmtCheck.executeQuery();

        if (rsCheck.next()) {
            // Verificar si fecha_entrega tiene valor
            if (rsCheck.getString("fecha_entrega") != null) {
                JOptionPane.showMessageDialog(this, "Este préstamo ya ha sido devuelto anteriormente.");
                jTextPane1.setText("");
                txtidlibro.setText("");
                txtidusuario.setText("");
                txtfechaprestamo.setText("");
                txtnombreusuario.setText("");
                txtnombrelibro.setText("");
                return; // Terminar la ejecución del método
   
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID de préstamo no encontrado.");
            return; // Terminar la ejecución del método
        }

        // Si no se ha devuelto antes, procedemos con la actualización
        String queryUpdate = "UPDATE prestamos SET fecha_entrega = ? WHERE id_prestamo = ?";
        PreparedStatement stmtUpdate = conn.prepareStatement(queryUpdate);
        stmtUpdate.setString(1, LocalDate.now().toString());
        stmtUpdate.setString(2, idPrestamo);
        int rowsUpdated = stmtUpdate.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Devolución registrada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar la devolución.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Limpiar campos después de devolver
    jTextPane1.setText("");
    txtidlibro.setText("");
    txtidusuario.setText("");
    txtfechaprestamo.setText("");
    txtnombreusuario.setText("");
    txtnombrelibro.setText("");
    }//GEN-LAST:event_btndevolverActionPerformed

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btndevolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel txtfechaprestamo;
    private javax.swing.JLabel txtidlibro;
    private javax.swing.JLabel txtidusuario;
    private javax.swing.JLabel txtnombrelibro;
    private javax.swing.JLabel txtnombreusuario;
    // End of variables declaration//GEN-END:variables
}
