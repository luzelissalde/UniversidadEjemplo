/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;

/**
 *
 * @author USURIO
 */
public class InscripcionData {

    private Connection connection;
    private AlumnoData alumnoData;
    private MateriaData materiaData;

    public InscripcionData() {
        connection = Conexion.getConexion();
    }

    public void guardarIncripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Nota añadida con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());

        }
    }

    public List<Inscripcion> obtenerInscripciones() {

        List<Inscripcion> inscricion = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();

                insc.setIdInscripcion(rs.getInt(1));
                insc.setNota(rs.getDouble(2));
                insc.getAlumno().setIdAlumno(rs.getInt(3));
                insc.getMateria().setIdMateria(rs.getInt(4));

                inscricion.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return inscricion;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        materiaData = new MateriaData();
        alumnoData = new AlumnoData();
        List<Inscripcion> inscripcion = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();

                insc.setIdInscripcion(rs.getInt(1));
                insc.setNota(rs.getDouble(2));
                Alumno alumno = alumnoData.buscarAlumno(rs.getInt(3));
                alumno.setIdAlumno(alumno.getIdAlumno());
                insc.setAlumno(alumno);
                Materia materia = materiaData.buscarMateria(rs.getInt(4));
                materia.setIdMateria(materia.getIdMateria());
                insc.setMateria(materia);
                inscripcion.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return inscripcion;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia"
                    + " WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al obtener Incripciones " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT materia.idMateria, nombre, año FROM materia "
                + "WHERE estado = 1 AND materia.idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al obtener Incripciones " + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ? ";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la inscripcion del alumno");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla incripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ? ";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }

    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {

        List<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idAlumno, dni, apellido, alumno.nombre  FROM inscripcion, alumno"
                    + " WHERE inscripcion.idAlumno = alumno.idAlumno AND inscripcion.idMateria = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt(1));
                alumno.setDni(rs.getInt(2));
                alumno.setApellido(rs.getString(3));
                alumno.setNombre(rs.getString(4));
//                alumno.setFechaNac(rs.getDate(5).toLocalDate());
//                alumno.setActivo(rs.getBoolean(6));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al obtener Incripciones " + ex.getMessage());
        }
        return alumnos;
    }

}
