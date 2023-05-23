/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import com.mycompany.crudcentroeducativo.Entidades.Alumno;
import com.mycompany.crudcentroeducativo.Entidades.Matricula;
import com.mycompany.crudcentroeducativo.Entidades.Unidad;
import com.mycompany.crudcentroeducativo.controladorDAO.AlumnoDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.MatriculaDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.UnidadDaoImp;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alejandrobalangutierrez
 */
public class frmTablaMatricula extends javax.swing.JFrame {

    /**
     * Creates new form frmTablaMatricula
     */
    private void CargaDesplegable(){
        try {
            comboUnidades.removeAllItems();
            
            for (Unidad unidad : UnidadDaoImp.getInstance().getAll()) {
                comboUnidades.addItem(unidad.getCodigo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmTablaMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public frmTablaMatricula() {
        initComponents();
        configTabla();
        cargaTabla();
        CargaDesplegable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMatriculas = new javax.swing.JTable();
        btnAddMatricula = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboUnidades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtBuscar.setText("Escribe y presiona Enter para buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        jtMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMatriculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMatriculas);

        btnAddMatricula.setText("Añadir Registro");
        btnAddMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMatriculaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA MATRICULAS");

        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUnidadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar)
                        .addGap(144, 144, 144)
                        .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(btnAddMatricula)
                        .addGap(43, 43, 43))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddMatricula)
                    .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("PULSANDO ENTER");
            buscarCampo();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jtMatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMatriculasMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                System.out.println("DOBLE CLIC");

                // Obtener el valor de la columna 0 (ID)
                int idMatricula = Integer.parseInt(jtMatriculas.getValueAt(jtMatriculas.getSelectedRow(), 0).toString());

                // Abrir formulario de frmMatricula y pasar el valor del ID
                frmMatricula matriculaForm = new frmMatricula();
                matriculaForm.setIdMatricula(idMatricula);
                matriculaForm.miTablaInterna=this;
                matriculaForm.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(frmTablaMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jtMatriculasMouseClicked

    private void btnAddMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMatriculaActionPerformed
        // TODO add your handling code here:
        frmMatricula matriculaForm = new frmMatricula();
                matriculaForm.miTablaInterna=this;
                matriculaForm.setVisible(true);
    }//GEN-LAST:event_btnAddMatriculaActionPerformed

    private void comboUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUnidadesActionPerformed
        // TODO add your handling code here:
        txtBuscar.setText((String) comboUnidades.getSelectedItem());
        buscarCampo();
    }//GEN-LAST:event_comboUnidadesActionPerformed

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
            java.util.logging.Logger.getLogger(frmTablaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTablaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTablaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTablaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTablaMatricula().setVisible(true);
            }
        });
    }

    private void configTabla() {
        String col[] = {"ID", "DNI ALUMNO", "NOMBRE ALUMNO", "CÓDIGO UNIDAD", "NOMBRE UNIDAD", "F. MATRICULA", "F. BAJA"};
        DefaultTableModel modelo = new DefaultTableModel(col, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jtMatriculas.setModel(modelo);
    }

    public void cargaTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jtMatriculas.getModel();
        MatriculaDaoImp matriculaDaoImp = MatriculaDaoImp.getInstance();
        AlumnoDaoImp alumnoDaoImp = AlumnoDaoImp.getInstance();
        UnidadDaoImp unidadDaoImp = UnidadDaoImp.getInstance();

        try {
            modelo.setNumRows(0);
            for (Matricula matricula : matriculaDaoImp.getAll()) {
                Alumno alumno = alumnoDaoImp.getById(matricula.getIdalumno());
                Unidad unidad = unidadDaoImp.getById(matricula.getIdunidad());

                Object[] lista = {
                    matricula.getIdmatricula(),
                    alumno.getDni(),
                    alumno.getNombre(),
                    unidad.getCodigo(),
                    unidad.getNombre(),
                    matricula.getFmatricula(),
                    matricula.getfBaja()
                };
                modelo.addRow(lista);
            }
        } catch (Exception e) {
        }
    }
    private void buscarCampo(){
        DefaultTableModel modelo = (DefaultTableModel) jtMatriculas.getModel();
            TableRowSorter<TableModel> trSorter = new TableRowSorter<>(modelo);

            jtMatriculas.setRowSorter(trSorter);

            if (txtBuscar.getText().length() == 0) {
                trSorter.setRowFilter(null);
            } else {
                trSorter.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().trim()));
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMatricula;
    private javax.swing.JComboBox<String> comboUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMatriculas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
