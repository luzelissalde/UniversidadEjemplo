
package universidadejemplo.accesoADatos;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB = "universidad ulp";
    private static final  String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private Conexion(){}
    
    
    public static Connection getConexion() {
        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB , USUARIO, PASSWORD);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD " + ex.getMessage());

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());

            }
        }
        return connection;
    }

}