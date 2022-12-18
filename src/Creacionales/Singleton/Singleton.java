package Creacionales.Singleton;

public class Singleton {
    private static Singleton singleton;      // crear una variable privada de la instancia
    private Singleton(){};                   // se instancia en privado para que no se pueda invocar desde fuera

    int contador;

    //+++++++++SINGLETON+++++++++++++++++++++//
    public static Singleton getInstance() {  // la fx getInstance(), es la unica que puede crear new Singleton()
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    //---------------------------------------//

    }
    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
}
