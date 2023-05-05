/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package formularios;

import com.mycompany.crudcentroeducativo.BD.MyDataSource;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author alejandrobalangutierrez
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH );
        generaMenuCursosAcademicos();
    }
    
    private void generaMenuCursosAcademicos(){
        try {
            String sql = "select distinct yearinicio,id from cursoacademico order by yearinicio desc";
            Connection cn = MyDataSource.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            ButtonGroup brgCursosAcademicos = new ButtonGroup();
            
            while (rs.next()) {
                JRadioButtonMenuItem jrb = new JRadioButtonMenuItem(("Curso: "+rs.getString("yearinicio")+" - "+(Integer.parseInt(rs.getString("yearinicio"))+1)),true);
                jrb.setName(rs.getString("id"));
                menuCursoAcademico.add(jrb);
                brgCursosAcademicos.add(jrb);
                
                jrb.addItemListener(new ItemListener(){
                
                    public void itemStateChanged(ItemEvent e){
                        JRadioButtonMenuItem jrbSelected =(JRadioButtonMenuItem)e.getItem();
                        
                        System.out.println(""+jrbSelected.getText());
                        System.out.println(""+jrbSelected.getName());
                    }
                });
            }
            
           
            
            rs.close();
            pstm.close();
            
            //menuCursoAcademico.add(a)
        } catch (SQLException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
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

        pnldEscritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        optmCursoAcademico = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        optmAlumno = new javax.swing.JMenuItem();
        menuCursoAcademico = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Parametrizacion");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Mantenimiento");

        optmCursoAcademico.setMnemonic('t');
        optmCursoAcademico.setText("Curso Academico");
        optmCursoAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optmCursoAcademicoActionPerformed(evt);
            }
        });
        editMenu.add(optmCursoAcademico);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Curso");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        optmAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        optmAlumno.setMnemonic('p');
        optmAlumno.setText("Alumnos");
        optmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optmAlumnoActionPerformed(evt);
            }
        });
        editMenu.add(optmAlumno);

        menuBar.add(editMenu);

        menuCursoAcademico.setText("Año Academico");
        menuBar.add(menuCursoAcademico);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Acerca de");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnldEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnldEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        
        frmAcercaDeDialogo frmAcerca = new frmAcercaDeDialogo(this, rootPaneCheckingEnabled);
        frmAcerca.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void optmCursoAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optmCursoAcademicoActionPerformed
        // TODO add your handling code here:
        frmCursoAcademico frmCursoAca = new frmCursoAcademico();
        frmCursoAca.setVisible(true);
    }//GEN-LAST:event_optmCursoAcademicoActionPerformed

    private void optmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optmAlumnoActionPerformed
        // TODO add your handling code here:
        
       /* for (JInternalFrame object :  pnldEscritorio.getAllFrames()) {
            if (object.getClass().equals(frmInternoAlumnos.class)) {
                System.out.println("YA AÑADIDO");
                return;
            }
        }*/
        frmInternoAlumnos frmAlum = new frmInternoAlumnos();
        //frmAlumnos frmAlum = new frmAlumnos();
        compruebaFrame(frmAlum, pnldEscritorio);
        
        pnldEscritorio.add(frmAlum);
        
        
        frmAlum.show();
        
    }//GEN-LAST:event_optmAlumnoActionPerformed
    public void compruebaFrame(JInternalFrame objeFrame, JDesktopPane panel){
        for (JInternalFrame object : panel.getAllFrames()) {
            if(object.getClass().equals(panel.getClass())){
                System.out.println("EXISTE");
                return;
            }
        }
        panel.add(objeFrame);
        for (JInternalFrame object : panel.getAllFrames()) {
            if(objeFrame.equals(object))
                object.show();
        }
        objeFrame.show();
        
        
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCursoAcademico;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem optmAlumno;
    private javax.swing.JMenuItem optmCursoAcademico;
    private javax.swing.JDesktopPane pnldEscritorio;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
