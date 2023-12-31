/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
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
        setOpaque(false);
        cargarCombo();
        cargarTabla();
        setMaximizable(true);
        radioBotones();
        setClosable(true);
        setMaximizable(true);
        darleFormaAlComboBox();
        panelRound1.requestFocus();

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
        panelRound1 = new universidadejemplo.Vistas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jRMatInscriptas = new javax.swing.JRadioButton();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jRMatNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jAnular = new universidadejemplo.Vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        btnInscribir = new universidadejemplo.Vistas.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jBSalir = new universidadejemplo.Vistas.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        panelRound2 = new universidadejemplo.Vistas.PanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(28, 27, 41));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 228, 231));
        jLabel1.setText("Seleccione un alumno");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 188, -1));

        jRMatInscriptas.setBackground(new java.awt.Color(28, 27, 41));
        jRMatInscriptas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRMatInscriptas.setForeground(new java.awt.Color(228, 228, 231));
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
        panelRound1.add(jRMatInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 155, -1));

        cbAlumnos.setBackground(new java.awt.Color(28, 27, 41));
        cbAlumnos.setFont(new java.awt.Font("Open Sans Medium", 0, 16)); // NOI18N
        cbAlumnos.setForeground(new java.awt.Color(228, 228, 231));
        cbAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbAlumnos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbAlumnosFocusGained(evt);
            }
        });
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });
        panelRound1.add(cbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 230, 28));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(228, 228, 231));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Listado de Materias");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 519, -1));

        jRMatNoInscriptas.setBackground(new java.awt.Color(28, 27, 41));
        jRMatNoInscriptas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jRMatNoInscriptas.setForeground(new java.awt.Color(228, 228, 231));
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
        panelRound1.add(jRMatNoInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 170, -1));

        jTabla.setBackground(new java.awt.Color(28, 27, 41));
        jTabla.setFont(new java.awt.Font("Open Sans Medium", 0, 12)); // NOI18N
        jTabla.setForeground(new java.awt.Color(228, 228, 231));
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
        jTabla.setSelectionBackground(new java.awt.Color(28, 27, 41));
        jTabla.setSelectionForeground(new java.awt.Color(228, 228, 231));
        jScrollPane1.setViewportView(jTabla);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 440, 184));

        jAnular.setBackground(new java.awt.Color(88, 101, 242));
        jAnular.setRoundBottomLeft(40);
        jAnular.setRoundBottomRight(40);
        jAnular.setRoundTopLeft(40);
        jAnular.setRoundTopRight(40);
        jAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAnularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAnularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAnularMouseExited(evt);
            }
        });
        jAnular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(88, 101, 242));
        jLabel4.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(228, 228, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Anular Inscripcion");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAnular.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 35));

        panelRound1.add(jAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 205, -1));

        btnInscribir.setBackground(new java.awt.Color(88, 101, 242));
        btnInscribir.setRoundBottomLeft(40);
        btnInscribir.setRoundBottomRight(40);
        btnInscribir.setRoundTopLeft(40);
        btnInscribir.setRoundTopRight(40);
        btnInscribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInscribirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInscribirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInscribirMouseExited(evt);
            }
        });
        btnInscribir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(88, 101, 242));
        jLabel3.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(228, 228, 231));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inscribir");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInscribir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 35));

        panelRound1.add(btnInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jBSalir.setBackground(new java.awt.Color(88, 101, 242));
        jBSalir.setRoundBottomLeft(40);
        jBSalir.setRoundBottomRight(40);
        jBSalir.setRoundTopLeft(40);
        jBSalir.setRoundTopRight(40);
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
        });
        jBSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(88, 101, 242));
        jLabel5.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(228, 228, 231));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salir");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 35));

        panelRound1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 520, 400));

        panelRound2.setBackground(new java.awt.Color(41, 40, 65));
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Open Sans Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(228, 228, 231));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario de Inscripcion");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRMatInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMatInscriptasActionPerformed
        inscripcion = new InscripcionData();
        materia = new MateriaData();
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();

        borrarFilas();
        for (Materia prod : inscripcion.obtenerMateriasCursadas(alumn.getIdAlumno())) {

            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});

        }
        btnInscribir.setEnabled(false);
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
        btnInscribir.setEnabled(true);
        jAnular.setEnabled(false);
    }//GEN-LAST:event_jRMatNoInscriptasActionPerformed

    private void jRMatNoInscriptasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRMatNoInscriptasFocusGained
//        inscripcion = new InscripcionData();
////        materia = new MateriaData();
//        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();
//
//        borrarFilas();
//        for (Materia prod : inscripcion.obtenerMateriasNOCursadas(alumn.getIdAlumno())) {
//
//            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});
//
//        }
//        for (Component component : btnInscribir.getComponents()) {
//            component.setEnabled(true);
//        }
//        btnInscribir.setEnabled(true);
//        jLabel3.setEnabled(true);
//        jAnular.setEnabled(false);
//        jLabel4.setEnabled(false);
    }//GEN-LAST:event_jRMatNoInscriptasFocusGained

    private void jRMatInscriptasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRMatInscriptasFocusGained
