/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;
import universidadejemplo.accesoADatos.*;

/**
 *
 * @author USURIO
 */
public class vistaMateria extends javax.swing.JInternalFrame {
    
    private MateriaData materia;
    
    public vistaMateria() {
        initComponents();
        setClosable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        panelRound1 = new universidadejemplo.Vistas.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelRound2 = new universidadejemplo.Vistas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxNombreMateria = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jTxCodigo = new javax.swing.JTextField();
        jTxAnio = new javax.swing.JTextField();
        btnCrear2 = new universidadejemplo.Vistas.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        btnCrear3 = new universidadejemplo.Vistas.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        btnCrear4 = new universidadejemplo.Vistas.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        btnCrear5 = new universidadejemplo.Vistas.PanelRound();
        jLabel11 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(41, 40, 65));
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Materia");
        jLabel2.setAlignmentX(50.0F);
        jLabel2.setAlignmentY(50.0F);
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 462, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 63, 365, 16));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 80));

        panelRound2.setBackground(new java.awt.Color(28, 27, 41));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo");
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 104, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 94, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 94, -1));

        jTxNombreMateria.setBackground(new java.awt.Color(28, 27, 41));
        jTxNombreMateria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTxNombreMateria.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jTxNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 324, -1));

        jBBuscar.setBackground(new java.awt.Color(28, 27, 41));
        jBBuscar.setFont(new java.awt.Font("Open Sans Medium", 0, 18)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(228, 228, 231));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        panelRound2.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 96, -1));

        jTxCodigo.setBackground(new java.awt.Color(28, 27, 41));
        jTxCodigo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTxCodigo.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jTxCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 165, -1));

        jTxAnio.setBackground(new java.awt.Color(28, 27, 41));
        jTxAnio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTxAnio.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jTxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 199, -1));

        btnCrear2.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear2.setRoundBottomLeft(40);
        btnCrear2.setRoundBottomRight(40);
        btnCrear2.setRoundTopLeft(40);
        btnCrear2.setRoundTopRight(40);
        btnCrear2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrear2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrear2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrear2MouseExited(evt);
            }
        });
        btnCrear2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(88, 101, 242));
        jLabel8.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(228, 228, 231));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar");
        jLabel8.setAlignmentX(40.0F);
        btnCrear2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        panelRound2.add(btnCrear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 40));

        btnCrear3.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear3.setRoundBottomLeft(40);
        btnCrear3.setRoundBottomRight(40);
        btnCrear3.setRoundTopLeft(40);
        btnCrear3.setRoundTopRight(40);
        btnCrear3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrear3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrear3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrear3MouseExited(evt);
            }
        });
        btnCrear3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(88, 101, 242));
        jLabel9.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(228, 228, 231));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Eliminar");
        jLabel9.setAlignmentX(40.0F);
        btnCrear3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        panelRound2.add(btnCrear3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 100, 40));

        btnCrear4.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear4.setRoundBottomLeft(40);
        btnCrear4.setRoundBottomRight(40);
        btnCrear4.setRoundTopLeft(40);
        btnCrear4.setRoundTopRight(40);
        btnCrear4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrear4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrear4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrear4MouseExited(evt);
            }
        });
        btnCrear4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(88, 101, 242));
        jLabel10.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(228, 228, 231));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Guardar");
        jLabel10.setAlignmentX(40.0F);
        btnCrear4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        panelRound2.add(btnCrear4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 100, 40));

        btnCrear5.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear5.setRoundBottomLeft(40);
        btnCrear5.setRoundBottomRight(40);
        btnCrear5.setRoundTopLeft(40);
        btnCrear5.setRoundTopRight(40);
        btnCrear5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrear5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrear5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrear5MouseExited(evt);
            }
        });
        btnCrear5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(88, 101, 242));
        jLabel11.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(228, 228, 231));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Salir");
        jLabel11.setAlignmentX(40.0F);
        btnCrear5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        panelRound2.add(btnCrear5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 100, 40));

        getContentPane().add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 460, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        materia = new MateriaData();
        if (jTxCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo correcto");
        } else {
            try {
                Materia mate = materia.buscarMateria(Integer.parseInt(jTxCodigo.getText()));
                jTxNombreMateria.setText(mate.getNombre());
                jTxAnio.setText(String.valueOf(mate.getAnio()));
//                jRadioEstadoMateria.setSelected(mate.isActivo());
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "La materia ingresado no existe o es incorrecto el codigo");
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void btnCrear2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear2MouseClicked
        materia = new MateriaData();
        if (jTxNombreMateria.getText().isEmpty() || jTxAnio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "revise que los campos no este vacios");
        } else {
            try {
                Materia mate = new Materia(jTxNombreMateria.getText(), Integer.parseInt(jTxAnio.getText()), true);
                materia.guardarMateria(mate);
            } catch (HeadlessException | NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Error al cargar el materia" + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCrear2MouseClicked

    private void btnCrear2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear2MouseEntered
        btnCrear2.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnCrear2MouseEntered

    private void btnCrear2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear2MouseExited
        btnCrear2.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrear2MouseExited

    private void btnCrear3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear3MouseClicked
        materia = new MateriaData();
        if (jTxCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el codigo de la materia correcto");
        } else {
            try {
                materia.eliminarMateria(Integer.parseInt(jTxCodigo.getText()));
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "La materia ingresada no existe o es incorrecta");
            }
        }
    }//GEN-LAST:event_btnCrear3MouseClicked

    private void btnCrear3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear3MouseEntered
        btnCrear3.setBackground(new Color(121, 131, 245));// TODO add your handling code here:
    }//GEN-LAST:event_btnCrear3MouseEntered

    private void btnCrear3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear3MouseExited
       btnCrear3.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrear3MouseExited

    private void btnCrear4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear4MouseClicked
         materia = new MateriaData();
        if (jTxCodigo.getText().isEmpty() || jTxNombreMateria.getText().isEmpty() || jTxAnio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "revise que los campos no este vacios");
        } else {
            try {
                Materia mate = materia.buscarMateria(Integer.parseInt(jTxCodigo.getText()));
                mate.setIdMateria(Integer.parseInt(jTxCodigo.getText()));
                mate.setNombre(jTxNombreMateria.getText());
                mate.setAnio(Integer.parseInt(jTxAnio.getText()));
//                mate.setActivo(jRadioEstadoMateria.isSelected());
                String si = "SI";
                String no = "NO";
                String cancelar = "Cancelar";
                Object[] opciones = {si, no};
                int confirmacion = JOptionPane.showOptionDialog(this, "¿Desea modificar los datos de la materia?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, si);
                System.out.println(confirmacion);
                if (confirmacion == 0) {
                    materia.modificarMateria(mate);
                }
            } catch (HeadlessException | NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Error al cargar la materia " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCrear4MouseClicked

    private void btnCrear4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear4MouseEntered
        btnCrear4.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnCrear4MouseEntered

    private void btnCrear4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear4MouseExited
        btnCrear4.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrear4MouseExited

    private void btnCrear5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear5MouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCrear5MouseClicked

    private void btnCrear5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear5MouseEntered
       btnCrear5.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnCrear5MouseEntered

    private void btnCrear5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear5MouseExited
       btnCrear5.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrear5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private universidadejemplo.Vistas.PanelRound btnCrear2;
    private universidadejemplo.Vistas.PanelRound btnCrear3;
    private universidadejemplo.Vistas.PanelRound btnCrear4;
    private universidadejemplo.Vistas.PanelRound btnCrear5;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxAnio;
    private javax.swing.JTextField jTxCodigo;
    private javax.swing.JTextField jTxNombreMateria;
    private universidadejemplo.Vistas.PanelRound panelRound1;
    private universidadejemplo.Vistas.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}
