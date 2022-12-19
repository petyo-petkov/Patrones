package Compoertamiento.Iterator;

public class Usuarios implements UsuarioIterator {


    public void Crear(Usuario usuario) {

    }

    @Override
    public Usuario siguiente() { return null; }
    @Override public boolean hayMas() { return false; }
    @Override
    public void reinicia() { }

}
