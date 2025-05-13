package control;

import modelo.PrototipoPaz;

public class RegistroUsuarios implements OperacionPaz {

    private PrototipoPaz usuario;

    public RegistroUsuarios(PrototipoPaz usuario) {
        this.usuario = usuario;
    }

    @Override
    public void procesar() {
        usuario.ejecutar();
    }

}
