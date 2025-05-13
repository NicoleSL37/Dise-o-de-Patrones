package app;

import control.OperacionPaz;
import control.PazFactory;

import java.sql.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;
import modelo.PrototipoPaz;
import modelo.PrototypeUsuarios;
import modelo.RolUsuario;

public class PlataformaJusticiaYPaz {

    public static void main(String[] args) throws IllegalAccessException, ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fecha de Creación (YYYY-MM-DD): ");
        String fechaCreacionStr = scanner.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaCreacion = (Date) formato.parse(fechaCreacionStr);

        System.out.println("---- REGISTRO DE USUARIO ----");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasenia = scanner.nextLine();

        System.out.print("Nombre: ");
        RolUsuario rol = RolUsuario.USUARIO;

        PrototipoPaz usuario = new PrototypeUsuarios(nombre, apellido, email, contrasenia, fechaCreacion, rol);
        OperacionPaz operacion = PazFactory.crearOperacion("Usuario", usuario);
        operacion.procesar();
    }
}
