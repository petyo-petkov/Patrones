package Creacionales.Prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.marca = "Honda";
        coche.modelo = "Civic";
        coche.puertas = 3;

        System.out.println(coche.marca + " "+ coche.modelo + " " + coche.puertas + " puertas" );

        Coche clonado = coche.clonar();
        clonado.puertas = 5;
        System.out.println(clonado.marca + " "+ clonado.modelo + " " + clonado.puertas + " puertas" );
    }
}
