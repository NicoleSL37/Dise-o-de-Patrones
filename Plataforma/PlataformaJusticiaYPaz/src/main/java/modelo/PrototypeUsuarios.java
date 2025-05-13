package modelo;

import basededatos.ConexionBD;
import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class PrototypeUsuarios extends PrototipoPaz {

    private String nombre, apellido, email, contrasenia;
    private Date fechaCreacion;
    private RolUsuario rol;

    public PrototypeUsuarios(String nombre, String apellido, String email, String contrasenia, Date fechaCreacion, RolUsuario rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasenia = contrasenia;
        this.fechaCreacion = fechaCreacion;
        this.rol = rol;
    }

    @Override
    public void ejecutar() {

        try {
            Connection con = ConexionBD.getInstancia().getConexion();
            CallableStatement stmt = (CallableStatement) con.prepareCall("CALL sp_insertar_usuario(?,?,?,?,?,?)");
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, email);
            stmt.setString(4, contrasenia);
            stmt.setDate(5, fechaCreacion);
            stmt.setString(6, RolUsuario.USUARIO.name());
            stmt.execute();
            System.out.println("Usuario registrado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

}
