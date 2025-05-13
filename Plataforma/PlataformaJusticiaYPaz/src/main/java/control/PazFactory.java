package control;

public class PazFactory {

    public static OperacionPaz crearOperacion(String tipo, Object objeto) throws IllegalAccessException {
        switch (tipo) {
            case "Usuario" -> {
                return new RegistroUsuarios((modelo.PrototipoPaz) objeto);
            }
            default ->
                throw new IllegalAccessException("Tipo de operación desconocido: " + tipo);
        }
    }

}
