/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;
import universidadejemplo.accesoADatos.AlumnoData;
import universidadejemplo.accesoADatos.InscripcionData;
import universidadejemplo.accesoADatos.MateriaData;

/**
 *
 * @author Micaela
 */
public class ConsultaAlumnoMateria extends javax.swing.JInternalFrame {

    InscripcionData inscripcion;
    MateriaData materia;
    AlumnoData alumno;
    DefaultTableModel modelo = new DefaultTableModel();

    public ConsultaAlumnoMateria() {
        initComponents();
        cargarCombo();
        cargarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBmateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione una materia:");

        jCBmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBmateriaActionPerformed(evt);
            }
        });

        jTabla.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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

        jBsalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(jCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBsalir)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBsalir)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCBmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBmateriaActionPerformed
        inscripcion = new InscripcionData();
        alumno = new AlumnoData();
        Materia mat = (Materia) jCBmateria.getSelectedItem();
        System.out.println(mat.getIdMateria());
        borrarFilas();
        for (Alumno prod : inscripcion.obtenerAlumnosXMateria(mat.getIdMateria())) {
//            System.out.println("ID de Alumno: " + prod.getIdAlumno());
//            System.out.println("DNI del Alumno: " + prod.getDni());
//            System.out.println("Apellido del Alumno: " + prod.getApellido());
//            System.out.println("Nombre del Alumno: " + prod.getNombre());
            modelo.addRow(new Object[]{prod.getIdAlumno(), prod.getDni(), prod.getApellido(), prod.getNombre()});
        }
        
    }//GEN-LAST:event_jCBmateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Materia> jCBmateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables

    public void cargarCombo() {
        materia = new MateriaData();
        DefaultComboBoxModel<Materia> mdlCombo = new DefaultComboBoxModel(materia.listarMateria().toArray());
        jCBmateria.setModel(mdlCombo);
    }

    public void cargarTabla() {

        jTabla.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
    }

    private void borrarFilas() {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
