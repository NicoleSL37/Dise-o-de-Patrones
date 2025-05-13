package modelo;

public abstract class PrototipoPaz implements Cloneable {

    public abstract void ejecutar();

    public PrototipoPaz clonar() {
        try {
            return (PrototipoPaz) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
