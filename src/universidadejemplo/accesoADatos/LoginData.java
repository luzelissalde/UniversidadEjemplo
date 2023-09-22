/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;

/**
 *
 * @author USURIO
 */
public class LoginData {
    
    private Connection connection;

    public LoginData() {

        connection = Conexion.getConexion();
    }
    
    public void guardarLogin(Login login) {

        String sql = "INSERT INTO login (idLogin, usuario, contraseña, nombre , apellido , mail, pregunta) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(2, login.getUsuario());
            ps.setString(3, login.getContrasenia());
            ps.setString(3, login.getNombre());
            ps.setString(3, login.getApellido());
            ps.setString(3, login.getMail());
            ps.setString(3, login.getPregunta());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                login.setIdLogin(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

        }
    }
    
    public void modificarLogin(Login login) {

        String sql = "UPDATE alumno SET usuario = ? , contraseña = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContrasenia());
            ps.setInt(3, login.getIdLogin());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login " + ex.getMessage());
        }

    }
    
     public Login buscarLoginPorUsuario(String usuario) {
        Login login = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                login = new Login();
                login.setIdLogin(rs.getInt(1));
                login.setUsuario(rs.getString(2));
                login.setContrasenia(rs.getString(3));
                login.setNombre(rs.getString(4));
                login.setApellido(rs.getString(5));
                login.setMail(rs.getString(6));
                login.setPregunta(rs.getString(7));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return login;
    }
    
}
