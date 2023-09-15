/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.Entidades.*;
import universidadejemplo.accesoADatos.*;

/**
 *
 * @author USURIO
 */
public class VistaFormularioInscripcion extends javax.swing.JInternalFrame {

    AlumnoData alumno;
    InscripcionData inscripcion;
    MateriaData materia;
    DefaultTableModel modelo = new DefaultTableModel();

    public VistaFormularioInscripcion() {
        initComponents();
        cargarCombo();
        cargarTabla();
        setMaximizable(true);
        radioBotones();
        setClosable(true);
        setMaximizable(true);

    }

    public void radioBotones() {
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(jRMatInscriptas);
        grupo.add(jRMatNoInscriptas);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jRMatInscriptas = new javax.swing.JRadioButton();
        jBNuevo = new javax.swing.JButton();
        jAnular = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRMatNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione un alumno");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario de Inscripcion");

        jRMatInscriptas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRMatInscriptas.setText("Materias Inscriptas");
        jRMatInscriptas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRMatInscriptasFocusGained(evt);
            }
        });
        jRMatInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMatInscriptasActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jBNuevo.setText("Inscribir");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jAnular.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jAnular.setText("Anular Inscricion");
        jAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnularActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        cbAlumnos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Listado de Materias");

        jRMatNoInscriptas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRMatNoInscriptas.setText("Materias no Inscriptas");
        jRMatNoInscriptas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRMatNoInscriptasFocusGained(evt);
            }
        });
        jRMatNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMatNoInscriptasActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRMatInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(jRMatNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBNuevo)
                                .addGap(28, 28, 28)
                                .addComponent(jAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMatInscriptas)
                    .addComponent(jRMatNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jAnular)
                    .addComponent(jBSalir))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRMatInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMatInscriptasActionPerformed
        inscripcion = new InscripcionData();
        materia = new MateriaData();
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

        borrarFilas();
        for (Materia prod : inscripcion.obtenerMateriasCursadas(alumn.getIdAlumno())) {

            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

        }
        jBNuevo.setEnabled(false);
        jAnular.setEnabled(true);

    }//GEN-LAST:event_jRMatInscriptasActionPerformed

    private void jRMatNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMatNoInscriptasActionPerformed
        inscripcion = new InscripcionData();
//        materia = new MateriaData();
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

        borrarFilas();
        for (Materia prod : inscripcion.obtenerMateriasNOCursadas(alumn.getIdAlumno())) {

            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

        }
        jBNuevo.setEnabled(true);
        jAnular.setEnabled(false);
    }//GEN-LAST:event_jRMatNoInscriptasActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();
        Inscripcion insc = new Inscripcion();
        materia = new MateriaData();
        inscripcion = new InscripcionData();

        insc.setAlumno(alumn);
        insc.setMateria(materia.buscarMateria((int) modelo.getValueAt(jTabla.getSelectedRow(), 0)));
        insc.setNota(0);

        inscripcion.guardarIncripcion(insc);

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnularActionPerformed
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();
//        Inscripcion insc = new Inscripcion();
//        materia = new MateriaData();
        inscripcion = new InscripcionData();

        inscripcion.borrarInscripcionMateriaAlumno(alumn.getIdAlumno(), (int) modelo.getValueAt(jTabla.getSelectedRow(), 0));
    }//GEN-LAST:event_jAnularActionPerformed

    private void jRMatNoInscriptasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRMatNoInscriptasFocusGained
        inscripcion = new InscripcionData();
//        materia = new MateriaData();
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

        borrarFilas();
        for (Materia prod : inscripcion.obtenerMateriasNOCursadas(alumn.getIdAlumno())) {

            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

        }
        jBNuevo.setEnabled(true);
        jAnular.setEnabled(false);
    }//GEN-LAST:event_jRMatNoInscriptasFocusGained

    private void jRMatInscriptasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRMatInscriptasFocusGained
        inscripcion = new InscripcionData();
        materia = new MateriaData();
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

        borrarFilas();
        for (Materia prod : inscripcion.obtenerMateriasCursadas(alumn.getIdAlumno())) {

            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

        }
        jBNuevo.setEnabled(false);
        jAnular.setEnabled(true);
    }//GEN-LAST:event_jRMatInscriptasFocusGained

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        if (jRMatInscriptas.isSelected()) {
            inscripcion = new InscripcionData();
            materia = new MateriaData();
            Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

            borrarFilas();
            for (Materia prod : inscripcion.obtenerMateriasCursadas(alumn.getIdAlumno())) {

                modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

            }
        } else if (jRMatNoInscriptas.isSelected()) {
            inscripcion = new InscripcionData();
//        materia = new MateriaData();
            Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

            borrarFilas();
            for (Materia prod : inscripcion.obtenerMateriasNOCursadas(alumn.getIdAlumno())) {

                modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

            }
        }
    }//GEN-LAST:event_cbAlumnosActionPerformed

    public void cargarCombo() {
        alumno = new AlumnoData();
        DefaultComboBoxModel<Alumno> mdlCombo = new DefaultComboBoxModel(alumno.listarAlumnos().toArray());
        cbAlumnos.setModel(mdlCombo);
    }

    public void cargarTabla() {

        jTabla.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
    }

    private void borrarFilas() {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JButton jAnular;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRMatInscriptas;
    private javax.swing.JRadioButton jRMatNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}


/*
int filaSeleccionada = jTalumno.getSelectedRow();
        if(filaSeleccionada !=-1){
            int matricula = (Integer)jTalumno.getValueAt(filaSeleccionada, 0);
            String apellido = (String)jTalumno.getValueAt(filaSeleccionada, 1);
            String nombre = (String)jTalumno.getValueAt(filaSeleccionada, 2);
            
            jTmatricula.setText(matricula+"");
            jTapellido.setText(apellido);
            jTnombre.setText(nombre);
        }
 */
