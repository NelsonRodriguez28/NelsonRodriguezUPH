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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author NelsonRO
 */
public class Reportes extends javax.swing.JPanel {

    private JTable table;
    private DefaultTableModel tableModel; 
    private TableRowSorter<DefaultTableModel> rowSorter;
   
    /**
     * Creates new form Reportes
     */
    public Reportes() {
        initComponents();
        String[] columnTitles = {"ID PRESTAMO", "ID LIBRO", "NOMBRE", "ID USUARIO", "NOMBRE", "FECHA DE PRESTAMO", "FECHA DE DEVOLUCION"};
         // Inicializar el modelo de la tabla con los títulos de las columnas
        tableModel = new DefaultTableModel(null, columnTitles);
        jTable1.setModel(tableModel);
        tableModel = (DefaultTableModel) jTable1.getModel();
        
        loadTableData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PRESTAMOS DE LIBROS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Title 5");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Title 6");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

 
    private void loadTableData() {
    Connection conn = Cconexion.establecerConexion();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);  // Limpiar la tabla

    try {
        String query = "SELECT  p.id_prestamo, p.idlibro, l.nombre AS nombre_libro, p.idusuarios, u.nombre AS nombre_usuario, p.fecha_prestamo, p.fecha_entrega "
                     + "FROM prestamos p "
                     + "JOIN libros l ON p.idlibro = l.idlibro "
                     + "JOIN usuarios u ON p.idusuarios = u.idusuarios";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String idPrestamo = rs.getString("id_prestamo");
            String idLibro = rs.getString("idlibro");
            String nombreLibro = rs.getString("nombre_libro");
            String idUsuario = rs.getString("idusuarios");
            String nombreUsuario = rs.getString("nombre_usuario");
            String fechaPrestamo = rs.getString("fecha_prestamo");
            String fechaEntrega = rs.getString("fecha_entrega") != null ? rs.getString("fecha_entrega") : "No devuelto";

            model.addRow(new Object[]{idPrestamo, idLibro, nombreLibro, idUsuario, nombreUsuario, fechaPrestamo, fechaEntrega});
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } 
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

  
}
