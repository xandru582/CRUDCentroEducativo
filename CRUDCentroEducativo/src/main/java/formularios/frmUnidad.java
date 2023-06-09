/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import com.mycompany.crudcentroeducativo.Entidades.Aula;
import com.mycompany.crudcentroeducativo.Entidades.Curso;
import com.mycompany.crudcentroeducativo.Entidades.Personal;
import com.mycompany.crudcentroeducativo.Entidades.Unidad;
import com.mycompany.crudcentroeducativo.controladorDAO.AulaDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.CursoDao;
import com.mycompany.crudcentroeducativo.controladorDAO.CursoDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.PersonalDaoImp;
import com.mycompany.crudcentroeducativo.controladorDAO.UnidadDaoImp;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandrobalangutierrez
 */
public class frmUnidad extends javax.swing.JFrame {

    private Unidad miUnidad;
    public frmTablaUnidad miTablaInterna;
    public void setUnidad(Unidad u) {
        miUnidad = u;
        cargaCampos();
    }

    /**
     * Creates new form frmUnidad
     */
    public frmUnidad() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoUnidad = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombreUnidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDniPersonal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoAula = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreCurso = new javax.swing.JTextField();
        txtNombreTutor = new javax.swing.JTextField();
        txtNombreAula = new javax.swing.JTextField();
        btnAddUnidad = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNIDAD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("Codigo");

        txtCodigoUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUnidadActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        txtNombreUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUnidadActionPerformed(evt);
            }
        });

        jLabel4.setText("Observaciones");

        txtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservacionesActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo Curso");

        txtCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCursoActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI Personal");

        txtDniPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniPersonalActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo Aula");

        txtCodigoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAulaActionPerformed(evt);
            }
        });

        jLabel3.setText("DETALLES");

        jLabel8.setText("Nombre del Curso");

        jLabel9.setText("Nombre del Tutor");

        jLabel10.setText("Nombre del Aula");

        txtNombreCurso.setEditable(false);

        txtNombreTutor.setEditable(false);

        txtNombreAula.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCurso)
                    .addComponent(txtNombreTutor)
                    .addComponent(txtNombreAula, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddUnidad.setText("Añadir");
        btnAddUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUnidadActionPerformed(evt);
            }
        });

        btnRestablecer.setText("Restablecer");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnDetalles.setText("Detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtDniPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddUnidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestablecer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetalles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDniPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUnidad)
                    .addComponent(btnRestablecer)
                    .addComponent(btnEliminar)
                    .addComponent(btnDetalles)
                    .addComponent(btnActualizar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUnidadActionPerformed

    private void txtNombreUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUnidadActionPerformed

    private void txtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservacionesActionPerformed

    private void txtCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCursoActionPerformed

    private void txtDniPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniPersonalActionPerformed

    private void txtCodigoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAulaActionPerformed

    private void btnAddUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUnidadActionPerformed
        // TODO add your handling code here:
        addUnidad();
        cargaCampos();

    }//GEN-LAST:event_btnAddUnidadActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        // TODO add your handling code here:
        restablecerCampos();
        
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        deleteUnidad();
        cargaCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        // TODO add your handling code here:
        cargarDetalles();
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizarUnidad();
        cargaCampos();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUnidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUnidad().setVisible(true);
            }
        });
    }

    private void addUnidad() {
        String codigoUnidad = txtCodigoUnidad.getText();
        String nombreUnidad = txtNombreUnidad.getText();
        String observaciones = txtObservaciones.getText();
        String codigoCurso = txtCodigoCurso.getText();
        String dniPersonal = txtDniPersonal.getText();
        String codigoAula = txtCodigoAula.getText();
        System.out.println(Integer.parseInt(codigoCurso));
        try {
            CursoDaoImp cursoDao = CursoDaoImp.getInstance();
            System.out.println(Integer.parseInt(codigoCurso));
            Curso curso = cursoDao.getById(Integer.parseInt(codigoCurso));

            if (curso == null) {
                JOptionPane.showMessageDialog(this, "El código de curso no es válido");
                return;
            }

            PersonalDaoImp personalDao = PersonalDaoImp.getInstance();
            Personal tutor = personalDao.getByDni(dniPersonal);

            if (tutor == null) {
                JOptionPane.showMessageDialog(this, "El DNI del tutor no es válido");
                return;
            }

            AulaDaoImp aulaDao = AulaDaoImp.getInstance();
            Aula aula = aulaDao.getById(Integer.parseInt(codigoAula));

            if (aula == null) {
                JOptionPane.showMessageDialog(this, "El código de aula no es válido");
                return;
            }

            Unidad unidad = new Unidad();
            unidad.setCodigo(codigoUnidad);
            unidad.setNombre(nombreUnidad);
            unidad.setObservaciones(observaciones);
            unidad.setIdCurso(curso.getId());
            unidad.setIdTutor(tutor.getId());
            unidad.setIdAula(aula.getId());

            UnidadDaoImp unidadDao = UnidadDaoImp.getInstance();
            unidadDao.add(unidad);

            JOptionPane.showMessageDialog(this, "La unidad se ha agregado correctamente");
            restablecerCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar la unidad: " + ex.getMessage());
        }
    }

    private void restablecerCampos() {
        txtCodigoUnidad.setText("");
        txtNombreUnidad.setText("");
        txtObservaciones.setText("");
        txtCodigoCurso.setText("");
        txtDniPersonal.setText("");
        txtCodigoAula.setText("");
    }

    public Unidad consultaUnidad(String codigo) {
        try {
            UnidadDaoImp unidadDao = UnidadDaoImp.getInstance();
            Unidad unidad = unidadDao.getByCodigo(codigo);

            if (unidad != null) {
                //JOptionPane.showMessageDialog(this, "Unidad encontrada", "Consulta exitosa", JOptionPane.INFORMATION_MESSAGE);
                return unidad;
            } else {
                JOptionPane.showMessageDialog(this, "La unidad no existe", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al consultar la unidad", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    private void deleteUnidad() {
        miUnidad = consultaUnidad(txtCodigoUnidad.getText());
        if (miUnidad != null) {
            try {
                UnidadDaoImp unidadDao = UnidadDaoImp.getInstance();
                int idUnidad = miUnidad.getId();
                unidadDao.delete(idUnidad);
                JOptionPane.showMessageDialog(this, "La unidad ha sido eliminada correctamente");
                restablecerCampos();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar la unidad: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay una unidad seleccionada para eliminar");
        }
    }

    private void cargarDetalles() {

        if (miUnidad != null) {
            try {
                CursoDaoImp cursoDao = CursoDaoImp.getInstance();
                Curso curso = cursoDao.getById(miUnidad.getIdCurso());
                if (curso != null) {
                    txtNombreCurso.setText(curso.getNombre());
                }

                PersonalDaoImp personalDao = PersonalDaoImp.getInstance();
                Personal tutor = personalDao.getById(miUnidad.getIdTutor());
                if (tutor != null) {
                    txtNombreTutor.setText(tutor.getNombre());
                }

                AulaDaoImp aulaDao = AulaDaoImp.getInstance();
                Aula aula = aulaDao.getById(miUnidad.getIdAula());
                if (aula != null) {
                    txtNombreAula.setText(aula.getCodigo());
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los detalles: " + ex.getMessage());
            }
        } else {
            txtNombreCurso.setText("");
            txtNombreTutor.setText("");
            txtNombreAula.setText("");
        }
    }

    private void cargaCampos() {
        if (miUnidad != null) {
            txtCodigoUnidad.setText(miUnidad.getCodigo());
            txtNombreUnidad.setText(miUnidad.getNombre());
            txtObservaciones.setText(miUnidad.getObservaciones());

            // Obtener los valores de los códigos en lugar de los IDs
            try {
                CursoDaoImp cursoDao = CursoDaoImp.getInstance();
                Curso curso = cursoDao.getById(miUnidad.getIdCurso());
                if (curso != null) {
                    txtCodigoCurso.setText(curso.getCodigo());
                }

                PersonalDaoImp personalDao = PersonalDaoImp.getInstance();
                Personal tutor = personalDao.getById(miUnidad.getIdTutor());
                if (tutor != null) {
                    txtDniPersonal.setText(tutor.getDni());
                }

                AulaDaoImp aulaDao = AulaDaoImp.getInstance();
                Aula aula = aulaDao.getById(miUnidad.getIdAula());
                if (aula != null) {
                    txtCodigoAula.setText(aula.getCodigo());
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar los detalles: " + ex.getMessage());
            }
        } else {
            restablecerCampos();
        }
    }

    private void actualizarUnidad() {
        if (miUnidad != null) {
            String codigoUnidad = txtCodigoUnidad.getText();
            String nombreUnidad = txtNombreUnidad.getText();
            String observaciones = txtObservaciones.getText();
            String codigoCurso = txtCodigoCurso.getText();
            String dniPersonal = txtDniPersonal.getText();
            String codigoAula = txtCodigoAula.getText();

            try {
                CursoDaoImp cursoDao = CursoDaoImp.getInstance();
                Curso curso = cursoDao.getByCodigo(codigoCurso);

                if (curso == null) {
                    JOptionPane.showMessageDialog(this, "El código de curso no es válido");
                    return;
                }

                PersonalDaoImp personalDao = PersonalDaoImp.getInstance();
                Personal tutor = personalDao.getByDni(dniPersonal);

                if (tutor == null) {
                    JOptionPane.showMessageDialog(this, "El DNI del tutor no es válido");
                    return;
                }

                AulaDaoImp aulaDao = AulaDaoImp.getInstance();
                Aula aula = aulaDao.getByCodigo(codigoAula);

                if (aula == null) {
                    JOptionPane.showMessageDialog(this, "El código de aula no es válido");
                    return;
                }

                // Obtener información adicional de la base de datos
                Curso cursoFromDb = cursoDao.getById(curso.getId());
                Personal tutorFromDb = personalDao.getByDni(tutor.getDni());
                Aula aulaFromDb = aulaDao.getByCodigo(aula.getCodigo());

                if (cursoFromDb == null || tutorFromDb == null || aulaFromDb == null) {
                    JOptionPane.showMessageDialog(this, "No se pudo obtener la información completa de la base de datos");
                    return;
                }

                miUnidad.setCodigo(codigoUnidad);
                miUnidad.setNombre(nombreUnidad);
                miUnidad.setObservaciones(observaciones);
                miUnidad.setIdCurso(cursoFromDb.getId());
                miUnidad.setIdTutor(tutorFromDb.getId());
                miUnidad.setIdAula(aulaFromDb.getId());

                UnidadDaoImp unidadDao = UnidadDaoImp.getInstance();
                unidadDao.update(miUnidad);

                JOptionPane.showMessageDialog(this, "La unidad se ha actualizado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al actualizar la unidad: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay una unidad seleccionada para actualizar");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAddUnidad;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCodigoAula;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCodigoUnidad;
    private javax.swing.JTextField txtDniPersonal;
    private javax.swing.JTextField txtNombreAula;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNombreTutor;
    private javax.swing.JTextField txtNombreUnidad;
    private javax.swing.JTextField txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
