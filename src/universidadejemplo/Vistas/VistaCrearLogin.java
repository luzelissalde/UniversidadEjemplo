/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadejemplo.Vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;
import universidadejemplo.accesoADatos.*;
import universidadejemplo.Entidades.*;

/**
 *
 * @author USURIO
 */
public class VistaCrearLogin extends javax.swing.JFrame {

    private LoginData loginData;

    /**
     * Creates new form VistaLogin
     */
    public VistaCrearLogin() {
        setUndecorated(true);
        initComponents();
        //Para que no se vea nada
        VistaCrearLogin.this.getRootPane().setOpaque(false);
        //Para darle color
        VistaCrearLogin.this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        VistaCrearLogin.this.setBackground(new Color(0, 0, 0, 0));
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        panelRound2.requestFocus();
        if (jTxtNombre.getText().isEmpty() || jTxtNombre.getText().equalsIgnoreCase("Ingrese su Nombre")) {
            jTxtNombre.setText("Ingrese su Nombre");
        }
        if (jTxtApellido.getText().isEmpty() || jTxtApellido.getText().equalsIgnoreCase("Ingrese su Apellido")) {
            jTxtApellido.setText("Ingrese su Apellido");
        }
        if (jTxtMail.getText().isEmpty() || jTxtMail.getText().equalsIgnoreCase("Ingrese su Mail")) {
            jTxtMail.setText("Ingrese su Mail");
        }
        if (jTxtUsuario.getText().isEmpty() || jTxtUsuario.getText().equalsIgnoreCase("Ingrese un Usuario")) {
            jTxtUsuario.setText("Ingrese un Usuario");
        }
        if (jTxtRespuesta.getText().isEmpty() || jTxtRespuesta.getText().equalsIgnoreCase("Conteste a la pregunta elegida")) {
            jTxtRespuesta.setText("Conteste a la pregunta elegida");
        }
        cargarCombo();
        darleFormaAlComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new universidadejemplo.Vistas.PanelRound();
        x = new javax.swing.JLabel();
        panelRound2 = new universidadejemplo.Vistas.PanelRound();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTxtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        JSnombre = new javax.swing.JSeparator();
        btnCrear = new universidadejemplo.Vistas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jTxtApellido = new javax.swing.JTextField();
        jSApellido = new javax.swing.JSeparator();
        jTxtMail = new javax.swing.JTextField();
        jSMail = new javax.swing.JSeparator();
        jTxtUsuario = new javax.swing.JTextField();
        jSUsuario = new javax.swing.JSeparator();
        jPasswordField2 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        passwoe = new javax.swing.JLabel();
        passwoe1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSRespuesta = new javax.swing.JSeparator();
        jTxtRespuesta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(41, 40, 65));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x.setBackground(new java.awt.Color(228, 228, 231));
        x.setFont(new java.awt.Font("Open Sans Medium", 1, 18)); // NOI18N
        x.setForeground(new java.awt.Color(228, 228, 231));
        x.setText("X");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });
        panelRound1.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        panelRound2.setBackground(new java.awt.Color(28, 27, 41));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setBackground(new java.awt.Color(28, 27, 41));
        jPasswordField1.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(228, 228, 231));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("Ingrese su password");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(228, 228, 231));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        panelRound2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, 30));

        jTxtNombre.setBackground(new java.awt.Color(28, 27, 41));
        jTxtNombre.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jTxtNombre.setForeground(new java.awt.Color(228, 228, 231));
        jTxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtNombre.setBorder(null);
        jTxtNombre.setCaretColor(new java.awt.Color(228, 228, 231));
        jTxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtNombreFocusLost(evt);
            }
        });
        jTxtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtNombreMouseClicked(evt);
            }
        });
        panelRound2.add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 30));

        jSeparator1.setBackground(new java.awt.Color(228, 228, 231));
        jSeparator1.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 10));

        JSnombre.setBackground(new java.awt.Color(228, 228, 231));
        JSnombre.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(JSnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 320, 10));

        btnCrear.setBackground(new java.awt.Color(88, 101, 242));
        btnCrear.setRoundBottomLeft(40);
        btnCrear.setRoundBottomRight(40);
        btnCrear.setRoundTopLeft(40);
        btnCrear.setRoundTopRight(40);
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

        jLabel1.setBackground(new java.awt.Color(88, 101, 242));
        jLabel1.setFont(new java.awt.Font("Open Sans SemiBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 228, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 320, 40));

        panelRound2.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 320, 40));

        jTxtApellido.setBackground(new java.awt.Color(28, 27, 41));
        jTxtApellido.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jTxtApellido.setForeground(new java.awt.Color(228, 228, 231));
        jTxtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtApellido.setBorder(null);
        jTxtApellido.setCaretColor(new java.awt.Color(228, 228, 231));
        jTxtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtApellidoFocusLost(evt);
            }
        });
        jTxtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtApellidoMouseClicked(evt);
            }
        });
        panelRound2.add(jTxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 320, 30));

        jSApellido.setBackground(new java.awt.Color(228, 228, 231));
        jSApellido.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, 10));

        jTxtMail.setBackground(new java.awt.Color(28, 27, 41));
        jTxtMail.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jTxtMail.setForeground(new java.awt.Color(228, 228, 231));
        jTxtMail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtMail.setBorder(null);
        jTxtMail.setCaretColor(new java.awt.Color(228, 228, 231));
        jTxtMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtMailFocusLost(evt);
            }
        });
        jTxtMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtMailMouseClicked(evt);
            }
        });
        panelRound2.add(jTxtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, 30));

        jSMail.setBackground(new java.awt.Color(228, 228, 231));
        jSMail.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 10));

        jTxtUsuario.setBackground(new java.awt.Color(28, 27, 41));
        jTxtUsuario.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jTxtUsuario.setForeground(new java.awt.Color(228, 228, 231));
        jTxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtUsuario.setBorder(null);
        jTxtUsuario.setCaretColor(new java.awt.Color(228, 228, 231));
        jTxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtUsuarioFocusLost(evt);
            }
        });
        jTxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtUsuarioMouseClicked(evt);
            }
        });
        panelRound2.add(jTxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 320, 30));

        jSUsuario.setBackground(new java.awt.Color(228, 228, 231));
        jSUsuario.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 320, 10));

        jPasswordField2.setBackground(new java.awt.Color(28, 27, 41));
        jPasswordField2.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(228, 228, 231));
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.setText("Repita el password");
        jPasswordField2.setBorder(null);
        jPasswordField2.setCaretColor(new java.awt.Color(228, 228, 231));
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        panelRound2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 320, 30));

        jSeparator2.setBackground(new java.awt.Color(228, 228, 231));
        jSeparator2.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 320, 10));

        passwoe.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        passwoe.setForeground(new java.awt.Color(228, 228, 231));
        passwoe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwoe.setText("Repita la contraseña");
        panelRound2.add(passwoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 400, -1));

        passwoe1.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        passwoe1.setForeground(new java.awt.Color(228, 228, 231));
        passwoe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwoe1.setText("Ingrese una contraseña");
        panelRound2.add(passwoe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 400, -1));

        jComboBox1.setBackground(new java.awt.Color(28, 27, 41));
        jComboBox1.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 320, -1));

        jSRespuesta.setBackground(new java.awt.Color(228, 228, 231));
        jSRespuesta.setForeground(new java.awt.Color(228, 228, 231));
        panelRound2.add(jSRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 320, 10));

        jTxtRespuesta.setBackground(new java.awt.Color(28, 27, 41));
        jTxtRespuesta.setFont(new java.awt.Font("Open Sans Medium", 0, 14)); // NOI18N
        jTxtRespuesta.setForeground(new java.awt.Color(228, 228, 231));
        jTxtRespuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtRespuesta.setBorder(null);
        jTxtRespuesta.setCaretColor(new java.awt.Color(228, 228, 231));
        jTxtRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTxtRespuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtRespuestaFocusLost(evt);
            }
        });
        jTxtRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtRespuestaMouseClicked(evt);
            }
        });
        panelRound2.add(jTxtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 320, 30));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 580));

        jSeparator3.setBackground(new java.awt.Color(228, 228, 231));
        jSeparator3.setForeground(new java.awt.Color(228, 228, 231));
        panelRound1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 400, 20));

        titulo1.setFont(new java.awt.Font("Open Sans Medium", 0, 22)); // NOI18N
        titulo1.setForeground(new java.awt.Color(228, 228, 231));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Nuevo usuario");
        panelRound1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 400, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNombreFocusLost
        if (jTxtNombre.getText().isEmpty() || jTxtNombre.getText().equalsIgnoreCase("Ingrese su Nombre")) {
            jTxtNombre.setText("Ingrese su Nombre");
        }
    }//GEN-LAST:event_jTxtNombreFocusLost

    private void jTxtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtNombreMouseClicked
        if (jTxtNombre.getText().equalsIgnoreCase("Ingrese su Nombre")) {
            jTxtNombre.setText("");
        }
        JSnombre.setForeground(new Color(228, 228, 231));
        JSnombre.setBackground(new Color(228, 228, 231));

    }//GEN-LAST:event_jTxtNombreMouseClicked

    private void jTxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNombreFocusGained
        if (jTxtNombre.getText().equalsIgnoreCase("Ingrese su Nombre")) {
            jTxtNombre.setText("");
        }
    }//GEN-LAST:event_jTxtNombreFocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty() || String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("Ingrese su password");
        }

    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("");
        }
        passwoe1.setText("Ingrese una Contraseña");
        passwoe1.setForeground(new Color(228, 228, 231));
        jSeparator1.setForeground(new Color(228, 228, 231));
        jSeparator1.setBackground(new Color(228, 228, 231));
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase("Ingrese su password")) {
            jPasswordField1.setText("");
        }