//        inscripcion = new InscripcionData();
//        materia = new MateriaData();
//        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();
//
//        borrarFilas();
//        for (Materia prod : inscripcion.obtenerMateriasCursadas(alumn.getIdAlumno())) {
//
//            modelo.addRow(new Object[]{prod.getIdMateria(), prod.getNombre(), prod.getAnio()});
//
//        }
//        btnInscribir.setEnabled(false);
//        jLabel3.setEnabled(false);
//        jAnular.setEnabled(true);
//        jLabel4.setEnabled(true);
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

    private void btnInscribirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirMouseEntered
        if (jRMatNoInscriptas.isSelected()|| (!jRMatInscriptas.isSelected()&&!jRMatNoInscriptas.isSelected())) {
            btnInscribir.setBackground(new Color(121, 131, 245));
        }
    }//GEN-LAST:event_btnInscribirMouseEntered

    private void btnInscribirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirMouseExited
        btnInscribir.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnInscribirMouseExited

    private void btnInscribirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirMouseClicked
        inscripcion = new InscripcionData();
        materia = new MateriaData();
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();
        Materia mat = materia.buscarMateria(Integer.parseInt(String.valueOf(modelo.getValueAt(jTabla.getSelectedRow(), 0))));
        if (jRMatNoInscriptas.isSelected()) {

            inscripcion.guardarIncripcion(new Inscripcion(alumn, mat, 0));
            jRMatNoInscriptas.requestFocus();
        }
    }//GEN-LAST:event_btnInscribirMouseClicked

    private void jAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAnularMouseClicked
        Alumno alumn = (Alumno) cbAlumnos.getSelectedItem();
//        Inscripcion insc = new Inscripcion();
//        materia = new MateriaData();
        inscripcion = new InscripcionData();
        if (jRMatInscriptas.isSelected()) {
            inscripcion.borrarInscripcionMateriaAlumno(alumn.getIdAlumno(), (int) modelo.getValueAt(jTabla.getSelectedRow(), 0));
        }

    }//GEN-LAST:event_jAnularMouseClicked

    private void jAnularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAnularMouseEntered
        if (jRMatInscriptas.isSelected()) {
            jAnular.setBackground(new Color(121, 131, 245));
        }
        
    }//GEN-LAST:event_jAnularMouseEntered

    private void jAnularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAnularMouseExited
        jAnular.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_jAnularMouseExited

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        jBSalir.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        jBSalir.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_jBSalirMouseExited

    private void cbAlumnosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbAlumnosFocusGained
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
    }//GEN-LAST:event_cbAlumnosFocusGained

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
    
    private void darleFormaAlComboBox() {
        cbAlumnos.setUI(new BasicComboBoxUI() {
            private boolean isPopupVisible = false;
            private boolean isImageChanged = false;

            @Override
            protected JButton createArrowButton() {
                JButton arrowButton = new JButton(new ImageIcon("src/img/Recurso 2.png"));

                arrowButton.setBorderPainted(false);
                arrowButton.setContentAreaFilled(false);
                arrowButton.setFocusPainted(false);
                arrowButton.setOpaque(false);

                arrowButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!isPopupVisible) {
                            isImageChanged = !isImageChanged;
                            if (isImageChanged) {
                                arrowButton.setIcon(new ImageIcon("src/img/Recurso 3.png"));
                            } else {
                                arrowButton.setIcon(new ImageIcon("src/img/Recurso 2.png"));
                            }
                        }
                    }
                });
                cbAlumnos.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (!isPopupVisible) {
                            isImageChanged = !isImageChanged;
                            if (isImageChanged) {
                                arrowButton.setIcon(new ImageIcon("src/img/Recurso 3.png"));
                            } else {
                                arrowButton.setIcon(new ImageIcon("src/img/Recurso 2.png"));
                            }
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }

                });

                cbAlumnos.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!isPopupVisible) {
                            isImageChanged = !isImageChanged;
                            if (isImageChanged) {
                                arrowButton.setIcon(new ImageIcon("src/img/Recurso 3.png"));
                            } else {
                                arrowButton.setIcon(new ImageIcon("src/img/Recurso 2.png"));
                            }
                        }
                    }

                });

                return arrowButton;
            }

        });

        cbAlumnos.setForeground(new Color(228, 228, 231));
        cbAlumnos.setFocusable(false);
        DefaultListCellRenderer renderer = new DefaultListCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private universidadejemplo.Vistas.PanelRound btnInscribir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private universidadejemplo.Vistas.PanelRound jAnular;
    private universidadejemplo.Vistas.PanelRound jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRMatInscriptas;
    private javax.swing.JRadioButton jRMatNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabla;
    private universidadejemplo.Vistas.PanelRound panelRound1;
    private universidadejemplo.Vistas.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}


