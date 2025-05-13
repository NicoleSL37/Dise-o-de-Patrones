package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static ConexionBD instancia;
    private Connection conexion;
    private final String URL = "jbdc:mysql://localhost:3306/plataformapaz";
    private final String usuario = "root";
    private final String clave = "";

    public ConexionBD() {

        try {
            conexion = DriverManager.getConnection(URL, usuario, clave);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

}
