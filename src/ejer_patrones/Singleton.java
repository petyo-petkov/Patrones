package ejer_patrones;
//-------------------Tipos de Patrones---------//
// 1. Creacionales

// 1.1 Singleton - Garantiza que una clase tenga una unica instancia. Se suele usar con archivos o base de datos
// 1.2 Factory - Atravez de una interfaz unimos varias clases. Para crear jerarquía de clases.
// 1.3 Builder - Permite construir objetos complejos , paso a paso.
// 1.4 Prototype - Clona una clase y sus metodos.

// 2. Estructurales

// 2.1 Decorator - Añade funcionalidades a una clase, sin modificarla.
// 2.2 Adapter - Crea una clase que une otras clases distintas. Se usa al trabajar con codigo antiguo o sin posibilidad se acceder al codigo fuente.
// 2.3 Facade - Interfaz que simplifica un grupo complejo de clases.


//+++++++++SINGLETON+++++++++++++++++++//
public class Singleton {
    private static Singleton singleton;
    private Singleton(){};

    int contador;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }
    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }
}
