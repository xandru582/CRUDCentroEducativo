/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import com.mycompany.crudcentroeducativo.Entidades.CursoAcademico;
import com.mycompany.crudcentroeducativo.controladorDAO.CursoAcademicoDaoImp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejandrobalangutierrez
 */
public class frmCursoAcademico extends javax.swing.JFrame {

    /**
     * Creates new form frmCursoAcademico
     */
    public frmCursoAcademico() {
        initComponents();
        configTabla();
        cargaTabla();
        txtId.setVisible(false);
    }
    
    private  void configTabla(){
        String col[]={"ID","INICIO","FIN","DESCRIPCION"};
        
        DefaultTableModel modelo = new DefaultTableModel(col,0);
        jtCursos.setModel(modelo);
   
                
    }
    
    private void cargaTabla(){
        DefaultTableModel modelo = (DefaultTableModel)jtCursos.getModel();
        CursoAcademicoDaoImp daoCursoAcademico = CursoAcademicoDaoImp.getInstance();
        try {
            modelo.setNumRows(0);
            for (CursoAcademico curso : daoCursoAcademico.getAll()) {
            Object [] lista = {curso.getId(),curso.getYearinicio(),curso.getYearfin(),curso.getDescripcion()};
            modelo.addRow(lista);
        }
        } catch (Exception e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpcampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        txtFin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inicio");

        txtInicio.setText("jTextField1");

        jlabel.setText("Fin");

        txtFin.setText("jTextField1");

        jLabel2.setText("Descripcion");

        txtDescripcion.setText("jTextField1");

        txtId.setText("jTextField1");

        javax.swing.GroupLayout jpcamposLayout = new javax.swing.GroupLayout(jpcampos);
        jpcampos.setLayout(jpcamposLayout);
        jpcamposLayout.setHorizontalGroup(
            jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcamposLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jpcamposLayout.createSequentialGroup()
                        .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel)
                            .addGroup(jpcamposLayout.createSequentialGroup()
                                .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        jpcamposLayout.setVerticalGroup(
            jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpcamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Inicio", "Fin", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCursos);

        javax.swing.GroupLayout jpTablaLayout = new javax.swing.GroupLayout(jpTabla);
        jpTabla.setLayout(jpTablaLayout);
        jpTablaLayout.setHorizontalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpTablaLayout.setVerticalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTablaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        btnActualiza.setText("Actualiza");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });

        btnElimina.setText("Elimina");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpcampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnAgregar)
                .addGap(40, 40, 40)
                .addComponent(btnActualiza)
                .addGap(42, 42, 42)
                .addComponent(btnElimina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpcampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualiza)
                    .addComponent(btnElimina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
       addCursito();
        
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void jtCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosMouseClicked
        elementoSeleccionado();
    }//GEN-LAST:event_jtCursosMouseClicked

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
        // TODO add your handling code here:
        actualizaCurso();
        cargaTabla();
        
    }//GEN-LAST:event_btnActualizaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here:
        eliminaCurso();
    }//GEN-LAST:event_btnEliminaActionPerformed
    private void actualizaCurso(){
        CursoAcademicoDaoImp daoCursoAcademico = CursoAcademicoDaoImp.getInstance();
        CursoAcademico cursito = new CursoAcademico(Integer.parseInt(txtId.getText()), Integer.parseInt(txtInicio.getText()), Integer.parseInt(txtFin.getText()), txtDescripcion.getText());
        try {
            daoCursoAcademico.update(cursito);
            System.out.println(txtId.getText());
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        cargaTabla();
    }
    private void elementoSeleccionado(){
        DefaultTableModel modelo = (DefaultTableModel)jtCursos.getModel();
        
        jtCursos.getValueAt(jtCursos.getSelectedRow(),0);
        
        int numColumn=jtCursos.getColumnCount();
        CursoAcademico cursito;
        txtId.setText(String.valueOf(jtCursos.getValueAt(jtCursos.getSelectedRow(), 0)));
        txtInicio.setText(String.valueOf(jtCursos.getValueAt(jtCursos.getSelectedRow(),1)));
        txtFin.setText(String.valueOf(jtCursos.getValueAt(jtCursos.getSelectedRow(),2)));
        txtDescripcion.setText(String.valueOf(jtCursos.getValueAt(jtCursos.getSelectedRow(),3)));
    }
    private void eliminaCurso(){
        CursoAcademicoDaoImp daoCursoAcademico = CursoAcademicoDaoImp.getInstance();
        try {
            daoCursoAcademico.delete(Integer.parseInt(txtId.getText()));
            cargaTabla();
        } catch (Exception e) {
        }
        
        
    }
    private void addCursito(){
         CursoAcademicoDaoImp daoCursoAcademico = CursoAcademicoDaoImp.getInstance();
        try {
            DefaultTableModel modelo = (DefaultTableModel)jtCursos.getModel();
            
            CursoAcademico curso = new CursoAcademico(Integer.parseInt(txtInicio.getText()),Integer.parseInt(txtFin.getText()),txtDescripcion.getText());
            daoCursoAcademico.add(curso);
            //Object [] lista = {curso.getId(),curso.getYearinicio(),curso.getYearfin(),curso.getDescripcion()};
            //modelo.addRow(lista);
        } catch (Exception e) {
        }
        cargaTabla();
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
            java.util.logging.Logger.getLogger(frmCursoAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCursoAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCursoAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCursoAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCursoAcademico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JPanel jpcampos;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtInicio;
    // End of variables declaration//GEN-END:variables
}