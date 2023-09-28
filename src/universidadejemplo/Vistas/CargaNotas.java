/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
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
public class CargaNotas extends javax.swing.JInternalFrame {

    AlumnoData alumno;
    InscripcionData inscripcion;
    MateriaData materia;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 2) {
                return true;
            }
            return false;
        }
    };

    public CargaNotas() {
        initComponents();
        setOpaque(false);
        cargarCombo();
        cargarTabla();
        darleFormaAlComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new universidadejemplo.Vistas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBalumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnCrear = new universidadejemplo.Vistas.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        btnCrear1 = new universidadejemplo.Vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        panelRound2 = new universidadejemplo.Vistas.PanelRound();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(28, 27, 41));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Open Sans Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 228, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de notas");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, -1));

        jLabel2.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(228, 228, 231));
        jLabel2.setText("Seleccione un alumno:");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jCBalumno.setBackground(new java.awt.Color(28, 27, 41));
        jCBalumno.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jCBalumno.setForeground(new java.awt.Color(228, 228, 231));
        jCBalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBalumnoActionPerformed(evt);
            }
        });
        panelRound1.add(jCBalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 260, -1));

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

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 170));

        jSeparator1.setBackground(new java.awt.Color(228, 228, 231));
        jSeparator1.setForeground(new java.awt.Color(228, 228, 231));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 85, 260, -1));

        btnCrear.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear.setRoundBottomLeft(30);
        btnCrear.setRoundBottomRight(30);
        btnCrear.setRoundTopLeft(30);
        btnCrear.setRoundTopRight(30);
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearMouseExited(evt);
            }
        });
        btnCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(88, 101, 242));
        jLabel3.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(228, 228, 231));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salir");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 120, 30));

        panelRound1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 275, 120, 30));

        btnCrear1.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear1.setRoundBottomLeft(30);
        btnCrear1.setRoundBottomRight(30);
        btnCrear1.setRoundTopLeft(30);
        btnCrear1.setRoundTopRight(30);
        btnCrear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrear1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrear1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrear1MouseExited(evt);
            }
        });
        btnCrear1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(88, 101, 242));
        jLabel4.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(228, 228, 231));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Guardar");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 120, 30));

        panelRound1.add(btnCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 275, 120, 30));

        panelRound2.setBackground(new java.awt.Color(41, 40, 65));
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(228, 228, 231));
        jSeparator2.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 500, 10));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBalumnoActionPerformed
        // TODO add your handling code here:

        inscripcion = new InscripcionData();
        materia = new MateriaData();

        Alumno alumn = (Alumno) jCBalumno.getSelectedItem();

        borrarFilas();
        for (Inscripcion prod : inscripcion.obtenerInscripcionesPorAlumno(alumn.getIdAlumno())) {
            modelo.addRow(new Object[]{prod.getMateria().getIdMateria(), prod.getMateria().getNombre(), prod.getNota()});

        }
    }//GEN-LAST:event_jCBalumnoActionPerformed

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseEntered
        btnCrear.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnCrearMouseEntered

    private void btnCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseExited
        btnCrear.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrearMouseExited

    private void btnCrear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear1MouseClicked
        inscripcion = new InscripcionData();
        Alumno alum = (Alumno) jCBalumno.getSelectedItem();
        modelo.setValueAt(modelo.getValueAt(jTabla.getSelectedRow(), 2), jTabla.getSelectedRow(), 2);
        inscripcion.actualizarNota(alum.getIdAlumno(), (int) modelo.getValueAt(jTabla.getSelectedRow(), 0), Double.parseDouble(modelo.getValueAt(jTabla.getSelectedRow(), 2).toString()));
//        modelo.setValueAt(modelo.getValueAt(jTabla.getSelectedRow(),2), modelo.getRowCount()-1, 2);
//        inscripcion.actualizarNota(alum.getIdAlumno(), (int)modelo.getValueAt(modelo.getRowCount()-1, 0), Double.parseDouble(modelo.getValueAt(modelo.getRowCount()-1, 2).toString()));
    }//GEN-LAST:event_btnCrear1MouseClicked

    private void btnCrear1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear1MouseEntered
        btnCrear.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnCrear1MouseEntered

    private void btnCrear1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear1MouseExited
        btnCrear.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrear1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private universidadejemplo.Vistas.PanelRound btnCrear;
    private universidadejemplo.Vistas.PanelRound btnCrear1;
    private javax.swing.JComboBox<Alumno> jCBalumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabla;
    private universidadejemplo.Vistas.PanelRound panelRound1;
    private universidadejemplo.Vistas.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables

    public void cargarCombo() {
        alumno = new AlumnoData();
        DefaultComboBoxModel<Alumno> mdlCombo = new DefaultComboBoxModel(alumno.listarAlumnos().toArray());
        jCBalumno.setModel(mdlCombo);
    }

    public void cargarTabla() {

        jTabla.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
    }

    private void borrarFilas() {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void darleFormaAlComboBox() {
        jCBalumno.setUI(new BasicComboBoxUI() {
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
                jCBalumno.addMouseListener(new MouseListener() {
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

                jCBalumno.addActionListener(new ActionListener() {
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

        jCBalumno.setForeground(new Color(228, 228, 231));
        jCBalumno.setFocusable(false);
        DefaultListCellRenderer renderer = new DefaultListCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
