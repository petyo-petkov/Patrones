package Compoertamiento.Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

    private ArrayList<Usuario> usuarios = new ArrayList();

    public void Crear(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public Usuario siguiente() { return null; }
    @Override public boolean hayMas() { return false; }
    @Override
    public void reinicia() { }

}
