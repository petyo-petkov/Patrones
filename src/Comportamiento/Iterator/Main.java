package Comportamiento.Iterator;

public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Petyo", 42));
        usuarios.crear(new Usuario("Irene", 42));
        usuarios.crear(new Usuario("Juan", 13));
        usuarios.crear(new Usuario("Elsa", 14));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es " + usuario.getNombre());
        }
        usuarios.crear(new Usuario("Maria", 23));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario es " + usuario.getNombre());

        usuarios.reinicia();
        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();
            System.out.println("Usuario es " + usuario.getNombre());
        }
    }

}