//        if (incorrecto) {
//            jLerror.setVisible(false);
//            jSeparator1.setForeground(new Color(228, 228, 231));
//            jSeparator1.setBackground(new Color(228, 228, 231));
//        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void btnCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseEntered
        btnCrear.setBackground(new Color(121, 131, 245));
    }//GEN-LAST:event_btnCrearMouseEntered

    private void btnCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseExited
        btnCrear.setBackground(new Color(88, 101, 242));
    }//GEN-LAST:event_btnCrearMouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x.setForeground(new Color(121, 131, 245));    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x.setForeground(new Color(228, 228, 231));
    }//GEN-LAST:event_xMouseExited

    private void jTxtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtApellidoFocusGained
        if (jTxtApellido.getText().equalsIgnoreCase("Ingrese su Apellido")) {
            jTxtApellido.setText("");
        }
    }//GEN-LAST:event_jTxtApellidoFocusGained

    private void jTxtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtApellidoFocusLost
        if (jTxtApellido.getText().isEmpty() || jTxtApellido.getText().equalsIgnoreCase("Ingrese su Apellido")) {
            jTxtApellido.setText("Ingrese su Apellido");
        }
    }//GEN-LAST:event_jTxtApellidoFocusLost

    private void jTxtApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtApellidoMouseClicked
        if (jTxtApellido.getText().equalsIgnoreCase("Ingrese su Apellido")) {
            jTxtApellido.setText("");
        }
        jSApellido.setForeground(new Color(228, 228, 231));
        jSApellido.setBackground(new Color(228, 228, 231));
    }//GEN-LAST:event_jTxtApellidoMouseClicked

    private void jTxtMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtMailFocusGained
        if (jTxtMail.getText().equalsIgnoreCase("Ingrese su Mail")) {
            jTxtMail.setText("");
        }
    }//GEN-LAST:event_jTxtMailFocusGained

    private void jTxtMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtMailFocusLost
        if (jTxtMail.getText().isEmpty() || jTxtMail.getText().equalsIgnoreCase("Ingrese su Mail")) {
            jTxtMail.setText("Ingrese su Mail");
        }
    }//GEN-LAST:event_jTxtMailFocusLost

    private void jTxtMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtMailMouseClicked
        if (jTxtMail.getText().equalsIgnoreCase("Ingrese su Mail")) {
            jTxtMail.setText("");
        }
        jSMail.setForeground(new Color(228, 228, 231));
        jSMail.setBackground(new Color(228, 228, 231));
    }//GEN-LAST:event_jTxtMailMouseClicked

    private void jTxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtUsuarioFocusGained
        if (jTxtUsuario.getText().equalsIgnoreCase("Ingrese un Usuario")) {
            jTxtUsuario.setText("");
        }
    }//GEN-LAST:event_jTxtUsuarioFocusGained

    private void jTxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtUsuarioFocusLost
        if (jTxtUsuario.getText().isEmpty() || jTxtUsuario.getText().equalsIgnoreCase("Ingrese un Usuario")) {
            jTxtUsuario.setText("Ingrese un Usuario");
        }
    }//GEN-LAST:event_jTxtUsuarioFocusLost

    private void jTxtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtUsuarioMouseClicked
        if (jTxtUsuario.getText().equalsIgnoreCase("Ingrese un Usuario")) {
            jTxtUsuario.setText("");
        }
        jSUsuario.setForeground(new Color(228, 228, 231));
        jSUsuario.setBackground(new Color(228, 228, 231));
    }//GEN-LAST:event_jTxtUsuarioMouseClicked

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        if (String.valueOf(jPasswordField2.getPassword()).equalsIgnoreCase("Repita el password")) {
            jPasswordField2.setText("");
        }
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        if (String.valueOf(jPasswordField2.getPassword()).isEmpty() || String.valueOf(jPasswordField2.getPassword()).equalsIgnoreCase("Repita el password")) {
            jPasswordField2.setText("Repita el password");
        }
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        if (String.valueOf(jPasswordField2.getPassword()).equalsIgnoreCase("Repita el password")) {
            jPasswordField2.setText("");
        }
        passwoe1.setText("Repita el Contraseña");
        passwoe1.setForeground(new Color(228, 228, 231));
        jSeparator2.setForeground(new Color(228, 228, 231));
        jSeparator2.setBackground(new Color(228, 228, 231));
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jTxtRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtRespuestaFocusGained
        if (jTxtRespuesta.getText().equalsIgnoreCase("Conteste a la pregunta elegida")) {
            jTxtRespuesta.setText("");
        }
    }//GEN-LAST:event_jTxtRespuestaFocusGained

    private void jTxtRespuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtRespuestaFocusLost
        if (jTxtRespuesta.getText().isEmpty() || jTxtRespuesta.getText().equalsIgnoreCase("Conteste a la pregunta elegida")) {
            jTxtRespuesta.setText("Conteste a la pregunta elegida");
        }
    }//GEN-LAST:event_jTxtRespuestaFocusLost

    private void jTxtRespuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtRespuestaMouseClicked
        if (jTxtRespuesta.getText().equalsIgnoreCase("Conteste a la pregunta elegida")) {
            jTxtRespuesta.setText("");
        }
        jSRespuesta.setForeground(new Color(228, 228, 231));
        jSRespuesta.setBackground(new Color(228, 228, 231));
    }//GEN-LAST:event_jTxtRespuestaMouseClicked

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        if (String.valueOf(jPasswordField1.getPassword()).equalsIgnoreCase(String.valueOf(jPasswordField2.getPassword()))) {
            if (!jTxtNombre.getText().isEmpty() ||!jTxtUsuario.getText().isEmpty() ||!jTxtMail.getText().isEmpty() || !jTxtRespuesta.getText().isEmpty()||!jTxtApellido.getText().isEmpty()) {
                loginData = new LoginData();
                Login login = new Login(jTxtUsuario.getText(), String.valueOf(jPasswordField1.getPassword()), jTxtNombre.getText(), jTxtApellido.getText(), jTxtMail.getText(), String.valueOf(jComboBox1.getSelectedItem()), jTxtRespuesta.getText());
                loginData.guardarLogin(login);
                VistaLogin vista = new VistaLogin();
                vista.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Verifique que alguno de los campos no este vacios");
            }
        } else {
            passwoe.setText("Las contraseñas no coiciden");
            passwoe.setForeground(Color.red);
            passwoe1.setText("Las contraseñas no coiciden");
            passwoe1.setForeground(Color.red);
            jSeparator1.setBackground(Color.red);
            jSeparator2.setBackground(Color.red);
            jSeparator1.setForeground(Color.red);
            jSeparator2.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnCrearMouseClicked

    public void cargarCombo() {
        DefaultComboBoxModel<String> mdlCombo = new DefaultComboBoxModel(preguntas().toArray());
        jComboBox1.setModel(mdlCombo);
    }

    public List<String> preguntas() {
        List<String> prefuntas = new ArrayList<>();

        prefuntas.add("¿Como se llamaba tu primer pareja?");
        prefuntas.add("¿Como se llamaba tu primer mascota?");
        prefuntas.add("¿Cual es tu lugar favorito?");
        prefuntas.add("¿Cual es tu juego favorito?");

        return prefuntas;
    }

    private void darleFormaAlComboBox() {
        jComboBox1.setUI(new BasicComboBoxUI() {
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
                jComboBox1.addMouseListener(new MouseListener() {
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

                jComboBox1.addActionListener(new ActionListener() {
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

        jComboBox1.setForeground(new Color(228, 228, 231));
        jComboBox1.setFocusable(false);
        DefaultListCellRenderer renderer = new DefaultListCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator JSnombre;
    private universidadejemplo.Vistas.PanelRound btnCrear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSApellido;
    private javax.swing.JSeparator jSMail;
    private javax.swing.JSeparator jSRespuesta;
    private javax.swing.JSeparator jSUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtMail;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtRespuesta;
    private javax.swing.JTextField jTxtUsuario;
    private universidadejemplo.Vistas.PanelRound panelRound1;
    private universidadejemplo.Vistas.PanelRound panelRound2;
    private javax.swing.JLabel passwoe;
    private javax.swing.JLabel passwoe1;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
