package Comportamiento.Strategy;

public class Main {
    public static void main(String[] args) {

        UsuariosFichero usuarios = new UsuariosFichero();

        usuarios.crear("Petyo");
        usuarios.crear("Elsa");
        usuarios.crear("Irene");

        for (String usuario : usuarios.listar()){
            System.out.println(usuario);
        }
    }

}
