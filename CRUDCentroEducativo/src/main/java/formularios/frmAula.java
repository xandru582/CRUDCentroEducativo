/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import com.mycompany.crudcentroeducativo.Entidades.Aula;
import com.mycompany.crudcentroeducativo.controladorDAO.AulaDaoImp;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejandrobalangutierrez
 */
public class frmAula extends javax.swing.JFrame {

    /**
     * Creates new form frmAula
     */
    public frmTablaAula miTablaInterna;
    private Aula aulaInterna;
    private int idAulaInterno;
    public void setAula(Aula a){
        aulaInterna=a;
        cargarDatosAula();
    }
    /*public void setIdAula(int id) {
        this.idAulaInterno = id;
        // Puedes usar el ID para cargar los datos correspondientes en el formulario
        cargarDatosAula(idAulaInterno);
    }*/
    public frmAula() {
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
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAddPersonal = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aula");
        jLabel1.setToolTipText("");

        jLabel2.setText("Codigo");

        jLabel3.setText("Descripcion");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAddPersonal.setText("Añadir");
        btnAddPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonalActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRestablecer.setText("Restablecer");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnBuscar)
                    .addGap(18, 18, 18)
                    .addComponent(btnActualizar)
                    .addGap(18, 18, 18)
                    .addComponent(btnAddPersonal)
                    .addGap(18, 18, 18)
                    .addComponent(btnEliminar)
                    .addGap(18, 18, 18)
                    .addComponent(btnRestablecer)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 224, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(164, 164, 164)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnActualizar)
                        .addComponent(btnAddPersonal)
                        .addComponent(btnEliminar)
                        .addComponent(btnRestablecer))
                    .addContainerGap(165, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        aulaInterna = consultaAula();
        cargaCampos(aulaInterna);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if(aulaInterna!=null)updateAula();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAddPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonalActionPerformed
        // TODO add your handling code here:
        addAula();
    }//GEN-LAST:event_btnAddPersonalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (aulaInterna != null)
            eliminarAula();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        // TODO add your handling code here:
        RestablecerCampos();
    }//GEN-LAST:event_btnRestablecerActionPerformed

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
            java.util.logging.Logger.getLogger(frmAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAula().setVisible(true);
            }
        });
    }

    private void RestablecerCampos() {
        txtCodigo.setText("");
        txtDescripcion.setText("");
    }

    private void eliminarAula() {
        AulaDaoImp instanciaDaoImp = AulaDaoImp.getInstance();
        try {
            instanciaDaoImp.delete(aulaInterna.getId());
            miTablaInterna.cargaTabla();
        } catch (SQLException ex) {
            Logger.getLogger(frmAula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Aula consultaAula() {
        AulaDaoImp instanciaAulaDaoImp = AulaDaoImp.getInstance();
        try {
            
            return instanciaAulaDaoImp.getByCodigo(txtCodigo.getText());
            
        } catch (SQLException ex) {
            Logger.getLogger(frmAula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void cargaCampos(Aula aula) {
        if (aula != null) {
            txtCodigo.setText(aula.getCodigo());
            txtDescripcion.setText(aula.getDescripcion());
        }
    }

    private void updateAula() {
        AulaDaoImp instanciaAulaDaoImp = AulaDaoImp.getInstance();
        Aula aula = new Aula();
        aula.setId(aulaInterna.getId());
        aula.setCodigo(txtCodigo.getText());
        aula.setDescripcion(txtDescripcion.getText());

        try {
            instanciaAulaDaoImp.update(aula);
            miTablaInterna.cargaTabla();
        } catch (SQLException ex) {
            Logger.getLogger(frmAula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void addAula() {
    AulaDaoImp instanciaAulaDaoImp = AulaDaoImp.getInstance();
    Aula aula = new Aula();
    aula.setCodigo(txtCodigo.getText());
    aula.setDescripcion(txtDescripcion.getText());

    try {
        instanciaAulaDaoImp.add(aula);
        miTablaInterna.cargaTabla();
    } catch (SQLException ex) {
        Logger.getLogger(frmAula.class.getName()).log(Level.SEVERE, null, ex);
    }
}
/*private void cargarDatosAula(int id) {
        AulaDaoImp aulaDaoImp = AulaDaoImp.getInstance();

        try {
            // Obtener el aula por su ID
            Aula aula = aulaDaoImp.getById(id);

            // Cargar los datos en los campos correspondientes del formulario
            txtCodigo.setText(aula.getCodigo());
            txtDescripcion.setText(aula.getDescripcion());
            // Otras asignaciones de datos según tu estructura de aula
        } catch (SQLException e) {
            // Manejar cualquier excepción que ocurra durante la carga de datos
            e.printStackTrace();
        }
    }*/
    private void cargarDatosAula() {
    if (aulaInterna != null) {
        txtCodigo.setText(aulaInterna.getCodigo());
        txtDescripcion.setText(aulaInterna.getDescripcion());
        // Cargar los demás campos con los datos de aula, si es necesario
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAddPersonal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
