/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;
import universidadejemplo.accesoADatos.*;

/**
 *
 * @author USURIO
 */
public class vistaAlumno extends javax.swing.JInternalFrame {

    private AlumnoData alumno;

    public vistaAlumno() {
        initComponents();
        setOpaque(false);
        setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        panelRound1 = new universidadejemplo.Vistas.PanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        panelRound2 = new universidadejemplo.Vistas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxApellido = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jTxDocumento = new javax.swing.JTextField();
        jTxNombre = new javax.swing.JTextField();
        jDFecha = new com.toedter.calendar.JDateChooser();
        btnEliminar = new universidadejemplo.Vistas.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new universidadejemplo.Vistas.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        btnSalir = new universidadejemplo.Vistas.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        btnAregar = new universidadejemplo.Vistas.PanelRound();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(41, 40, 65));
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 60, 460, 16));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(228, 228, 231));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alumno");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 62));

        panelRound2.setBackground(new java.awt.Color(28, 27, 41));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 228, 231));
        jLabel1.setText("Documento");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 104, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(228, 228, 231));
        jLabel4.setText("Apellido");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 94, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(228, 228, 231));
        jLabel5.setText("Nombre");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 94, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(228, 228, 231));
        jLabel6.setText("Fecha de Nacimiento");
        panelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 179, 28));

        jTxApellido.setBackground(new java.awt.Color(28, 27, 41));
        jTxApellido.setFont(new java.awt.Font("Open Sans Medium", 0, 18)); // NOI18N
        jTxApellido.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jTxApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 199, -1));

        jBBuscar.setBackground(new java.awt.Color(28, 27, 41));
        jBBuscar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(228, 228, 231));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        panelRound2.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jTxDocumento.setBackground(new java.awt.Color(28, 27, 41));
        jTxDocumento.setFont(new java.awt.Font("Open Sans Medium", 0, 18)); // NOI18N
        jTxDocumento.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jTxDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 165, -1));

        jTxNombre.setBackground(new java.awt.Color(28, 27, 41));
        jTxNombre.setFont(new java.awt.Font("Open Sans Medium", 0, 18)); // NOI18N
        jTxNombre.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jTxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 199, -1));

        jDFecha.setBackground(new java.awt.Color(28, 27, 41));
        jDFecha.setForeground(new java.awt.Color(228, 228, 231));
        jDFecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        panelRound2.add(jDFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, 28));

        btnEliminar.setBackground(new java.awt.Color(88, 101, 242));
        btnEliminar.setRoundBottomLeft(40);
        btnEliminar.setRoundBottomRight(40);
        btnEliminar.setRoundTopLeft(40);
        btnEliminar.setRoundTopRight(40);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(88, 101, 242));
        jLabel8.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(228, 228, 231));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Eliminar");
        jLabel8.setAlignmentX(40.0F);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        panelRound2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 90, 40));

        btnGuardar.setBackground(new java.awt.Color(88, 101, 242));
        btnGuardar.setRoundBottomLeft(40);
        btnGuardar.setRoundBottomRight(40);
        btnGuardar.setRoundTopLeft(40);
        btnGuardar.setRoundTopRight(40);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(88, 101, 242));
        jLabel9.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(228, 228, 231));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Guardar");
        jLabel9.setAlignmentX(40.0F);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        panelRound2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, 40));

        btnSalir.setBackground(new java.awt.Color(88, 101, 242));
        btnSalir.setRoundBottomLeft(40);
        btnSalir.setRoundBottomRight(40);
        btnSalir.setRoundTopLeft(40);
        btnSalir.setRoundTopRight(40);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(88, 101, 242));
        jLabel10.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(228, 228, 231));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Salir");
        jLabel10.setAlignmentX(40.0F);
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        panelRound2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 90, 40));

        btnAregar.setBackground(new java.awt.Color(88, 101, 242));
        btnAregar.setRoundBottomLeft(40);
        btnAregar.setRoundBottomRight(40);
        btnAregar.setRoundTopLeft(40);
        btnAregar.setRoundTopRight(40);
        btnAregar.setVerifyInputWhenFocusTarget(false);
        btnAregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAregarMouseExited(evt);
            }
        });
        btnAregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(88, 101, 242));
        jLabel11.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(228, 228, 231));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Agregar");
        jLabel11.setAlignmentX(40.0F);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAregar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        panelRound2.add(btnAregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 40));

        getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String si = "SI";
        String no = "NO";
        String cancelar = "Cancelar";
        Object[] opciones = {si, no};
        alumno = new AlumnoData();
        if (jTxDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de documento correcto");
        } else {
            try {
                Alumno jorge = alumno.buscarAlumnoPorDni(Integer.parseInt(jTxDocumento.getText()));
                if (jorge.isActivo()) {
                    jTxDocumento.setText(String.valueOf(jorge.getDni()));
                    jTxApellido.setText(jorge.getApellido());
                    jTxNombre.setText(jorge.getNombre());
//                jRadioEstado.setSelected(jorge.isActivo());
                    jDFecha.setDate(Date.valueOf(jorge.getFechaNac()));
                } else if (!jorge.isActivo()) {
                    jorge.setActivo(true);
                    int confirmacion = JOptionPane.showOptionDialog(this, "El alumno que esta buscando se ha dado de baja ¿Desea volver a activarlo?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, si);
                    System.out.println(confirmacion);
                    if (confirmacion == 0) {
                        alumno.modificarAlumno(jorge);
                    }
                }
                
            } catch (NullPointerException e) {
//                JOptionPane.showMessageDialog(null, "El alumno/a ingresado no existe o es incorrecto");
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        AlumnoData alumnos = new AlumnoData();
        Alumno jorge = new Alumno();
        if (jTxDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de documento correcto");
        } else {
            try {
                jorge = alumnos.buscarAlumnoPorDni(Integer.parseInt(jTxDocumento.getText()));
                alumnos.eliminarAlumno(jorge.getIdAlumno());
//                JOptionPane.showMessageDialog(null, "Se dio de baja correctamente al alumno: " + jorge.getNombre() + jorge.getApellido());
            } catch (NullPointerException e) {
//                JOptionPane.showMessageDialog(null, "El alumno/a ingresado no existe o es incorrecto");
            }
        }
        jTxNombre.setText("");
        jTxApellido.setText("");
        jTxDocumento.setText("");
        jDFecha.setDate(Date.valueOf(""));
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        alumno = new AlumnoData();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if (jTxDocumento.getText().isEmpty() || jTxApellido.getText().isEmpty() || jTxNombre.getText().isEmpty() || jDFecha.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "revise que los campos no este vacios");
        } else {
            try {
                Alumno jorge = alumno.buscarAlumnoPorDni(Integer.parseInt(jTxDocumento.getText()));
                jorge.setDni(Integer.parseInt(jTxDocumento.getText()));
                jorge.setApellido(jTxApellido.getText());
                jorge.setNombre(jTxNombre.getText());
                jorge.setFechaNac(LocalDate.parse(formato.format(jDFecha.getDate())));
//                jorge.setActivo(jRadioEstado.isSelected());

                String si = "SI";
                String no = "NO";
                String cancelar = "Cancelar";
                Object[] opciones = {si, no};
                int confirmacion = JOptionPane.showOptionDialog(this, "¿Desea modificar los datos del Alumno?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, si);
                System.out.println(confirmacion);
                if (confirmacion == 0) {
                    alumno.modificarAlumno(jorge);
                }
            } catch (HeadlessException | NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Error al cargar el Alumno " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnAregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAregarMouseClicked
        alumno = new AlumnoData();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if (jTxDocumento.getText().isEmpty() || jTxApellido.getText().isEmpty() || jTxNombre.getText().isEmpty() || jDFecha.getDate().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "revise que los campos no este vacios");
        } else {
            try {
                Alumno jorge = new Alumno(Integer.parseInt(jTxDocumento.getText()), jTxNombre.getText(), jTxApellido.getText(), LocalDate.parse(formato.format(jDFecha.getDate())), true);
                alumno.guardarAlumno(jorge);
            } catch (HeadlessException | NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Error al cargar el Alumno " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAregarMouseClicked

    private void btnAregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAregarMouseEntered
        btnAregar.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnAregarMouseEntered

    private void btnAregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAregarMouseExited
        btnAregar.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnAregarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private universidadejemplo.Vistas.PanelRound btnAregar;
    private universidadejemplo.Vistas.PanelRound btnEliminar;
    private universidadejemplo.Vistas.PanelRound btnGuardar;
    private universidadejemplo.Vistas.PanelRound btnSalir;
    private javax.swing.JButton jBBuscar;
    private com.toedter.calendar.JDateChooser jDFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxApellido;
    private javax.swing.JTextField jTxDocumento;
    private javax.swing.JTextField jTxNombre;
    private universidadejemplo.Vistas.PanelRound panelRound1;
    private universidadejemplo.Vistas.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
