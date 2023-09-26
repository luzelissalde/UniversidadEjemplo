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

        String sql = "INSERT INTO login (idLogin, usuario, contraseña, nombre , apellido , mail, pregunta, respuesta) VALUES (?,?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContrasenia());
            ps.setString(3, login.getNombre());
            ps.setString(4, login.getApellido());
            ps.setString(5, login.getMail());
            ps.setString(6, login.getPregunta());
            ps.setString(7, login.getRespueta());
            
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

        String sql = "UPDATE alumno SET usuario = ? , contraseña = ? , nombre=?, apellido =? , mail =?, pregunta=? , respuesta = ? WHERE idLogin = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContrasenia());
            ps.setString(3, login.getNombre());
            ps.setString(4, login.getApellido());
            ps.setString(5, login.getMail());
            ps.setString(6, login.getPregunta());
            ps.setString(7, login.getRespueta());
            ps.setInt(8, login.getIdLogin());
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
        String sql = "SELECT idLogin, usuario, contraseña, nombre, apellido, mail, pregunta, respuesta FROM login WHERE usuario=?";
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
                login.setRespueta(rs.getString(8));
            }else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login " + ex.getMessage());
        }

        return login;
    }
    
}
