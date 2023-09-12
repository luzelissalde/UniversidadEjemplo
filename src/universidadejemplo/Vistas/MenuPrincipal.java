/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadejemplo.Vistas;

/**
 *
 * @author USURIO
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMFormularioAlumno = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMFormularioMateria = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMManejoInscripcion = new javax.swing.JMenuItem();
        jMManipulacionNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMAlumnosMateria = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMFormularioAlumno.setText("Formulario de Alumno");
        jMFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMFormularioAlumno);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");
        jMMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMateriaActionPerformed(evt);
            }
        });

        jMFormularioMateria.setText("Formulario de Materia");
        jMMateria.add(jMFormularioMateria);

        jMenuBar1.add(jMMateria);

        jMAdministracion.setText("Administracion");

        jMManejoInscripcion.setText("Manejo de Inscripcion");
        jMAdministracion.add(jMManejoInscripcion);

        jMManipulacionNotas.setText("Manipulacion de notas");
        jMAdministracion.add(jMManipulacionNotas);

        jMenuBar1.add(jMAdministracion);

        jMConsultas.setText("Consultas");

        jMAlumnosMateria.setText("Alumnos por Materia");
        jMConsultas.add(jMAlumnosMateria);

        jMenuBar1.add(jMConsultas);

        jMSalir.setText("Salir");
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaAlumno alumnoView = new vistaAlumno();
        alumnoView.setVisible(true);
        escritorio.add(alumnoView);
        escritorio.moveToFront(alumnoView);
    }//GEN-LAST:event_jMFormularioAlumnoActionPerformed

    private void jMMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaMateria materiaView = new vistaMateria();
        materiaView.setVisible(true);
        escritorio.add(materiaView);
        escritorio.moveToFront(materiaView);
    }//GEN-LAST:event_jMMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenuItem jMAlumnosMateria;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMFormularioAlumno;
    private javax.swing.JMenuItem jMFormularioMateria;
    private javax.swing.JMenuItem jMManejoInscripcion;
    private javax.swing.JMenuItem jMManipulacionNotas;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
